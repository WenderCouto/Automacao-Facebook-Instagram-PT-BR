package org.local.modules;

import org.local.services.ExcelReader;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.List;
import java.util.Random;

/**
 * ReportFacebookProfilesScript class.
 *
 * @author Wender Couto
 * @since 0.0.1 Beta
 */

public class ReportFacebookProfilesModule {
    private static final Logger reportLog = LoggerFactory.getLogger(ReportFacebookProfilesModule.class);

    private static final int TOTAL_ACTIONS = 100; // avoid infinite loop with while.
    private static int rowIndex = 1;

    private WebDriver driver;
    private final int MIN_DELAY = 2000;
    private final int MAX_DELAY = 5000;
    private WebDriverWait wait;
    private Random rand;

    public ReportFacebookProfilesModule(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        this.rand = new Random();
    }

    public void reportarPostagem(String fbReportUrls) {
        goToTargetPostToReport(fbReportUrls);
        pause();
        WebElement element = driver.findElement(By.xpath("//*[@aria-label='Ações para esta publicação']"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        pause();
        if (!driver.findElements(By.xpath("//span[contains(text(), 'Denunciar publicação')]")).isEmpty()) {
            element = driver.findElement(By.xpath("//span[contains(text(), 'Denunciar publicação')]"));
        } else if (!driver.findElements(By.xpath("//span[contains(text(), 'Denunciar')]")).isEmpty()) {
            element = driver.findElement(By.xpath("//span[contains(text(), 'Denunciar')]"));
        }
        executor.executeScript("arguments[0].click();", element);
        pause();
        String buttonText = "";
        if (!driver.findElements(By.xpath("//span[contains(text(), 'Conteúdo violento, que promove o ódio ou é perturbador')]")).isEmpty()) {
            element = driver.findElement(By.xpath("//span[contains(text(), 'Conteúdo violento, que promove o ódio ou é perturbador')]"));
            buttonText = "Conteúdo violento";
        } else if (!driver.findElements(By.xpath("//span[contains(text(), 'Discurso de ódio')]")).isEmpty()) {
            element = driver.findElement(By.xpath("//span[contains(text(), 'Discurso de ódio')]"));
            buttonText = "Discurso de ódio";
        }
        executor.executeScript("arguments[0].click();", element);
        pause();
        if (buttonText.equals("Conteúdo violento")) {
            element = driver.findElement(By.xpath("//span[contains(text(), 'Incentivo ao ódio')]"));
            executor.executeScript("arguments[0].click();", element);
            pause();
            element = driver.findElement(By.xpath("//span[contains(text(), 'Publicação de discurso de ódio')]"));
            executor.executeScript("arguments[0].click();", element);
            pause();
        } else if (buttonText.equals("Discurso de ódio")) {
            element = driver.findElement(By.xpath("//span[contains(text(), 'Outra coisa')]"));
            executor.executeScript("arguments[0].click();", element);
            pause();
        }
        element = driver.findElement(By.xpath("//span[contains(text(), 'Enviar')]"));
        executor.executeScript("arguments[0].click();", element);
        pause();
        element = driver.findElement(By.xpath("//span[contains(text(), 'Avançar')]"));
        executor.executeScript("arguments[0].click();", element);
        pause();
        element = driver.findElement(By.xpath("//span[contains(text(), 'Concluir')]"));
        executor.executeScript("arguments[0].click();", element);
        pause();
    }

    public void engage() {
        int counter = 0;
        do {
            sharePost();
            try {
                ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0);");
            } catch (Exception e) {
                if (driver == null) Thread.currentThread().interrupt();
            }
            commentToPost();
            counter++;
            getFixedDelay(Duration.ofSeconds(5));
        } while (counter != TOTAL_ACTIONS);
        Thread.currentThread().interrupt();
    }

    public void sharePost() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        try {
            List<WebElement> shareButtons = driver.findElements(By.xpath("//div[@aria-label='Compartilhar']"));
            shareButtons.addAll(driver.findElements(By.xpath("//div/div[@aria-label='Compartilhar']")));
            shareButtons.addAll(driver.findElements(By.xpath("//div[@aria-label='Envie para seus amigos ou publique no seu perfil.']")));

            if (!shareButtons.isEmpty()) {
                WebElement shareButton = shareButtons.getFirst();
                executor.executeScript("arguments[0].click();", shareButton);
                WebElement audienceSelector = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Amigos']")));
                if (audienceSelector != null) {
                    executor.executeScript("arguments[0].click();", audienceSelector);
                    WebElement publicOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Público']")));
                    if (publicOption != null) {
                        executor.executeScript("arguments[0].click();", publicOption);
                        WebElement checkBox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='checkbox' and @name='checkbox']")));
                        if (checkBox != null) {
                            executor.executeScript("arguments[0].click();", checkBox);
                        }
                        WebElement saveButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@aria-label='Salvar']")));
                        if (saveButton != null) {
                            executor.executeScript("arguments[0].click();", saveButton);
                        }
                    }
                }

                WebElement shareNowButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@aria-label='Compartilhar agora']")));
                executor.executeScript("arguments[0].click();", shareNowButton);
            }
        } catch (Exception e) {
        }
        try {
            WebElement shareNowButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@aria-label='Compartilhar agora']")));
            executor.executeScript("arguments[0].click();", shareNowButton);
        } catch (Exception e) {

        }
    }

    public void commentToPost() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        try {
            WebElement commentSection = driver.findElement(By.xpath("//div[@role='textbox' and @aria-label='Comente…']"));
            executor.executeScript("arguments[0].click();", commentSection);
            WebElement commentBox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='textbox' and @aria-placeholder='Comente…']")));

            if (commentBox != null) {
                String comment = ExcelReader.getCommentFromExcel(rowIndex);
                if (comment != null && !comment.isEmpty()) {
                    commentBox.clear();
                    for (char c : comment.toCharArray()) {
                        commentBox.sendKeys(String.valueOf(c));
                        getFixedDelay(Duration.ofMillis(70));
                    }
                    commentBox.sendKeys(Keys.RETURN);
                    rowIndex++;
                }
                /*
                while ((comment = ExcelReader.getCommentFromExcel(++rowIndex)) != null && !comment.isEmpty()) {
                    commentBox.clear();
                    for (char c : comment.toCharArray()) {
                        commentBox.sendKeys(String.valueOf(c));
                    }
                    getFixedDelay(Duration.ofMillis(MIN_DELAY));
                    commentBox.sendKeys(Keys.RETURN);
                } */
            }
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
    }

    private void goToTargetPostToReport(String link) {
        driver.get(link);
    }

    private int getRandomDelay() {
        return rand.nextInt((MAX_DELAY - MIN_DELAY) + 1) + MIN_DELAY;
    }

    private void getFixedDelay(Duration duration) {
        try {
            Thread.sleep(duration.toMillis());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private void pause() {
        try {
            Thread.sleep(getRandomDelay());
        } catch (Exception e) {
            reportLog.error("Erro ao chamar sleep para delay");
        }
    }
}