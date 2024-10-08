package org.local.services;

import org.local.Configurations.WebDriverWindowTrackerConfiguration;
import org.local.DriverContainer.DriverFactory;
import org.local.model.SupportedBrowser;
import org.local.modules.FacebookScriptLoader;
import org.local.modules.ReportFacebookProfilesModule;
import org.openqa.selenium.*;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.Random;

/**
 * FaceBookWebBot class.
 *
 * @author Wender Couto
 * @since 0.0.1 Beta
 */

public class FacebookWebBot {
    private static final Logger facebookLog = LoggerFactory.getLogger(FacebookWebBot.class);
    private final WebDriver driver;
    private final String url = "https://www.facebook.com/";

    public FacebookWebBot(SupportedBrowser browser, int windowPositionIndex, int sizeFB, int sizeIG) {

        this.driver = DriverFactory.createDriver(browser);
        WebDriverWindowTrackerConfiguration windowTracker = new WebDriverWindowTrackerConfiguration();

        if (sizeFB == 1 && sizeIG == 0) {
            driver.manage().window().maximize();
        } else if (sizeFB == 2 && sizeIG == 0) {
            windowTracker.registerWindow(driver.manage().window());
            windowTracker.applySnappingTwo(windowPositionIndex);
        }  else if (sizeFB == 1 && sizeIG == 1) {
            windowTracker.registerWindow(driver.manage().window());
            windowTracker.applySnappingTwo(windowPositionIndex);
        }
        else {
            driver.manage().window().maximize();
        }
    }

    public void login(String email, String password, String userLink, String clientName) {
        driver.get(url);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("email")));
        WebElement emailGuard =  driver.findElement(By.id("email"));
        WebElement passwordGuard = driver.findElement(By.id("pass"));

        slowType(emailGuard, email, 100);
        slowType(passwordGuard, password, 100);

        facebookLog.info("Dados do útimo login: { E-Mail: {} | Senha: {} }", email, password);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        passwordGuard.submit();
        emailChecker();
        mainScripts(userLink, clientName);
    }

    public void loginsToReportPosts(String email, String password, String fbReportUrls) {
        driver.get(url);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.name("email")));
            WebElement emailGuard = driver.findElement(By.id("email"));

            WebElement passwordGuard = driver.findElement(By.id("pass"));

            slowType(emailGuard, email, 100);
            slowType(passwordGuard, password, 100);

            facebookLog.info("Dados do útimo login: { E-Mail: {} | Senha: {} }", email, password);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
            passwordGuard.submit();
        } catch (Exception e) {
            facebookLog.error("Possible cause: WebDriver user-agent");
            return;
        }
        emailChecker();
        try {
            driver.get(fbReportUrls);
        } catch (Exception e) {
            facebookLog.error("Janela fechada anteriormente, ignorando... ");
        }
        reportScript();

        Random rand = new Random();
        int waitTime = rand.nextInt((15 - 5) + 1) + 5;
        try {
            Thread.sleep(waitTime  * 1000);
        } catch (InterruptedException e) {
            facebookLog.error("Não foi possível agaurdar o tempo esperado de: {}", waitTime);
        }
        try {
            driver.get(url);
            facebookLog.info("Perfil do Facebook: {} Realizou a denuncia com sucesso!", email);
        } catch (Exception e) {
            facebookLog.error("Não foi possivel fechar o driver, não existente.");
            return;
        }

        int numRolls = rand.nextInt(7) + 1;
        for(int i = 0; i < numRolls; i++){
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight);");
            int waitTime2 = rand.nextInt((30 - 15) + 1) + 15;
            try {
                Thread.sleep(waitTime2  * 1000);
            } catch (InterruptedException e) {
                facebookLog.error("Não foi possível agaurdar o tempo esperado de: {}", waitTime);
            }
        }
        closeBrowser();
    }

    private void emailChecker() {
        try {
            WebDriverWait waitFor = new WebDriverWait(this.driver, Duration.ofSeconds(8));
            WebElement element = waitFor.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(), 'No que você está pensando')]")));

            if (element == null) {
                closeBrowser();
            }
        } catch (TimeoutException t ){
            closeBrowser();
        }
    }

    private void mainScripts(String userLink, String nomeCliente) {
        FacebookScriptLoader autoLiker = new FacebookScriptLoader(driver);
        Random rand = new Random();
        int waitTime = rand.nextInt((30 - 15) + 1) + 15;
        try {
            Thread.sleep(waitTime  * 1000);
        } catch (InterruptedException e) {
            facebookLog.error("Não foi possível aguardar o tempo esperado de: {}", waitTime);
        }

        goToUserTarget(userLink);
        autoLiker.likePostsFrom(nomeCliente);
    }

    private void reportScript() {
        Random rand = new Random();
        int waitTime = rand.nextInt((10 - 5) + 1) + 5;
        try {
            Thread.sleep(waitTime  * 1000);
        } catch (InterruptedException e) {
            facebookLog.error("Não foi possível aguardar o tempo esperado de: {}", waitTime);
        }

        //autoReportPosts.reportarPostagem(fbReportUrls);

        new ReportFacebookProfilesModule(driver).engage();
    }

    private void goToUserTarget(String link) {
        try {
            driver.get(link);
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
    }

    private void slowType(WebElement element, String input, long delay) {
        for (char c : input.toCharArray()) {
            element.sendKeys(String.valueOf(c));
            delay(delay);
        }
    }

    private void delay(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            facebookLog.error("Erro ao chamar sleep para delay");
        }
    }

    public WebDriver getDriver() {
        return this.driver;
    }

    public void closeBrowser() {
        driver.quit();
    }
}