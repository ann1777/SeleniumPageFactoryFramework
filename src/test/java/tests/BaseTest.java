package tests;

import helpers.AppManager;
import helpers.UserJsonDataHelper;
import helpers.wait.WaitHelper;
import locators.BasePageLocators;
import locators.CreateAccountPageLocators;
import locators.MyAccountPageLocators;
import model.RegistrationFormData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.json.JsonException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public static WebDriver driver;
    public CreateAccountPageLocators newAccountPage;
    public MyAccountPageLocators myAccountPage;
    public UserJsonDataHelper userJsonDataHelper;
    public RegistrationFormData registrationFormData;
    public static BasePageLocators base;
    public AppManager appManager;

    private static String sessionToken;


    public BaseTest() throws IOException {
        super();
        this.appManager = new AppManager();
        this.base = new BasePageLocators();
        this.myAccountPage = new MyAccountPageLocators();
        this.newAccountPage = new CreateAccountPageLocators();
        this.userJsonDataHelper = new UserJsonDataHelper(driver);
        PageFactory.initElements((ElementLocatorFactory) driver, this);
    }


    public static WebDriver getDriver(){
        System.out.println("Constructing BaseTest");
        System.out.println("WebDriver inst: " + driver);
        return driver;
    }

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        appManager.initApp();
        driver = BaseTest.getDriver();
        driver.get("https://automationpractice.com/index.php/");
        WaitHelper wait = new WaitHelper(driver);
        wait.setImplicitWait(5, TimeUnit.SECONDS);
        System.out.println("Constructing BaseTest");
        System.out.println("WebDriver inst: " + driver);
    }

    @BeforeMethod
    public void getUser() throws JsonException {
        userJsonDataHelper.createAccount(registrationFormData);
    }

    @Test
    public void getAlreadyCreatedUser() throws JsonException {
        userJsonDataHelper.createAlreadyUsedEmailAccount(registrationFormData);
    }

    @Test
    public void greeting() {
        System.out.println("Hello app!");
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        appManager.stopApp();
    }
}