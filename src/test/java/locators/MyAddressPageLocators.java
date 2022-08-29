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
    WebElement homeIcn;
    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_NAVIGATION_PIPE1)
    WebElement navigationPipe1;
    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_NYACCOUNT_TAB)
    WebElement navigationTab;
    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_NAVIGATION_PIPE2)
    WebElement navigationPipe2;
    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_MYADDRESS_TAB)
    WebElement myAddressTab;
    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_TITLE)
    WebElement myAddressPageTitle;
    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_INFO_TITLE)
    WebElement myAddressPageInfoTitle;
    @FindBy(xpath = MyAddressPage_OR.MYADDRESSPAGE_LISTED_BELOW_MSG)
    WebElement myAddressPageListedBelowMsg;
    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_UPDATE_INFORMATION_MSG)
    WebElement myAddressPageUpdateInfoMsg;
    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_BLOCK_ADDRESS_ROW)
    WebElement myAddressPageBlockAddressRow;
    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_USER_EMAIL_TITLE)
    WebElement myAddressPageUserEmailTitle;
    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_USERNAME)
    WebElement myAddressPageUserName;
    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_USERLASTNAME)
    WebElement myAddressPageUserLastName;
    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_COMPNYNAME)
    WebElement myAddressPageCompanyName;
    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_ADDRESS1COMPANY)
    WebElement myAddressPageCompanyAddress1;
    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_ADDRESS2COMPANY)
    WebElement myAddressPageCompanyAddress2;
    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_COMPANYCITY)
    WebElement myAddressPageCompanyCity;
    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_COMPANYSTATE)
    WebElement myAddressPageCompanyState;
    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_COMPANYINDEX)
    WebElement myAddressPageCompanyIndex;
    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_COMPANYCOUNTRY)
    WebElement myAddressPageCompanyCountry;
    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_COMPANYPHONE)
    WebElement myAddressPageCompanyPhone;
    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_COMPANYMOBILEPHONE)
    WebElement myAddressPageCompanyMobilePhone;
    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_UPDATE_BTN)
    WebElement myAddressPageUpdateBtn;
    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_UPDATE_BTN_ARROW_ICN)
    WebElement myAddressPageUpdateBtnArrowIcn;
    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_DELETE_BTN)
    WebElement myAddressPageDeleteBtn;
    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_DELETE_BTN_REMOVE_ICN)
    WebElement myAddressPageDeleteBtnRemoveIcn;
    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_ADD_NEW_ADDRESS_BTN)
    WebElement myAddressPageAddNewAddressBtn;
    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_ADD_NEW_ADDRESS_BTN_ARROW)
    WebElement myAddressPageAddNewAddressBtnArrowIcn;
    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_BACK_TO_ACCOUNT_BTN)
    WebElement myAddressPageBackToAccountBtn;
    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_BACK_TO_ACCOUNT_BTN_LEFT_ARROW)
    WebElement myAddressPageBackToAccountBtnArrowIcn;
    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_BACK_TO_HOME_BTN)
    WebElement myAddressPageBackToHomeBtn;
    @FindBy(css = MyAddressPage_OR.MYADDRESSPAGE_BACK_TO_HOME_BTN_LEFT_ARROW)
    WebElement myAddressPageBackToHomeBtnArrowIcn;

    public MyAddressPageLocators(WebDriver driver) {
        super(driver);
        this.driver = driver;
        driver.get("http://automationpractice.com/index.php?controller=addresses");
        PageFactory.initElements((ElementLocatorFactory) driver, this);
    }
    public MyAddressPageLocators() {
    }
}
