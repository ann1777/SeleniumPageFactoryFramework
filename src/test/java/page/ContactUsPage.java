package page;

import objectRepository.ContactUsPage_OR;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage extends BasePage {
    WebDriver driver;

    @FindBy(css = ContactUsPage_OR.HOME_ICN)
    WebElement homeIcn;

    @FindBy(css = ContactUsPage_OR.NAVIGATION_PIPE)
    WebElement navigationPipe;

    @FindBy(css = ContactUsPage_OR.CONTACTUSPAGE_ICN)
    WebElement contactIcn;

    @FindBy(css = ContactUsPage_OR.CONTACTUSPAGE_CONTENT)
    WebElement contactPageContent;

    @FindBy(css = ContactUsPage_OR.CONTACTUSPAGE_HEADER)
    WebElement contactPageHeader;

    @FindBy(xpath = ContactUsPage_OR.CONTACTUSPAGE_CONTENT_HEADER)
    WebElement contactPageContentHeader;

    @FindBy(xpath = ContactUsPage_OR.CONTACTUSPAGE_SUBJECT_HEADING_LABEL)
    WebElement contactPageSubjectHeadingLabel;

    @FindBy(xpath = ContactUsPage_OR.CONTACTUSPAGE_CONTACTFORM_DROPDOWN)
    WebElement contactFormDropdown;

    @FindBy(xpath = ContactUsPage_OR.CONTACTUSPAGE_CONTACTNAMES_FORM_DROPDOWN)
    WebElement contactNamesFormDropdown;

    @FindBy(css = ContactUsPage_OR.CONTACTUSPAGE_WEBMASTER_OPTION_CONTACTFORM_DROPDOWN)
    WebElement webmasterOptionContactFormDropdown;

    @FindBy(xpath = ContactUsPage_OR.CONTACTUSPAGE_EMAILADDRESS_LABEL)
    WebElement contactPageEmailAddressLabel;

    @FindBy(xpath = ContactUsPage_OR.CONTACTUSPAGE_EMAILINPUT_FLD)
//    @FindBy(css = ContactUsPage_OR.CONTACTPAGE_EMAILINPUT_FLD)
    WebElement contactFormEmailInputFld;

    @FindBy(xpath = ContactUsPage_OR.CONTACTUSPAGE_ORDER_REFERENCE_LABEL)
    WebElement contactPageOrderReferenceLabel;

    @FindBy(xpath = ContactUsPage_OR.CONTACTUSPAGE_ORDER_REFERENCE_INPUT_FLD)
    WebElement contactOrderReferenceInputFld;

    @FindBy(xpath = ContactUsPage_OR.CONTACTUSPAGE_ATTACHFILE_LABEL)
    WebElement contactPageAttachFileLabel;

    @FindBy(xpath = ContactUsPage_OR.CONTACTUSPAGE_CONTACTFORM_FILE_UPLOADER)
    WebElement contactFormFileUploader;

    @FindBy(xpath = ContactUsPage_OR.CONTACTUSPAGE_CONTACTFORM_FILE_UPLOADER_NAME_SELECTOR)
    WebElement contactFormFileUploaderNameSelector;

    @FindBy(xpath = ContactUsPage_OR.CONTACTUSPAGE_CONTACTFORM_FILE_UPLOADER_ACTION_BTN)
    WebElement contactFormFileUploaderActionBtn;

    @FindBy(xpath = ContactUsPage_OR.CONTACTUSPAGE_MESSAGEFLD_LABEL)
    WebElement contactPageMessageFldLabel;

    @FindBy(css = ContactUsPage_OR.CONTACTUSPAGE_MESSAGE_FLD)
    WebElement contactPageMassageFld;

    @FindBy(xpath = ContactUsPage_OR.CONTACTUSPAGE_MESSAGE_SUBMIT_BTN)
    WebElement contactPageMassageSubmitBtn;

    public ContactUsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        driver.get("http://automationpractice.com/index.php?controller=contact");
        PageFactory.initElements(driver, this);
    }
}