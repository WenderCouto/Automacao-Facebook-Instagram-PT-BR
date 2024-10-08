package org.local.modules;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.Random;

/**
 * InstagramAutoScript class.
 *
 * @author Wender Couto
 * @since 0.0.1 Beta
 */

public class InstagramScriptLoader {
    private static final Logger instagramScriptLog = LoggerFactory.getLogger(InstagramScriptLoader.class);

    private WebDriver driver;
    private final int MIN_DELAY = 9000;
    private final int MAX_DELAY = 35000;
    private WebDriverWait wait;
    private Random rand;

    public InstagramScriptLoader(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        this.rand = new Random();
    }

    public void likePostsFromLastPost() {
        pause();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        String script = "const divs = document.querySelectorAll('div[style*=\"display: flex\"]');"
                + "const primeiroLink = divs[0].querySelector('a[role=\"link\"]');"
                + "primeiroLink.click();";

        js.executeScript(script);
        likePostScript();
    }

    private void likePostScript() {
        pause();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        String script =
                "function likePosts() {" +
                "    const unlikeButton = document.querySelector(\"svg[aria-label='Descurtir']\");" +
                "    const likeButton = document.querySelector(\"svg[aria-label='Curtir']\");" +
                "    if (unlikeButton) {" +
                "        console.log('A primeira postagem já foi curtida anteriormente. Ignorando...');" +
                "    } else if (likeButton && likeButton.parentElement) {" +
                "        likeButton.parentElement.click();" +
                "        console.log('Postagem curtida!');" +
                "    } " +
                "}" +
                "likePosts();";

        js.executeScript(script);
        nextPostFromTarget();
    }

    private void nextPostFromTarget() {
        pause();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        String script =
                "function clickNextButton() {" +
                "   const button = document.querySelector(\"svg[aria-label='Avançar']\");" +
                "   if (button && button.parentElement) {" +
                "       button.parentElement.click();" +
                "       console.log('Botão Avançar clicado!');" +
                "   } else {" +
                "       console.log('Botão Avançar não encontrado.');" +
                "   }" +
                "}" +
                "clickNextButton();";

        js.executeScript(script);
        likePostScript();
    }

    private int getRandomDelay() {
        return rand.nextInt((MAX_DELAY - MIN_DELAY) + 1) + MIN_DELAY;
    }

    private void pause()  {
        try {
            Thread.sleep(getRandomDelay());
        } catch (InterruptedException e) {
            instagramScriptLog.error("Erro ao chamar sleep para delay");
        }
    }
}