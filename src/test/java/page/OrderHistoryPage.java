package page;

import objectRepository.OrderHistoryPage_OR;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderHistoryPage extends BasePage{
    public WebDriver driver;

    @FindBy(css = OrderHistoryPage_OR.ORDERHISTORYPAGE_HOMEICN)
    WebElement homeIcn;

    @FindBy(xpath = OrderHistoryPage_OR.ORDERHISTORYPAGE_NAVIGATION_PIPE1)
    WebElement navigationPipe1;

    @FindBy(css = OrderHistoryPage_OR.ORDERHISTORYPAGE_NYACCOUNT_TAB)
    WebElement navigationTab;

    @FindBy(xpath = OrderHistoryPage_OR.ORDERHISTORYPAGE_NAVIGATION_PIPE2)
    WebElement navigationPipe2;

    @FindBy(xpath = OrderHistoryPage_OR.ORDERHISTORYPAGE_ORDER_HISTORY_TAB)
    WebElement orderHistoryTab;

    @FindBy(xpath = OrderHistoryPage_OR.ORDERHISTORYPAGE_TITLE)
    WebElement orderHistoryPageTitle;

    @FindBy(xpath = OrderHistoryPage_OR.ORDERHISTORYPAGE_INFO_TITLE)
    WebElement orderHistoryPageInfoTitle;

    @FindBy(xpath = OrderHistoryPage_OR.ORDERHISTORYPAGE_BLOCK_ORDER_HISTORY)
    WebElement orderHistoryPageBlockHistory;

    @FindBy(xpath = OrderHistoryPage_OR.ORDERHISTORYPAGE_BACK_TO_ACCOUNT_BTN)
    WebElement orderHistoryPageBackAccountBtn;

    @FindBy(xpath = OrderHistoryPage_OR.ORDERHISTORYPAGE_BACK_TO_ACCOUNT_BTN_LEFT_ARROW)
    WebElement orderHistoryPageBackAccountBtnLeftArrowIcn;

    @FindBy(xpath = OrderHistoryPage_OR.ORDERHISTORYPAGE_BACK_TO_HOME_BTN)
    WebElement orderHistoryPageBackHomeBtn;

    @FindBy(xpath = OrderHistoryPage_OR.ORDERHISTORYPAGE_BACK_TO_HOME_BTN_LEFT_ARROW)
    WebElement orderHistoryPageBackHomeBtnLeftArrowIcn;

    public OrderHistoryPage(WebDriver driver) {
        super();
        PageFactory.initElements(driver, this);
        this.driver = driver;
        driver.get("http://automationpractice.com/index.php?controller=history");
    }
}
