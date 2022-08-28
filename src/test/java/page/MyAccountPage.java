package page;

import objectRepository.MyAccountPage_OR;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends BasePage{
    public WebDriver driver;

    @FindBy(css = MyAccountPage_OR.MYACCOUNTPAGE_HOMEICN)
    WebElement homeIcn;

    @FindBy(css = MyAccountPage_OR.MYACCOUNTPAGE_NAVIGATION_PIPE)
    WebElement navigationPipe;

    @FindBy(css = MyAccountPage_OR.MYACCOUNTPAGE_NAVIGATION_TAB)
    WebElement navigationPage;

    @FindBy(css = MyAccountPage_OR.MYACCOUNTPAGE_MYACCOUNTFORM_HEADER)
    WebElement myAccountPageHeader;

    @FindBy(css = MyAccountPage_OR.MYACCOUNTPAGE_MYACCOUNTFORM_WELCOME_MSG)
    WebElement myAccountFormWelcomeMsg;

    @FindBy(css = MyAccountPage_OR.MYACCOUNTPAGE_MYACCOUNTFORM_ADDRESSES_LISTS)
    WebElement myAccountFormAddressesList;

    @FindBy(css = MyAccountPage_OR.MYACCOUNTPAGE_MYACCOUNTFORM_ORDER_HISTORY_BTN)
    WebElement myAccountFormOrderHistory;

    @FindBy(css = MyAccountPage_OR.MYACCOUNTPAGE_MYACCOUNTFORM_ORDER_HISTORY_ICN)
    WebElement myAccountFormOrderHistoryIcn;

    @FindBy(css = MyAccountPage_OR.MYACCOUNTPAGE_MYACCOUNTFORM_CREDIT_SLIPS_BTN)
    WebElement myAccountFormCreditSlips;

    @FindBy(css = MyAccountPage_OR.MYACCOUNTPAGE_MYACCOUNTFORM_CREDIT_SLIPS_ICN)
    WebElement myAccountFormCreditSlipsIcn;

    @FindBy(css = MyAccountPage_OR.MYACCOUNTPAGE_MYACCOUNTFORM_ADDRESS_BTN)
    WebElement myAccountFormAddressBtn;

    @FindBy(css = MyAccountPage_OR.MYACCOUNTPAGE_MYACCOUNTFORM_ADDRESS_ICN)
    WebElement myAccountFormAddressIcn;

    @FindBy(css = MyAccountPage_OR.MYACCOUNTPAGE_MYACCOUNTFORM_PERSONAL_INFO_BTN)
    WebElement myAccountFormPersonalInfoBtn;

    @FindBy(css = MyAccountPage_OR.MYACCOUNTPAGE_MYACCOUNTFORM_PERSONAL_INFO_ICN)
    WebElement myAccountFormPersonalInfoIcn;

    @FindBy(css = MyAccountPage_OR.MYACCOUNTPAGE_MYACCOUNTFORM_WISHLISTS_BTN)
    WebElement myAccountFormWishListBtn;

    @FindBy(css = MyAccountPage_OR.MYACCOUNTPAGE_MYACCOUNTFORM_WISHLISTS_ICN)
    WebElement myAccountFormWishListIcn;

    @FindBy(css = MyAccountPage_OR.MYACCOUNTPAGE_BACKTOHOME_BTN)
    WebElement myAccountFormBackToHomeBtn;

    @FindBy(css = MyAccountPage_OR.MYACCOUNTPAGE_BACKTOHOMEBTN_LEFT_ICN)
    WebElement myAccountFormBackToHomeBtnLeftIcn;

    public MyAccountPage(WebDriver driver) {
        super();
        PageFactory.initElements(driver, this);
        this.driver = driver;
        driver.get("http://automationpractice.com/index.php?controller=my-account");
    }

}
