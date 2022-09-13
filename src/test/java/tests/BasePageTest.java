package tests;

import helpers.AppManager;
import locators.*;
import model.RegistrationFormData;
import objectRepository.BasePage_OR;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.testng.Assert;

import java.io.IOException;
import java.util.Random;


public class BasePageTest extends BaseTest{
    public BasePageLocators base;
    public CatalogPageLocators women;
    public SpecialsPageLocators specials;
    public NewProductsPageLocators newproducts;
    public BestSellersPageLocators bestsellers;
    public OurStoresPageLocators ourstores;
    public ContactUsPageLocators contactus;
    public TermsOfUsePageLocators termsofuse;
    public AboutUsPageLocators aboutus;
    public SitemapPageLocators sitemap;
    public OrderHistoryPageLocators myorders;
    public CreditSlipsPageLocators creditslips;
    public MyAddressPageLocators myaddress;
    public PersonalInfoPageLocators myinfo;
    public SignInPageLocators signout;
    public SearchResultsPageLocators search;
    public FacebookPage fbPage;
    String ValidEmailPageAlertMsg = " Newsletter : You have successfully subscribed to this newsletter.";
    String ValidEmailFooterAlertMsg = "You have successfully subscribed to this newsletter.";
    String AlreadyRegisteredPageAlertMsg = " Newsletter : This email address is already registered.";
    String AlreadyRegisteredFooterAlertMsg = "This email address is already registered.";
    String InvalidEmailPageAlertMsg = " Newsletter : Invalid email address.";
    String InvalidEmailFooterAlertMsg = "Invalid email address.";
    String facebookPageLink = "https://www.facebook.com/groups/525066904174158/";
    String facebookPageTile = "Selenium Framework";
    String twitterPageLink = "https://twitter.com/seleniumfrmwrk";
    String twitterPageTile = "Selenium Framework";
    String youtubePageLink = "https://www.youtube.com/channel/UCHl59sI3SRjQ-qPcTrgt0tA";
    String googlePlusPageLink = "https://plus.google.com/111979135243110831526/posts";
    String womenPageLink = "http://automationpractice.com/index.php?id_category=3&controller=category";
    String specialsPageLink = "http://automationpractice.com/index.php?controller=prices-drop";
    String newProductsPageLink = "http://automationpractice.com/index.php?controller=new-products";
    String bestSellersPageLink = "http://automationpractice.com/index.php?controller=new-products";
    String ourStoresPageLink = "http://automationpractice.com/index.php?controller=stores";
    String contactUsPageLink = "http://automationpractice.com/index.php?controller=contact";
    String termsOfUsePageLink = "http://automationpractice.com/index.php?id_cms=3&controller=cms";
    String aboutUsPageLink = "http://automationpractice.com/index.php?controller=stores";
    String sitemapPageLink = "http://automationpractice.com/index.php?controller=stores";
    String myOrdersPageLink = "http://automationpractice.com/index.php?controller=history";
    String myCreditSlipsPageLink = "http://automationpractice.com/index.php?controller=order-slip";
    String myAddressPageLink = "http://automationpractice.com/index.php?controller=addresses";
    String myPersonalInfoPageLink = "http://automationpractice.com/index.php?controller=identity";
    String signOutPageLink = "http://automationpractice.com/index.php?mylogout";

    String actualTitle = "//h2//span[text()='Selenium Framework']";
    
    String ExpectedTitle1 = "Selenium Framework";

    String fbPageTitle = "Selenium Framework";
    String itemName = "Blouse";

    String foundItemsName;
    AppManager app = new AppManager();

    public BasePageTest(WebDriver driver) throws IOException {
        this.base = new BasePageLocators();
        this.women = new CatalogPageLocators();
        this.specials = new SpecialsPageLocators();
        this.newproducts = new NewProductsPageLocators();
        this.bestsellers = new BestSellersPageLocators();
        this.ourstores = new OurStoresPageLocators();
        this.contactus = new ContactUsPageLocators();
        this.termsofuse = new TermsOfUsePageLocators();
        this.aboutus = new AboutUsPageLocators();
        this.sitemap = new SitemapPageLocators();
        this.myorders = new OrderHistoryPageLocators();
        this.creditslips = new CreditSlipsPageLocators();
        this.myaddress = new MyAddressPageLocators();
        this.myinfo = new PersonalInfoPageLocators();
        this.signout = new SignInPageLocators();
        this.search = new SearchResultsPageLocators();
        PageFactory.initElements((ElementLocatorFactory) driver, this);
    }

    @Test
     public void siteHeaderAdvClick() {
        base.wait.waitForElement(base.headerAdv);
        base.headerAdv.click(); }


    @Test
    public void searchingItem() {
        base.wait.waitForElement(base.womenDisplayBlock);
        String itemName = String.valueOf(base.womenDisplayBlock.findElement(By.xpath(BasePage_OR.ITEM_NAME)));
        Random rnd1 = new Random();
        int a = Math.round(rnd1.nextInt());
        while (a > 14) a -= 14;
        int count1 = 0;
        while (count1 < a) {
            base.womenDisplayBlock.sendKeys(Keys.DOWN);
            count1 = count1++;
        }
        base.womenDisplayBlock.sendKeys(Keys.RETURN);
        base.womenDisplayBlock.getText();
        base.searchFld.sendKeys(itemName);
        base.searchBtn.click();
        search.searchTitle.getText().equals(itemName);

    }

    @Test
    public void getItemName() {
        base.wait.waitForElement(base.womenDisplayBlock);
        base.womenDisplayBlock.findElement(By.xpath(BasePage_OR.ITEM_NAME)).getText();
    }

    @Test
    public void SearchingItem() {
        base.wait.waitForElement(base.womenDisplayBlock);
        itemName = base.womenDisplayBlock.findElement(By.xpath(BasePage_OR.ITEM_NAME)).getText();
        base.searchFld.sendKeys(itemName);
        base.searchBtn.click();
    }

    @Test
    public void clickContactUsBtn() {
        base.wait.waitForElement(base.contactUsBtn);
        base.contactUsBtn.click();
    }

    @Test
    public void clickSignBtn() {
        base.wait.waitForElement(base.signInBtn);
        base.signInBtn.click();
    }

    @Test
    public void clickShoppingCartIcn() {
        base.wait.waitForElement(base.shoppingCartIcn);
        base.shoppingCartIcn.click();
    }

    @Test
    public void clickWomenBtn() {
        base.wait.waitForElement(base.womenDisplayBlockTab);
        base.womenDisplayBlockTab.click();
        base.womenDisplayBlock.findElement(By.id("category-thumbnail"));
        base.womenDisplayBlock.findElements(By.className("sf-with-ul"));
        base.womenDisplayBlock.findElement(By.className("submenu-container"));
        base.womenDisplayBlock.findElement(By.linkText("Blouses"));
        base.womenDisplayBlock.findElement(By.linkText("Dresses"));
        base.womenDisplayBlock.findElement(By.linkText("Casual Dresses"));
    }

    @Test
    public void clickDressesBtn() {
        base.wait.waitForElement(base.dressesDisplayBlockTab);
        base.dressesDisplayBlockTab.click();
        base.dressesDisplayBlockTab.findElement(By.linkText("Casual Dresses"));
        base.dressesDisplayBlockTab.findElement(By.linkText("Evening Dresses"));
        base.dressesDisplayBlockTab.findElement(By.linkText("Summer Dresses"));
    }

    @Test
    public void clickTShirtsBtn() {
        base.wait.waitForElement(base.tShirtsDisplayBlockTab);
        base.tShirtsDisplayBlockTab.click();
    }

    @Test
    public void fillNewsLetterFieldWithInvalidEmail() {
        base.wait.waitForElement(base.NewsletterInputFld);
        base.NewsletterInputFld.sendKeys(RegistrationFormData.getUserEmailAddress().toString()+"*");
        base.submitNewsletterBtn.click();
        base.newsLetterInvalidAlertMsg.getValue().equals(InvalidEmailPageAlertMsg);
        base.enterYourEmailFldValue.getValue().equals(InvalidEmailFooterAlertMsg);
    }

    @Test
    public void fillNewsLetterFieldWithValidNewEmail() {
        base.wait.waitForElement(base.NewsletterInputFld);
        base.NewsletterInputFld.click();
        base.NewsletterInputFld.sendKeys(RegistrationFormData.getUserEmailAddress());
        base.submitNewsletterBtn.click();
        base.enterYourEmailFldValue.getValue().equals(ValidEmailPageAlertMsg);
        base.footerNewsLetterInputFldSuccessAlertMsg.getValue().equals(ValidEmailFooterAlertMsg);
    }

    @Test
    public void fillNewsLetterFieldWithAlreadyUsedEmail() {
        base.wait.waitForElement(base.NewsletterInputFld);
        base.NewsletterInputFld.click();
        base.NewsletterInputFld.sendKeys(Keys.DOWN);
        base.NewsletterInputFld.sendKeys(Keys.RETURN);
        base.submitNewsletterBtn.click();
        base.newsLetterAlreadyRegisteredAlertMsg.getValue().equals(AlreadyRegisteredPageAlertMsg);
        base.footerInputFldAlreadyRegisteredAlertMsg.getValue().equals(AlreadyRegisteredFooterAlertMsg);
    }

    @Test
    public void followUsByFacebook() {
        base.wait.waitForElement(base.facebookIcn);
        base.facebookIcn.click();
        app.getNavigationHelper().goToFbPage();
        try {
            fbPage.pageTitle.getText();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Assert.assertTrue(fbPage.pageTitle.getText().equals("Selenium Framework"));
    }

    @Test
    public void followUsByTwitter() {
        base.wait.waitForElement(base.twitterIcn);
        base.twitterIcn.click();
        app.getNavigationHelper().goToTwitterPage();
    }

    @Test
    public void followUsByYoutube() {
        base.wait.waitForElement(base.youtubeIcn);
        base.youtubeIcn.click();
        app.getNavigationHelper().goToYoutubePage();
    }

    @Test
    public void followUsByGooglePlus() {
        base.wait.waitForElement(base.googlePlusIcn);
        base.googlePlusIcn.click();
        app.getNavigationHelper().goToGooglePlusPage();
    }

    @Test
    public void goWomenPage() {
        base.wait.waitForElement(base.womenSubsection);
        base.womenSubsection.click();
        app.getNavigationHelper().goToWomenPage();
    }

    @Test
    public void goSpecialsPage() {
        base.wait.waitForElement(base.specialsSubsection);
        base.specialsSubsection.click();
        app.getNavigationHelper().goToSpecialsPage();
    }

    @Test
    public void goNewProductsPage() {
        base.wait.waitForElement(base.newProductsSubsection);
        base.newProductsSubsection.click();
        app.getNavigationHelper().goToNewProductsPage();
    }

    @Test
    public void goBestSellersPage() {
        base.wait.waitForElement(base.bestSellersSubsection);
        base.bestSellersSubsection.click();
        app.getNavigationHelper().goToBestSellersPage();
    }

    @Test
    public void goOurStoresPage() {
        base.wait.waitForElement(base.ourStoresSubsection);
        base.ourStoresSubsection.click();
        app.getNavigationHelper().goToOurStoresPage();
    }

    @Test
    public void goContactUsPage() {
        base.wait.waitForElement(base.contactUsSubsection);
        base.contactUsSubsection.click();
        app.getNavigationHelper().goToContactUsPage();
    }

    @Test
    public void goTermsOfUsePage() {
        base.wait.waitForElement(base.termsOfUseSubsection);
        base.termsOfUseSubsection.click();
        app.getNavigationHelper().goToTermsOfUsePage();
    }

    @Test
    public void goAboutUsPage() {
        base.wait.waitForElement(base.aboutUsSubsection);
        base.aboutUsSubsection.click();
        app.getNavigationHelper().goToAboutUsPage();
    }

    @Test
    public void goSiteMapPage() {
        base.wait.waitForElement(base.sitemapSubsection);
        base.sitemapSubsection.click();
        app.getNavigationHelper().goToSitemapPage();
    }

    @Test
    public void goMyOrdersPage() {
        base.wait.waitForElement(base.myOrdersSubsection);
        base.myOrdersSubsection.click();
        app.getNavigationHelper().goToMyOrdersPage();
    }

    @Test
    public void goMyCreditSlipsPage() {
        base.wait.waitForElement(base.myCreditSlipsSubsection);
        base.myCreditSlipsSubsection.click();
        app.getNavigationHelper().goToMyCreditSlipsPage();
    }

    @Test
    public void goMyAddressesPage() {
        base.wait.waitForElement(base.myAddressSubsection);
        base.myAddressSubsection.click();
        app.getNavigationHelper().goToMyAddressPagePage();
    }

    @Test
    public void goPersonalInfoPage() {
        base.wait.waitForElement(base.myPersonalInfoSubsection);
        base.myPersonalInfoSubsection.click();
        app.getNavigationHelper().goToMyPersonalInfoPage();
    }

    @Test
    public void goSignInPage() {
        base.wait.waitForElement(base.signOutSubsection);
        base.signOutSubsection.click();
        app.getNavigationHelper().goToSignOutPage();
    }
}
