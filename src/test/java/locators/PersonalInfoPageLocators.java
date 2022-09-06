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
    WebElement homeIcn;
    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_NAVIGATION_PIPE1)
    WebElement navigationPipe1;
    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_NYACCOUNT_TAB)
    WebElement navigationTab;
    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_NAVIGATION_PIPE2)
    WebElement navigationPipe2;
    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_PERSONALINFO_TAB)
    WebElement myAddressTab;
    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_TITLE)
    WebElement myAddressPageTitle;
    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_UPDATE_MSG)
    WebElement myAddressPageUpdateMsg;
    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_REQUIRED_MARK)
    WebElement myAddressPageRequiredMark;
    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_MAILGENDERRADIO_LABEL)
    WebElement myAddressPageMailGenderRadioLabel;
    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_MAILGENDERRADIO_BTN)
    WebElement myAddressPageMailGenderRadioBtn;
    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_FEMAILGENDERRADIO_LABEL)
    WebElement myAddressPageFemailGenderRadioLabel;
    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_FEMAILGENDERRADIO_BTN)
    WebElement myAddressPageFemailGenderRadioBtn;
    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_FIRSTNAME_LABEL)
    WebElement myAddressPageFirstNameLabel;
    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_FIRSTNAME_FLD)
    WebElement myAddressPageFirstNameFld;
    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_LASTNAME_LABEL)
    WebElement myAddressPageLastNameLabel;
    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_LASTNAME_FLD)
    WebElement myAddressPageLastNameFld;
    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_EMAILADDRESS_LABEL)
    WebElement myAddressPageEmailLabel;
    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_EMAILADDRESS_FLD)
    WebElement myAddressPageEmailFld;
    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_BIRTHDATA_LABEL)
    WebElement myAddressPageBirthDayLabel;
    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_BIRTHDATA_DAY_SELECTOR)
    WebElement myAddressPageBirthDaySelector;
    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_BIRTHDATA_DAY_CHOOSER)
    WebElement myAddressPageBirthDayChooser;
    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_BIRTHDATA_MONTH_SELECTOR)
    WebElement myAddressPageBirthDayMonthSelector;
    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_BIRTHDATA_MONTH_CHOOSER)
    WebElement myAddressPageBirthDayMonthChooser;
    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_BIRTHDATA_YEARS_SELECTOR)
    WebElement myAddressPageBirthDayYearsSelector;
    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_BIRTHDATA_YEARS_CHOOSER)
    WebElement myAddressPageBirthDayYearsChooser;
    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_CURRENTPASSWD_LABEL)
    WebElement myAddressPageCurrentPasswordLabel;
    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_CURRENTPASSWD_FLD)
    WebElement myAddressPageCurrentPasswordFld;
    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_NEWPASSWD_LABEL)
    WebElement myAddressPageNewPasswordLabel;
    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_NEWPASSWD_FLD)
    WebElement myAddressPageNewPasswordFld;
    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_CONFIRMATION_LABEL)
    WebElement myAddressPageConfirmationLabel;
    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_CONFIRMATION_FLD)
    WebElement myAddressPageConfirmationFld;
    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_NEWSLETTERS_LABEL)
    WebElement myAddressPageNewsLetterLabel;
    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_NEWSLETTERS_CHECKBOX)
    WebElement myAddressPageNewsLetterCheckbox;
    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_SPECIALOFFERS_LABEL)
    WebElement myAddressPageSpecialOffersLabel;
    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_SPECIALOFFERS_CHECKBOX)
    WebElement myAddressPageSpecialOffersCheckbox;
    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_SAVE_BTN)
    WebElement myAddressPageInfoPageSaveBtn;
    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_SAVE_BTN_ARROW)
    WebElement myAddressPageInfoPageSaveBtnArrow;
    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_BACK_BTNS)
    WebElement myAddressPageBackBtns;
    @FindBy(css = PersonalInfoPage_OR.PERSONALINFOPAGE_BACKBTNS_ARROWS)
    WebElement myAddressPageBackBtnsArrows;


    public PersonalInfoPageLocators(WebDriver driver) {
        super();
        this.driver = driver;
        driver.get("http://automationpractice.com/index.php?controller=addresses");
        PageFactory.initElements((ElementLocatorFactory) driver, this);
    }
    public PersonalInfoPageLocators() {

    }
}
