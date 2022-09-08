package locators;

import objectRepository.MyAddressPage_OR;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

public class MyAddressPageLocators extends BasePageLocators {
    public WebDriver driver;

    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_HOMEICN)
    public WebElement homeIcn;

    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_NAVIGATION_PIPE1)
    public WebElement navigationPipe1;

    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_NYACCOUNT_TAB)
    public WebElement navigationTab;

    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_NAVIGATION_PIPE2)
    public WebElement navigationPipe2;

    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_MYADDRESS_TAB)
    public WebElement myAddressTab;

    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_TITLE)
    public WebElement pageTitle;

    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_INFO_TITLE)
    public WebElement myAddressPageInfoTitle;

    @FindBy(xpath = MyAddressPage_OR.MYADDRESSPAGE_LISTED_BELOW_MSG)
    public WebElement myAddressPageListedBelowMsg;

    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_UPDATE_INFORMATION_MSG)
    public WebElement myAddressPageUpdateInfoMsg;

    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_BLOCK_ADDRESS_ROW)
    public WebElement myAddressPageBlockAddressRow;

    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_USER_EMAIL_TITLE)
    public WebElement myAddressPageUserEmailTitle;

    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_USERNAME)
    public WebElement myAddressPageUserName;

    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_USERLASTNAME)
    public WebElement myAddressPageUserLastName;

    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_COMPNYNAME)
    public WebElement myAddressPageCompanyName;

    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_ADDRESS1COMPANY)
    public WebElement myAddressPageCompanyAddress1;

    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_ADDRESS2COMPANY)
    public WebElement myAddressPageCompanyAddress2;

    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_COMPANYCITY)
    public WebElement myAddressPageCompanyCity;

    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_COMPANYSTATE)
    public WebElement myAddressPageCompanyState;

    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_COMPANYINDEX)
    public WebElement myAddressPageCompanyIndex;

    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_COMPANYCOUNTRY)
    public WebElement myAddressPageCompanyCountry;

    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_COMPANYPHONE)
    public WebElement myAddressPageCompanyPhone;

    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_COMPANYMOBILEPHONE)
    public WebElement myAddressPageCompanyMobilePhone;

    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_UPDATE_BTN)
    public WebElement myAddressPageUpdateBtn;

    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_UPDATE_BTN_ARROW_ICN)
    public WebElement myAddressPageUpdateBtnArrowIcn;

    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_DELETE_BTN)
    public WebElement myAddressPageDeleteBtn;

    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_DELETE_BTN_REMOVE_ICN)
    public WebElement myAddressPageDeleteBtnRemoveIcn;

    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_ADD_NEW_ADDRESS_BTN)
    public WebElement myAddressPageAddNewAddressBtn;

    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_ADD_NEW_ADDRESS_BTN_ARROW)
    public WebElement myAddressPageAddNewAddressBtnArrowIcn;

    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_BACK_TO_ACCOUNT_BTN)
    public WebElement myAddressPageBackToAccountBtn;

    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_BACK_TO_ACCOUNT_BTN_LEFT_ARROW)
    public WebElement myAddressPageBackToAccountBtnArrowIcn;

    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_BACK_TO_HOME_BTN)
    public WebElement myAddressPageBackToHomeBtn;

    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_BACK_TO_HOME_BTN_LEFT_ARROW)
    public WebElement myAddressPageBackToHomeBtnArrowIcn;

    public MyAddressPageLocators(WebDriver driver) {
        super(driver);
        this.driver = driver;
        driver.get("http://automationpractice.com/index.php?controller=addresses");
        PageFactory.initElements((ElementLocatorFactory) driver, this);
    }
    public MyAddressPageLocators() {
    }
}
