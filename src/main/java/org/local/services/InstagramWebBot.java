package org.local.services;

import org.local.Configurations.WebDriverWindowTrackerConfiguration;
import org.local.DriverContainer.DriverFactory;
import org.local.model.SupportedBrowser;
import org.local.modules.InstagramScriptLoader;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.UUID;

/**
 * InstagramWebBot class.
 *
 * @author Wender Couto
 * @since 0.0.1 Beta
 */

public class InstagramWebBot {
    private static final Logger instagramLog = LoggerFactory.getLogger(InstagramWebBot.class);
    private WebDriver driver;
    private String url = "https://www.instagram.com/";
    private WebDriverWindowTrackerConfiguration windowTracker;

    public InstagramWebBot(SupportedBrowser browser, int windowPositionIndex, int sizeIG, int sizeFB) {

        this.driver = DriverFactory.createDriver(browser);
        WebDriverWindowTrackerConfiguration windowTracker = new WebDriverWindowTrackerConfiguration();

        if (sizeIG == 1 && sizeFB == 0){
            driver.manage().window().maximize();
        } else if (sizeIG == 2 && sizeFB == 0) {
            windowTracker.registerWindow(driver.manage().window());
            windowTracker.applySnappingTwo(windowPositionIndex);
        } else if (sizeIG == 1 && sizeFB == 1) {
            windowTracker.removeWindow(driver.manage().window());
            windowTracker.applySnappingTwo(windowPositionIndex);
        } else {
            windowTracker.registerWindow(driver.manage().window());
            windowTracker.applySnappingFour(windowPositionIndex);
        }
    }

    public void login(String username, String password, String userLink, String igUser) {
        instagramLog.warn("Variable not in use: {}", igUser);
        driver.get(url);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement emailGuard = null;
        WebElement passwordGuard = null;

        try {
            emailGuard = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='text' or @name='username']")));
            passwordGuard = driver.findElement(By.xpath("//input[@type='password' or @name='password']"));
        } catch (NoSuchElementException | TimeoutException e) {
            try {
                WebElement entrarButton = driver.findElement(By.xpath("//button[@type='submit' and .//div[contains(text(), 'Entrar')]]"));
                entrarButton.click();

                emailGuard = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='text' or @name='username']")));
                passwordGuard = driver.findElement(By.xpath("//input[@type='password' or @name='password']"));
            } catch (NoSuchElementException | TimeoutException ex) {
                instagramLog.warn("Não foi possível encontrar o botão \"Entrar\", Tentando alternativa...");

                try {
                    WebElement entrarDiv = driver.findElement(By.xpath("//div[@role='button' and contains(text(), 'Entrar')]"));
                    entrarDiv.click();

                    emailGuard = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='text' or @name='username']")));
                    passwordGuard = driver.findElement(By.xpath("//input[@type='password' or @name='password']"));
                } catch (NoSuchElementException | TimeoutException exc) {
                    instagramLog.error("Não foi possível encontrar os campos de login após tentar todas as alternativas.");
                    return;
                }
            }
        }

        slowType(emailGuard, username, 100);
        slowType(passwordGuard, password, 100);
        //passwordGuard.sendKeys(password);
        //passwordGuard.submit();
        instagramLog.info("Dados do último login: { E-Mail: {} | Senha: {} }", username, password);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", passwordGuard.findElement(By.xpath("//button[@type='submit']")));
        Random rand = new Random();
        int waitTime = rand.nextInt((30 - 15) + 1) + 15;
        try {
            Thread.sleep(waitTime  * 1000);
        } catch (Exception e) {
            instagramLog.error("Não foi possível agaurdar o tempo esperado de: {}", waitTime);
        }

        verificarLoginChecker(userLink, passwordGuard);
        mainScript();
    }

    private void verificarLoginChecker(String userLink, WebElement passwordGuard) {
        List<WebElement> emailCheck = driver.findElements(By.xpath("//span[contains(text(), 'Entrar')]"));
        List<WebElement> notificacaoCheck = driver.findElements(By.xpath("//span[div[contains(text(), 'Sua senha está incorreta. Confira-a.')]]"));
        List<WebElement> passwordIncorrect = driver.findElements(By.xpath("//div[h2[contains(text(), 'Detectamos uma tentativa de login incomum')]]"));

        boolean loginSucesso = false;

        if (!notificacaoCheck.isEmpty()) {
            for (int i = 0; i < 3; i++) {
                WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
                if (submitButton.isDisplayed()) {
                    JavascriptExecutor executor = (JavascriptExecutor) driver;
                    executor.executeScript("arguments[0].click();", submitButton);
                    Random rand = new Random();
                    int waitTime = rand.nextInt((25 - 10) + 1) + 10;
                    try {
                        Thread.sleep(waitTime  * 1000);
                    } catch (InterruptedException e) {
                        break;
                    }
                    if (driver.findElements(By.xpath("//elemento_genério_para_ser_empty")).isEmpty()) {
                        loginSucesso = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (!loginSucesso) {
                goToUserTarget(userLink);
            }
        }
        if (!emailCheck.isEmpty() || !passwordIncorrect.isEmpty()) {
            cleanupWebDriver();
        } else {
            goToUserTarget(userLink);
        }
    }

    public void mainScript() {
        InstagramScriptLoader autoLiker = new InstagramScriptLoader(driver);
        Random rand = new Random();
        int waitTime = rand.nextInt((30 - 15) + 1) + 15;
        try {
            Thread.sleep(waitTime  * 1000);
        } catch (InterruptedException e) {
            instagramLog.error("Não foi possível aguardar o tempo esperado de: {}", waitTime);
        }
        if (driver != null) {
            try {
                autoLiker.likePostsFromLastPost();
            } catch (Exception e) {
                cleanupWebDriver();
            }
        } else {
            cleanupWebDriver();
        }
    }

    public void goToUserTarget(String link) {
        driver.get(link);
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
            instagramLog.error("Erro ao chamar sleep para delay");
        }
    }

    public WebDriver getDriver() {
        return this.driver;
    }

    public void cleanupWebDriver() {
        driver.quit();
    }
}