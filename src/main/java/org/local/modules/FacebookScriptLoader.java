package org.local.modules;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.List;
import java.util.Random;

/**
 * FacebookAutoScript class.
 *
 * @author Wender Couto
 * @since 0.0.1 Beta
 */

public class FacebookScriptLoader {
    private static final Logger facebookScriptLog = LoggerFactory.getLogger(FacebookScriptLoader.class);
    private final int MIN_DELAY = 2000; //Quick access
    private final int MAX_DELAY = 9000; //Quick access
    private final WebDriver driver;
    private final Random rand;
    private WebElement lastLikedElement = null;

    public FacebookScriptLoader(WebDriver driver) {
        this.driver = driver;
        new WebDriverWait(driver, Duration.ofSeconds(30));
        this.rand = new Random();
    }

    public void likePostsFrom(String profileName) {
        WebElement profileElement = driver.findElement(By.xpath("//strong/span[contains(text(), '" + profileName + "')]"));
        List<WebElement> likeButtons;
        if (lastLikedElement != null) {
            likeButtons = lastLikedElement.findElements(By.xpath(".//following::div/div[contains(@aria-label, 'Curtir') and not(contains(@aria-pressed, 'true'))]"));
        } else {
            likeButtons = profileElement.findElements(By.xpath("//div/div[contains(@aria-label, 'Curtir') and not(contains(@aria-pressed, 'true')) and not(.//ancestor::*[contains(@style, 'display: none;')])]"));
        }
        likeButtons.addAll(profileElement.findElements(By.xpath("//div/div[contains(@aria-label, '\"Curtir\" ativado') and not(contains(@aria-pressed, 'true')) and not(.//ancestor::*[contains(@style, 'display: none;')])]")));
        if (likeButtons.isEmpty()) {
            scrollToBottomAndLike(profileName);
        } else {
            boolean allButtonsClicked = true;
            for (WebElement likeButton : likeButtons) {
                String ariaLabel = likeButton.getAttribute("aria-label");
                if ("Curtir".equals(ariaLabel)) {
                    JavascriptExecutor executor = (JavascriptExecutor) driver;
                    executor.executeScript("arguments[0].click();", likeButton);
                    WebElement post = likeButton.findElement(By.xpath(".//ancestor::div[.//div[@aria-label='Compartilhar'] or .//div[@aria-label='Envie para seus amigos ou publique no seu perfil.']]"));
                    sharePost(post, profileName);
                    lastLikedElement = likeButton;
                    long delay = getRandomDelay();
                    try {
                        Thread.sleep(delay);
                    } catch (InterruptedException e) {
                        facebookScriptLog.error("");
                    }
                    allButtonsClicked = false;
                    break;
                }
            }
            if (allButtonsClicked) {
                while (!false) {
                    scrollToNextButtonAndLike();
                }
            }
        }
    }

    private void scrollToNextButtonAndLike() {
        try {
            String script = Files.readString(Paths.get("src/main/java/org/local/modules/scripts/facebook/1_FacebookScrollToNextButtonAndLike.js"));
            facebookScriptLog.info("Script carregado: {}", script);
            ((JavascriptExecutor) driver).executeScript(sanitizeScript(script));
        } catch (IOException e) {
            facebookScriptLog.error("Erro ao carregar o script: {}", "1_FacebookScrollToNextButtonAndLike.js", e);
        }
    }

    private void scrollToBottomAndLike(String profileName) {
        try {
            String script = Files.readString(Paths.get("src/main/java/org/local/modules/scripts/facebook/2_FacebookScrollToView.js"));
            facebookScriptLog.info("Script carregado: {}", sanitizeScript(script));
            ((JavascriptExecutor) driver).executeScript(sanitizeScript(script));
        } catch (IOException e) {
            facebookScriptLog.error("Erro ao carregar o script: {}", "2_FacebookScrollToView.js", e);
        }
        likePostsFrom(profileName);
    }

    public void sharePost(WebElement post, String profileName) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        List<WebElement> shareButtons = post.findElements(By.xpath(".//div[@aria-label='Compartilhar']"));
        shareButtons.addAll(post.findElements(By.xpath(".//div/div[@aria-label='Compartilhar']")));
        shareButtons.addAll(post.findElements(By.xpath(".//div[@aria-label='Envie para seus amigos ou publique no seu perfil.']")));
        WebElement shareButton = null;
        if (!shareButtons.isEmpty()) {
            shareButton = shareButtons.size() >= 2 ? shareButtons.get(1) : shareButtons.get(0);
            executor.executeScript("arguments[0].click();", shareButton);
            getSleepForThread(Duration.ofSeconds(5));
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            WebElement shareNowButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-label='Compartilhar agora']")));
            executor.executeScript("arguments[0].click();", shareNowButton);
        }
        likePostsFrom(profileName);
    }

    private int getRandomDelay() {
        return rand.nextInt((MAX_DELAY - MIN_DELAY) + 1) + MIN_DELAY;
    }

    private void getSleepForThread(Duration time) {
        try {
            Thread.sleep(Duration.ofSeconds(time.getSeconds()));
        } catch (InterruptedException e) {
            facebookScriptLog.error("Erro ao executar sleep na Thread ", e);
        }
    }

    //AI generated
    private String sanitizeScript(String scriptContent) {
        StringBuilder sanitizedScript = new StringBuilder();
        boolean inBlockComment = false;

        for (String line : scriptContent.split("\n")) {
            StringBuilder sanitizedLine = new StringBuilder();
            char[] chars = line.toCharArray();

            for (int i = 0; i < chars.length; i++) {
                if (i < chars.length - 1 && chars[i] == '/' && chars[i + 1] == '*') {
                    inBlockComment = true;
                    i++;
                } else if (i < chars.length - 1 && chars[i] == '*' && chars[i + 1] == '/') {
                    inBlockComment = false;
                    i++;
                } else if (!inBlockComment && i < chars.length - 1 && chars[i] == '/' && chars[i + 1] == '/') {
                    break;
                } else if (!inBlockComment) {
                    sanitizedLine.append(chars[i]);
                }
            }

            if (!sanitizedLine.isEmpty()) {
                sanitizedScript.append(sanitizedLine.toString().replace("\"", "\\\"")).append("\n");
            }
        }

        return sanitizedScript.toString();
    }
}