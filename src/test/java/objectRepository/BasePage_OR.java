package objectRepository;

public class BasePage_OR {

    //page header elements
    public static final String HEADER_MENU = "#header";
    public static final String HEADER_ADV = ".row>a>img";
    public static final String SHOP_PHONE = "//*[@class='shop-phone']";
    public static final String HEADER_PHONE_ICN = "span>.icon-phone";
    public static final String CONTACT_AS_BTN = "contact-link";
    public static final String SIGN_IN_BTN = ".login";
    public static final String HEADER_LOGO = "//div[@id='header_logo']";
    //*[@id="block_top_menu"]/ul

    public static final String HEADER_USERNAME_INFO = "//a[@class='account']";
    public static final String HEADER_BLOCK_TOP_MENU = "//div[@id='block_top_menu']";
    public static final String SEARCH_FLD = "//*[@placeholder='Search']";
    public static final String SEARCH_BTN = "//button [@name='submit_search']";
    public static final String SHOPPING_CART_ICN = "a[title='View my shopping cart']";
    public static final String WOMEN_BTN = "//li/a[@title='Women']";
    public static final String WOMEN_DISPLAY_BLOCK = "//*[@id='block_top_menu']/ul//a[text() = 'Women']";
    public static final String HEADER_DISPLAY_BLOCK_CONTAINER = ".submenu-container clearfix first-in-line-xs";
    public static final String HEADER_BLOCK_TOPS_TITLE = "//*[@class='sfHoverForce']//*[text()='Tops']";
    public static final String HEADER_TSHIRTS_SUBTITLE = "//*[@class='sfHoverForce']//*[text()='T-shirts']";
    public static final String HEADER_BLOUSES_SUBTITLE = "//*[@class='sfHoverForce']//*[text()='Blouses']";
    public static final String HEADER_DRESSES_TITLE = "//*[@class='sfHoverForce']//*[text()='Dresses']";
    public static final String HEADER_CASUAL_DRESSES_SUBTITLE = "//*[@class='sfHoverForce']//*[text()='Casual Dresses']";
    public static final String HEADER_EVENING_DRESSES_SUBTITLE = "//*[@class='sfHoverForce']//*[text()='Evening Dresses']";
    public static final String HEADER_SUMMER_DRESSES_SUBTITLE = "//*[@class='sfHoverForce']//*[text()='Summer Dresses']";
    public static final String HEADER_DRESSES_BTN = "//*[@class='sf-with-ul'][text()='Dresses']";
    public static final String HEADER_TSHIRTS_BTN = "//*[@title='T-shirts'][text()='T-shirts']";
    public static final String HEADER_DISPLAY_BLOCK_CASUAL_DRESSES_SUBTITLE = "//*[@title='Casual Dresses']";
    public static final String HEADER_DISPLAY_BLOCK_EVENING_DRESSES_SUBTITLE = "//*[@title='Casual Dresses']";
    public static final String HEADER_DISPLAY_BLOCK_SUMMER_DRESSES_SUBTITLE = "//*[@title='Summer Dresses']";
    public static final String HEADER_DRESSES_DISPLAY_BLOCK = "//*[@id='block_top_menu']/ul/li/a[text() = 'Dresses']";
    public static final String HEADER_DRESSES_DISPLAY_BLOCK_CASUAL_DRESSES = "//*[@id='block_top_menu']/ul/li/a[text() = 'Dresses']/../ul/li/a";
    public static final String HEADER_TSHIRTS_DISPLAY_BLOCK = "//*[@id='block_top_menu']/ul/li/a[text() = 'T-shirts']";

    //page footer elements
    public static final String FOOTER_MENU = ".footer-container";
    public static final String FOOTER_NEWS_LETTER_BLOCK = "//*[text() = 'Newsletter']";
    public static final String FOOTER_NEWS_LETTER_INPUT_FLD = "//*[@id = 'newsletter-input']";
    public static final String FOOTER_EMAIL_FLD = "//*[@value='Enter your e-mail']";
    public static final String FOOTER_NEWS_LETTER_BTN = "#newsletter_block_left>div>form>div>button";
    public static final String FOOTER_SOCIAL_BLOCK = "#social_block";
    public static final String FOOTER_FOLLOW_US_BLOCK = "//*[text() = 'Follow us']";
    public static final String FOOTER_FACEBOOK_ICN = "li.facebook";
    public static final String FOOTER_TWITTER_ICN = "li.twitter";
    public static final String FOOTER_YOUTUBE_ICN = "li.youtube";
    public static final String FOOTER_GOOGLE_PLUS_ICN = "li.google-plus";
    public static final String FOOTER_CATEGORIES_SECT = "//h4[text()='Categories']";
    public static final String FOOTER_WOMEN_SUBSECTION = "//div[@class='footer-container']//a[contains(text(),'Women')]";
    public static final String FOOTER_INFORMATION_SECT = "//h4[text()='Information']";
    public static final String FOOTER_SPECIALS_SUBSECTION = "//div[@class='footer-container']//a[@title='Specials']";
    public static final String FOOTER_NEW_PRODUCTS_SUBSECTION = "//div[@class='footer-container']//a[@title='New products']";
    public static final String FOOTER_BEST_SELLERS_SUBSECTION = "//div[@class='footer-container']//a[@title='Best sellers']";
    public static final String FOOTER_OUR_STORES_SUBSECTION = "//div[@class='footer-container']//a[@title='Our stores']";
    public static final String FOOTER_CONTACT_US_SUBSECTION = "//div[@class='footer-container']//a[@title='Contact us']";
    public static final String FOOTER_TERMS_OF_USE_SUBSECTION = "//div[@class='footer-container']//a[contains(text(),'of use')]";
    public static final String FOOTER_ABOUT_US_SUBSECTION = "//div[@class='footer-container']//a[@title='About us']";
    public static final String FOOTER_SITEMAP_SUBSECTION = "//div[@class='footer-container']//a[@title='Sitemap']";
    public static final String FOOTER_MY_ACCOUNT_SECT = "//h4/a[text()='My account']";
    public static final String FOOTER_MY_ORDERS_SUBSECTION = "//div[@class='footer-container']//a[@title='My orders']";
    public static final String FOOTER_MY_CREDIT_SLIPS_SUBSECTION = "//div[@class='footer-container']//a[@title='My credit slips']";
    public static final String FOOTER_MY_ADDRESS_SUBSECTION = "//div[@class='footer-container']//a[@title='My addresses']";
    public static final String FOOTER_MY_PERSONAL_INFO_SUBSECTION = "//div[@class='footer-container']//a[text()='My personal info']";
    public static final String FOOTER_SIGN_OUT_SUBSECTION = "//div[@class='footer-container']//a[@title='Sign out']";
    public static final String FOOTER_STORE_INFORMATION_SECT = "//h4[text()='Store information']";
    public static final String FOOTER_MAP_MARKER_ICN = ".icon-map-marker";
    public static final String FOOTER_PHONE_ICN = "li>.icon-phone";
    public static final String FOOTER_ENVELOPE_ICN = ".icon-envelope-alt";
    public static final String PAGE_SUCCESS_EMAIL_ADDRESS_ALERT = "//p[@class='alert alert-success']";
    public static final String PAGE_SUCCESS_EMAIL_ADDRESS_ALERT_MSG = "//p[contains(text(),' You have successfully subscribed')]";
    public static final String PAGE_SUCCESS_EMAIL_ADDRESS_ALERT_MSG_OK_ICN = "p.alert.alert-success::before";
    public static final String PAGE_INVALID_EMAIL_ADDRESS_ALERT = "//p[@class='alert alert-danger']";
    public static final String PAGE_INVALID_EMAIL_ADDRESS_ALERT_MSG = "//p[contains(text(),' Invalid email address.')]";
    //    public static final String PAGE_INVALID_EMAIL_ADDRESS_ALERT_MSG = "//p[text()=' Newsletter : Invalid email address.']";
    public static final String PAGE_ALREADY_REGISTERED_ADDRESS_ALERT = "p.alert.alert-danger";
    public static final String PAGE_ALREADY_REGISTERED_ADDRESS_ALERT_MSG = "//p[contains(text(),' is already registered.')]";
    public static final String PAGE_ALREADY_REGISTERED_ADDRESS_CROSS_ICN = "p.alert.alert-danger::before";
    public static final String FOOTER_NEWSLETTER_INPUT_FLD= "//*/input[@id='newsletter-input']";
    //    public static final String FOOTER_NEWSLETTER_INPUT_FLD = "//*/input[@value='Enter your e-mail']";
    public static final String FOOTER_NEWSLETTER_INPUT_FLD_SUBMIT_BTN = "//*[@id='newsletter-input']/../button[@type='submit']";
    //    public static final String FOOTER_NEWSLETTER_INPUT_FLD_SUBMIT_BTN = "//button[@name='submitNewsletter']";
    public static final String PAGE_DANGER_EMAIL_ADDRESS_ALERT_MSG_CROSS_ICN = "p.alert.alert-danger::before";
    public static final String FOOTER_NEWSLETTER_INPUT_FLD_SUCCESS_EMAIL_ADDRESS_MSG = "//*[@id='newsletter-input'][@value='You have successfully subscribed to this newsletter.']";
    public static final String FOOTER_NEWSLETTER_INPUT_FLD_INVALID_EMAIL_ADDRESS_MSG = "//*[@id='newsletter-input'][@value='Invalid email address.']";
    public static final String FOOTER_NEWSLETTER_INPUT_FLD_ALREADY_REGISTERED_ADDRESS_ALERT_MSG = "//*[@id='newsletter-input'][@value='Invalid email address.']";
    public static final String FOOTER_NEWSLETTER_INPUT_FLD_ALREADY_REGISTERED_ADDRESS_NEXT_ICN = "//*/button[@name='submitNewsletter']";
    public static final String ITEM_NAME = "//h5/a";
}
