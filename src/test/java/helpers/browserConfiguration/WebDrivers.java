package helpers.browserConfiguration;

import helpers.AppManager;
import helpers.browserConfig.PropertyReader;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class WebDrivers {
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

    ChromeBrowser chromeBrowser = new ChromeBrowser();
    FirefoxBrowser firefoxBrowser = new FirefoxBrowser();
    IEBrowser ieBrowser = new IEBrowser();
    AppManager appManager = new AppManager();
    PropertyReader propertyReader = new PropertyReader();

    public WebDrivers() throws IOException {
    }

    public WebDrivers createAndGetDriver() {

        if (driver.get() != null) {
            return (WebDrivers) driver.get();
        }

        appManager.initApp();
        String browserName = String.valueOf(propertyReader.getBrowserType());
        if (browserName.equalsIgnoreCase("Chrome")) {
            driver.set(chromeBrowser.getChromeDriver());
        } else if (browserName.equalsIgnoreCase("Firefox")) {
            driver.set(firefoxBrowser.getFirefoxDriver());
        } else {
            driver.set(ieBrowser.getExplorerDriver());
        }
        return (WebDrivers) driver.get();
    }
}
