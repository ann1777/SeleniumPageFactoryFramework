package tests;

import helpers.AppManager;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONException;
import org.json.JSONObject;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphanumeric;

public class BaseTest {
    private final String userNamePrefix = "testUser";
    private final String userPasswd = "testPasswd";

    private String userName;
    private String userEmail = userName.toString() + "@gmail.com";
    private String sessionToken;

    protected final AppManager app = new AppManager();

    @BeforeSuite(alwaysRun = true)
    public void setUp() {
        app.init();
    }

    @AfterSuite(alwaysRun = true)
    public void tearDown() {
        app.stop();
    }

    @BeforeMethod
    public void getUser() throws JSONException {
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

        Response sessionResponse = RestAssured.given()
                .queryParam("emailAddress", userEmail)
                .queryParam("password", userPasswd)
                .when()
                .get("/login");
        sessionResponse.then().statusCode(200);
        JSONObject joTokenRespone = new JSONObject(sessionResponse.asString());
        sessionToken = joTokenRespone.getString("session_token");
        System.out.println(sessionToken);

        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .setAccept(ContentType.JSON)
                .addHeader("userToken", sessionToken)
                .build();
    }

}