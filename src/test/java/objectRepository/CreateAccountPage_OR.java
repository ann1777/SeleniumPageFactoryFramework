package objectRepository;

public class CreateAccountPage_OR {

    public static final String CREATEACCOUNTPAGE_HOME_ICN = ".icon-home";
    public static final String CREATEACCOUNTPAGE_NAVIGATION_PIPE = ".navigation-pipe";
    public static final String CREATEACCOUNTPAGE_NAVIGATION_TAB = ".navigation_page";
    public static final String CREATEACCOUNTPAGE_PAGE_TITLE = "//h1[@class='page-heading']";
//    public static final String CREATEACCOUNTPAGE_PAGE_TITLE = "//h1[text()='Create an account']";
//    public static final String CREATEACCOUNTPAGE_PAGE_TITLE = "#noSlide>h1";
    public static final String CREATEACCOUNTPAGE_PERSONALINFORMATION_FORM = "#account-creation_form";
//    public static final String CREATEACCOUNTPAGE_PERSONALINFORMATION_FORM = "//*[@id='account-creation_form']";
//    public static final String CREATEACCOUNTPAGE_PERSONALINFORMATION_FORM = "//*[@method='post'][1]";
//    public static final String CREATEACCOUNTPAGE_PERSONALINFORMATION_FORM = "//*/div[@class='account_creation'][1]";
    public static final String CREATEACCOUNTPAGE_PERSONALINFORMATION_FORM_TITLE = "//*/h3[@class='page-subheading'][text()='Your personal information']";
    public static final String CREATEACCOUNTPAGE_PERSONALINFORMATION_TITLE_LABEL = "//*/label[text()='Title']";
    public static final String CREATEACCOUNTPAGE_MAILGENGER_CHECKBOX = "//*[@id='uniform-id_gender1']";
//    public static final String CREATEACCOUNTPAGE_MAILGENGER_CHECKBOX = "//*/label[@for='id_gender1']";
//    public static final String CREATEACCOUNTPAGE_MAILGENGER_CHECKBOX = "//*/input[@type='radio'][@value=1]";
//    public static final String CREATEACCOUNTPAGE_MAILGENGER_CHECKBOX = "#uniform-id_gender1";
    public static final String CREATEACCOUNTPAGE_MAILGENGER_TEXT = "//*[@id='account-creation_form']//label[@for='id_gender1']/text()";
    public static final String CREATEACCOUNTPAGE_FEMAILGENDER_CHECKBOX = "//*[@id='uniform-id_gender2']";
//    public static final String CREATEACCOUNTPAGE_FEMAILGENDER_CHECKBOX = "//*/label[@for='id_gender2']/text()";
//    public static final String CREATEACCOUNTPAGE_FEMAILGENDER_CHECKBOX = "//*/input[@type='radio'][@value=2]";
    public static final String CREATEACCOUNTPAGE_FEMAILGENDER_TEXT = "//*[@id='account-creation_form']//label[@for='id_gender2']/text()";
    public static final String CREATEACCOUNTPAGE_FIRSTNAME_LABEL = "//*/label[@for='customer_firstname']";
    public static final String CREATEACCOUNTPAGE_FIRSTNAME_FLD = "#customer_firstname";
//    public static final String CREATEACCOUNTPAGE_FIRSTNAME_FLD = "//*/input[@id='customer_firstname']";
//    public static final String CREATEACCOUNTPAGE_FIRSTNAME_FLD = "//*/input[@name='customer_firstname']";
    public static final String CREATEACCOUNTPAGE_LASTNAME_LABEL = "//*/label[@for='customer_lastname']";
//    public static final String CREATEACCOUNTPAGE_LASTNAME_LABEL = "//*/div/label[text()='Last name ']";
    public static final String CREATEACCOUNTPAGE_LASTNAME_FLD = "#customer_lastname";
//    public static final String CREATEACCOUNTPAGE_LASTNAME_FLD = "//*/input[@data-validate="isEmail"]";
//    public static final String CREATEACCOUNTPAGE_LASTNAME_FLD = "//*/input[@id="email"]";
    public static final String CREATEACCOUNTPAGE_EMAIL_LABEL = "//*/label[@for='email']";
    public static final String CREATEACCOUNTPAGE_PASSWORD_LABEL = "//*/label[@for='passwd']";
    public static final String CREATEACCOUNTPAGE_EMAIL_FLD = "#email";
//    public static final String CREATEACCOUNTPAGE_EMAIL_FLD = "//*/input[@data-validate='isEmail']";
//    public static final String CREATEACCOUNTPAGE_EMAIL_FLD = "//*/input[@id='email']";
    public static final String CREATEACCOUNTPAGE_PASSWORD_FLD = "#passwd";
//    public static final String CREATEACCOUNTPAGE_PASSWORD_FLD = "//*/input[@data-validate='isPasswd']";
//    public static final String CREATEACCOUNTPAGE_PASSWORD_FLD = "//*/input[@id='passwd']";
//    public static final String CREATEACCOUNTPAGE_PASSWORD_FLD = "//*/input[@name='passwd']";
    public static final String CREATEACCOUNTPAGE_BIRTHDAY_LABEL = "//*/label[text()='Date of Birth']";
    public static final String CREATEACCOUNTPAGE_BIRTHDAY_DAY_SELECTOR = "#uniform-days";
    public static final String CREATEACCOUNTPAGE_BIRTHDAY_MONTH_SELECTOR = "#uniform-months";
    public static final String CREATEACCOUNTPAGE_BIRTHDAY_YEARS_SELECTOR = "#uniform-years";
    public static final String CREATEACCOUNTPAGE_SIGNUP_FOR_NEWSLETTER_CHECKBOX = "#newsletter";
//    public static final String CREATEACCOUNTPAGE_SIGNUP_FOR_NEWSLETTER_CHECKBOX = "//*/input[@name='newsletter']";
//    public static final String CREATEACCOUNTPAGE_SIGNUP_FOR_NEWSLETTER_CHECKBOX = "//*/input[@id='uniform-newsletter']";
    public static final String CREATEACCOUNTPAGE_SIGNUP_FOR_NEWSLETTER_LABEL = "//*/label[@for='newsletter']";
//    public static final String CREATEACCOUNTPAGE_SIGNUP_FOR_NEWSLETTER_LABEL = "//*/label[text()=\"Sign up for our newsletter!\"]";
    public static final String CREATEACCOUNTPAGE_RECEIVE_SPECIALOFFERS_CHECKBOX = "#newsletter";
//    public static final String CREATEACCOUNTPAGE_RECEIVE_SPECIALOFFERS_CHECKBOX = "//*/input[@name='optin']";
//    public static final String CREATEACCOUNTPAGE_RECEIVE_SPECIALOFFERS_CHECKBOX = "//*/input[@id='optin']";
    public static final String CREATEACCOUNTPAGE_RECEIVE_SPECIALOFFERS_LABEL = "//*/label[@for='optin']";
//    public static final String CREATEACCOUNTPAGE_RECEIVE_SPECIALOFFERS_LABEL = "//*/label[text()='Receive special offers from our partners!']";
    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM = "//*/div[@class='account_creation'][2]";
//    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM = "//*/h3[text()='Your address']";
    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_FIRSTNAME_LABEL = "//*/label[@for='customer_firstname']";
//    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_FIRSTNAME_LABEL = "//*/p/label[text()='First name']";
    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_FIRSTNAME_FLD = "#firstname.form-control";
//    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_FIRSTNAME_FLD = "//*/input[@id='firstname']";
//    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_FIRSTNAME_FLD = "//*/input[@name='firstname']";
    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_LASTNAME_LABEL = "//*/label[@for='lastname']";
//    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_LASTNAME_LABEL = "//*/p/label[text()='Last name ']";
    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_LASTNAME_FLD = "input#lastname";
//    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_LASTNAME_FLD = "//*/input[@id='lastname']";
//    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_LASTNAME_FLD = "//*/input[@name='lastname']";
    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_COMPANY_LABEL = "//*/label[@for='company']";
//    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_COMPANY_LABEL = "//*/p/label[text()="Company"]";
    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_COMPANY_FLD = "#company";
//    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_COMPANY_FLD = "//*/input[@id='company']";
//    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_COMPANY_FLD = "//*/input[@name='company']";
    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_ADDERESS_LABEL = "//*/label[@for='address1']";
//    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_ADDERESS_LABEL = "//*/p/label[text()='Address ']";
    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_ADDERESS_FLD = "#address1";
//    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_ADDERESS_FLD = "//*/input[@name='address1']";
//    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_ADDERESS_FLD = "//*/input[@id='address1']";
    public static final String CREATEACCOUNTPAGE_YOURADDRESS_INLINEINFO_LABEL = "p.required.form-group>span.inline-infos";
//    public static final String CREATEACCOUNTPAGE_YOURADDRESS_INLINEINFO_LABEL = "//*/span[text()='Street address, P.O. Box, Company name, etc.']";
    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_ADDRESS2_LABEL = "//*/label[@for='address2']";
//    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_ADDRESS2_LABEL = "//*/p/label[text()='Address (Line 2)']";
    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_ADDRESS2_FLD = "#address2";
//    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_ADDRESS2_FLD = "//*/input[@name='address2']";
//    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_ADDRESS2_FLD = "//*/input[@id='address2']";
    public static final String CREATEACCOUNTPAGE_YOURADDRESS2_INLINEINFO_LABEL = "p.form-group.is_customer_param>span.inline-infos";
//    public static final String CREATEACCOUNTPAGE_YOURADDRESS2_INLINEINFO_LABEL = "p.form-group.is_customer_param>span.inline'//*/span[text()='Apartment, suite, unit, building, floor, etc...']'-infos";
    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_CITY_LABEL = "//*/label[@for='city']";
//    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_CITY_LABEL = "//*/p/label[text()='City']";
    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_CITY_FLD = "#city";
//    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_CITY_FLD = "//*/input[@name='city']";
//    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_CITY_FLD = "//*/input[@id='city']";
    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_STATE_LABEL = "//*/label[@for='id_state']";
//    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_STATE_LABEL = "//*/p/label[text()='State ']";
    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_STATE_SELECTOR = "#uniform-id_state";
//    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_STATE_SELECTOR = "//*/div[@id='uniform-id_state']";
//    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_STATE_SELECTOR = "//*/select[@id='id_state']";
    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_STATE_SELECTOR_GEORGIA = "#id_state>option";
//    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_STATE_SELECTOR_GEORGIA = "//*[@id='id_state']/option[12]";
    public static final String CREATEACCOUNTPAGE_YOURADDRESS_ZIPCODE_LABEL = "//*/label[@for='postcode']";
//    public static final String CREATEACCOUNTPAGE_YOURADDRESS_ZIPCODE_LABEL = "//*/p/label[text()='Zip/Postal Code ']";
    public static final String CREATEACCOUNTPAGE_YOURADDRESS_ZIPCODE_SELECTOR = "#postcode";
//    public static final String CREATEACCOUNTPAGE_YOURADDRESS_ZIPCODE_SELECTOR = "//*/input[@id='postcode']";
//    public static final String CREATEACCOUNTPAGE_YOURADDRESS_ZIPCODE_SELECTOR = "//*/input[@name='postcode']";
    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_COUNTRY_LABEL = "//*/label[@for='id_country']";
//    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_COUNTRY_LABEL = "//*/p/label[text()='Country ']";
    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_COUNTRY_SELECTOR = "#uniform-id_country";
//    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_COUNTRY_SELECTOR = "//*/div[@id='uniform-id_country']";
//    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_COUNTRY_SELECTOR = "//*/span[text()='United States']";
//    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_COUNTRY_SELECTOR = "//*/select[@id='id_country']";
    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_ADDITIONAL_INFORMATION_LABEL = "#other";
//    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_ADDITIONAL_INFORMATION_LABEL = "//label[@for='other']";
//    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_ADDITIONAL_INFORMATION_LABEL = "//label[text()='Additional information']";
//    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_ADDITIONAL_INFORMATION_LABEL = "//textarea[@name='other']";
//    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_ADDITIONAL_INFORMATION_LABEL = "//textarea[@class='form-control']";
    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_ADDITIONAL_INFORMATION_INLINE_INFOS = "//p[@class='inline-infos']";
//    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_ADDITIONAL_INFORMATION_INLINE_INFOS = "//p[text()='You must register at least one phone number.']";
//    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_ADDITIONAL_INFORMATION_INLINE_INFOS = "//*/p/label[text()='Zip/Postal Code ']";
    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_HOMEPHONE_LABEL = "//*/label[@for='phone']";
//    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_HOMEPHONE_LABEL = "//*/label[text()='Home phone']";
    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_HOMEPHONE_FLD = "#phone";
//    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_HOMEPHONE_FLD = "//*/input[@id='phone']";
//    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_HOMEPHONE_FLD = "//*/input[@name='phone']";
    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_MOBILEPHONE_LABEL = "//*/label[@for='phone_mobile']";
//    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_MOBILEPHONE_LABEL = "//*/p/label[text()='Mobile phone ']";
    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_MOBILEPHONE_FLD = "#phone_mobile";
//    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_MOBILEPHONE_FLD = "//*/input[@id='phone_mobile']";
//    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_MOBILEPHONE_FLD = "//*/input[@name='phone_mobile']";
    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_FUTURE_REFERENCE_LABEL = "//*/label[@for='alias']";
//    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_FUTURE_REFERENCE_LABEL = "//label[text()='Assign an address alias for future reference. ']";
    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_FUTURE_REFERENCE_FLD = "#alias";
//    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_FUTURE_REFERENCE_FLD = "//input[@value='My address']";
//    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_FUTURE_REFERENCE_FLD = "//input[@name='alias']";
//    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_FUTURE_REFERENCE_FLD = "//input[@id='alias']";
    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_REGISTER_BTN = ".submit";
//    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_REGISTER_BTN = ".submit.clearfix";
//    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_REGISTER_BTN = "//div[@class='submit clearfix']";
//    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_REGISTER_BTN = "//*/span[text()='Register']";
    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_PHONE_FLD = ".pull-right";
//    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_PHONE_FLD = ".pull-right.required";
//    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_PHONE_FLD = "//*/span[text()='Required field']";
//    public static final String CREATEACCOUNTPAGE_YOURADDRESS_FORM_PHONE_FLD = "//*/p[@class='pull-right required']";

}
