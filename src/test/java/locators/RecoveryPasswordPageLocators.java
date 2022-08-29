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
    WebElement homeIcn;

    @FindBy(css = RecoveryPasswordPage_OR.RECOVERYPASSWDPAGE_NAVIGATION_PIPS)
    WebElement navigationPips;

    @FindBy(xpath = RecoveryPasswordPage_OR.RECOVERYPASSWDPAGE_AUTHENTICATION_TAB)
    WebElement authenticationTab;

    @FindBy(xpath = RecoveryPasswordPage_OR.RECOVERYPASSWDPAGE_FORGOTYOURPASSWORD_TAB)
    WebElement forgotYourPasswordTab;

    @FindBy(xpath = RecoveryPasswordPage_OR.RECOVERYPASSWDPAGE_HEADER)
    WebElement recoveryPageHeader;

    @FindBy(xpath = RecoveryPasswordPage_OR.RECOVERYPASSWORD_TEXT)
    WebElement recoveryPasswordText;

    @FindBy(xpath = RecoveryPasswordPage_OR.RECOVERYPASSWDPAGE_EMAILADDRESS_LABEL)
    WebElement emailAddressLabel;

    @FindBy(xpath = RecoveryPasswordPage_OR.RECOVERYPASSWDPAGE_EMAILADDRESS_FLD)
    WebElement emailAddressFld;

    @FindBy(xpath = RecoveryPasswordPage_OR.RECOVERYPASSWDPAGE_EMAILADDRESS_SUBMIT_BTN)
    WebElement submitBtn;

    @FindBy(xpath = RecoveryPasswordPage_OR.RECOVERYPASSWDPAGE_BACKTOLOGIN_BTN)
    WebElement backToLoginBtn;

    public RecoveryPasswordPageLocators(WebDriver driver) {
        super(driver);
        this.driver = driver;
        driver.get("http://automationpractice.com/index.php?controller=password");
        PageFactory.initElements((ElementLocatorFactory) driver, this);
    }
    public RecoveryPasswordPageLocators() {
    }
}
