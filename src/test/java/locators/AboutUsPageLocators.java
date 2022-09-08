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
    public WebElement homeIcn;

    @FindBy(css = AboutUsPage_OR.NAVIGATION_PIPE)
    public WebElement navigationPipe1;

    @FindBy(css = AboutUsPage_OR.ABOUT_US_NAVIGATION_TAB)
    public WebElement navigationTab;

    @FindBy(css = AboutUsPage_OR.ABOUT_US_PAGE_TITLE)
    public WebElement pageTitle;

    @FindBy(css = AboutUsPage_OR.OUR_COMPANY_BLOCK_TITLE)
    public WebElement ourCompanyBlockTitle;

    @FindBy(css = AboutUsPage_OR.WE_LIVE_RULES_TITLE)
    public WebElement weLiveRulesTitle;

    @FindBy(css = AboutUsPage_OR.WE_LIVE_RULES_TITLE_OK_ICNs)
    public WebElement weLiveRulesTitleOKIcn;

    @FindBy(css = AboutUsPage_OR.TOP_QUANTITY_PRODUCTS_RULE)
    public WebElement topQuantityProductsRule;

    @FindBy(css = AboutUsPage_OR.BEST_CUSTOMER_PRODUCTS_RULE)
    public WebElement bestCustomerProductsRule;

    @FindBy(css = AboutUsPage_OR.BACK_GUARANTEE_PRODUCTS_RULE)
    public WebElement backGuarantyProductsRule;

    @FindBy(css = AboutUsPage_OR.OUR_TEAM_BLOCK_TITLE)
    public WebElement ourTeamBlockTitle;

    @FindBy(css = AboutUsPage_OR.TESTIMONIALS_BLOCK_TITLE)
    public WebElement testimonialBlockTitle;

    public AboutUsPageLocators(WebDriver driver) {
        super(driver);
        this.driver = driver;
        driver.get("http://automationpractice.com/index.php?controller=addresses");
        PageFactory.initElements((ElementLocatorFactory) driver, this);
    }
    public AboutUsPageLocators() {
    }


}
