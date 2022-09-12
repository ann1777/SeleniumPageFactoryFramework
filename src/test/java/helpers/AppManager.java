package helpers;

import helpers.browserConfiguration.WebDrivers;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.Assert.fail;

public class AppManager extends HelperBase {
    private SessionHelper sessionHelper;
    private NavigationHelper navigationHelper;
    private ButtonsHelper buttonsHelper;
    private UserJsonDataHelper userJsonDataHelper;
    WebDrivers webDrivers;
    private final StringBuffer verificationErrors = new StringBuffer();

    public AppManager() {
        super();
    }
    public void initApp() {
        System.clearProperty("webdriver.chrome.driver");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-dev-shm-usage");
        driver = new ChromeDriver();
        userJsonDataHelper = new UserJsonDataHelper();
        buttonsHelper = new ButtonsHelper(driver);
        navigationHelper = new NavigationHelper(driver);
        sessionHelper = new SessionHelper(driver);
//        driver.manage().window().maximize();
        sessionHelper.login();
    }

    public void stopApp() {
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