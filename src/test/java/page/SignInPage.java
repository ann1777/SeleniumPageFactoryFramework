package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends BasePage{
    WebDriver driver;

    @FindBy(xpath = "//*[@id='center_column']/h1")
    WebElement authenticationPageHeader;

    @FindBy(xpath = "//*[@id='create-account_form']/h3")
    WebElement createAnAccountFormHeader;

    @FindBy(xpath = "//*[@id='email_create']")
    WebElement createAccountEmailField;

    @FindBy(xpath = "//*[text() = 'Create an account']")
//    @FindBy(xpath = "//button[@id='SubmitCreate']/span")
    WebElement createAccountSubmitBtn;

    @FindBy(xpath = "//*[@id='login_form']/h3")
    WebElement alreadyRegisteredFormHeader;

    @FindBy(xpath = "//*[@id='email']")
    WebElement emailAddressField;

    @FindBy(xpath = "//*[@id='passwd']")
    WebElement passwordField;

    @FindBy(css = "a[title='Recover your forgotten password']")
//    @FindBy(xpath = "//a[title='Recover your forgotten password']")
    WebElement forgotPasswordLink;

    @FindBy(css = "button#SubmitLogin")
//    @FindBy(xpath = "//*[text() = 'Sign in']")
//    @FindBy(xpath = "//button[@id='SubmitLogin']")
    WebElement SignInBtn;

    @FindBy(css = ".icon-home")
    WebElement homeIcn;

    @FindBy(css = ".navigation-pipe")
    WebElement navigationPipe;

    @FindBy(css = ".navigation_page")
    WebElement navigationTab;

    public SignInPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        PageFactory.initElements(driver, this);
    }
}
