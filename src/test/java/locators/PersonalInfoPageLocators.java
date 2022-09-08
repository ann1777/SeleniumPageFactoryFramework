package locators;

import objectRepository.PersonalInfoPage_OR;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

public class PersonalInfoPageLocators {
    public WebDriver driver;

    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_HOMEICN)
    public WebElement homeIcn;

    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_NAVIGATION_PIPE1)
    public WebElement navigationPipe1;

    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_NYACCOUNT_TAB)
    public WebElement navigationTab;

    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_NAVIGATION_PIPE2)
    public WebElement navigationPipe2;

    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_PERSONALINFO_TAB)
    public WebElement myAddressTab;

    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_TITLE)
    public WebElement pageTitle;

    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_UPDATE_MSG)
    public WebElement myAddressPageUpdateMsg;

    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_REQUIRED_MARK)
    public WebElement myAddressPageRequiredMark;

    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_MAILGENDERRADIO_LABEL)
    public WebElement myAddressPageMailGenderRadioLabel;

    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_MAILGENDERRADIO_BTN)
    public WebElement myAddressPageMailGenderRadioBtn;

    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_FEMAILGENDERRADIO_LABEL)
    public WebElement myAddressPageFemailGenderRadioLabel;

    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_FEMAILGENDERRADIO_BTN)
    public WebElement myAddressPageFemailGenderRadioBtn;

    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_FIRSTNAME_LABEL)
    public WebElement myAddressPageFirstNameLabel;

    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_FIRSTNAME_FLD)
    public WebElement myAddressPageFirstNameFld;

    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_LASTNAME_LABEL)
    public WebElement myAddressPageLastNameLabel;

    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_LASTNAME_FLD)
    public WebElement myAddressPageLastNameFld;

    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_EMAILADDRESS_LABEL)
    public WebElement myAddressPageEmailLabel;

    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_EMAILADDRESS_FLD)
    public WebElement myAddressPageEmailFld;

    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_BIRTHDATA_LABEL)
    public WebElement myAddressPageBirthDayLabel;

    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_BIRTHDATA_DAY_SELECTOR)
    public WebElement myAddressPageBirthDaySelector;

    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_BIRTHDATA_DAY_CHOOSER)
    public WebElement myAddressPageBirthDayChooser;

    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_BIRTHDATA_MONTH_SELECTOR)
    public WebElement myAddressPageBirthDayMonthSelector;

    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_BIRTHDATA_MONTH_CHOOSER)
    public WebElement myAddressPageBirthDayMonthChooser;

    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_BIRTHDATA_YEARS_SELECTOR)
    public WebElement myAddressPageBirthDayYearsSelector;

    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_BIRTHDATA_YEARS_CHOOSER)
    public WebElement myAddressPageBirthDayYearsChooser;

    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_CURRENTPASSWD_LABEL)
    public WebElement myAddressPageCurrentPasswordLabel;

    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_CURRENTPASSWD_FLD)
    public WebElement myAddressPageCurrentPasswordFld;

    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_NEWPASSWD_LABEL)
    public WebElement myAddressPageNewPasswordLabel;

    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_NEWPASSWD_FLD)
    public WebElement myAddressPageNewPasswordFld;

    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_CONFIRMATION_LABEL)
    public WebElement myAddressPageConfirmationLabel;

    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_CONFIRMATION_FLD)
    public WebElement myAddressPageConfirmationFld;

    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_NEWSLETTERS_LABEL)
    public WebElement myAddressPageNewsLetterLabel;

    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_NEWSLETTERS_CHECKBOX)
    public WebElement myAddressPageNewsLetterCheckbox;

    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_SPECIALOFFERS_LABEL)
    public WebElement myAddressPageSpecialOffersLabel;

    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_SPECIALOFFERS_CHECKBOX)
    public WebElement myAddressPageSpecialOffersCheckbox;

    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_SAVE_BTN)
    public WebElement myAddressPageInfoPageSaveBtn;

    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_SAVE_BTN_ARROW)
    public WebElement myAddressPageInfoPageSaveBtnArrow;

    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_BACK_BTNS)
    public WebElement myAddressPageBackBtns;

    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_BACKBTNS_ARROWS)
    public WebElement myAddressPageBackBtnsArrows;


    public PersonalInfoPageLocators(WebDriver driver) {
        super();
        this.driver = driver;
        driver.get("http://automationpractice.com/index.php?controller=addresses");
        PageFactory.initElements((ElementLocatorFactory) driver, this);
    }
    public PersonalInfoPageLocators() {

    }
}
