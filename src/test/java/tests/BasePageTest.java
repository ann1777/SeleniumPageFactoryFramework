package tests;

import locators.*;
import model.RegistrationFormData;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.testng.Assert;

import java.util.Iterator;
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

    public void siteHeaderAdvClick() {
        base.headerAdv.click();
    }

    @Test
    public void SearchingItems() {
        base.womenDisplayBlock.findElement(By.xpath("//h5/a");
        Random rnd1 = new Random();
        while (rnd1.nextInt() > 14) rnd1.nextInt() -= 14;
        int count1 = 0;
        while (count1 < rnd1.nextInt()) {
            base.womenDisplayBlock.sendKeys(Keys.DOWN);
            count1 = count1++;
        }
        WebElement itemName;
        itemName = base.womenDisplayBlock.sendKeys(Keys.RETURN).getText();

        base.searchFld.sendKeys((CharSequence) itemName);
        base.searchBtn.click();
        base.womenDisplayBlock.findElement(By.xpath(foundItemsName);
        Assert.assertEquals(itemName, foundItemsName);

    }

    public String getItemName() {
        base.womenDisplayBlock.findElement(By.xpath("//h5/a")).getText();
        return this.foundItemsName;
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

    @Test
    public void fillNewsLetterFildWithInvalidEmail() {
        base.NewsletterInputFld.sendKeys(RegistrationFormData.getUserEmailAddress().toString()+"*");
        base.submitNewsletterBtn.click();
        base.newsLetterInvalidAlertMsg.getValue().equals(InvalidEmailPageAlertMsg);
        base.enterYourEmailFldValue.getValue().equals(InvalidEmailFooterAlertMsg);
    }

    @Test
    public void fillNewsLetterFildWithValidNewEmail() {
        base.NewsletterInputFld.click();
        base.NewsletterInputFld.sendKeys(RegistrationFormData.getUserEmailAddress());
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

    @Test
    public FacebookPage followUsByFacebook() {
        base.facebookIcn.click();
        try {
            driver.get(facebookPageLink);
            return new FacebookPage(driver);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Iterator<String> BasePage = s.iterator();
        String facebookPage = BasePage.next();
        if(!BasePage.equals(facebookPage)) {
            driver.switchTo().window(facebookPage);
        }
        System.out.println(driver.switchTo().window(facebookPage).getTitle());
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
        Iterator<String> BasePage = s1.iterator();
        String twitterPage = BasePage.next();
        if(!BasePage.equals(twitterPage)) {
            driver.switchTo().window(twitterPage);
        }
        String ActualTitle2 = driver.switchTo().window(twitterPage).getTitle();
        System.out.println(ActualTitle2);
        Assert.assertEquals(twitterPageTile, ActualTitle2);
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
