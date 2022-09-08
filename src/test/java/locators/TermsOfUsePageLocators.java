package locators;

import helpers.wait.WaitHelper;
import objectRepository.TermsOfUsePage_OR;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

public class TermsOfUsePageLocators extends BasePageLocators{
    public WebDriver driver;
    public WaitHelper wait;
    @FindBy(css = TermsOfUsePage_OR.HOME_ICN)
    public WebElement homeIcn;

    @FindBy(css = TermsOfUsePage_OR.NAVIGATION_PIPE)
    public WebElement navigationPips;

    @FindBy(css = TermsOfUsePage_OR.TERMS_CONDITIONS_NAVIGATION_TAB)
    public WebElement navigationTab;

    @FindBy(xpath = TermsOfUsePage_OR.TERMS_CONDITIONS_PAGE_TITLE)
    public WebElement pageTitle;

    @FindBy(xpath = TermsOfUsePage_OR.TERMS_CONDITIONS_RULES_TITLE)
    public WebElement rulesTitle;

    @FindBy(xpath = TermsOfUsePage_OR.TERMS_CONDITIONS_RULES_CONTENT)
    public WebElement rulesContent;

    public TermsOfUsePageLocators(WebDriver driver) {
        this.driver = driver;
        driver.get("http://automationpractice.com/index.php?id_cms=3&controller=cms");
        PageFactory.initElements((ElementLocatorFactory) driver, this);
    }
    public TermsOfUsePageLocators() {
    }
}
