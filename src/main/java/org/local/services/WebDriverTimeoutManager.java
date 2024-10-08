package org.local.services;

import org.openqa.selenium.WebDriver;
import java.util.concurrent.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * WebDriverTimeoutManager class.
 *
 * @author Wender Couto
 * @since 0.0.2 Beta
 */

public class WebDriverTimeoutManager {
    private static final Logger timeOutManagerLog = LoggerFactory.getLogger(WebDriverTimeoutManager.class);
    private final ScheduledExecutorService scheduler;

    public WebDriverTimeoutManager() {
        this.scheduler = Executors.newScheduledThreadPool(1);
    }

    public void start(WebDriver driver, long timeout, TimeUnit unit) {
        scheduler.schedule(new Runnable() {
            @Override
            public void run() {
                try {
                    timeOutManagerLog.info("Fechando WebDriver após {} {}", timeout, unit.toString().toLowerCase());
                    driver.quit();
                    shutdown();
                } catch (Exception e) {
                    timeOutManagerLog.error("Erro ao fechar o WebDriver ", e);
                }
            }
        }, timeout, unit);
    }

    public void shutdown() {
        scheduler.shutdown();
        timeOutManagerLog.info("Shutting Down now.");
        try {
            if (!scheduler.awaitTermination(10, TimeUnit.SECONDS)) {
                scheduler.shutdownNow();
            }
        } catch (InterruptedException e) {
            scheduler.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }
}