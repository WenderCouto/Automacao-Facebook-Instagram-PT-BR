package org.local.DriverContainer;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.local.model.SupportedBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * DriverFactory class.
 *
 * @author Wender Couto
 * @since 0.0.1 Beta
 */

public class DriverFactory {
    private static final Logger driverFactoryLog = LoggerFactory.getLogger(DriverFactory.class);

    private static WebDriver driver;
    private static final String ERROR_MESSAGE = "Navegador não suportado.";

    public static void setupDrivers() {
        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
        WebDriverManager.edgedriver().setup();
        //WebDriverManager.safaridriver().setup();  // Already on macOS
    }

    public static WebDriver createDriver(SupportedBrowser browser) {
        WebDriver driver = null;
        //String userAgent = FullUserAgentsList.getRandomUserAgent();

        switch (browser) {
            case GOOGLE: case CHROME:
                ChromeOptions chromeOptions = new ChromeOptions();
                //chromeOptions.addArguments("--user-agent=" + userAgent);
                driver = new ChromeDriver(chromeOptions);
                break;
            case MOZILA: case FIREFOX:
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                //firefoxOptions.addPreference("general.useragent.override", userAgent);
                if (System.getProperty("os.name").toUpperCase().contains("MAC")) {
                    firefoxOptions.setBinary("/Applications/Firefox.app/Contents/MacOS/firefox");
                }
                driver = new FirefoxDriver(firefoxOptions);
                break;
            case EDGE:
                EdgeOptions edgeOptions = new EdgeOptions();
                //edgeOptions.addArguments("--user-agent=" + userAgent);
                driver = new EdgeDriver(edgeOptions);
                break;
            case SAFARI:
                driver = new SafariDriver();
                break;
            default:
                driverFactoryLog.error(ERROR_MESSAGE);
        }
        return driver;
    }
}