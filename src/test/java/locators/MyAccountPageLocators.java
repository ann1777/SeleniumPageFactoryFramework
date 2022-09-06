package locators;

import objectRepository.MyAccountPage_OR;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

public class MyAccountPageLocators extends BasePageLocators {
    public WebDriver driver;

    @FindBy(css = MyAccountPage_OR.MYACCOUNTPAGE_HEADER_ACCOUNTNAME_TAB)
    public WebElement accountNameTab;

    @FindBy(css = MyAccountPage_OR.MYACCOUNTPAGE_HEADER_SIGNOUT_TAB)
    public WebElement signOutTab;

    @FindBy(css = MyAccountPage_OR.MYACCOUNTPAGE_HEADER_CONTACTUS_TAB)
    public WebElement contactUsTab;

    @FindBy(css = MyAccountPage_OR.MYACCOUNTPAGE_HOMEICN)
    public WebElement homeIcn;

    @FindBy(css = MyAccountPage_OR.MYACCOUNTPAGE_NAVIGATION_PIPE)
    public WebElement navigationPipe;

    @FindBy(css = MyAccountPage_OR.MYACCOUNTPAGE_NAVIGATION_TAB)
    public WebElement navigationPage;

    @FindBy(css = MyAccountPage_OR.MYACCOUNTPAGE_MYACCOUNTFORM_HEADER)
    public WebElement myAccountPageHeader;

    @FindBy(css = MyAccountPage_OR.MYACCOUNTPAGE_MYACCOUNTFORM_WELCOME_MSG)
    public WebElement myAccountFormWelcomeMsg;

    @FindBy(css = MyAccountPage_OR.MYACCOUNTPAGE_MYACCOUNTFORM_ADDRESSES_LISTS)
    public WebElement myAccountFormAddressesList;

    @FindBy(css = MyAccountPage_OR.MYACCOUNTPAGE_MYACCOUNTFORM_ORDER_HISTORY_BTN)
    public WebElement myAccountFormOrderHistory;

    @FindBy(css = MyAccountPage_OR.MYACCOUNTPAGE_MYACCOUNTFORM_ORDER_HISTORY_ICN)
    public WebElement myAccountFormOrderHistoryIcn;

    @FindBy(css = MyAccountPage_OR.MYACCOUNTPAGE_MYACCOUNTFORM_CREDIT_SLIPS_BTN)
    public WebElement myAccountFormCreditSlips;

    @FindBy(css = MyAccountPage_OR.MYACCOUNTPAGE_MYACCOUNTFORM_CREDIT_SLIPS_ICN)
    public WebElement myAccountFormCreditSlipsIcn;

    @FindBy(css = MyAccountPage_OR.MYACCOUNTPAGE_MYACCOUNTFORM_ADDRESS_BTN)
    public WebElement myAccountFormAddressBtn;

    @FindBy(css = MyAccountPage_OR.MYACCOUNTPAGE_MYACCOUNTFORM_ADDRESS_ICN)
    public WebElement myAccountFormAddressIcn;

    @FindBy(css = MyAccountPage_OR.MYACCOUNTPAGE_MYACCOUNTFORM_PERSONAL_INFO_BTN)
    public WebElement myAccountFormPersonalInfoBtn;

    @FindBy(css = MyAccountPage_OR.MYACCOUNTPAGE_MYACCOUNTFORM_PERSONAL_INFO_ICN)
    public WebElement myAccountFormPersonalInfoIcn;

    @FindBy(css = MyAccountPage_OR.MYACCOUNTPAGE_MYACCOUNTFORM_WISHLISTS_BTN)
    public WebElement myAccountFormWishListBtn;

    @FindBy(css = MyAccountPage_OR.MYACCOUNTPAGE_MYACCOUNTFORM_WISHLISTS_ICN)
    public WebElement myAccountFormWishListIcn;

    @FindBy(css = MyAccountPage_OR.MYACCOUNTPAGE_BACKTOHOME_BTN)
    public WebElement myAccountFormBackToHomeBtn;

    @FindBy(css = MyAccountPage_OR.MYACCOUNTPAGE_BACKTOHOMEBTN_LEFT_ICN)
    public WebElement myAccountFormBackToHomeBtnLeftIcn;

    public MyAccountPageLocators(WebDriver driver) {
        super();
        this.driver = driver;
        driver.get("http://automationpractice.com/index.php?controller=my-account");
        PageFactory.initElements((ElementLocatorFactory) driver, this);
    }

}
