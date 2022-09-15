package locators;

import objectRepository.SignInPage_OR;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

public class SignInPageLocators extends BasePageLocators {
    WebDriver driver;

    @FindBy(xpath = SignInPage_OR.SIGNINPAGE_AUTHENTICATION_PAGEHEADER)
    public WebElement pageTitle;

    @FindBy(xpath = SignInPage_OR.SIGNINPAGE_CREATEACCOUNTFORM_HEADER)
    public WebElement createAnAccountFormHeader;

    @FindBy(xpath = SignInPage_OR.SIGNINPAGE_CREATEACCOUNT_EMAILFLD)
    public WebElement createAccountEmailField;

    @FindBy(xpath = SignInPage_OR.SIGNINPAGE_CREATEACCOUNT_SUBMITBTN)
    public WebElement createAccountSubmitBtn;

    @FindBy(xpath = SignInPage_OR.SIGNINPAGE_ALREADYREGISTEREDFORM_HEADER)
    public WebElement alreadyRegisteredFormHeader;

    @FindBy(xpath = SignInPage_OR.SIGNINPAGE_EMAILADDRESS_FLD)
    public WebElement emailAddressField;

    @FindBy(xpath = SignInPage_OR.SIGNINPAGE_PASSWORD_FLD)
    public WebElement passwordField;

    @FindBy(css = SignInPage_OR.SIGNINPAGE_FORGOTPASSWORD_LINK)
    public WebElement forgotPasswordLink;

    @FindBy(css = SignInPage_OR.SIGNINPAGE_SIGNIN_BTN)
    public WebElement SignInBtn;

    @FindBy(css = SignInPage_OR.SIGNINPAGE_HOMEICN)
    public WebElement homeIcn;

    @FindBy(css = SignInPage_OR.SIGNINPAGE_NAVIGATION_PIPE)
    public WebElement navigationPipe;

    @FindBy(css = SignInPage_OR.SIGNINPAGE_NAVIGATION_TAB)
    public WebElement navigationTab;

    public SignInPageLocators(WebDriver driver) {
        super(driver);
        this.driver = driver;
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        PageFactory.initElements((ElementLocatorFactory) driver, this);
    }

    public SignInPageLocators() {

    }
}
