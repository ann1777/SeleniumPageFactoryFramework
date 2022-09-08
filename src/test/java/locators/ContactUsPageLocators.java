package locators;

import objectRepository.ContactUsPage_OR;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

public class ContactUsPageLocators extends BasePageLocators {
    WebDriver driver;

    @FindBy(css = ContactUsPage_OR.HOME_ICN)
    public WebElement homeIcn;

    @FindBy(css = ContactUsPage_OR.NAVIGATION_PIPE)
    public WebElement navigationPipe;

    @FindBy(css = ContactUsPage_OR.CONTACTUSPAGE_TAB)
    public WebElement navigationTab;

    @FindBy(css = ContactUsPage_OR.CONTACTUSPAGE_CONTENT)
    public WebElement contactPageContent;

    @FindBy(css = ContactUsPage_OR.CONTACTUSPAGE_HEADER)
    public WebElement pageTitle;

    @FindBy(xpath = ContactUsPage_OR.CONTACTUSPAGE_CONTENT_HEADER)
    public WebElement contactPageContentHeader;

    @FindBy(xpath = ContactUsPage_OR.CONTACTUSPAGE_SUBJECT_HEADING_LABEL)
    public WebElement contactPageSubjectHeadingLabel;

    @FindBy(xpath = ContactUsPage_OR.CONTACTUSPAGE_CONTACTFORM_DROPDOWN)
    public WebElement contactFormDropdown;

    @FindBy(xpath = ContactUsPage_OR.CONTACTUSPAGE_CONTACTNAMES_FORM_DROPDOWN)
    public WebElement contactNamesFormDropdown;

    @FindBy(css = ContactUsPage_OR.CONTACTUSPAGE_WEBMASTER_OPTION_CONTACTFORM_DROPDOWN)
    public WebElement webmasterOptionContactFormDropdown;

    @FindBy(xpath = ContactUsPage_OR.CONTACTUSPAGE_EMAILADDRESS_LABEL)
    public WebElement contactPageEmailAddressLabel;

    @FindBy(xpath = ContactUsPage_OR.CONTACTUSPAGE_EMAILINPUT_FLD)
//    @FindBy(css = ContactUsPage_OR.CONTACTPAGE_EMAILINPUT_FLD)
    public WebElement contactFormEmailInputFld;

    @FindBy(xpath = ContactUsPage_OR.CONTACTUSPAGE_ORDER_REFERENCE_LABEL)
    public WebElement contactPageOrderReferenceLabel;

    @FindBy(xpath = ContactUsPage_OR.CONTACTUSPAGE_ORDER_REFERENCE_INPUT_FLD)
    public WebElement contactOrderReferenceInputFld;

    @FindBy(xpath = ContactUsPage_OR.CONTACTUSPAGE_ATTACHFILE_LABEL)
    public WebElement contactPageAttachFileLabel;

    @FindBy(xpath = ContactUsPage_OR.CONTACTUSPAGE_CONTACTFORM_FILE_UPLOADER)
    public WebElement contactFormFileUploader;

    @FindBy(xpath = ContactUsPage_OR.CONTACTUSPAGE_CONTACTFORM_FILE_UPLOADER_NAME_SELECTOR)
    public WebElement contactFormFileUploaderNameSelector;

    @FindBy(xpath = ContactUsPage_OR.CONTACTUSPAGE_CONTACTFORM_FILE_UPLOADER_ACTION_BTN)
    public WebElement contactFormFileUploaderActionBtn;

    @FindBy(xpath = ContactUsPage_OR.CONTACTUSPAGE_MESSAGEFLD_LABEL)
    public WebElement contactPageMessageFldLabel;

    @FindBy(css = ContactUsPage_OR.CONTACTUSPAGE_MESSAGE_FLD)
    public WebElement contactPageMassageFld;

    @FindBy(xpath = ContactUsPage_OR.CONTACTUSPAGE_MESSAGE_SUBMIT_BTN)
    public WebElement contactPageMassageSubmitBtn;

    public ContactUsPageLocators(WebDriver driver) {
        super(driver);
        this.driver = driver;
        driver.get("http://automationpractice.com/index.php?controller=contact");
        PageFactory.initElements((ElementLocatorFactory) driver, this);
    }

    public ContactUsPageLocators() {

    }
}