package locators;

import objectRepository.CreateAccountPage_OR;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPageLocators extends BasePageLocators {
    WebDriver driver;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_HOME_ICN)
    WebElement homeIcn;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_NAVIGATION_PIPE)
    WebElement navigationPipe;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_NAVIGATION_TAB)
    WebElement navigationTab;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_PAGE_TITLE)
    WebElement createAccountPageTitle;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_PERSONALINFORMATION_FORM)
    WebElement personalInformationForm;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_PERSONALINFORMATION_FORM_TITLE)
    WebElement personalInformationFormTitle;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_PERSONALINFORMATION_TITLE_LABEL)
    WebElement getPersonalInformationTitleLabel;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_MAILGENGER_CHECKBOX)
    WebElement mailGenderCheckBox;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_MAILGENGER_TEXT)
    WebElement mailGenderText;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_FEMAILGENDER_CHECKBOX)
    WebElement femailGenderCheckBox;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_FEMAILGENDER_TEXT)
    WebElement femailGenderText;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_FIRSTNAME_LABEL)
    WebElement firstNameLabel;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_FIRSTNAME_FLD)
    WebElement firstNameFld;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_LASTNAME_LABEL)
    WebElement lastNameLabel;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_LASTNAME_FLD)
    WebElement lastNameFld;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_EMAIL_LABEL)
    WebElement emailLabel;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_EMAIL_FLD)
    WebElement emailFld;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_PASSWORD_LABEL)
    WebElement passwdLabel;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_PASSWORD_FLD)
    WebElement passwdFld;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_BIRTHDAY_LABEL)
    WebElement birthDataLabel;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_BIRTHDAY_DAY_SELECTOR)
    WebElement birthDaySelector;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_BIRTHDAY_MONTH_SELECTOR)
    WebElement birthMonthSelector;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_BIRTHDAY_YEARS_SELECTOR)
    WebElement birthYearsSelector;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_SIGNUP_FOR_NEWSLETTER_CHECKBOX)
    WebElement signUpForNewsLetterCheckBox;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_SIGNUP_FOR_NEWSLETTER_LABEL)
    WebElement signUpForNewsLetterLabel;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_RECEIVE_SPECIALOFFERS_CHECKBOX)
    WebElement receiveSpecialOffersCheckBox;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_RECEIVE_SPECIALOFFERS_LABEL)
    WebElement receiveSpecialOffersLabel;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM)
//    @FindBy(xpath = )
    WebElement yourAddressForm;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_FIRSTNAME_LABEL)
    WebElement yourAddressFormFirstNameLabel;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_FIRSTNAME_FLD)
    WebElement yourAddressFormFirstNameFld;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_LASTNAME_LABEL)
    WebElement yourAddressFormLastNameLabel;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_LASTNAME_FLD)
    WebElement yourAddressFormLastNameFld;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_COMPANY_LABEL)
    WebElement yourAddressFormCompanyLabel;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_COMPANY_FLD)
    WebElement yourAddressFormCompanyFld;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_ADDERESS_LABEL)
    WebElement yourAddressFormAddressLabel;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_ADDERESS_FLD)
    WebElement yourAddressFormAddressFld;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_INLINEINFO_LABEL)
    WebElement yourAddressInlineInfoLabel;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_ADDRESS2_LABEL)
    WebElement yourAddressFormAddress2Label;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_ADDRESS2_FLD)
    WebElement yourAddressFormAddress2Fld;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS2_INLINEINFO_LABEL)
    WebElement yourAddress2InlineInfoLabel;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_CITY_LABEL)
    WebElement yourAddressFormCityLabel;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_CITY_FLD)
    WebElement yourAddressFormCityFld;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_STATE_LABEL)
    WebElement yourAddressFormStateLabel;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_STATE_SELECTOR)
    WebElement yourAddressFormStateSelector;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_STATE_SELECTOR_GEORGIA)
    WebElement yourAddressFormStateSelectGeorgia;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_ZIPCODE_LABEL)
    WebElement yourAddressZipCodeLabel;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_ZIPCODE_SELECTOR)
    WebElement yourAddressZipCodeSelector;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_COUNTRY_LABEL)
    WebElement yourAddressFormCountryLabel;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_COUNTRY_SELECTOR)
    WebElement yourAddressFormCountrySelector;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_ADDITIONAL_INFORMATION_LABEL)
    WebElement yourAddressFormAdditionalInformationLabel;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_ADDITIONAL_INFORMATION_INLINE_INFOS)
    WebElement yourAddressFormAdditionalInformationInlineInfos;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_HOMEPHONE_LABEL)
    WebElement yourAddressFormHomePhoneLabel;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_HOMEPHONE_FLD)
    WebElement yourAddressFormHomePhoneFld;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_MOBILEPHONE_LABEL)
    WebElement yourAddressFormMobilePhoneLabel;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_MOBILEPHONE_FLD)
    WebElement yourAddressFormMobilePhoneFld;

    @FindBy(xpath = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_FUTURE_REFERENCE_LABEL)
    WebElement yourAddressFormFutureReferenceLabel;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_FUTURE_REFERENCE_FLD)
    WebElement yourAddressFormFutureReferenceFld;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_REGISTER_BTN)
    WebElement yourAddressFormRegisterBtn;

    @FindBy(css = CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_PHONE_FLD)

    WebElement yourAddressHomePhoneFld;
    public CreateAccountPageLocators(WebDriver driver) {
        super(driver);
        this.driver = driver;
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
        PageFactory.initElements(driver, this);
    }
}
