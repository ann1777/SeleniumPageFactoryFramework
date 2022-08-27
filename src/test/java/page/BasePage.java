package page;
import helpers.wait.WaitHelper;
import objectRepository.BasePage_OR;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    private WebDriver driver;
    public WaitHelper wait;

    //page header elements
    @FindBy(css = BasePage_OR.BASEPAGE_HEADER)
    WebElement pageHeader;

    @FindBy(css = BasePage_OR.BASEPAGE_HEADER_ADV)
    WebElement headerAdv;

    @FindBy(xpath = BasePage_OR.BASEPAGE_SHOP_PHONE)
    WebElement shopPhone;

    @FindBy(css = BasePage_OR.BASEPAGE_HEADER_PHONE_ICN)
    WebElement headerPhoneIcn;

    @FindBy(id = BasePage_OR.BASEPAGE_CONTACT_AS_BTN)
    WebElement contactAsBtn;

    @FindBy(css = BasePage_OR.BASEPAGE_SIGN_IN_BTN)
    WebElement signInBtn;

    @FindBy(xpath = BasePage_OR.BASEPAGE_HEADER_LOGO)
    WebElement headerLogo;

    @FindBy(xpath = BasePage_OR.BASEPAGE_SEARCH_FLD)
    WebElement searchFld;

    @FindBy(xpath = BasePage_OR.BASEPAGE_SHOPPING_CART_ICN)
    WebElement shoppingCartIcn;

    @FindBy(xpath = BasePage_OR.BASEPAGE_WOMAN_DISPLAY_BLOCK)
    WebElement womanDisplayBlock;

    @FindBy(css = BasePage_OR.BASEPAGE_HEADER_DISPLAY_BLOCK_CONTAINER)
    WebElement womanDisplayBlockContainer;

    @FindBy(xpath = BasePage_OR.BASEPAGE_HEADER_BLOCK_TOPS_TITLE)
    WebElement womanDisplayBlockTopsTitle;

    @FindBy(xpath = BasePage_OR.BASEPAGE_HEADER_TSHIRTS_SUBTITLE)
    WebElement womanDisplayBlockTshirtsSubtitle;

    @FindBy(xpath = BasePage_OR.BASEPAGE_HEADER_BLOUSES_SUBTITLE)
    WebElement womanDisplayBlockBlousesSubtitle;

    @FindBy(xpath = BasePage_OR.BASEPAGE_HEADER_DRESSES_TITLE)
    WebElement womanDisplayBlockDressesTitle;

    @FindBy(xpath = BasePage_OR.BASEPAGE_HEADER_CASUAL_DRESSES_SUBTITLE)
//    @FindBy(xpath = "//*[@title='Casual Dresses'][text()='Casual Dresses']")
    WebElement womanDisplayBlockCasualDressesSubTitle;

    @FindBy(xpath = BasePage_OR.BASEPAGE_HEADER_EVENING_DRESSES_SUBTITLE)
//    @FindBy(xpath = "//*[@title='Evening Dresses'][text()='Evening Dresses']")
    WebElement womanDisplayBlockEveningDressesSubTitle;

    @FindBy(xpath = BasePage_OR.BASEPAGE_HEADER_SUMMER_DRESSES_SUBTITLE)
//    @FindBy(xpath = "//*[@title='Summer Dresses'][text()='Summer Dresses']")
    WebElement womanDisplayBlockSummerDressesSubTitle;

    @FindBy(xpath = BasePage_OR.BASEPAGE_HEADER_ADV_IMG)
    WebElement womanDisplayBlockAdvImg;

    @FindBy(xpath = BasePage_OR.BASEPAGE_HEADER_DRESSES_DISPLAY_BLOCK_TAB)
//    @FindBy(xpath = "//*[@id='block_top_menu']//a[text()='Dresses']")
//    @FindBy(css = "a.sf-with-ul:nth-of-type(2)")
    WebElement dressesDisplayBlockTab;

    @FindBy(xpath = BasePage_OR.BASEPAGE_HEADER_DISPLAY_BLOCK_CASUAL_DRESSES_SUBTITLE)
    WebElement dressesDisplayBlockCasualDressesSubTitle;

    @FindBy(xpath = BasePage_OR.BASEPAGE_HEADER_DISPLAY_BLOCK_EVENING_DRESSES_SUBTITLE)
    WebElement dressesDisplayBlockEveningDressesSubTitle;

    @FindBy(xpath = BasePage_OR.BASEPAGE_HEADER_DISPLAY_BLOCK_SUMMER_DRESSES_SUBTITLE)
    WebElement dressesDisplayBlockSummerDressesSubTitle;

    @FindBy(xpath = BasePage_OR.BASEPAGE_HEADER_DRESSES_DISPLAY_BLOCK)
    WebElement dressesDisplayBlock;

    @FindBy(xpath = BasePage_OR.BASEPAGE_HEADER_TSHIRTS_DISPLAY_BLOCK)
    WebElement tShirtsDisplayBlock;

    //page footer elements
    @FindBy(css = BasePage_OR.BASEPAGE_FOOTER)
    WebElement pageFooter;

    @FindBy(xpath = BasePage_OR.BASEPAGE_FOOTER_NEWS_LETTER_BLOCK)
    WebElement NewsletterBlock;

    @FindBy(css = BasePage_OR.BASEPAGE_FOOTER_NEWS_LETTER_INPUT_FLD)
    WebElement NewsletterInputFld;

    @FindBy(xpath = BasePage_OR.BASEPAGE_FOOTER_EMAIL_FLD)
    WebElement enterYourEmailFldValue;

    @FindBy(css = BasePage_OR.BASEPAGE_FOOTER_NEWS_LETTER_BTN)
    WebElement submitNewsletterBtn;

    @FindBy(css = BasePage_OR.BASEPAGE_FOOTER_SOCIAL_BLOCK)
    WebElement footerSocialBlock;

    @FindBy(xpath = BasePage_OR.BASEPAGE_FOOTER_FOLLOW_US_BLOCK)
    WebElement footerFollowUsBlock;

    @FindBy(css = BasePage_OR.BASEPAGE_FOOTER_FACEBOOK_ICN)
    WebElement facebookIcn;

    @FindBy(css = BasePage_OR.BASEPAGE_FOOTER_TWITTER_ICN)
    WebElement twitterIcn;

    @FindBy(css = BasePage_OR.BASEPAGE_FOOTER_YOUTUBE_ICN)
    WebElement youtubeIcn;

    @FindBy(css = BasePage_OR.BASEPAGE_FOOTER_GOOGLE_PLUS_ICN)
    WebElement googlePlusIcn;

    @FindBy(xpath = BasePage_OR.BASEPAGE_FOOTER_FOOTER_CATEGORIES_SECT)
    WebElement CategoriesSection;

    @FindBy(xpath = BasePage_OR.BASEPAGE_FOOTER_FOOTER_INFORMATIONS_SECT)
    WebElement informationSection;

    @FindBy(xpath = BasePage_OR.BASEPAGE_FOOTER_FOOTER_ACCOUNT_SECT)
    WebElement myAccountSection;

    @FindBy(xpath = BasePage_OR.BASEPAGE_FOOTER_FOOTER_INFORMATION_SECT)
    WebElement storeInformationSection;

    @FindBy(css = BasePage_OR.BASEPAGE_FOOTER_FOOTER_MAP_MARCER_ICN)
    WebElement mapMarkerIcn;

    @FindBy(css = BasePage_OR.BASEPAGE_FOOTER_FOOTER_PHONE_ICN)
    WebElement footerPhoneIcn;

    @FindBy(css = BasePage_OR.BASEPAGE_FOOTER_ENVELOPE_ICN)
    WebElement envelopeIcn;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        driver.get("https://automationpractice.com/index.php");
        PageFactory.initElements(driver, this);
    }
    public BasePage() {
    }
}
