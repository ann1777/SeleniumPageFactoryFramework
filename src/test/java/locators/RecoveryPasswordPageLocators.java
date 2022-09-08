package locators;

import objectRepository.RecoveryPasswordPage_OR;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

public class RecoveryPasswordPageLocators extends BasePageLocators {
    WebDriver driver;

    @FindBy(css = RecoveryPasswordPage_OR.RECOVERYPASSWDPAGE_HOME_ICN)
    public WebElement homeIcn;

    @FindBy(css = RecoveryPasswordPage_OR.RECOVERYPASSWDPAGE_NAVIGATION_PIPS)
    public WebElement navigationPips;

    @FindBy(xpath = RecoveryPasswordPage_OR.RECOVERYPASSWDPAGE_AUTHENTICATION_TAB)
    public WebElement authenticationTab;

    @FindBy(xpath = RecoveryPasswordPage_OR.RECOVERYPASSWDPAGE_FORGOTYOURPASSWORD_TAB)
    public WebElement forgotYourPasswordTab;

    @FindBy(xpath = RecoveryPasswordPage_OR.RECOVERYPASSWDPAGE_HEADER)
    public WebElement recoveryPageHeader;

    @FindBy(xpath = RecoveryPasswordPage_OR.RECOVERYPASSWORD_TEXT)
    public WebElement recoveryPasswordText;

    @FindBy(xpath = RecoveryPasswordPage_OR.RECOVERYPASSWDPAGE_EMAILADDRESS_LABEL)
    public WebElement emailAddressLabel;

    @FindBy(xpath = RecoveryPasswordPage_OR.RECOVERYPASSWDPAGE_EMAILADDRESS_FLD)
    public WebElement emailAddressFld;

    @FindBy(xpath = RecoveryPasswordPage_OR.RECOVERYPASSWDPAGE_EMAILADDRESS_SUBMIT_BTN)
    public WebElement submitBtn;

    @FindBy(xpath = RecoveryPasswordPage_OR.RECOVERYPASSWDPAGE_BACKTOLOGIN_BTN)
    public WebElement backToLoginBtn;

    public RecoveryPasswordPageLocators(WebDriver driver) {
        super(driver);
        this.driver = driver;
        driver.get("http://automationpractice.com/index.php?controller=password");
        PageFactory.initElements((ElementLocatorFactory) driver, this);
    }
    public RecoveryPasswordPageLocators() {
    }
}
