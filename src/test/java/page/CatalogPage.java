package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CatalogPage extends BasePage{
    WebDriver driver;

    @FindBy(css = ".icon-home")
    WebElement homeIcn;

    @FindBy(css = ".navigation-pipe")
//    @FindBy(css = ".navigation-pipe:nth-of-type(1)") //to find firs pipe
    WebElement navigationPips;

    @FindBy(css = "#columns>div.breadcrumb.clearfix>a:nth-child(3)")
//    @FindBy(xpath = "//*[@id="columns"]/div[1]/a[2]")
    WebElement womenTab;

    @FindBy(css = "#columns>div.breadcrumb.clearfix>a:nth-child(5)")
//    @FindBy(xpath = "//*[@id="columns"]/div[1]/a[3]")
    WebElement dressesTab;

    @FindBy(xpath = "//*[@id=\"columns\"]/div[1]/text()[last()]")
    WebElement eveningDressesTab;

    // left sidebar elements
    @FindBy(css = "#left_column")
    WebElement navigationMenuColumn;

    @FindBy(xpath = "//*[text()='Catalog']")
    WebElement layersFormTitle;

    @FindBy(css = "#layered_form")
    WebElement layersFormMenuBox;

    @FindBy(xpath = "//*[text()='Size']")
    WebElement sizeCatalogMenuSubtitle;

    @FindBy(xpath = "//*[@id=\"uniform-layered_id_attribute_group_1\"]")
    WebElement sizeSCheckbox;

    @FindBy(xpath = "//*[text()='S']")
    WebElement sizeSLabel;

    @FindBy(xpath = "//*[@id=\"uniform-layered_id_attribute_group_2\"]")
    WebElement sizeMCheckbox;

    @FindBy(xpath = "//*[text()='M']")
    WebElement sizeMLabel;

    @FindBy(xpath = "//*[@id=\"uniform-layered_id_attribute_group_3\"]")
    WebElement sizeLCheckbox;

    @FindBy(xpath = "//*[text()='L']")
    WebElement sizeLLabel;

    @FindBy(xpath = "//*[text()='Color']")
    WebElement colorCatalogMenuSubtitle;

    @FindBy(css = "#ul_layered_id_attribute_group_3")

    WebElement colorsFormMenuBox;
    @FindBy(css = ".color-option")
//    @FindBy(xpath = "//*[text()='Color']/../../ul/li/input[@class=\"color-option  \"]")
    WebElement colorsOptionsCheckBoxes;

    @FindBy(xpath = "//*[text()='Color']/../../ul/li/label/a/text()")
    WebElement colorsOptionsLabels;

    @FindBy(xpath = "//*[text()='Compositions']")
    WebElement compositionsCatalogMenuSubtitle;

    @FindBy(css = "#uniform-layered_id_feature_3")
    WebElement compositionsOptionsCheckBox;

    @FindBy(xpath = "//*[@id=\"ul_layered_id_feature_5\"]/li/label/a/text()")
    WebElement compositionsOptionsLabels;

    @FindBy(xpath = "//*[text()='Styles']")
    WebElement stylesCatalogMenuSubtitle;

    @FindBy(xpath = "//*[text()='Styles']/../../ul/li/div[@class=\"checker\"]")
    WebElement stylesOptionsCheckBox;

    @FindBy(xpath = "//*[text()='Styles']/../../ul/li/label")
    WebElement stylesOptionsLabels;

    @FindBy(xpath = "//*[text()='Properties']")
    WebElement propertiesCatalogMenuSubtitle;

    @FindBy(xpath = "//*[text()='Properties']/../../ul/li/div[@class=\"checker\"]")
    WebElement propertiesOptionsCheckBox;

    @FindBy(xpath = "//*[text()='Properties']/../../ul/li/label")
    WebElement propertiesOptionsLabels;

    @FindBy(xpath = "//*[text()='Availability']")
    WebElement availabilityCatalogMenuSubtitle;

    @FindBy(xpath = "//*[text()='Availability']/../../ul/li/div[@class=\"checker\"]")
    WebElement availabilityOptionsCheckBox;

    @FindBy(xpath = "//*[text()='Availability']/../../ul/li/label")
    WebElement availabilityOptionsLabels;

    @FindBy(xpath = "//*[text()='Manufacturer']")
    WebElement manufacturerCatalogMenuSubtitle;

    @FindBy(xpath = "//*[text()='Manufacturer']/../../ul/li/div[@class=\"checker\"]")
    WebElement manufacturerOptionsCheckBox;

    @FindBy(xpath = "//*[text()='Manufacturer']/../../ul/li/label")
    WebElement manufacturerOptionsLabels;

    @FindBy(xpath = "//*[text()='Condition']")
    WebElement conditionCatalogMenuSubtitle;

    @FindBy(xpath = "//*[text()='Condition']/../../ul/li/div[@class=\"checker\"]")
    WebElement conditionOptionsCheckBox;

    @FindBy(xpath = "//*[text()='Condition']/../../ul/li/label")
    WebElement conditionOptionsLabels;

    @FindBy(xpath = "//*[text()='Price']")
    WebElement priceCatalogMenuSubtitle;

    @FindBy(xpath = "//*[text()='Price']/../../ul/label")
    WebElement priceRangeLabels;

    @FindBy(css = "#layered_price_range")
    WebElement priceRange;

    @FindBy(css = ".layered_slider_container")
    WebElement priceRangeSlider;

    @FindBy(xpath = "//*[@class='block informations_block_left']")
    WebElement informationCatalogMenuSubtitle;

    @FindBy(xpath = "//*[@title='Delivery']")
    WebElement deliveryInformationMenuTitle;

    @FindBy(xpath = "//*[@title='Legal Notice']")
    WebElement legalNoticeInformationMenuTitle;

    @FindBy(xpath = "//*[@title='Terms and conditions of use']") //need first of type
    WebElement termsAndConditionsInformationMenuTitle;

    @FindBy(xpath = "//*[@title='About us']") //need first of type
    WebElement aboutUsInformationMenuTitle;

    @FindBy(xpath = "//*[@title='Secure payment']")
    WebElement securePaymentInformationMenuTitle;

    @FindBy(xpath = "//*[@id=\"informations_block_left_1\"]/div/ul/li[6]/a")
    WebElement ourStoresInformationMenuTitle;

    @FindBy(xpath = "//*[@title='Specials']")
    WebElement specialsCatalogMenuSubtitle;

    @FindBy(xpath = "//*[@id=\"special_block_right\"]//img")
    WebElement itemImgSpecialsCatalogMenu;

    @FindBy(css = "div.product-content>h5>a.product-name") //need first of type
    WebElement itemNameSpecialsCatalogMenu;

    @FindBy(css = "div.product-content>p.product-description") //need first of type
    WebElement itemDescriptionSpecialsCatalogMenu;

    @FindBy(css = "div.product-content>div.price-box")
    WebElement itemPriceBoxSpecialsCatalogMenu;

    @FindBy(css = "div.product-content>div.price-box>span.price")
    WebElement itemPriceSpecialsCatalogMenu;

    @FindBy(css = "div.product-content>div.price-box>span.old-price")
    WebElement itemOldPriceSpecialsCatalogMenu;

    @FindBy(xpath = "//*[@title='All specials']")
    WebElement allSpecialsSpecialsCatalogMenuBtn;

    @FindBy(xpath = "//*[@class='title_block']/a[@title='Our stores']")
    WebElement catalogMenuOurStoresSubtitle;

    @FindBy(css = "#stores_block_left>div>p>a>img.img-responsive")
    WebElement catalogMenuOurStoresImg;

    @FindBy(xpath = "//*[text()='Discover our stores']")
    WebElement catalogMenuOurStoresLink;

    @FindBy(xpath = "//*[text()='Viewed products']")
    WebElement catalogMenuViewedProductsSubtitle;

    @FindBy(css = "a.products-block-image") //need second of type
    WebElement catalogMenuViewedProductsImg;

    @FindBy(xpath = "//*[@class=\"clearfix last_item\"]/div[@class=\"product-content\"]")
    WebElement catalogMenuViewedProductsContent;

    @FindBy(xpath = "//*[@class=\"clearfix last_item\"]//p[@class=\"product-description\"]")
    WebElement catalogMenuViewedProductsName;


    //  main page column
    @FindBy(css = "#center_column.center_column")
    WebElement pageContentColumn;

    @FindBy(css = ".content_scene_cat")
    WebElement categoryImg;

    @FindBy(css = ".cat-name")
    WebElement categoryName;

    @FindBy(css = ".heading-counter")
    WebElement productsCounter;

    @FindBy(xpath = "//*[@class=\"select selector1\"]/label")
    WebElement filterLabel;

    @FindBy(css = "#uniform-selectProductSort")
    WebElement productsSelectorFld;

    @FindBy(xpath = "//*[text()='View']")
    WebElement displayViewTitle;

    @FindBy(css = "#grid")
    WebElement gridIcon;

    @FindBy(xpath = "//*[text() = 'Grid']")
    WebElement gridTitle;

    @FindBy(css = ".icon-th-list")
    WebElement listIcon;

    @FindBy(xpath = "//*[text() = 'List']")
    WebElement listTitle;

    @FindBy(xpath = "//*[@class=\"product-count\"]") //need first of type
    WebElement productCounterUp;

    @FindBy(css = ".bt_compare") //need first of type
    WebElement compareBtnUp;

    @FindBy(css = ".total-compare-val") //need first of type
    WebElement compareBtnVal;

    @FindBy(css = ".icon-chevron-right") //need 5-th of type
    WebElement rightArrowVal;

    @FindBy(css = "img.replace-2x.img-responsive") //need second of type
    WebElement itemPhoto;

    @FindBy(css = ".icon-eye-open")
    WebElement itemPreviewIcon;

    @FindBy(xpath = "//*[@id=\"bigpic\"]")
    WebElement itemBigPic;

    @FindBy(xpath = "//*[@id=\"views_block\"]")
    WebElement itemViewBlock;

    @FindBy(xpath = "//*[@id=\"thumbs_list\"]")
    WebElement itemViewBlockPicList;

    @FindBy(css = "a.fancybox.shown")
    WebElement itemViewBlockPic1;

    @FindBy(css = "a.fancybox.shown")
    WebElement itemViewBlockPic2;

    @FindBy(css = "a.fancybox-item.fancybox-close")
    WebElement itemViewBlockCloseBtn;

    @FindBy(css = ".right-block>h5>a.product-name")
//    @FindBy(xpath = "//*[@class = \"right-block\"]//a[@class=\"product-name\"]")
    WebElement productNameTitle;

    @FindBy(css = ".price.product-price") // need last of type
    WebElement itemPrice;

    @FindBy(xpath = "//*[text() = 'Add to cart']")
    WebElement addToCartBtn;

    @FindBy(xpath = "//*[text() = 'More']")
    WebElement moreBtn;

    @FindBy(css = ".color-list-container")
    WebElement colorListContainer;

    @FindBy(css = ".color_pick") //need choose one from list
    WebElement colorItemVariable;

    @FindBy(css = ".available-now")
    WebElement inStockBtn;

    @FindBy(css = ".addToWishlist")
    WebElement addToWishListLink;

    @FindBy(css = ".compare")
    WebElement addToCompareLink;

    @FindBy(xpath = "//*[@class=\"product-count\"]") //need last of type
    WebElement productCounterBottom;

    @FindBy(css = ".bt_compare") //need last of type
    WebElement compareBtnBottom;

    //*[@class = "cart-info"]/div[@class="product-name"]
    public CatalogPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        driver.get("http://automationpractice.com/index.php?id_category=10&controller=category");
        PageFactory.initElements(driver, this);
    }
}
