package locators;

import objectRepository.OrderHistoryPage_OR;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

public class OrderHistoryPageLocators extends BasePageLocators {
    public WebDriver driver;

    @FindBy(css = OrderHistoryPage_OR.ORDERHISTORYPAGE_HOMEICN)
    public WebElement homeIcn;

    @FindBy(xpath = OrderHistoryPage_OR.ORDERHISTORYPAGE_NAVIGATION_PIPE1)
    public WebElement navigationPipe1;

    @FindBy(css = OrderHistoryPage_OR.ORDERHISTORYPAGE_NYACCOUNT_TAB)
    public WebElement navigationTab;

    @FindBy(xpath = OrderHistoryPage_OR.ORDERHISTORYPAGE_NAVIGATION_PIPE2)
    public WebElement navigationPipe2;

    @FindBy(xpath = OrderHistoryPage_OR.ORDERHISTORYPAGE_ORDER_HISTORY_TAB)
    public WebElement orderHistoryTab;

    @FindBy(xpath = OrderHistoryPage_OR.ORDERHISTORYPAGE_TITLE)
    public WebElement pageTitle;

    @FindBy(xpath = OrderHistoryPage_OR.ORDERHISTORYPAGE_INFO_TITLE)
    public WebElement orderHistoryPageInfoTitle;

    @FindBy(xpath = OrderHistoryPage_OR.ORDERHISTORYPAGE_BLOCK_ORDER_HISTORY)
    public WebElement orderHistoryPageBlockHistory;

    @FindBy(xpath = OrderHistoryPage_OR.ORDERHISTORYPAGE_BACK_TO_ACCOUNT_BTN)
    public WebElement orderHistoryPageBackAccountBtn;

    @FindBy(xpath = OrderHistoryPage_OR.ORDERHISTORYPAGE_BACK_TO_ACCOUNT_BTN_LEFT_ARROW)
    public WebElement orderHistoryPageBackAccountBtnLeftArrowIcn;

    @FindBy(xpath = OrderHistoryPage_OR.ORDERHISTORYPAGE_BACK_TO_HOME_BTN)
    public WebElement orderHistoryPageBackHomeBtn;

    @FindBy(xpath = OrderHistoryPage_OR.ORDERHISTORYPAGE_BACK_TO_HOME_BTN_LEFT_ARROW)
    public WebElement orderHistoryPageBackHomeBtnLeftArrowIcn;

    public OrderHistoryPageLocators(WebDriver driver) {
        super(driver);
        this.driver = driver;
        driver.get("http://automationpractice.com/index.php?controller=history");
        PageFactory.initElements((ElementLocatorFactory) driver, this);
    }
    public OrderHistoryPageLocators() {

    }

}
