package tests;

import helpers.AppManager;
import helpers.UserJsonDataHelper;
import helpers.wait.WaitHelper;
import locators.BasePageLocators;
import locators.CreateAccountPageLocators;
import locators.MyAccountPageLocators;
import model.RegistrationFormData;
import org.json.JSONException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest extends BasePageTest {
    public static WebDriver driver;
    public CreateAccountPageLocators newAccountPage;
    public MyAccountPageLocators myAccountPage;
    public UserJsonDataHelper userJsonDataHelper;
    public RegistrationFormData registrationFormData;
    public static BasePageLocators base;
    public AppManager appManager;
    private static String sessionToken;


    public BaseTest(WebDriver driver) {
        super(driver);
        this.base = new BasePageLocators();
        this.myAccountPage = new MyAccountPageLocators();
        this.newAccountPage = new CreateAccountPageLocators();
        this.userJsonDataHelper = new UserJsonDataHelper();
        PageFactory.initElements((ElementLocatorFactory) driver, this);
    }


    public static WebDriver getDriver(){
        return driver;
    }

    @BeforeClass
    public void setUp() throws Exception {
        appManager.initApp();
        driver = new ChromeDriver();
        driver.get("https://automationpractice.com/index.php/");
        WaitHelper wait = new WaitHelper(driver);
        wait.setImplicitWait(5, TimeUnit.SECONDS);
    }

    @BeforeMethod
    public void getUser() throws JSONException {
        userJsonDataHelper.createAccount(registrationFormData);
    }
    @AfterClass
    public void tearDown() throws Exception {
        appManager.stopApp();
        driver.quit();
    }
}