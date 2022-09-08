package locators;
import helpers.wait.WaitHelper;
import objectRepository.BasePage_OR;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

public class BasePageLocators {
    public WebDriver driver;
    public WaitHelper wait;

    //page header elements
    @FindBy(css = BasePage_OR.HEADER_MENU)
    public WebElement pageHeader;

    @FindBy(css = BasePage_OR.HEADER_ADV)
    public WebElement headerAdv;

    @FindBy(xpath = BasePage_OR.SHOP_PHONE)
    public WebElement shopPhone;

    @FindBy(css = BasePage_OR.HEADER_PHONE_ICN)
    public WebElement headerPhoneIcn;

    @FindBy(id = BasePage_OR.CONTACT_AS_BTN)
    public WebElement contactUsBtn;

    @FindBy(css = BasePage_OR.SIGN_IN_BTN)
    public WebElement signInBtn;

    @FindBy(xpath = BasePage_OR.HEADER_LOGO)
    public WebElement headerLogo;

    @FindBy(xpath = BasePage_OR.HEADER_BLOCK_TOP_MENU)
    public WebElement headerBlockTopMenu;

    @FindBy(xpath = BasePage_OR.HEADER_USERNAME_INFO)
    public WebElement headerUserNameInfo;

    @FindBy(xpath = BasePage_OR.SEARCH_FLD)
    public WebElement searchFld;

    @FindBy(xpath = BasePage_OR.SEARCH_BTN)
    public WebElement searchBtn;

    @FindBy(xpath = BasePage_OR.SHOPPING_CART_ICN)
    public WebElement shoppingCartIcn;

    @FindBy(xpath = BasePage_OR.WOMEN_BTN)
    public WebElement womenDisplayBlockTab;

    @FindBy(xpath = BasePage_OR.WOMEN_DISPLAY_BLOCK)
    public WebElement womenDisplayBlock;

    @FindBy(css = BasePage_OR.HEADER_DISPLAY_BLOCK_CONTAINER)
    public WebElement womenDisplayBlockContainer;

    @FindBy(xpath = BasePage_OR.HEADER_BLOCK_TOPS_TITLE)
    public WebElement womenDisplayBlockTopsTitle;

    @FindBy(xpath = BasePage_OR.HEADER_TSHIRTS_SUBTITLE)
    public WebElement womanDisplayBlockTshirtsSubtitle;

    @FindBy(xpath = BasePage_OR.HEADER_BLOUSES_SUBTITLE)
    public WebElement womanDisplayBlockBlousesSubtitle;

    @FindBy(xpath = BasePage_OR.HEADER_DRESSES_TITLE)
    public WebElement womanDisplayBlockDressesTitle;

    @FindBy(xpath = BasePage_OR.HEADER_CASUAL_DRESSES_SUBTITLE)
//    @FindBy(xpath = "//*[@title='Casual Dresses'][text()='Casual Dresses']")
    public WebElement womanDisplayBlockCasualDressesSubTitle;

    @FindBy(xpath = BasePage_OR.HEADER_EVENING_DRESSES_SUBTITLE)
//    @FindBy(xpath = "//*[@title='Evening Dresses'][text()='Evening Dresses']")
    public WebElement womanDisplayBlockEveningDressesSubTitle;

    @FindBy(xpath = BasePage_OR.HEADER_SUMMER_DRESSES_SUBTITLE)
//    @FindBy(xpath = "//*[@title='Summer Dresses'][text()='Summer Dresses']")
    public WebElement womanDisplayBlockSummerDressesSubTitle;

    @FindBy(xpath = BasePage_OR.HEADER_DRESSES_BTN)
//    @FindBy(xpath = "//*[@id='block_top_menu']//a[text()='Dresses']")
//    @FindBy(css = "a.sf-with-ul:nth-of-type(2)")
    public WebElement dressesDisplayBlockTab;

    @FindBy(xpath = BasePage_OR.HEADER_DISPLAY_BLOCK_CASUAL_DRESSES_SUBTITLE)
    public WebElement dressesDisplayBlockCasualDressesSubTitle;

    @FindBy(xpath = BasePage_OR.HEADER_DISPLAY_BLOCK_EVENING_DRESSES_SUBTITLE)
    public WebElement dressesDisplayBlockEveningDressesSubTitle;

    @FindBy(xpath = BasePage_OR.HEADER_DISPLAY_BLOCK_SUMMER_DRESSES_SUBTITLE)
    public WebElement dressesDisplayBlockSummerDressesSubTitle;

    @FindBy(xpath = BasePage_OR.HEADER_DRESSES_DISPLAY_BLOCK)
    public WebElement dressesDisplayBlock;

    @FindBy(xpath = BasePage_OR.HEADER_DRESSES_DISPLAY_BLOCK_CASUAL_DRESSES)
    public WebElement dressesDisplayBlockCasualSubtitle;

    @FindBy(xpath = BasePage_OR.HEADER_TSHIRTS_BTN)
    public WebElement tShirtsDisplayBlockTab;

    @FindBy(xpath = BasePage_OR.HEADER_TSHIRTS_DISPLAY_BLOCK)
    public WebElement tShirtsDisplayBlock;

    @FindBy(xpath = BasePage_OR.PAGE_SUCCESS_EMAIL_ADDRESS_ALERT)
    public WebElement newsLetterSuccessAlert;

    @FindBy(xpath = BasePage_OR.PAGE_SUCCESS_EMAIL_ADDRESS_ALERT_MSG)
    public WebElement newsLetterSuccessAlertMsg;

    @FindBy(xpath = BasePage_OR.PAGE_SUCCESS_EMAIL_ADDRESS_ALERT_MSG_OK_ICN)
    public WebElement newsLetterSuccessAlertMsgOKIcn;

    @FindBy(xpath = BasePage_OR.PAGE_INVALID_EMAIL_ADDRESS_ALERT)
    public WebElement newsLetterInvalidAlert;

    @FindBy(xpath = BasePage_OR.PAGE_INVALID_EMAIL_ADDRESS_ALERT_MSG)
    public WebElement newsLetterInvalidAlertMsg;

    @FindBy(xpath = BasePage_OR.PAGE_DANGER_EMAIL_ADDRESS_ALERT_MSG_CROSS_ICN)
    public WebElement newsLetterAlertMsgCrossIcn;

    @FindBy(xpath = BasePage_OR.PAGE_ALREADY_REGISTERED_ADDRESS_ALERT)
    public WebElement newsLetterAlreadyRegisteredAlert;

    @FindBy(xpath = BasePage_OR.PAGE_ALREADY_REGISTERED_ADDRESS_ALERT_MSG)
    public WebElement newsLetterAlreadyRegisteredAlertMsg;

    @FindBy(xpath = BasePage_OR.PAGE_ALREADY_REGISTERED_ADDRESS_CROSS_ICN)
    public WebElement newsLetterAlreadyRegisteredAlertCrossIcn;

    @FindBy(xpath = BasePage_OR.FOOTER_NEWSLETTER_INPUT_FLD)
    public WebElement footerNewsLetterInputFld;

    @FindBy(xpath = BasePage_OR.FOOTER_NEWSLETTER_INPUT_FLD_SUBMIT_BTN)
    public WebElement footerNewsLetterInputFldSubmitBtn;

    @FindBy(xpath = BasePage_OR.FOOTER_NEWSLETTER_INPUT_FLD_SUCCESS_EMAIL_ADDRESS_MSG)
    public WebElement footerNewsLetterInputFldSuccessAlertMsg;

    @FindBy(xpath = BasePage_OR.FOOTER_NEWSLETTER_INPUT_FLD_INVALID_EMAIL_ADDRESS_MSG)
    public WebElement footerNewsLetterInputFldInvalidEmailAlertMsg;

    @FindBy(xpath = BasePage_OR.FOOTER_NEWSLETTER_INPUT_FLD_ALREADY_REGISTERED_ADDRESS_ALERT_MSG)
    public WebElement footerInputFldAlreadyRegisteredAlertMsg;

    @FindBy(xpath = BasePage_OR.FOOTER_NEWSLETTER_INPUT_FLD_ALREADY_REGISTERED_ADDRESS_NEXT_ICN)
    public WebElement footerInputFldAlreadyRegisteredAlertCrossIcn;

    //page footer elements
    @FindBy(css = BasePage_OR.FOOTER_MENU)
    public WebElement pageFooter;

    @FindBy(xpath = BasePage_OR.FOOTER_NEWS_LETTER_BLOCK)
    public WebElement NewsletterBlock;

    @FindBy(css = BasePage_OR.FOOTER_NEWS_LETTER_INPUT_FLD)
    public  WebElement NewsletterInputFld;

    @FindBy(xpath = BasePage_OR.FOOTER_EMAIL_FLD)
    public WebElement enterYourEmailFldValue;

    @FindBy(css = BasePage_OR.FOOTER_NEWS_LETTER_BTN)
    public WebElement submitNewsletterBtn;

    @FindBy(css = BasePage_OR.FOOTER_SOCIAL_BLOCK)
    public WebElement footerSocialBlock;

    @FindBy(xpath = BasePage_OR.FOOTER_FOLLOW_US_BLOCK)
    public WebElement footerFollowUsBlock;

    @FindBy(css = BasePage_OR.FOOTER_FACEBOOK_ICN)
    public WebElement facebookIcn;

    @FindBy(css = BasePage_OR.FOOTER_TWITTER_ICN)
    public WebElement twitterIcn;

    @FindBy(css = BasePage_OR.FOOTER_YOUTUBE_ICN)
    public WebElement youtubeIcn;

    @FindBy(css = BasePage_OR.FOOTER_GOOGLE_PLUS_ICN)
    public WebElement googlePlusIcn;

    @FindBy(xpath = BasePage_OR.FOOTER_CATEGORIES_SECT)
    public WebElement categoriesSection;

    @FindBy(xpath = BasePage_OR.FOOTER_WOMEN_SUBSECTION)
    public WebElement womenSubsection;

    @FindBy(xpath = BasePage_OR.FOOTER_INFORMATION_SECT)
    public WebElement informationSection;

    @FindBy(xpath = BasePage_OR.FOOTER_SPECIALS_SUBSECTION)
    public WebElement specialsSubsection;

    @FindBy(xpath = BasePage_OR.FOOTER_NEW_PRODUCTS_SUBSECTION)
    public WebElement newProductsSubsection;

    @FindBy(xpath = BasePage_OR.FOOTER_BEST_SELLERS_SUBSECTION)
    public WebElement bestSellersSubsection;

    @FindBy(xpath = BasePage_OR.FOOTER_OUR_STORES_SUBSECTION)
    public WebElement ourStoresSubsection;

    @FindBy(xpath = BasePage_OR.FOOTER_CONTACT_US_SUBSECTION)
    public WebElement contactUsSubsection;

    @FindBy(xpath = BasePage_OR.FOOTER_TERMS_OF_USE_SUBSECTION)
    public WebElement termsOfUseSubsection;

    @FindBy(xpath = BasePage_OR.FOOTER_ABOUT_US_SUBSECTION)
    public WebElement aboutUsSubsection;

    @FindBy(xpath = BasePage_OR.FOOTER_SITEMAP_SUBSECTION)
    public WebElement sitemapSubsection;

    @FindBy(xpath = BasePage_OR.FOOTER_MY_ACCOUNT_SECT)
    public WebElement myAccountSection;

    @FindBy(xpath = BasePage_OR.FOOTER_MY_ORDERS_SUBSECTION)
    public WebElement myOrdersSubsection;

    @FindBy(xpath = BasePage_OR.FOOTER_MY_CREDIT_SLIPS_SUBSECTION)
    public WebElement myCreditSlipsSubsection;

    @FindBy(xpath = BasePage_OR.FOOTER_MY_ADDRESS_SUBSECTION)
    public WebElement myAddressSubsection;

    @FindBy(xpath = BasePage_OR.FOOTER_MY_PERSONAL_INFO_SUBSECTION)
    public WebElement myPersonalInfoSubsection;

    @FindBy(xpath = BasePage_OR.FOOTER_SIGN_OUT_SUBSECTION)
    public WebElement signOutSubsection;

    @FindBy(xpath = BasePage_OR.FOOTER_STORE_INFORMATION_SECT)
    public WebElement storeInformationSection;

    @FindBy(css = BasePage_OR.FOOTER_MAP_MARKER_ICN)
    public WebElement mapMarkerIcn;

    @FindBy(css = BasePage_OR.FOOTER_PHONE_ICN)
    public WebElement footerPhoneIcn;

    @FindBy(css = BasePage_OR.FOOTER_ENVELOPE_ICN)
    public WebElement envelopeIcn;

    public BasePageLocators(WebDriver driver) {
        this.driver = driver;
        driver.get("https://automationpractice.com/index.php");
        PageFactory.initElements((ElementLocatorFactory) driver, this);
    }
    public BasePageLocators() {
    }
}
