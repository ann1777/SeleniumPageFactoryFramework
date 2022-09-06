package helpers;

import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.fail;

public class AppManager {
    private ChromeDriver driver;


    private SessionHelper sessionHelper;
    private NavigationHelper navigationHelper;
    private ButtonsHelper buttonsHelper;
    private WebTableHelper webTableHelper;

    private final StringBuffer verificationErrors = new StringBuffer();

    public void init() {
        System.clearProperty("webdriver.chrome.driver");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        webTableHelper = new WebTableHelper(driver);
        buttonsHelper = new ButtonsHelper(driver);
        navigationHelper = new NavigationHelper(driver);
        sessionHelper = new SessionHelper(driver);
        driver.manage().window().maximize();
        sessionHelper.login();
    }

    public void stop() {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    public WebTableHelper getWebTableHelper() {
        return webTableHelper;
    }

    public ButtonsHelper getButtonsHelper() {
        return buttonsHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
}