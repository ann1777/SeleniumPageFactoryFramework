package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecoveryPasswordPage extends BasePage{
    WebDriver driver;

    @FindBy(css = ".icon-home")
    WebElement homeIcn;

    @FindBy(css = ".navigation-pipe")
    WebElement navigationPips;

    @FindBy(xpath = "//*[text() = 'Authentication']")
    WebElement authenticationTab;

    @FindBy(xpath = "//*[@id=\"columns\"]/div[1]/text()[last()]")
    WebElement forgotYourPasswordTab;

    @FindBy(xpath = "//*[text() = 'Forgot your password?']")
    WebElement recoveryPageHeader;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div/p")
    WebElement recoveryPasswordText;

    @FindBy(xpath = "//*[text() = 'Email address']")
    WebElement emailAddressLabel;

    @FindBy(xpath = "//*[@id=\"email\"]")
    WebElement emailAddressFld;

    @FindBy(xpath = "//*[@class = \"submit\"]")
    WebElement submitBtn;

    @FindBy(xpath = "//*[text() = 'Back to Login']")
    WebElement backToLoginBtn;

    public RecoveryPasswordPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        driver.get("http://automationpractice.com/index.php?controller=password");
        PageFactory.initElements(driver, this);
    }
}
