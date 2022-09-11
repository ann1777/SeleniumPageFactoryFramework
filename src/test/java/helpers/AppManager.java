package helpers;

import helpers.browserConfiguration.WebDrivers;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;
import static tests.BaseTest.driver;

public class AppManager {
    private SessionHelper sessionHelper;
    private NavigationHelper navigationHelper;
    private ButtonsHelper buttonsHelper;
    private UserJsonDataHelper userJsonDataHelper;
    WebDrivers webDrivers;

    private final StringBuffer verificationErrors = new StringBuffer();



    public AppManager() throws IOException {
        webDrivers = new WebDrivers();

        if(driver == null) {
            driver = (WebDriver) webDrivers.createAndGetDriver();
            PageFactory.initElements((SearchContext) driver, this);
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        }
    }


    public void initApp() {
        System.clearProperty("webdriver.chrome.driver");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        userJsonDataHelper = new UserJsonDataHelper();
        buttonsHelper = new ButtonsHelper(driver);
        navigationHelper = new NavigationHelper(driver);
        sessionHelper = new SessionHelper(driver);
//        driver.manage().window().maximize();
        sessionHelper.login();
    }

    public void stop() {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    public UserJsonDataHelper getUserJsonHelper() {
        return userJsonDataHelper;
    }

    public ButtonsHelper getButtonsHelper() {
        return buttonsHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

}