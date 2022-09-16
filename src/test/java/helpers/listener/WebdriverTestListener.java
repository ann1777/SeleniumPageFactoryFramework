package helpers.listener;

import helpers.browserConfig.PropertyReader;
import helpers.browserConfiguration.ChromeBrowser;
import helpers.browserConfiguration.FirefoxBrowser;
import helpers.browserConfiguration.IEBrowser;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.TestListenerAdapter;

import static helpers.browserConfiguration.BrowserType.*;

public class WebdriverTestListener  extends TestListenerAdapter {

    @Override
    public void onStart(ITestContext testContext) {
        super.onStart(testContext);
        final String browser_type = PropertyReader.config.getProperty("browser_type");
        String capabilities = (PropertyReader.config.getProperty("browser_type"));
        WebDriver driver = null;
        String URL;
        if(capabilities == String.valueOf(Chrome)) {
            driver = (WebDriver) new ChromeBrowser();
            ChromeBrowser.getChromeOptions();
            ChromeBrowser.getChromeDriver();
            try {
                URL = "http://localhost:4444/wd/hub";
                driver = new RemoteWebDriver((Capabilities) new ChromeDriver());
                driver.get("http://localhost:4444/wd/hub");
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
        }
        else if(capabilities == String.valueOf(Firefox)) {
            driver = (WebDriver) new FirefoxBrowser();
            FirefoxBrowser.getFirefoxOptions();
            FirefoxBrowser.getFirefoxDriver();
            try {
                driver = new RemoteWebDriver((Capabilities) new FirefoxBrowser());
                driver.get("http://localhost:4442/wd/hub");
            } catch (RuntimeException e1) {
                e1.printStackTrace();
            }
        }
        else if(capabilities == String.valueOf(IExplorer)) {
            driver = (WebDriver) new IEBrowser();
            IEBrowser.getInternetExplorerCapabilities();
            IEBrowser.getExplorerDriver();
            try {
                driver = new RemoteWebDriver((Capabilities) new IEBrowser());
                driver.get("http://localhost:4440/wd/hub");
            } catch ( RuntimeException e2) {
                e2.printStackTrace();
            }
        }
        testContext.setAttribute("webdriver", null);
    }

    @Override
    public void onFinish(ITestContext testContext) {
        super.onFinish(testContext);
        WebDriver driver = (WebDriver) testContext.getAttribute("webdriver");
        driver.close();
    }
}

