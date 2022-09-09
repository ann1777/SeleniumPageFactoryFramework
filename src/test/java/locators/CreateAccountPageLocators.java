package locators;

import objectRepository.CreateAccountPage_OR;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

public class CreateAccountPageLocators extends BasePageLocators {
    WebDriver driver;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_HOME_ICN)
    public WebElement homeIcn;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_NAVIGATION_PIPE)
    public WebElement navigationPipe;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_NAVIGATION_TAB)
    public WebElement navigationTab;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_PAGE_TITLE)
    public WebElement createAccountPageTitle;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_PERSONALINFORMATION_FORM)
    public WebElement personalInformationForm;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_PERSONALINFORMATION_FORM_TITLE)
    public WebElement personalInformationFormTitle;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_PERSONALINFORMATION_TITLE_LABEL)
    public WebElement getPersonalInformationTitleLabel;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_MAILGENGER_CHECKBOX)
    public WebElement mailGenderCheckBox;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_MAILGENGER_TEXT)
    public WebElement mailGenderText;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_FEMAILGENDER_CHECKBOX)
    public WebElement femailGenderCheckBox;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_FEMAILGENDER_TEXT)
    public WebElement femailGenderText;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_FIRSTNAME_LABEL)
    public WebElement firstNameLabel;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_FIRSTNAME_FLD)
    public WebElement firstNameFld;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_LASTNAME_LABEL)
    public WebElement lastNameLabel;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_LASTNAME_FLD)
    public WebElement lastNameFld;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_EMAIL_LABEL)
    public WebElement emailLabel;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_EMAIL_FLD)
    public WebElement emailFld;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_PASSWORD_LABEL)
    public WebElement passwdLabel;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_PASSWORD_FLD)
    public WebElement passwdFld;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_BIRTHDAY_LABEL)
    public WebElement birthDataLabel;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_BIRTHDAY_DAY_SELECTOR)
    public WebElement birthDaySelector;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_14_BIRTHDAY_OPT)
    public WebElement birthDay14Opt;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_BIRTHDAY_MONTH_SELECTOR)
    public WebElement birthMonthSelector;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_BIRTHDAY_MONTH_MAY_OPT)
    public WebElement birthMonthMayOpt;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_BIRTHDAY_YEARS_2004_OPT)
    public WebElement birthYear2004Opt;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_BIRTHDAY_YEARS_SELECTOR)
    public WebElement birthYearsSelector;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_SIGNUP_FOR_NEWSLETTER_CHECKBOX)
    public WebElement signUpForNewsLetterCheckBox;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_SIGNUP_FOR_NEWSLETTER_LABEL)
    public WebElement signUpForNewsLetterLabel;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_RECEIVE_SPECIALOFFERS_CHECKBOX)
    public WebElement receiveSpecialOffersCheckBox;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_RECEIVE_SPECIALOFFERS_LABEL)
    public WebElement receiveSpecialOffersLabel;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM)
    public WebElement yourAddressForm;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_FIRSTNAME_LABEL)
    public WebElement yourAddressFormFirstNameLabel;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_FIRSTNAME_FLD)
    public WebElement yourAddressFormFirstNameFld;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_LASTNAME_LABEL)
    public WebElement yourAddressFormLastNameLabel;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_LASTNAME_FLD)
    public WebElement yourAddressFormLastNameFld;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_COMPANY_LABEL)
    public WebElement yourAddressFormCompanyLabel;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_COMPANY_FLD)
    public WebElement yourAddressFormCompanyFld;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_ADDERESS_LABEL)
    public WebElement yourAddressFormAddressLabel;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_ADDERESS_FLD)
    public WebElement yourAddressFormAddressFld;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_INLINEINFO_LABEL)
    public WebElement yourAddressInlineInfoLabel;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_ADDRESS2_LABEL)
    public WebElement yourAddressFormAddress2Label;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_ADDRESS2_FLD)
    public WebElement yourAddressFormAddress2Fld;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS2_INLINEINFO_LABEL)
    public WebElement yourAddress2InlineInfoLabel;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_CITY_LABEL)
    public WebElement yourAddressFormCityLabel;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_CITY_FLD)
    public WebElement yourAddressFormCityFld;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_STATE_LABEL)
    public WebElement yourAddressFormStateLabel;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_STATE_SELECTOR)
    public WebElement yourAddressFormStateSelector;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_STATE_SELECTOR_GEORGIA)
    public WebElement stateGeorgia;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_ZIPCODE_LABEL)
    public WebElement yourAddressZipCodeLabel;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_ZIPCODE_FLD)
    public WebElement yourAddressZipCodeFld;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_COUNTRY_LABEL)
    public WebElement yourAddressFormCountryLabel;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_COUNTRY_SELECTOR)
    public WebElement yourAddressFormCountrySelector;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_ADDITIONAL_INFORMATION_LABEL)
    public WebElement yourAddressFormAdditionalInformationLabel;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_ADDITIONAL_INFORMATION_FLD)
    public WebElement yourAddressFormAdditionalIntoFld;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_ADDITIONAL_INFORMATION_INLINE_INFOS)
    public WebElement yourAddressFormAdditionalInformationInlineInfos;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_HOMEPHONE_LABEL)
    public WebElement yourAddressFormHomePhoneLabel;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_HOMEPHONE_FLD)
    public WebElement yourAddressFormHomePhoneFld;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_MOBILEPHONE_LABEL)
    public WebElement yourAddressFormMobilePhoneLabel;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_MOBILEPHONE_FLD)
    public WebElement yourAddressFormMobilePhoneFld;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_FUTURE_REFERENCE_LABEL)
    public WebElement yourAddressFormFutureReferenceLabel;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_FUTURE_REFERENCE_FLD)
    public WebElement yourAddressFormFutureReferenceFld;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_REGISTER_BTN)
    public WebElement yourAddressFormRegisterBtn;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_PHONE_FLD)
    public WebElement yourAddressHomePhoneFld;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_ALLERT_DANGER)
    public WebElement yourAddressFormDangerAlert;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_ALLERT_ALREADYREGISTERED)
    public WebElement yourAddressFormAlreadyRegisteredAlert;

    public CreateAccountPageLocators() {
        super(driver);
        this.driver = driver;
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
        PageFactory.initElements((ElementLocatorFactory) driver, this);
    }
}
