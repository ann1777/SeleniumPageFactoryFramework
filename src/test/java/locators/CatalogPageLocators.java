package locators;

import objectRepository.CatalogPage_OR;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

public class CatalogPageLocators extends BasePageLocators {
    WebDriver driver;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_HOMEICN)
    public WebElement homeIcn;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_NAVIGATION_PIPE)
    public WebElement navigationPips;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_WOMAN_TAB)
//    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_WOMAN_TAB)
    public WebElement navigationTab;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_DRESSES_TAB)
//    @FindBy(xpath = "//*[@id="columns"]/div[1]/a[3]")
    public WebElement dressesTab;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_EVENING_DRESSES_TAB)
    public WebElement eveningDressesTab;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_TITLE)
    public WebElement pageTitle;

    // left sidebar elements
    @FindBy(css = CatalogPage_OR.CATALOGPAGE_NAVIGATIONMENU_COLUMN)
    public WebElement navigationMenuColumn;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_LAYERSFORM_TITLE)
    public WebElement layersFormTitle;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_LAYERSFORM_MENU_BOX)
    public WebElement layersFormMenuBox;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_CATALOGMENU_SUBTITLE)
    public WebElement sizeCatalogMenuSubtitle;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_SIZE_CHECKBOX)
    public WebElement sizeSCheckbox;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_SIZE_LABEL)
    public WebElement sizeSLabel;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_SIZE_M_CHECKBOX)
    public WebElement sizeMCheckbox;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_SIZE_M_LABEL)
    public WebElement sizeMLabel;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_SIZE_L_CHECKBOX)
    public WebElement sizeLCheckbox;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_SIZE_L_LABEL)
    public WebElement sizeLLabel;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_COLORS_CATALOGMENU_SUBTITLE)
    public WebElement colorCatalogMenuSubtitle;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_COLORS_FORMMENU_BOX)
    public WebElement colorsFormMenuBox;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_COLORS_OPTIONS_CHECKBOXES)
//    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_COLORS_OPTIONS_CHECKBOXES)
    public WebElement colorsOptionsCheckBoxes;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_COLORS_OPTIONS_LABELS)
    public WebElement colorsOptionsLabels;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_COMPOSITIONS_CATALOGMENU_SUBTITLE)
    public WebElement compositionsCatalogMenuSubtitle;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_COMPOSITIONS_OPTIONS_CHECKBOX)
    public WebElement compositionsOptionsCheckBox;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_COMPOSITIONS_OPTIONS_LABELS)
    public WebElement compositionsOptionsLabels;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_STYLES_CATALOGMENU_SUBTITLE)
    public WebElement stylesCatalogMenuSubtitle;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_STYLES_OPTIONS_CHECKBOX)
    public WebElement stylesOptionsCheckBox;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_STYLES_OPTIONS_LABELS)
    public WebElement stylesOptionsLabels;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_PROPERTIES_CATALOGMENU_SUBTITLE)
    public WebElement propertiesCatalogMenuSubtitle;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_PROPERTIES_OPTIONS_CHECKBOX)
    public WebElement propertiesOptionsCheckBox;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_PROPERTIES_OPTIONS_LABEL)
    public WebElement propertiesOptionsLabels;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_AVAILBCATALOG_MENU_SUBTITLE)
    public WebElement availabilityCatalogMenuSubtitle;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_AVAILBOPTIOS_CHECKBOX)
    public WebElement availabilityOptionsCheckBox;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_AVAILBOPTIONS_LABELS)
    public WebElement availabilityOptionsLabels;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_MANUFCATALOG_MENU_SUBTITLE)
    public WebElement manufacturerCatalogMenuSubtitle;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_MANUF_OPTIONS_CHECKBOX)
    public WebElement manufacturerOptionsCheckBox;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_MANUFOPTIONS_LABELS)
    public WebElement manufacturerOptionsLabels;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_CONDITIONS_CATALOG_MENU_SUBTITLE)
    public WebElement conditionCatalogMenuSubtitle;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_CONDITIONS_OPTIONS_CHECKBOX)
    public WebElement conditionOptionsCheckBox;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_CONDITIONS_OPTIONS_LABELS)
    public WebElement conditionOptionsLabels;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_PRICE_CATALOG_MENU_SUBTITLE)
    public WebElement priceCatalogMenuSubtitle;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_PRICE_RANGE_LABELS)
    public WebElement priceRangeLabels;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_PRICE_RANGE)
    public WebElement priceRange;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_PRICE_RANGE_SLIDER)
    public WebElement priceRangeSlider;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_INFORMATION_CATALOG_MENU_SUBTITLE)
    public WebElement informationCatalogMenuSubtitle;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_DELIVERY_INFORMATION_MENU_TITLE)
    public WebElement deliveryInformationMenuTitle;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_LEGALNOTICE_INFORMATION_MENU_TITLE)
    public WebElement legalNoticeInformationMenuTitle;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_TERM_CONDITIONS_INFORMATION_MENU_TITLE) //need first of type
    public WebElement termsAndConditionsInformationMenuTitle;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_ABOUTUS_INFORMATION_MENU_TITLE) //need first of type
    public WebElement aboutUsInformationMenuTitle;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_SECURE_PAYMENT_INFORMATION_MENU_TITLE)
    public WebElement securePaymentInformationMenuTitle;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_OUR_STORES_INFORMATION_MENU_TITLE)
    public WebElement ourStoresInformationMenuTitle;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_SPECIALS_CATALOG_MENU_TITLE)
    public WebElement specialsCatalogMenuSubtitle;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_ITEM_IMG_SPECIALS_CATALOG_MENU)
    public WebElement itemImgSpecialsCatalogMenu;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_ITEM_NAME_SPECIALS_CATALOG_MENU) //need first of type
    public WebElement itemNameSpecialsCatalogMenu;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_ITEM_DESCR_SPECIALS_CATALOG_MENU) //need first of type
    public WebElement itemDescriptionSpecialsCatalogMenu;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_ITEM_PRICEBOX_SPECIALS_CATALOG_MENU)
    public WebElement itemPriceBoxSpecialsCatalogMenu;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_ITEM_PRICE_SPECIALS_CATALOG_MENU)
    public WebElement itemPriceSpecialsCatalogMenu;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_ITEM_OLD_PRICE_SPECIALS_CATALOG_MENU)
    public WebElement itemOldPriceSpecialsCatalogMenu;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_ALL_SPECIALS_CATALOG_MENU)
    public WebElement allSpecialsSpecialsCatalogMenuBtn;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_CATALOG_MENU_OUR_STORES_SUBTITLE)
    public WebElement catalogMenuOurStoresSubtitle;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_CATALOG_MENU_OUR_STORES_IMG)
    public WebElement catalogMenuOurStoresImg;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_CATALOG_MENU_OUR_STORES_LINK)
    public WebElement catalogMenuOurStoresLink;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_CATALOG_MENU_VIEWED_PRODS_SUBTITLE)
    public WebElement catalogMenuViewedProductsSubtitle;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_CATALOG_MENU_VIEWED_PRODS_IMG) //need second of type
    public WebElement catalogMenuViewedProductsImg;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_CATALOG_MENU_VIEWED_PRODS_CONTENT)
    public WebElement catalogMenuViewedProductsContent;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_CATALOG_MENU_VIEWED_PRODS_NAME)
    public WebElement catalogMenuViewedProductsName;

    //  main page column
    @FindBy(css = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN)
    public WebElement pageContentColumn;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_CATEGORY_IMG)
    public WebElement categoryImg;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_CATEGORY_NAME)
    public WebElement categoryName;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_PRODUCTSCOUNTER)
    public WebElement productsCounter;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_FILTER_LABEL)
    public WebElement filterLabel;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_PRODUCTSELECTOR_FLD)
    public WebElement productsSelectorFld;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_DISPLAYVIEWED_TITLE)
    public WebElement displayViewTitle;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_GRID_ICON)
    public WebElement gridIcon;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_GRID_TITLE)
    public WebElement gridTitle;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_LIST_ICON)
    public WebElement listIcon;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_LIST_TITLE)
    public WebElement listTitle;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_PRODUCT_COUNTER) //need first of type
    public WebElement productCounterUp;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_COMPARE_BTN) //need first of type
    public WebElement compareBtnUp;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_COMPARE_BTNVALUE) //need first of type
    public WebElement compareBtnVal;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_RIGHT_ARROW_VAL) //need 5-th of type
    public WebElement rightArrowVal;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_ITEM_PHOTO) //need second of type
    public WebElement itemPhoto;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_PREVIEW_PHOTO)
    public WebElement itemPreviewIcon;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_ITEMPIC)
    public WebElement itemBigPic;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_ITEM_VIEWBLOCK)
    public WebElement itemViewBlock;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_ITEM_VIEWBLOCK_PICLIST)
    public WebElement itemViewBlockPicList;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_ITEM_VIEWBLOCK_PIC1)
    public WebElement itemViewBlockPic1;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_ITEM_VIEWBLOCK_PIC2)
    public WebElement itemViewBlockPic2;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_ITEM_VIEWBLOCK_CLOSE_BTN)
    public WebElement itemViewBlockCloseBtn;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_PRODUCTNAME_TITLE)
//    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_PRODUCTNAME_TITLE)
    public WebElement productNameTitle;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_ITEM_PRICE) // need last of type
    public WebElement itemPrice;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_ADDTOCART)
    public WebElement addToCartBtn;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_MORE_BTN)
    public WebElement moreBtn;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_COLORLIST_CONTAINER)
    public WebElement colorListContainer;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_COLORITEM_VARIABLE)
    public WebElement colorItemVariable;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_COLORITEM1_VARIABLE)
    public WebElement colorItem1Variable;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_INSTOCK_BTN)
    public WebElement inStockBtn;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_ADDTOWISGLIST_LINK)
    public WebElement addToWishListLink;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_ADDTOCOMPARE_LINK)
    public WebElement addToCompareLink;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_PRODUCT_COUNTER_BOTTOM) //need last of type
    public WebElement productCounterBottom;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_COMPARE_BTN_BOTTOM) //need last of type
    public WebElement compareBtnBottom;

    public CatalogPageLocators(WebDriver driver) {
        super(driver);
        this.driver = driver;
        driver.get("http://automationpractice.com/index.php?id_category=5&controller=category");
        PageFactory.initElements((ElementLocatorFactory) driver, this);
    }
    public CatalogPageLocators() {
    }

}
