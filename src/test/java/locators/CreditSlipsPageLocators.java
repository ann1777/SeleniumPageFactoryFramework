package locators;

import objectRepository.CreditSlipsPage_OR;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

public class CreditSlipsPageLocators extends BasePageLocators {
    public WebDriver driver;

    @FindBy(css = CreditSlipsPage_OR.CREDITSLIPSPAGE_HOMEICN)
    public WebElement homeIcn;

    @FindBy(css = CreditSlipsPage_OR.CREDITSLIPSPAGE_NAVIGATION_PIPE1)
    public WebElement navigationPipe1;

    @FindBy(css = CreditSlipsPage_OR.CREDITSLIPSPAGE_NYACCOUNT_TAB)
    public WebElement navigationTab;

    @FindBy(css = CreditSlipsPage_OR.CREDITSLIPSPAGE_NAVIGATION_PIPE2)
    public WebElement navigationPipe2;

    @FindBy(css = CreditSlipsPage_OR.CREDITSLIPSPAGE_CREDITSLIPS_TAB)
    public WebElement creditSlipsTab;

    @FindBy(css = CreditSlipsPage_OR.CREDITSLIPSPAGE_TITLE)
    public WebElement pageTitle;

    @FindBy(css = CreditSlipsPage_OR.CREDITSLIPSPAGE_INFO_TITLE)
    public WebElement creditSlipsPageInfoTitle;

    @FindBy(css = CreditSlipsPage_OR.CREDITSLIPSPAGE_BLOCK_ORDER_HISTORY)
    public WebElement creditSlipsPageBlockHistory;

    @FindBy(xpath = CreditSlipsPage_OR.CREDITSLIPSPAGE_BACK_TO_ACCOUNT_BTN)
    public WebElement creditSlipsPageBackAccountBtn;

    @FindBy(css = CreditSlipsPage_OR.CREDITSLIPSPAGE_BACK_TO_ACCOUNT_BTN_LEFT_ARROW)
    public WebElement creditSlipsPageBackAccountBtnLeftArrowIcn;

    @FindBy(css = CreditSlipsPage_OR.CREDITSLIPSPAGE_BACK_TO_HOME_BTN)
    public WebElement creditSlipsPageBackHomeBtn;

    @FindBy(css = CreditSlipsPage_OR.CREDITSLIPSPAGE_BACK_TO_HOME_BTN_LEFT_ARROW)
    public WebElement creditSlipsPageBackHomeBtnLeftArrowIcn;

    public CreditSlipsPageLocators(WebDriver driver) {
        super();
        this.driver = driver;
        driver.get("http://automationpractice.com/index.php?controller=order-slip");
        PageFactory.initElements((ElementLocatorFactory) driver, this);
    }
    public CreditSlipsPageLocators() {

    }
}
