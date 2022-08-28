package page;

import objectRepository.SignInPage_OR;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends BasePage{
    WebDriver driver;

    @FindBy(xpath = SignInPage_OR.SIGNINPAGE_AUTHENTICATION_PAGEHEADER)
    WebElement authenticationPageHeader;

    @FindBy(xpath = SignInPage_OR.SIGNINPAGE_CREATEACCOUNTFORM_HEADER)
    WebElement createAnAccountFormHeader;
    @FindBy(xpath = SignInPage_OR.SIGNINPAGE_CREATEACCOUNT_EMAILFLD)
    WebElement createAccountEmailField;
    @FindBy(xpath = SignInPage_OR.SIGNINPAGE_CREATEACCOUNT_SUBMITBTN)
//    @FindBy(xpath = "//button[@id='SubmitCreate']/span")
    WebElement createAccountSubmitBtn;

    @FindBy(xpath = SignInPage_OR.SIGNINPAGE_ALREADYREGISTEREDFORM_HEADER)
    WebElement alreadyRegisteredFormHeader;

    @FindBy(xpath = SignInPage_OR.SIGNINPAGE_EMAILADDRESS_FLD)
    WebElement emailAddressField;

    @FindBy(xpath = SignInPage_OR.SIGNINPAGE_PASSWORD_FLD)
    WebElement passwordField;

    @FindBy(css = SignInPage_OR.SIGNINPAGE_FORGOTPASSWORD_LINK)
//    @FindBy(xpath = "//a[title='Recover your forgotten password']")
    WebElement forgotPasswordLink;

    @FindBy(css = SignInPage_OR.SIGNINPAGE_SIGNIN_BTN)
//    @FindBy(xpath = "//*[text() = 'Sign in']")
//    @FindBy(xpath = "//button[@id='SubmitLogin']")
    WebElement SignInBtn;

    @FindBy(css = SignInPage_OR.SIGNINPAGE_HOMEICN)
    WebElement homeIcn;

    @FindBy(css = SignInPage_OR.SIGNINPAGE_NAVIGATION_PIPE)
    WebElement navigationPipe;

    @FindBy(css = SignInPage_OR.SIGNINPAGE_NAVIGATION_TAB)
    WebElement navigationTab;

    public SignInPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        PageFactory.initElements(driver, this);
    }
    public void createUserAccount(){
        createAccountEmailField.sendKeys("testuser987@gmail.com");
        createAccountSubmitBtn.click();


    }
}
