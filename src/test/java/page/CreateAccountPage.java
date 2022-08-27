package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage extends  BasePage{
    WebDriver driver;

    @FindBy(css = ".icon-home")
    WebElement homeIcn;

    @FindBy(css = ".navigation-pipe")
    WebElement navigationPipe;

    @FindBy(css = ".navigation_page")
    WebElement navigationTab;

    @FindBy(xpath = "//h1[@class='page-heading']")
//    @FindBy(xpath = "//h1[text()='Create an account']")
//    @FindBy(css = "#noSlide>h1")
    WebElement createAccountPageTitle;

    @FindBy(css = "#account-creation_form")
//    @FindBy(xpath = "//*[@id='account-creation_form']")
//    @FindBy(xpath = "//*[@method='post'][1]")
//    @FindBy(xpath = "//*/div[@class="account_creation"][1]")
    WebElement personalInformationForm;

    @FindBy(xpath = "//*/h3[@class='page-subheading'][text()='Your personal information']")
    WebElement personalInformationFormTitle;

    @FindBy(xpath = "//*/label[text()='Title']")
    WebElement getPersonalInformationTitleLabel;

    @FindBy(xpath = "//*[@id='uniform-id_gender1']")
//    @FindBy(xpath = "//*/label[@for='id_gender1']")
//    @FindBy(xpath = "//*/input[@type="radio"][@value=1]")
//    @FindBy(css = "#uniform-id_gender1")
    WebElement mailGenderCheckBox;

    @FindBy(xpath = "//*[@id='account-creation_form']//label[@for='id_gender1']/text()")
    WebElement mailGenderText;

    @FindBy(xpath = "//*[@id='uniform-id_gender2']")
//    @FindBy(xpath = "//*/label[@for=\"id_gender2\"]/text()")
//    @FindBy(xpath = "//*/input[@type=\"radio\"][@value=2]")
    WebElement femailGenderCheckBox;

    @FindBy(xpath = "//*[@id='account-creation_form']//label[@for='id_gender2']/text()")
    WebElement femailGenderText;

    @FindBy(xpath = "//*/label[@for='customer_firstname']")
    WebElement firstNameLabel;

    @FindBy(css = "#customer_firstname")
//    @FindBy(xpath = "//*/input[@id="customer_firstname"]")
//    @FindBy(xpath = "//*/input[@name="customer_firstname"]")
    WebElement firstNameFld;

    @FindBy(xpath = "//*/label[@for='customer_lastname']")
//    @FindBy(xpath = "//*/div/label[text()='Last name ']")
    WebElement lastNameLabel;

    @FindBy(css = "#customer_lastname")
//    @FindBy(xpath = "//*/input[@id="customer_lastname"]")
//    @FindBy(xpath = "//*/input[@name="customer_lastname"]")
    WebElement lastNameFld;

    @FindBy(xpath = "//*/label[@for='email']")
    WebElement emailLabel;

    @FindBy(css = "#email")
//    @FindBy(xpath = "//*/input[@data-validate="isEmail"]")
//    @FindBy(xpath = "//*/input[@id="email"]")
    WebElement emailFld;

    @FindBy(xpath = "//*/label[@for='passwd']")
    WebElement passwdLabel;

    @FindBy(css = "#passwd")
//    @FindBy(xpath = "//*/input[@data-validate="isPasswd"]")
//    @FindBy(xpath = "//*/input[@id="passwd"]")
//    @FindBy(xpath = "//*/input[@name="passwd"]")
    WebElement passwdFld;

    @FindBy(xpath = "//*/label[text()=\"Date of Birth\"]")
    WebElement birthDataLabel;

    @FindBy(css = "#uniform-days")
    WebElement birthDaySelector;

    @FindBy(css = "#uniform-months")
    WebElement birthMonthSelector;

    @FindBy(css = "#uniform-years")
    WebElement birthYearsSelector;

    @FindBy(css = "#newsletter")
//    @FindBy(xpath = "//*/input[@name="newsletter"]")
//    @FindBy(xpath = "//*/input[@id="uniform-newsletter"]")
    WebElement signUpForNewsLetterCheckBox;

    @FindBy(xpath = "//*/label[@for='newsletter']")
//    @FindBy(xpath = "//*/label[text()=\"Sign up for our newsletter!\"]")
    WebElement signUpForNewsLetterLabel;

    @FindBy(css = "#newsletter")
//    @FindBy(xpath = "//*/input[@name="optin"]")
//    @FindBy(xpath = "//*/input[@id="optin"]")
    WebElement receiveSpecialOffersCheckBox;

    @FindBy(xpath = "//*/label[@for='optin']")
//    @FindBy(xpath = "//*/label[text()="Receive special offers from our partners!"]")
    WebElement receiveSpecialOffersLabel;

    @FindBy(xpath = "//*/div[@class='account_creation'][2]")
//    @FindBy(xpath = "//*/h3[text()="Your address"]")
    WebElement yourAddressForm;

    @FindBy(xpath = "//*/label[@for='customer_firstname']")
//    @FindBy(xpath = "//*/p/label[text()="First name"]")
    WebElement yourAddressFormFirstNameLabel;

    @FindBy(css = "#firstname.form-control")
//    @FindBy(xpath = "//*/input[@id="firstname"]")
//    @FindBy(xpath = "//*/input[@name="firstname"]")
    WebElement yourAddressFormFirstNameFld;

    @FindBy(xpath = "//*/label[@for='lastname']")
//    @FindBy(xpath = "//*/p/label[text()='Last name ']")
    WebElement yourAddressFormLastNameLabel;

    @FindBy(css = "input#lastname")
//    @FindBy(xpath = "//*/input[@id="lastname"]")
//    @FindBy(xpath = "//*/input[@name="lastname"]")
    WebElement yourAddressFormLastNameFld;

    @FindBy(xpath = "//*/label[@for='company']")
//    @FindBy(xpath = "//*/p/label[text()="Company"]")
    WebElement yourAddressFormCompanyLabel;

    @FindBy(css = "#company")
//    @FindBy(xpath = "//*/input[@id="company"]")
//    @FindBy(xpath = "//*/input[@name="company"]")
    WebElement yourAddressFormCompanyFld;

    @FindBy(xpath = "//*/label[@for='address1']")
//    @FindBy(xpath = "//*/p/label[text()="Address "]")
    WebElement yourAddressFormAddressLabel;

    @FindBy(css = "#address1")
//    @FindBy(xpath = "//*/input[@name='address1']")
//    @FindBy(xpath = "//*/input[@id='address1']")
    WebElement yourAddressFormAddressFld;

    @FindBy(css = "p.required.form-group>span.inline-infos")
//    @FindBy(xpath = "//*/span[text()='Street address, P.O. Box, Company name, etc.']")
    WebElement yourAddressInlineInfoLabel;

    @FindBy(xpath = "//*/label[@for='address2']")
//    @FindBy(xpath = "//*/p/label[text()="Address (Line 2)"]")
    WebElement yourAddressFormAddress2Label;

    @FindBy(css = "#address2")
//    @FindBy(xpath = "//*/input[@name='address2']")
//    @FindBy(xpath = "//*/input[@id='address2']")
    WebElement yourAddressFormAddress2Fld;

    @FindBy(css = "p.form-group.is_customer_param>span.inline-infos")
//    @FindBy(xpath = "//*/span[text()='Apartment, suite, unit, building, floor, etc...']")
    WebElement yourAddress2InlineInfoLabel;

    @FindBy(xpath = "//*/label[@for='city']")
//    @FindBy(xpath = "//*/p/label[text()="City"]")
    WebElement yourAddressFormCityLabel;

    @FindBy(css = "#city")
//    @FindBy(xpath = "//*/input[@name='city']")
//    @FindBy(xpath = "//*/input[@id='city']")
    WebElement yourAddressFormCityFld;

    @FindBy(xpath = "//*/label[@for='id_state']")
//    @FindBy(xpath = "//*/p/label[text()="State "]")
    WebElement yourAddressFormStateLabel;

    @FindBy(css = "#uniform-id_state")
//    @FindBy(xpath = "//*/div[@id='uniform-id_state']")
//    @FindBy(xpath = "//*/select[@id='id_state']")
    WebElement yourAddressFormStateSelector;

    @FindBy(css = "#id_state>option")
//    @FindBy(xpath = "//*[@id="id_state"]/option[12]")
    WebElement yourAddressFormStateSelectGeorgia;

    @FindBy(xpath = "//*/label[@for='postcode']")
//    @FindBy(xpath = "//*/p/label[text()="Zip/Postal Code "]")
    WebElement yourAddressZipCodeLabel;

    @FindBy(css = "#postcode")
//    @FindBy(xpath = "//*/input[@id='postcode']")
//    @FindBy(xpath = "//*/input[@name='postcode']")
    WebElement yourAddressZipCodeSelector;


    @FindBy(xpath = "//*/label[@for='id_country']")
//    @FindBy(xpath = "//*/p/label[text()="Country "]")
    WebElement yourAddressFormCountryLabel;

    @FindBy(css = "#uniform-id_country")
//    @FindBy(xpath = "//*/div[@id='uniform-id_country']")
//    @FindBy(xpath = "//*/span[text()='United States']")
//    @FindBy(xpath = "//*/select[@id='id_country']")
    WebElement yourAddressFormCountrySelector;

    @FindBy(css = "#other")
//    @FindBy(xpath = "//label[@for='other']")
//    @FindBy(xpath = "//label[text()='Additional information']")
//    @FindBy(xpath = "//textarea[@name='other']")
//    @FindBy(xpath = "//textarea[@class='form-control']")
    WebElement yourAddressFormAdditionalInformationLabel;

    @FindBy(xpath = "//p[@class='inline-infos']")
//    @FindBy(xpath = "//p[text()='You must register at least one phone number.']")
//    @FindBy(xpath = "//*/p/label[text()="Zip/Postal Code "]")
    WebElement yourAddressFormAdditionalInformationInlineInfos;

    @FindBy(xpath = "//*/label[@for='phone']")
//    @FindBy(xpath = "//*/label[text()='Home phone']")
    WebElement yourAddressFormHomePhoneLabel;

    @FindBy(css = "#phone")
//    @FindBy(xpath = "//*/input[@id='phone']")
//    @FindBy(xpath = "//*/input[@name='phone']")
    WebElement yourAddressFormHomePhoneFld;

    @FindBy(xpath = "//*/label[@for='phone_mobile']")
//    @FindBy(xpath = "//*/p/label[text()="Mobile phone "]")
    WebElement yourAddressFormMobilePhoneLabel;

    @FindBy(css = "#phone_mobile")
//    @FindBy(xpath = "//*/input[@id='phone_mobile']")
//    @FindBy(xpath = "//*/input[@name='phone_mobile']")
    WebElement yourAddressFormMobilePhoneFld;


    @FindBy(xpath = "//*/label[@for='alias']")
//    @FindBy(xpath = "//label[text()='Assign an address alias for future reference. ']")
    WebElement yourAddressFormFutureReferenceLabel;

    @FindBy(css = "#alias")
//    @FindBy(xpath = "//input[@value='My address']")
//    @FindBy(xpath = "//input[@name='alias']")
//    @FindBy(xpath = "//input[@id='alias']")
    WebElement yourAddressFormFutureReferenceFld;

    @FindBy(css = ".submit")
//    @FindBy(css = ".submit.clearfix")
//    @FindBy(xpath = "//div[@class='submit clearfix']")
//    @FindBy(xpath = "//*/span[text()="Register"]")
    WebElement yourAddressFormRegisterBtn;

    @FindBy(css = ".pull-right")
//    @FindBy(css = ".pull-right.required")
//    @FindBy(xpath = "//*/span[text()="Required field"]")
//    @FindBy(xpath = "//*/p[@class="pull-right required"]")
    WebElement yourAddressHomePhoneFld;
    public CreateAccountPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
        PageFactory.initElements(driver, this);
    }
}
