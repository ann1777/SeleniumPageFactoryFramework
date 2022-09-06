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
    WebElement homeIcn;
    @FindBy(css = CreditSlipsPage_OR.CREDITSLIPSPAGE_NAVIGATION_PIPE1)
    WebElement navigationPipe1;
    @FindBy(css = CreditSlipsPage_OR.CREDITSLIPSPAGE_NYACCOUNT_TAB)
    WebElement navigationTab;
    @FindBy(css = CreditSlipsPage_OR.CREDITSLIPSPAGE_NAVIGATION_PIPE2)
    WebElement navigationPipe2;
    @FindBy(css = CreditSlipsPage_OR.CREDITSLIPSPAGE_CREDITSLIPS_TAB)
    WebElement creditSlipsTab;
    @FindBy(css = CreditSlipsPage_OR.CREDITSLIPSPAGE_TITLE)
    WebElement creditSlipsPageTitle;
    @FindBy(css = CreditSlipsPage_OR.CREDITSLIPSPAGE_INFO_TITLE)
    WebElement creditSlipsPageInfoTitle;
    @FindBy(css = CreditSlipsPage_OR.CREDITSLIPSPAGE_BLOCK_ORDER_HISTORY)
    WebElement creditSlipsPageBlockHistory;
    @FindBy(xpath = CreditSlipsPage_OR.CREDITSLIPSPAGE_BACK_TO_ACCOUNT_BTN)
    WebElement creditSlipsPageBackAccountBtn;
    @FindBy(css = CreditSlipsPage_OR.CREDITSLIPSPAGE_BACK_TO_ACCOUNT_BTN_LEFT_ARROW)
    WebElement creditSlipsPageBackAccountBtnLeftArrowIcn;
    @FindBy(css = CreditSlipsPage_OR.CREDITSLIPSPAGE_BACK_TO_HOME_BTN)
    WebElement creditSlipsPageBackHomeBtn;
    @FindBy(css = CreditSlipsPage_OR.CREDITSLIPSPAGE_BACK_TO_HOME_BTN_LEFT_ARROW)
    WebElement creditSlipsPageBackHomeBtnLeftArrowIcn;

    public CreditSlipsPageLocators(WebDriver driver) {
        super();
        this.driver = driver;
        driver.get("http://automationpractice.com/index.php?controller=order-slip");
        PageFactory.initElements((ElementLocatorFactory) driver, this);
    }
    public CreditSlipsPageLocators() {

    }
}
