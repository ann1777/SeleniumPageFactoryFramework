package tests;

import locators.*;
import model.RegistrationFormData;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.testng.Assert;
import java.util.Random;

import static tests.BaseTest.driver;

public class BasePageTest{
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
    String itemName;
    String foundItemsName;

    public BasePageTest(WebDriver driver){
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
        PageFactory.initElements((ElementLocatorFactory) driver, this);
    }

    @Test
     public void siteHeaderAdvClick() { base.headerAdv.click(); }


    @Test
    public void SearchingItems() {
        base.womenDisplayBlock.findElement(By.xpath("//h5/a"));
        Random rnd1 = new Random();
        int a = Math.round(rnd1.nextInt());
        while (a > 14) a -= 14;
        int count1 = 0;
        while (count1 < a) {
            base.womenDisplayBlock.sendKeys(Keys.DOWN);
            count1 = count1++;
        }
        String itemName = base.womenDisplayBlock.sendKeys(Keys.RETURN).getText();
        base.searchFld.sendKeys(itemName);
        base.searchBtn.click();
        base.womenDisplayBlock.findElement(By.xpath(foundItemsName));
        Assert.assertEquals(itemName, foundItemsName);

    }

    @Test
    public String getItemName() {
        base.womenDisplayBlock.findElement(By.xpath("//h5/a")).getText();
        return this.foundItemsName;
    }

    @Test
    public void SearchingItem() {
        itemName = base.womenDisplayBlock.findElement(By.xpath("//h5/a")).getText();
        base.searchFld.sendKeys(itemName);
        base.searchBtn.click();
    }

    @Test
    public void clickContactUsBtn() {
        base.contactUsBtn.click();
    }

    @Test
    public void clickSignBtn() {
        base.signInBtn.click();
    }

    @Test
    public void clickShoppingCartIcn() {
        base.shoppingCartIcn.click();
    }

    @Test
    public void clickWomenBtn() {
        base.womenDisplayBlockTab.click();
        base.womenDisplayBlock.findElement(By.id("category-thumbnail"));
        base.womenDisplayBlock.findElement(By.className("sf-with-ul"));
        base.womenDisplayBlock.findElement(By.className("submenu-container"));
        base.womenDisplayBlock.findElement(By.linkText("Blouses"));
        base.womenDisplayBlock.findElement(By.linkText("Dresses"));
        base.womenDisplayBlock.findElement(By.linkText("Casual Dresses"));
    }

    @Test
    public void clickDressesBtn() {
        base.dressesDisplayBlockTab.click();
        base.dressesDisplayBlockTab.findElement(By.linkText("Casual Dresses"));
        base.dressesDisplayBlockTab.findElement(By.linkText("Evening Dresses"));
        base.dressesDisplayBlockTab.findElement(By.linkText("Summer Dresses"));
    }

    @Test
    public void clickTShirtsBtn() {
        base.tShirtsDisplayBlockTab.click();
    }

    @Test
    public void fillNewsLetterFieldWithInvalidEmail() {
        base.NewsletterInputFld.sendKeys(RegistrationFormData.getUserEmailAddress().toString()+"*");
        base.submitNewsletterBtn.click();
        base.newsLetterInvalidAlertMsg.getValue().equals(InvalidEmailPageAlertMsg);
        base.enterYourEmailFldValue.getValue().equals(InvalidEmailFooterAlertMsg);
    }

    @Test
    public void fillNewsLetterFieldWithValidNewEmail() {
        base.NewsletterInputFld.click();
        base.NewsletterInputFld.sendKeys(RegistrationFormData.getUserEmailAddress());
        base.submitNewsletterBtn.click();
        base.enterYourEmailFldValue.getValue().equals(ValidEmailPageAlertMsg);
        base.footerNewsLetterInputFldSuccessAlertMsg.getValue().equals(ValidEmailFooterAlertMsg);
    }

    @Test
    public void fillNewsLetterFieldWithAlreadyUsedEmail() {
        base.NewsletterInputFld.click();
        base.NewsletterInputFld.sendKeys(Keys.DOWN);
        base.NewsletterInputFld.sendKeys(Keys.RETURN);
        base.submitNewsletterBtn.click();
        base.newsLetterAlreadyRegisteredAlertMsg.getValue().equals(AlreadyRegisteredPageAlertMsg);
        base.footerInputFldAlreadyRegisteredAlertMsg.getValue().equals(AlreadyRegisteredFooterAlertMsg);
    }

    @Test
    public FacebookPage followUsByFacebook() {
        base.facebookIcn.click();
        try {
            driver.get(facebookPageLink);
            return new FacebookPage(driver);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

//        Iterator<String> BasePage = s.iterator();
//        String facebookPage = BasePage.next();
//        if(!BasePage.equals(facebookPage)) {
//            driver.switchTo().window(facebookPage);
//        }
//        System.out.println(driver.switchTo().window(facebookPage).getTitle());
    }

    @Test
    public TwitterPage followUsByTwitter() {
        base.twitterIcn.click();
        try{
            driver.get(twitterPageLink);
            return new TwitterPage(driver);
        } catch (Exception e1) {
            throw new RuntimeException(e1);
        }
    }

    @Test
    public void followUsByYoutube() {
        base.youtubeIcn.click();
        driver.get(youtubePageLink);
    }

    @Test
    public void followUsByGooglePlus() {
        base.googlePlusIcn.click();
        driver.get(googlePlusPageLink);
    }

    @Test
    public void goWomenPage() {
        base.womenSubsection.click();
        driver.get(womenPageLink);
    }

    @Test
    public void goSpecialsPage() {
        base.specialsSubsection.click();
        driver.get(specialsPageLink);
    }

    @Test
    public void goNewProductsPage() {
        base.newProductsSubsection.click();
        driver.get(newProductsPageLink);
    }

    @Test
    public void goBestSellersPage() {
        base.bestSellersSubsection.click();
        driver.get(bestSellersPageLink);
    }

    @Test
    public void goOurStoresPage() {
        base.ourStoresSubsection.click();
        driver.get(ourStoresPageLink);
    }

    @Test
    public void goContactUsPage() {
        base.contactUsSubsection.click();
        driver.get(contactUsPageLink);
    }

    @Test
    public void goTermsOfUsePage() {
        base.termsOfUseSubsection.click();
        driver.get(termsOfUsePageLink);
    }

    @Test
    public void goAboutUsPage() {
        base.aboutUsSubsection.click();
        driver.get(aboutUsPageLink);
    }

    @Test
    public void goSiteMapPage() {
        base.sitemapSubsection.click();
        driver.get(sitemapPageLink);
    }

    @Test
    public void goMyOrdersPage() {
        base.myOrdersSubsection.click();
        driver.get(myOrdersPageLink);
    }

    @Test
    public void goMyCreditSlipsPage() {
        base.myCreditSlipsSubsection.click();
        driver.get(myCreditSlipsPageLink);
    }

    @Test
    public void goMyAddressesPage() {
        base.myAddressSubsection.click();
        driver.get(myAddressPageLink);
    }

    @Test
    public void goPersonalInfoPage() {
        base.myPersonalInfoSubsection.click();
        driver.get(myPersonalInfoPageLink);
    }

    @Test
    public void goSignInPage() {
        base.signOutSubsection.click();
        driver.get(signOutPageLink);
    }
}
