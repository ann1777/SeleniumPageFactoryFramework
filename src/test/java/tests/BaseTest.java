package tests;

import helpers.AppManager;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONException;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphanumeric;

public class BaseTest extends BasePageTest {
    public static WebDriver driver;
    private final String userNamePrefix = "testUser";
    private final String userPasswd = "testPasswd";

    private String userName;
    public String userEmail = userName.toString() + "@gmail.com";
    private String sessionToken;

    protected final AppManager app = new AppManager();

    public BaseTest(WebDriver driver) {
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
    @AfterClass
    public static void tearDown() throws Exception {
        driver.quit();
    }
    @Test


     public void siteHeaderAdvClick() {
        base.headerAdv.click();
    }

    public void SearchingItems(String itemName) {
        base.searchFld.sendKeys(itemName);
        base.searchBtn.click();
    }

    public void clickContactUsBtn() {
        base.contactUsBtn.click();
    }

    public void clickSignBtn() {
        base.signInBtn.click();
    }

    public void clickShoppingCartIcn() {
        base.shoppingCartIcn.click();
    }

    public void clickWomenBtn() {
        base.womenDisplayBlockBtn.click();
        base.womenDisplayBlock.findElement(By.id("category-thumbnail"));
        base.womenDisplayBlock.findElement(By.className("sf-with-ul"));
        base.womenDisplayBlock.findElement(By.className("submenu-container"));
        base.womenDisplayBlock.findElement(By.linkText("Blouses"));
        base.womenDisplayBlock.findElement(By.linkText("Dresses"));
        base.womenDisplayBlock.findElement(By.linkText("Casual Dresses"));
    }

    public void clickDressesBtn() {
        base.dressesDisplayBlockBtn.click();
        base.dressesDisplayBlockBtn.findElement(By.linkText("Casual Dresses"));
        base.dressesDisplayBlockBtn.findElement(By.linkText("Evening Dresses"));
        base.dressesDisplayBlockBtn.findElement(By.linkText("Summer Dresses"));
    }

    public void clickTShirtsBtn() {
        base.tShirtsDisplayBlockTab.click();
    }

    public void fillNewsLetterFildWithInvalidEmail() {
        base.NewsletterInputFld.sendKeys(userEmail+"*");
        base.submitNewsletterBtn.click();
        base.newsLetterInvalidAlertMsg.getValue().equals(InvalidEmailPageAlertMsg);
        base.enterYourEmailFldValue.getValue().equals(InvalidEmailFooterAlertMsg);
    }

    public void fillNewsLetterFildWithValidNewEmail() {
        base.NewsletterInputFld.click();
        base.NewsletterInputFld.sendKeys(userEmail);
        base.submitNewsletterBtn.click();
        base.enterYourEmailFldValue.getValue().equals(ValidEmailPageAlertMsg);
        base.footerNewsLetterInputFldSuccessAlertMsg.getValue().equals(ValidEmailFooterAlertMsg);
    }

    @Test
    public void fillNewsLetterFildWithAlreadyUsedEmail() {
        base.NewsletterInputFld.click();
        base.NewsletterInputFld.sendKeys(Keys.DOWN);
        base.NewsletterInputFld.sendKeys(Keys.RETURN);
        base.submitNewsletterBtn.click();
        base.newsLetterAlreadyRegisteredAlertMsg.getValue().equals(AlreadyRegisteredPageAlertMsg);
        base.footerInputFldAlreadyRegisteredAlertMsg.getValue().equals(AlreadyRegisteredFooterAlertMsg);
    }

    public FacebookPage followUsByFacebook() {
        String ExpectedTitle1 = "Selenium Framework";
        base.facebookIcn.click();
        try {
            driver.get(facebookPageLink);
            return new FacebookPage(driver);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
//        String ActualTitle1 = driver.switchTo().window(facebookPageLink).getTitle();
//        Assert.assertEquals(ExpectedTitle1, ActualTitle1);
    }

    public TwitterPage followUsByTwitter() {
        base.twitterIcn.click();
        try{
            driver.get(twitterPageLink);
            return new TwitterPage(driver);
        } catch (Exception e1) {
            throw new RuntimeException(e1);
//            driver.switchTo().window("https://twitter.com/seleniumfrmwrk").findElement(By.xpath("//h2//span[text()='Selenium Framework']")).getText();
//            String ExpectedTitle1 = "Selenium Framework";
//            Assert.assertEquals(ExpectedTitle1, ActualTitle1);
        }

    }

    public void followUsByYoutube() {
        base.youtubeIcn.click();
        driver.get(youtubePageLink);
    }

    public void followUsByGooglePlus() {
        base.googlePlusIcn.click();
        driver.get(googlePlusPageLink);
    }

    public void goWomenPage() {
        base.womenSubsection.click();
        driver.get(womenPageLink);
    }

    public void goSpecialsPage() {
        base.specialsSubsection.click();
        driver.get(specialsPageLink);
    }

    public void goNewProductsPage() {
        base.newProductsSubsection.click();
        driver.get(newProductsPageLink);
    }

    public void goBestSellersPage() {
        base.bestSellersSubsection.click();
        driver.get(bestSellersPageLink);
    }

    public void goOurStoresPage() {
        base.ourStoresSubsection.click();
        driver.get(ourStoresPageLink);
    }

    public void goContactUsPage() {
        base.contactUsSubsection.click();
        driver.get(contactUsPageLink);
    }

    public void goTermsOfUsePage() {
        base.termsOfUseSubsection.click();
        driver.get(termsOfUsePageLink);
    }

    public void goAboutUsPage() {
        base.aboutUsSubsection.click();
        driver.get(aboutUsPageLink);
    }

    public void goSiteMapPage() {
        base.sitemapSubsection.click();
        driver.get(sitemapPageLink);
    }

    public void goMyOrdersPage() {
        base.myOrdersSubsection.click();
        driver.get(myOrdersPageLink);
    }

    public void goMyCreditSlipsPage() {
        base.myCreditSlipsSubsection.click();
        driver.get(myCreditSlipsPageLink);
    }

    public void goMyAddressesPage() {
        base.myAddressSubsection.click();
        driver.get(myAddressPageLink);
    }
    public void goPersonalInfoPage() {
        base.myPersonalInfoSubsection.click();
        driver.get(myPersonalInfoPageLink);
    }
    public void goSignInPage() {
        base.signOutSubsection.click();
        driver.get(signOutPageLink);
    }
}