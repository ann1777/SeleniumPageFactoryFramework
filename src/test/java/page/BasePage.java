package page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    WebDriver driver;
    //page header elements
    @FindBy(css = "#header")
    WebElement pageHeader;

    @FindBy(css = ".row>a>img")
    WebElement headerAdv;

    @FindBy(xpath = "//*[@class=\"shop-phone\"]")
    WebElement shopPhone;

    @FindBy(css = "span>.icon-phone")
    WebElement headerPhoneIcn;

    @FindBy(id = "contact-link")
    WebElement contactAsBtn;

    @FindBy(css = ".login")
    WebElement signInBtn;

    @FindBy(xpath = "//div[@id='header_logo']")
    WebElement headerLogo;

    @FindBy(xpath = "//*[@placeholder=\"Search\"]")
    WebElement searchFld;

    @FindBy(xpath = "a[title='View my shopping cart']")
    WebElement shoppingCartIcn;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul//a[text() = 'Women']")
    WebElement womanDisplayBlock;

    @FindBy(css = ".submenu-container.clearfix.first-in-line-xs']")
    WebElement womanDisplayBlockContainer;

    @FindBy(xpath = "//*[@class='sfHoverForce']//*[text()='Tops']")
    WebElement womanDisplayBlockTopsTitle;

    @FindBy(xpath = "//*[@class='sfHoverForce']//*[text()='T-shirts']")
    WebElement womanDisplayBlockTshirtsSubtitle;

    @FindBy(xpath = "//*[@class='sfHoverForce']//*[text()='Blouses']")
    WebElement womanDisplayBlockBlousesSubtitle;

    @FindBy(xpath = "//*[@class='sfHoverForce']//*[text()='Dresses']")
    WebElement womanDisplayBlockDressesTitle;

    @FindBy(xpath = "//*[@class='sfHoverForce']//*[text()='Casual Dresses']")
//    @FindBy(xpath = "//*[@title='Casual Dresses'][text()='Casual Dresses']")
    WebElement womanDisplayBlockCasualDressesSubTitle;

    @FindBy(xpath = "//*[@class=\"sfHoverForce\"]//*[text()='Evening Dresses']")
//    @FindBy(xpath = "//*[@title='Evening Dresses'][text()='Evening Dresses']")
    WebElement womanDisplayBlockEveningDressesSubTitle;

    @FindBy(xpath = "//*[@class='sfHoverForce']//*[text()='Summer Dresses']")
//    @FindBy(xpath = "//*[@title='Summer Dresses'][text()='Summer Dresses']")
    WebElement womanDisplayBlockSummerDressesSubTitle;

    @FindBy(xpath = "//*[@class=\"sfHoverForce\"]//*[@id='category-thumbnail']/div[img]")
    WebElement womanDisplayBlockAdvImg;


    @FindBy(xpath = "//*[@class='sf-with-ul'][text()='Dresses']")
//    @FindBy(xpath = "//*[@id='block_top_menu']//a[text()='Dresses']")
//    @FindBy(css = "a.sf-with-ul:nth-of-type(2)")
    WebElement dressesDisplayBlockTab;

    @FindBy(xpath = "//*[@title='Casual Dresses']")
    WebElement dressesDisplayBlockCasualDressesSubTitle;

    @FindBy(xpath = "//*[@title='Casual Dresses']")
    WebElement dressesDisplayBlockEveningDressesSubTitle;

    @FindBy(xpath = "//*[@title='Summer Dresses']")
    WebElement dressesDisplayBlockSummerDressesSubTitle;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li/a[text() = 'Dresses']")
    WebElement dressesDisplayBlock;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li/a[text() = 'T-shirts']")
    WebElement tShirtsDisplayBlock;

    //page footer elements
    @FindBy(css = ".footer-container")
    WebElement pageFooter;

    @FindBy(xpath = "//*[text() = 'Newsletter']")
    WebElement NewsletterBlock;

    @FindBy(css = "#newsletter-input")
    WebElement NewsletterInputFld;

    @FindBy(xpath = "//*[@value='Enter your e-mail']")
    WebElement enterYourEmailFldValue;

    @FindBy(css = "#newsletter_block_left>div>form>div>button")
    WebElement submitNewsletterBtn;

    @FindBy(css = "#social_block")
    WebElement footerSocialBlock;

    @FindBy(xpath = "//*[text() = 'Follow us']")
    WebElement footerFollowUsBlock;

    @FindBy(css = "li.facebook")
    WebElement facebookIcn;

    @FindBy(css = "li.twitter")
    WebElement twitterIcn;

    @FindBy(css = "li.youtube")
    WebElement youtubeIcn;

    @FindBy(css = "li.google-plus")
    WebElement googlePlusIcn;

    @FindBy(xpath = "//h4[text()='Categories']")
    WebElement CategoriesSection;

    @FindBy(xpath = "//h4[text()='Information']")
    WebElement informationSection;

    @FindBy(xpath = "//h4/a[text()='My account']")
    WebElement myAccountSection;

    @FindBy(xpath = "//h4[text()='Store information']")
    WebElement storeInformationSection;

    @FindBy(css = ".icon-map-marker")
    WebElement mapMarkerIcn;

    @FindBy(css = "li>.icon-phone")
    WebElement footerPhoneIcn;

    @FindBy(css = ".icon-envelope-alt")
    WebElement envelopeIcn;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        driver.get("https://automationpractice.com/index.php");
        PageFactory.initElements(driver, this);
    }
}
