package locators;

import objectRepository.HomePage_OR;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

public class HomePageLocators extends BasePageLocators {
    public WebDriver driver;

    @FindBy(id = HomePage_OR.HOMEPAGE_SLIDER_ROW )
    public WebElement SliderRow;

    @FindBy(css = HomePage_OR.HOMEPAGE_SLIDER)
    public WebElement Slider;

    @FindBy(css = HomePage_OR.HOMEPAGE_SLIDER_LEFT_ARROW)
    public WebElement SliderLeftArrow;

    @FindBy(css = HomePage_OR.HOMEPAGE_SLIDER_RIGHT_ARROW)
    public WebElement SliderRightArrow;

    @FindBy(css = HomePage_OR.HOMEPAGE_HTML_CONTENT)
    public WebElement HTMLContent;

    @FindBy(css = HomePage_OR.HOMEPAGE_POPULAR_BTN)
    public WebElement PopularBtn;

    @FindBy(css = HomePage_OR.HOMEPAGE_BESTSELLERS_BTN)
    public WebElement BestsellersBtn;

    @FindBy(xpath = HomePage_OR.HOMEPAGE_PRODUCTS_CONTAINER)
    public WebElement productsContainer;

    @FindBy(xpath = HomePage_OR.HOMEPAGE_PRODUCT1_CONTAINER)
    public WebElement product1Container;

    @FindBy(xpath = HomePage_OR.HOMEPAGE_ITEM_PHOTO)
    public WebElement itemPhoto;

    @FindBy(css = HomePage_OR.HOMEPAGE_ITEM_PREVIEW_ICON)
    public WebElement itemPreviewIcon;

    @FindBy(xpath = HomePage_OR.HOMEPAGE_ITEM_NAME)
    public WebElement itemName;

    @FindBy(xpath = HomePage_OR.HOMEPAGE_ITEM_PRICE)
    public WebElement itemPrice;

    @FindBy(xpath = HomePage_OR.HOMEPAGE_ADDTOCART_BTN)
    public WebElement addToCartBtn;

    @FindBy(xpath = HomePage_OR.HOMEPAGE_MORE_BTN)
    public WebElement moreBtn;

    @FindBy(css = HomePage_OR.HOMEPAGE_FOLLOWUS_ONFACCEBOOK_BLOCK)
    public WebElement followUsOnFacebookBlock;

    @FindBy(css = HomePage_OR.HOMEPAGE_INFO_BLOCK)
    public WebElement infoBlock;

    @FindBy(xpath = HomePage_OR.HOMEPAGE_CUSTOM_BLOCK)
    public WebElement customBlock;

    @FindBy(xpath = HomePage_OR.HOMEPAGE_SITE_TITLE)
    public WebElement siteTitle;

    public HomePageLocators(WebDriver driver) {
        super();
        PageFactory.initElements((ElementLocatorFactory) driver, this);
        this.driver = driver;
        driver.get("https://automationpractice.com/index.php");
    }
}
