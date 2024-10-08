package org.local;

import org.local.Configurations.JsonConfiguration;
import org.local.DriverContainer.DriverFactory;
import org.local.model.BotCredentialsContainer;
import org.local.model.BotCredentialsFb;
import org.local.model.BotCredentialsIg;
import org.local.model.ConfigurationInfo;
import org.local.services.*;
import org.openqa.selenium.WebDriver;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.slf4j.Logger;

/**
 * Main class.
 *
 * @author Wender Couto
 * @since 0.0.1 Beta
 */

public class Main {
    private static final Logger mainLogger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        mainLogger.info("Programa iniciado\n" +
                "Nucleos da máquina: {}", Runtime.getRuntime().availableProcessors());
        DriverFactory.setupDrivers();

        JsonConfiguration configFile = new JsonConfiguration();
        ConfigurationInfo configInfo = configFile.setConfig();

        ExcelReader excelReader = new ExcelReader();
        BotCredentialsContainer botCredentialsContainer = excelReader.excelCredentialReader(configInfo.getFilePath(), configInfo.isAutoInactivate());

        boolean isBotFacebook = configInfo.isFacebookBot();
        boolean isBotInstagram = configInfo.isInstagramBot();
        int eachInstanceValue = configInfo.getEachInstanceNumberPerAcc();

        if (botCredentialsContainer.getFbCredentialsList().isEmpty() && botCredentialsContainer.getIgCredentialsList().isEmpty()) {
            mainLogger.error("Verifique o Estado dos Bots, podem estar Inativos.");
            return;
        }

        List<BotCredentialsFb> fbBotCredentialsList = new ArrayList<>();
        for (BotCredentialsFb fbCredentials : botCredentialsContainer.getFbCredentialsList()) {
            if (fbCredentials.isFacebookBot()) {
                fbBotCredentialsList.add(fbCredentials);
            }
        }

        List<BotCredentialsIg> igBotCredentialsList = new ArrayList<>();
        for (BotCredentialsIg igCredentials : botCredentialsContainer.getIgCredentialsList()) {
            if (igCredentials.isInstagramBot()) {
                igBotCredentialsList.add(igCredentials);
            }
        }

        List<List<BotCredentialsFb>> fbBlock = splitInBlockFb(fbBotCredentialsList, eachInstanceValue);
        List<List<BotCredentialsIg>> igBlock = splitInBlockIg(igBotCredentialsList, eachInstanceValue);

        blocksHandler(fbBlock, igBlock, isBotFacebook, isBotInstagram, eachInstanceValue, configInfo, excelReader);
    }

    private static List<List<BotCredentialsFb>> splitInBlockFb(List<BotCredentialsFb> lista, int blockSize) {
        List<List<BotCredentialsFb>> blocos = new ArrayList<>();
        for (int i = 0; i < lista.size(); i = i + blockSize) {
            blocos.add(new ArrayList<>(lista.subList(i, Math.min(i + blockSize, lista.size()))));
        }
        return blocos;
    }

    private static List<List<BotCredentialsIg>> splitInBlockIg(List<BotCredentialsIg> lista, int blockSize) {
        List<List<BotCredentialsIg>> blocos = new ArrayList<>();
        for (int i = 0; i < lista.size(); i = i + blockSize) {
            blocos.add(new ArrayList<>(lista.subList(i, Math.min(i + blockSize, lista.size()))));
        }
        return blocos;
    }

    private static void blocksHandler(
            List<List<BotCredentialsFb>> fbBlocos,
            List<List<BotCredentialsIg>> igBlocos,
            boolean isBotFacebook,
            boolean isBotInstagram,
            int eachInstanceValue,
            ConfigurationInfo configInfo,
            ExcelReader excelReader) {

        int maxBlocks = Math.max(fbBlocos.size(), igBlocos.size());

        for (int i = 0; i < maxBlocks; i++) {
            List<BotCredentialsFb> fbBLock = (i < fbBlocos.size()) ? fbBlocos.get(i) : Collections.emptyList();
            List<BotCredentialsIg> igBlock = (i < igBlocos.size()) ? igBlocos.get(i) : Collections.emptyList();

            blockExecutor(fbBLock, igBlock, isBotFacebook, isBotInstagram, eachInstanceValue, configInfo, excelReader);
        }
    }

    private static void blockExecutor(
            List<BotCredentialsFb> fbBlock,
            List<BotCredentialsIg> igBlock,
            boolean isBotFacebook,
            boolean isBotInstagram,
            int eachInstanceValue,
            ConfigurationInfo configInfo,
            ExcelReader excelReader) {

        try (ExecutorService executorService = Executors.newFixedThreadPool(eachInstanceValue)) {
            final AtomicInteger counter = new AtomicInteger(0);

            if (isBotFacebook) {
                for (final BotCredentialsFb botCredentials : fbBlock) {
                    int windowPositionIndex = counter.incrementAndGet();
                    executorService.execute(new Runnable() {
                        @Override
                        public void run() {
                            WebDriver fbDriver = null;
                            boolean error = false;
                            try {
                                WebDriverTimeoutManager timeoutManager = new WebDriverTimeoutManager();
                                FacebookWebBot facebookBot = new FacebookWebBot(configInfo.getBrowser(), windowPositionIndex, configInfo.getFacebookBotQuantity(), configInfo.getInstagramBotQuantity());
                                fbDriver = facebookBot.getDriver();
                                timeoutManager.start(fbDriver, configInfo.getTimeInMinutePerAcc(), TimeUnit.MINUTES);
                                if (configInfo.isFbReportUrls()) {
                                    facebookBot.loginsToReportPosts(botCredentials.getUsername(), botCredentials.getPassword(), botCredentials.getFbReportUrls());
                                } else {
                                    facebookBot.login(botCredentials.getUsername(), botCredentials.getPassword(), configInfo.getFacebookClientAcc(), configInfo.getClientName());
                                }
                                facebookBot.closeBrowser();
                                excelReader.markAccountAsInactive(configInfo.getFilePath(), botCredentials.getRowIndex(), 5, 8);
                            } catch (Exception e) {
                                mainLogger.error("Erro ao processar FacebookBot ", e);
                                error = true;
                            } finally {
                                if (error && fbDriver != null) {
                                    try {
                                        fbDriver.quit();
                                    } catch (Exception e) {
                                        mainLogger.error("Erro ao fechar o WebDriver do Facebook ", e);
                                    }
                                    excelReader.markAccountAsInactive(configInfo.getFilePath(), botCredentials.getRowIndex(), 5, 8);
                                }
                            }
                        }
                    });
                }
            }

            if (isBotInstagram) {
                for (final BotCredentialsIg botCredentials : igBlock) {
                    int windowPositionIndex = counter.incrementAndGet();
                    executorService.execute(new Runnable() {
                        @Override
                        public void run() {
                            WebDriver igDriver = null;
                            boolean erroOcorrido = false;
                            try {
                                InstagramWebBot instagramBot = new InstagramWebBot(configInfo.getBrowser(), windowPositionIndex, configInfo.getInstagramBotQuantity(), configInfo.getFacebookBotQuantity());
                                igDriver = instagramBot.getDriver();
                                WebDriverTimeoutManager timeoutManager = new WebDriverTimeoutManager();
                                timeoutManager.start(igDriver, configInfo.getTimeInMinutePerAcc(), TimeUnit.MINUTES);
                                instagramBot.login(botCredentials.getUsername(), botCredentials.getPassword(), configInfo.getInstagramClientAcc(), configInfo.getClientName());
                                instagramBot.cleanupWebDriver();
                                excelReader.markAccountAsInactive(configInfo.getFilePath(), botCredentials.getRowIndex(), 5, 8);
                            } catch (Exception e) {
                                mainLogger.error("Erro ao processar InstagramBot ", e);
                                erroOcorrido = true;
                            } finally {
                                if (erroOcorrido && igDriver != null) {
                                    try {
                                        igDriver.quit();
                                    } catch (Exception e) {
                                        mainLogger.error("Erro ao fechar o WebDriver do Instagram", e);
                                    }
                                    excelReader.markAccountAsInactive(configInfo.getFilePath(), botCredentials.getRowIndex(), 5, 8);
                                }
                            }
                        }
                    });
                }
            }

            executorService.shutdown();
        } catch (Exception e) {
            mainLogger.error("Erro ao iniciar a pool de threads ", e);
        }
    }
}