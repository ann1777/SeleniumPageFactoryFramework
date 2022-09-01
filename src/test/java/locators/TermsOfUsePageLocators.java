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
    WebElement homeIcn;

    @FindBy(css = TermsOfUsePage_OR.NAVIGATION_PIPE)
    WebElement navigationPips;

    @FindBy(css = TermsOfUsePage_OR.TERMS_CONDITIONS_NAVIGATION_TAB)
    WebElement navigationTab;

    @FindBy(xpath = TermsOfUsePage_OR.TERMS_CONDITIONS_PAGE_TITLE)
    WebElement pageTitle;

    @FindBy(xpath = TermsOfUsePage_OR.TERMS_CONDITIONS_RULES_TITLE)
    WebElement rulesTitle;

    @FindBy(xpath = TermsOfUsePage_OR.TERMS_CONDITIONS_RULES_CONTENT)
    WebElement rulesContent;

    public TermsOfUsePageLocators(WebDriver driver) {
        this.driver = driver;
        driver.get("http://automationpractice.com/index.php?id_cms=3&controller=cms");
        PageFactory.initElements((ElementLocatorFactory) driver, this);
    }
    public TermsOfUsePageLocators() {
    }
}
