package page;

import objectRepository.HomePage_OR;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{
    public WebDriver driver;

    @FindBy(id = HomePage_OR.HOMEPAGE_SLIDER_ROW )
    WebElement homepageSliderRow;

    @FindBy(css = HomePage_OR.HOMEPAGE_SLIDER)
    WebElement homepageSlider;

    @FindBy(css = HomePage_OR.HOMEPAGE_SLIDER_LEFT_ARROW)
    WebElement homepageSliderLeftArrow;

    @FindBy(css = HomePage_OR.HOMEPAGE_SLIDER_RIGHT_ARROW)
    WebElement homepageSliderRightArrow;

    @FindBy(css = HomePage_OR.HOMEPAGE_HTML_CONTENT)
    WebElement homepageHTMLContent;

    @FindBy(css = HomePage_OR.HOMEPAGE_POPULAR_BTN)
    WebElement homepagePopularBtn;

    @FindBy(css = HomePage_OR.HOMEPAGE_BESTSELLERS_BTN)
    WebElement homepageBestsellersBtn;

    @FindBy(xpath = HomePage_OR.HOMEPAGE_PRODUCTS_CONTAINER)
    WebElement productsContainer;

    @FindBy(xpath = HomePage_OR.HOMEPAGE_PRODUCT1_CONTAINER)
    WebElement product1Container;

    @FindBy(xpath = HomePage_OR.HOMEPAGE_ITEM_PHOTO)
    WebElement itemPhoto;

    @FindBy(css = HomePage_OR.HOMEPAGE_ITEM_PREVIEW_ICON)
    WebElement itemPreviewIcon;

    @FindBy(xpath = HomePage_OR.HOMEPAGE_ITEM_NAME)
    WebElement itemName;

    @FindBy(xpath = HomePage_OR.HOMEPAGE_ITEM_PRICE)
    WebElement itemPrice;

    @FindBy(xpath = HomePage_OR.HOMEPAGE_ADDTOCART_BTN)
    WebElement addToCartBtn;

    @FindBy(xpath = HomePage_OR.HOMEPAGE_MORE_BTN)
    WebElement moreBtn;

    @FindBy(css = HomePage_OR.HOMEPAGE_FOLLOWUS_ONFACCEBOOK_BLOCK)
    WebElement followUsOnFacebookBlock;

    @FindBy(css = HomePage_OR.HOMEPAGE_INFO_BLOCK)
    WebElement infoBlock;

    @FindBy(xpath = HomePage_OR.HOMEPAGE_CUSTOM_BLOCK)
    WebElement customBlock;

    @FindBy(xpath = HomePage_OR.HOMEPAGE_SITE_TITLE)
    WebElement siteTitle;

    public HomePage(WebDriver driver) {
        super();
        PageFactory.initElements(driver, this);
        this.driver = driver;
        driver.get("https://automationpractice.com/index.php");
    }
}
