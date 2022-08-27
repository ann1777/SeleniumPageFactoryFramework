package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage extends BasePage {
    WebDriver driver;

    @FindBy(css = ".icon-home")
    WebElement homeIcn;

    @FindBy(css = ".navigation-pipe")
    WebElement navigationPipe;

    @FindBy(css = ".navigation_page")
    WebElement contactIcn;

    @FindBy(css = "div#center_column")
    WebElement contactPageContent;

    @FindBy(css = "h1.page-heading")
    WebElement contactPageHeader;

    @FindBy(xpath = "//*[text() = 'send a message']")
    WebElement contactPageContentHeader;

//    @FindBy(xpath = "//*[text() = 'Subject Heading']")
    @FindBy(xpath = "//*/label[@for='id_contact']")
    WebElement contactPageSubjectHeadingLabel;

    @FindBy(xpath = "//*[@class='selector'][@id=\"uniform-id_contact\"]")
//    @FindBy(css = "#uniform-id_contact")
    WebElement contactFormDropdown;

    @FindBy(xpath = "//*[@id='id_contact']")
    WebElement contactNamesFormDropdown;

    @FindBy(css = "#id_contact>option:nth-child(3)")
    WebElement webmasterOptionContactFormDropdown;

    @FindBy(xpath = "//*/label[@for='email']")
//    @FindBy(xpath = "//*[text() = 'Email address']")
    WebElement contactPageEmailAddressLabel;

    @FindBy(xpath = "//*[@id='email']")
//    @FindBy(css = "#email")
    WebElement contactFormEmailInputFld;

    @FindBy(xpath = "//*/label[text()='Order reference']")
    WebElement contactPageOrderReferenceLabel;

    @FindBy(xpath = "//*[@id='id_order']")
//    @FindBy(css = "#id_order")
    WebElement contactOrderReferenceInputFld;

    @FindBy(xpath = "//*/label[text()='Attach File']")
    WebElement contactPageAttachFileLabel;

    @FindBy(xpath = "//*[@id='uniform-fileUpload']")
//    @FindBy(css = "#uniform-fileUpload")
    WebElement contactFormFileUploader;

    @FindBy(xpath = "//*[@class='filename']")
//    @FindBy(css = ".filename")
    WebElement contactFormFileUploaderNameSelector;

    @FindBy(xpath = "//*[@class='action']")
//    @FindBy(css = ".action")
    WebElement contactFormFileUploaderActionBtn;

    @FindBy(xpath = "//*/label[@for='message']")
//    @FindBy(xpath = "//label[text()='Message']")
    WebElement contactPageMassageFldLabel;

    @FindBy(css = "#message")
//    @FindBy(xpath = "//*[@id= 'message']")
    WebElement contactPageMassageFld;

    @FindBy(xpath = "//*[@id= 'submitMessage']")
//    @FindBy(css = "#submitMessage")
//    @FindBy(xpath = "//*/span[text()='Send']")
    WebElement contactPageMassageSubmitBtn;

    public ContactUsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        driver.get("http://automationpractice.com/index.php?controller=contact");
        PageFactory.initElements(driver, this);
    }
}