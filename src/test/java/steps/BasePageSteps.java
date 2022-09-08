package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.*;
import objectRepository.BasePage_OR;
import org.jetbrains.annotations.NotNull;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import tests.BaseTest;

public class BasePageSteps extends BaseTest {
    public BasePageLocators basePage;
    public HomePageLocators homePage;
    public BestSellersPageLocators bestSellers;
    public NewProductsPageLocators newProducts;
    public SpecialsPageLocators priceDropPage;
    public OurStoresPageLocators storesMapPage;
    public ContactUsPageLocators contactUsPage;
    public TermsOfUsePageLocators termsOfUsePage;
    public AboutUsPageLocators aboutUdPage;
    public SitemapPageLocators sitemapPage;
    public OrderHistoryPageLocators myOrderPage;
    public CreditSlipsPageLocators myCreditSlipsPage;
    public MyAddressPageLocators myAddressPage;
    public PersonalInfoPageLocators myInfoPage;
    public SignInPageLocators signInPage;
    public CatalogPageLocators womanPage;
    public SearchResultsPageLocators searchPage;
    public FacebookPage fbPage;

    public BasePageSteps(WebDriver driver) {
        super(driver);
    }

    @Given ("Base page header is displayed with a searchField")
    public void searchFieldIsOnBasePage(@NotNull WebDriver driver) {
        driver.get("https://automationpractice.com/index.php");
        driver.findElement(By.xpath(BasePage_OR.SEARCH_FLD));
        Assert.assertTrue(basePage.searchFld.getText().equals("Search"));
    }

    @Given ("Base page header is displayed with <tabs> on it")
    public void tabsIsDisplayedOnPageHeader(@NotNull WebDriver driver) {
        driver.get("https://automationpractice.com/index.php"); }

    @Given("Base page footer is displayed with a subscribe NewsLetter field")
    public void inputFldIsOnPageFooter() {
        Assert.assertNotNull(basePage.pageFooter.findElement(By.xpath(BasePage_OR.FOOTER_NEWSLETTER_INPUT_FLD))); }

    @Given("Base page footer Follow Us section is displayed with social network icons on it")
    public void followUsBtnsIsOnPageFooter() {
        Assert.assertNotNull(basePage.pageFooter.findElement(By.xpath(BasePage_OR.FOOTER_FOLLOW_US_BLOCK))); }


    @Given ("Base page footer is displayed with the Categories, Information and My account Page links on it")
    public void pagesLinksIsOnPageFooter() {
        Assert.assertNotNull(basePage.pageFooter.findElement(By.xpath(BasePage_OR.FOOTER_CATEGORIES_SECT)));
        Assert.assertNotNull(basePage.pageFooter.findElement(By.xpath(BasePage_OR.FOOTER_INFORMATION_SECT)));
        Assert.assertNotNull(basePage.pageFooter.findElement(By.xpath(BasePage_OR.FOOTER_MY_ACCOUNT_SECT)));
    }

    @When ("I search for <itemName>")
    public void searchForItem(String itemName) { basePage.searchFld.sendKeys(itemName); }

    @When ("I click on a <page link> in the footer")
    public void clickOnFooterPageLink() {
        basePage.womenSubsection.click();
        basePage.specialsSubsection.click();
        basePage.newProductsSubsection.click();
        basePage.bestSellersSubsection.click();
        basePage.ourStoresSubsection.click();
        basePage.contactUsSubsection.click();
        basePage.termsOfUseSubsection.click();
        basePage.aboutUsSubsection.click();
        basePage.sitemapSubsection.click();
        basePage.myOrdersSubsection.click();
        basePage.myCreditSlipsSubsection.click();
        basePage.myAddressSubsection.click();
        basePage.myPersonalInfoSubsection.click();
        basePage.signOutSubsection.click();
    }

    @When("I hover mouse on <tab> button")
    public void mouseHoverOnTabBtn() {
        basePage.womenDisplayBlockTab.isEnabled();
        Assert.assertNotNull(basePage.womenDisplayBlock);
        basePage.dressesDisplayBlockTab.isEnabled();
        Assert.assertNotNull(basePage.dressesDisplayBlock);
        basePage.tShirtsDisplayBlockTab.isEnabled();
        Assert.assertNotNull(basePage.tShirtsDisplayBlock);
    }

    @When ("I fill up the subscribe NewsLetter field with <valid user email>")
    public void fillInValidEmail(String validEmail) {
        basePage.footerNewsLetterInputFld.sendKeys(validEmail);
    }

    @When ("I fill up the subscribe NewsLetter field with <invalid user email>")
    public void fillInInvalidEmail(String inValidEmail) {
        basePage.footerNewsLetterInputFld.sendKeys(inValidEmail);
    }

    @When ("I click on an <social network icon>")
    public void clickOnSocialBtn() {
        basePage.facebookIcn.click();
        Assert.assertNotNull(fbPage.pageTitle);
    }

    @And ("I see <itemName> on HomePage")
    public void isItemNameDisplayed() { Assert.assertNotNull(homePage.itemName); }

    @And ("I see the <successAlertMsg> in the footer NewsLetterInputFld")
    public void isSuccessFooterAlertMsgPresent() {
        Assert.assertNotNull(basePage.newsLetterSuccessAlertMsg);
    }

    @And ("I click on submitNewsletter button")
    public void clickOnNewsLetterBtn() {
        basePage.footerNewsLetterInputFldSubmitBtn.click();
    }

    @And ("I signed in as site user")
    public void isSignedInAsUser() {
        Assert.assertNotNull(basePage.headerUserNameInfo);
    }

    @And ("I see the <dangerAlertMsg> in the footer NewsLetterInputFld")
    public void isDangerFooterAlertMsgPresent() {
        Assert.assertNotNull(basePage.footerInputFldAlreadyRegisteredAlertMsg);
    }

    @And ("I click on submitNewsletter button")
    public void clickOnSubmitNewsLetterBtn() {
        basePage.submitNewsletterBtn.click();
    }

    @And ("I see <validEmailPageAlertMsg> on the page")
    public void isValidEmailPageAlertPresent() {
        Assert.assertNotNull(basePage.newsLetterSuccessAlertMsg);
    }

    @And ("I fill in the subscribe NewsLetter field with the same <valid user email>")
    public void fillInNewsLetterFldWithValidEmail(String validUserEmail) {
        basePage.footerNewsLetterInputFld.sendKeys(validUserEmail);
    }

    @And ("I see the <page title> on it")
    public void isPageTitlePresent() {
        Assert.assertNotNull(fbPage.pageTitle);
    }

    @And ("I see the same or corresponding <page heading> on it")
    public void isTheSamePageHeading() {
        basePage.womenSubsection.click();
        Assert.assertNotNull(homePage.pageTitle);
        basePage.specialsSubsection.click();
        Assert.assertNotNull(priceDropPage.pageTitle);
        basePage.newProductsSubsection.click();
        Assert.assertNotNull(newProducts.pageTitle);
        basePage.bestSellersSubsection.click();
        Assert.assertNotNull(bestSellers.pageTitle);
        basePage.ourStoresSubsection.click();
        Assert.assertNotNull(storesMapPage.pageTitle);
        basePage.contactUsSubsection.click();
        Assert.assertNotNull(contactUsPage.pageTitle);
        basePage.termsOfUseSubsection.click();
        Assert.assertNotNull(termsOfUsePage.pageTitle);
        basePage.aboutUsSubsection.click();
        Assert.assertNotNull(aboutUdPage.pageTitle);
        basePage.sitemapSubsection.click();
        Assert.assertNotNull(sitemapPage.pageTitle);
        basePage.myOrdersSubsection.click();
        Assert.assertNotNull(myOrderPage.pageTitle);
        basePage.myCreditSlipsSubsection.click();
        Assert.assertNotNull(myCreditSlipsPage.pageTitle);
        basePage.myAddressSubsection.click();
        Assert.assertNotNull(myAddressPage.pageTitle);
        basePage.myPersonalInfoSubsection.click();
        Assert.assertNotNull(myInfoPage.pageTitle);
        basePage.signOutSubsection.click();
        Assert.assertNotNull(signInPage.pageTitle);
    }

    @Then ("I see <searchResult> in search result block")
    public void isSearchResultPresent() {
        Assert.assertNotNull(searchPage.firstProductName);
    }

    @Then ("I see submenu-container opens with available <submenu-container options>")
    public void isSubmenuOptionsAvailable() {
        Assert.assertNotNull(basePage.pageHeader.findElement(By.xpath(BasePage_OR.HEADER_BLOCK_TOP_MENU)));
    }

    @Then("I see <dangerEmailPageAlertMsg> on the page")
    public void isDangerEmailPageAlertMsgPresent() {
        Assert.assertNotNull(basePage.footerInputFldAlreadyRegisteredAlertMsg);
    }

    @Then ("I see <invalidEmailPageAlertMsg> on the page")
    public void isInvalidEmailPageAlertMsgPresent() {
        Assert.assertNotNull(basePage.footerNewsLetterInputFldInvalidEmailAlertMsg);
    }

    @Then ("The <social network page> opens")
    public void isSocialNetworkPageOpens() {
        Assert.assertNotNull(fbPage.pageTitle);
    }

    @Then ("The site page opens with the corresponding <navigation page Tab text>")
    public void isNavigationPageTabPresent() {
        basePage.womenSubsection.click();
        Assert.assertNotNull(womanPage.navigationTab);
        basePage.specialsSubsection.click();
        Assert.assertNotNull(priceDropPage.navigationTab);
        basePage.newProductsSubsection.click();
        Assert.assertNotNull(newProducts.navigationTab);
        basePage.bestSellersSubsection.click();
        Assert.assertNotNull(bestSellers.navigationTab);
        basePage.ourStoresSubsection.click();
        Assert.assertNotNull(storesMapPage.navigationTab);
        basePage.contactUsSubsection.click();
        Assert.assertNotNull(contactUsPage.navigationTab);
        basePage.termsOfUseSubsection.click();
        Assert.assertNotNull(termsOfUsePage.navigationTab);
        basePage.aboutUsSubsection.click();
        Assert.assertNotNull(aboutUdPage.navigationTab);
        basePage.sitemapSubsection.click();
        Assert.assertNotNull(sitemapPage.navigationTab);
        basePage.myOrdersSubsection.click();
        Assert.assertNotNull(myOrderPage.navigationTab);
        basePage.myCreditSlipsSubsection.click();
        Assert.assertNotNull(myCreditSlipsPage.navigationTab);
        basePage.myAddressSubsection.click();
        Assert.assertNotNull(myAddressPage.navigationTab);
        basePage.myPersonalInfoSubsection.click();
        Assert.assertNotNull(myInfoPage.navigationTab);
        basePage.signOutSubsection.click();
        Assert.assertNotNull(signInPage.navigationTab);
    }
}

