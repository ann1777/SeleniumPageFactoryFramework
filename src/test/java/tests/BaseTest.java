package tests;

import helpers.AppManager;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import locators.BasePageLocators;
import org.asynchttpclient.Response;
import org.json.JSONException;
import org.json.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphanumeric;

public class BaseTest extends BasePageTest {
    public static WebDriver driver;
    private static final String userNamePrefix = "testUser";
    private static final String userPasswd = "testPasswd";

    private static String userName;
    public static String userEmail = userName.toString() + "@gmail.com";
    private static String sessionToken;

    protected final AppManager app = new AppManager();

    public BaseTest(WebDriver driver) {
        super(driver);
        this.base = new BasePageLocators();
        PageFactory.initElements((ElementLocatorFactory) driver, this);
    }


    public static WebDriver getDriver(){
        return driver;
    }

    @BeforeClass
    public static void setUp() throws Exception {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://automationpractice.com/index.php/");
    }

    @BeforeMethod
    public static void getUser() throws JSONException {
        RestAssured.reset();
        RestAssured.baseURI = "http://automationpractice.com/index.php?/";
        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .setAccept(ContentType.JSON)
                .build();
        userName = userNamePrefix + randomAlphanumeric(5);
        JSONObject jo = new JSONObject();
        jo.put("emailAddress", userEmail);
        jo.put("password", userPasswd);

        RestAssured.given()
                .body(jo.toString())
                .when()
                .post("/user").then().statusCode(200);

        Response sessionResponse = (Response) RestAssured.given()
                .queryParam("emailAddress", userEmail)
                .queryParam("password", userPasswd)
                .when()
                .get("/login");
        sessionResponse.then().statusCode(200);
        JSONObject joTokenRespone = new JSONObject(sessionResponse.getHeaders().getAsString());
        sessionToken = joTokenRespone.getString("session_token");
        System.out.println(sessionToken);

        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .setAccept(ContentType.JSON)
                .addHeader("userToken", sessionToken)
                .build();
    }
    @AfterClass
    public static void tearDown() throws Exception {
        driver.quit();
    }
}