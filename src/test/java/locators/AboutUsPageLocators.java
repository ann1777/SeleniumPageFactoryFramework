package locators;

import objectRepository.AboutUsPage_OR;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

public class AboutUsPageLocators  extends BasePageLocators{
    public WebDriver driver;

    @FindBy(css = AboutUsPage_OR.HOME_ICN)
    WebElement homeIcn;
    @FindBy(css = AboutUsPage_OR.NAVIGATION_PIPE)
    WebElement navigationPipe1;
    @FindBy(css = AboutUsPage_OR.ABOUT_US_NAVIGATION_TAB)
    WebElement navigationTab;
    @FindBy(css = AboutUsPage_OR.ABOUT_US_PAGE_TITLE)
    WebElement myAddressPageTitle;
    @FindBy(css = AboutUsPage_OR.OUR_COMPANY_BLOCK_TITLE)
    WebElement ourCompanyBlockTitle;
    @FindBy(css = AboutUsPage_OR.WE_LIVE_RULES_TITLE)
    WebElement weLiveRulesTitle;
    @FindBy(css = AboutUsPage_OR.WE_LIVE_RULES_TITLE_OK_ICNs)
    WebElement weLiveRulesTitleOKIcn;
    @FindBy(css = AboutUsPage_OR.TOP_QUANTITY_PRODUCTS_RULE)
    WebElement topQuantityProductsRule;
    @FindBy(css = AboutUsPage_OR.BEST_CUSTOMER_PRODUCTS_RULE)
    WebElement bestCustomerProductsRule;
    @FindBy(css = AboutUsPage_OR.BACK_GUARANTEE_PRODUCTS_RULE)
    WebElement backGuarantyProductsRule;
    @FindBy(css = AboutUsPage_OR.OUR_TEAM_BLOCK_TITLE)
    WebElement ourTeamBlockTitle;
    @FindBy(css = AboutUsPage_OR.TESTIMONIALS_BLOCK_TITLE)
    WebElement testimonialBlockTitle;

    public AboutUsPageLocators(WebDriver driver) {
        super(driver);
        this.driver = driver;
        driver.get("http://automationpractice.com/index.php?controller=addresses");
        PageFactory.initElements((ElementLocatorFactory) driver, this);
    }
    public AboutUsPageLocators() {
    }


}
