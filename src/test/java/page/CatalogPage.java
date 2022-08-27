package page;

import objectRepository.CatalogPage_OR;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CatalogPage extends BasePage{
    WebDriver driver;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_HOMEICN)
    WebElement homeIcn;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_NAVIGATION_PIPE)
    WebElement navigationPips;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_WOMAN_TAB)
//    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_WOMAN_TAB)
    WebElement womenTab;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_DRESSES_TAB)
//    @FindBy(xpath = "//*[@id="columns"]/div[1]/a[3]")
    WebElement dressesTab;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_EVENING_DRESSES_TAB)
    WebElement eveningDressesTab;

    // left sidebar elements
    @FindBy(css = CatalogPage_OR.CATALOGPAGE_NAVIGATIONMENU_COLUMN)
    WebElement navigationMenuColumn;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_LAYERSFORM_TITLE)
    WebElement layersFormTitle;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_LAYERSFORM_MENU_BOX)
    WebElement layersFormMenuBox;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_CATALOGMENU_SUBTITLE)
    WebElement sizeCatalogMenuSubtitle;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_SIZE_CHECKBOX)
    WebElement sizeSCheckbox;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_SIZE_LABEL)
    WebElement sizeSLabel;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_SIZE_M_CHECKBOX)
    WebElement sizeMCheckbox;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_SIZE_M_LABEL)
    WebElement sizeMLabel;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_SIZE_L_CHECKBOX)
    WebElement sizeLCheckbox;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_SIZE_L_LABEL)
    WebElement sizeLLabel;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_COLORS_CATALOGMENU_SUBTITLE)
    WebElement colorCatalogMenuSubtitle;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_COLORS_FORMMENU_BOX)
    WebElement colorsFormMenuBox;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_COLORS_OPTIONS_CHECKBOXES)
//    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_COLORS_OPTIONS_CHECKBOXES)
    WebElement colorsOptionsCheckBoxes;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_COLORS_OPTIONS_LABELS)
    WebElement colorsOptionsLabels;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_COMPOSITIONS_CATALOGMENU_SUBTITLE)
    WebElement compositionsCatalogMenuSubtitle;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_COMPOSITIONS_OPTIONS_CHECKBOX)
    WebElement compositionsOptionsCheckBox;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_COMPOSITIONS_OPTIONS_LABELS)
    WebElement compositionsOptionsLabels;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_STYLES_CATALOGMENU_SUBTITLE)
    WebElement stylesCatalogMenuSubtitle;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_STYLES_OPTIONS_CHECKBOX)
    WebElement stylesOptionsCheckBox;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_STYLES_OPTIONS_LABELS)
    WebElement stylesOptionsLabels;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_PROPERTIES_CATALOGMENU_SUBTITLE)
    WebElement propertiesCatalogMenuSubtitle;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_PROPERTIES_OPTIONS_CHECKBOX)
    WebElement propertiesOptionsCheckBox;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_PROPERTIES_OPTIONS_LABEL)
    WebElement propertiesOptionsLabels;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_AVAILBCATALOG_MENU_SUBTITLE)
    WebElement availabilityCatalogMenuSubtitle;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_AVAILBOPTIOS_CHECKBOX)
    WebElement availabilityOptionsCheckBox;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_AVAILBOPTIONS_LABELS)
    WebElement availabilityOptionsLabels;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_MANUFCATALOG_MENU_SUBTITLE)
    WebElement manufacturerCatalogMenuSubtitle;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_MANUF_OPTIONS_CHECKBOX)
    WebElement manufacturerOptionsCheckBox;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_MANUFOPTIONS_LABELS)
    WebElement manufacturerOptionsLabels;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_CONDITIONS_CATALOG_MENU_SUBTITLE)
    WebElement conditionCatalogMenuSubtitle;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_CONDITIONS_OPTIONS_CHECKBOX)
    WebElement conditionOptionsCheckBox;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_CONDITIONS_OPTIONS_LABELS)
    WebElement conditionOptionsLabels;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_PRICE_CATALOG_MENU_SUBTITLE)
    WebElement priceCatalogMenuSubtitle;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_PRICE_RANGE_LABELS)
    WebElement priceRangeLabels;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_PRICE_RANGE)
    WebElement priceRange;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_PRICE_RANGE_SLIDER)
    WebElement priceRangeSlider;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_INFORMATION_CATALOG_MENU_SUBTITLE)
    WebElement informationCatalogMenuSubtitle;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_DELIVERY_INFORMATION_MENU_TITLE)
    WebElement deliveryInformationMenuTitle;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_LEGALNOTICE_INFORMATION_MENU_TITLE)
    WebElement legalNoticeInformationMenuTitle;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_TERM_CONDITIONS_INFORMATION_MENU_TITLE) //need first of type
    WebElement termsAndConditionsInformationMenuTitle;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_ABOUTUS_INFORMATION_MENU_TITLE) //need first of type
    WebElement aboutUsInformationMenuTitle;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_SECURE_PAYMENT_INFORMATION_MENU_TITLE)
    WebElement securePaymentInformationMenuTitle;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_OUR_STORES_INFORMATION_MENU_TITLE)
    WebElement ourStoresInformationMenuTitle;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_SPECIALS_CATALOG_MENU_TITLE)
    WebElement specialsCatalogMenuSubtitle;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_ITEM_IMG_SPECIALS_CATALOG_MENU)
    WebElement itemImgSpecialsCatalogMenu;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_ITEM_NAME_SPECIALS_CATALOG_MENU) //need first of type
    WebElement itemNameSpecialsCatalogMenu;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_ITEM_DESCR_SPECIALS_CATALOG_MENU) //need first of type
    WebElement itemDescriptionSpecialsCatalogMenu;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_ITEM_PRICEBOX_SPECIALS_CATALOG_MENU)
    WebElement itemPriceBoxSpecialsCatalogMenu;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_ITEM_PRICE_SPECIALS_CATALOG_MENU)
    WebElement itemPriceSpecialsCatalogMenu;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_ITEM_OLD_PRICE_SPECIALS_CATALOG_MENU)
    WebElement itemOldPriceSpecialsCatalogMenu;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_ALL_SPECIALS_CATALOG_MENU)
    WebElement allSpecialsSpecialsCatalogMenuBtn;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_CATALOG_MENU_OUR_STORES_SUBTITLE)
    WebElement catalogMenuOurStoresSubtitle;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_CATALOG_MENU_OUR_STORES_IMG)
    WebElement catalogMenuOurStoresImg;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_CATALOG_MENU_OUR_STORES_LINK)
    WebElement catalogMenuOurStoresLink;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_CATALOG_MENU_VIEWED_PRODS_SUBTITLE)
    WebElement catalogMenuViewedProductsSubtitle;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_CATALOG_MENU_VIEWED_PRODS_IMG) //need second of type
    WebElement catalogMenuViewedProductsImg;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_CATALOG_MENU_VIEWED_PRODS_CONTENT)
    WebElement catalogMenuViewedProductsContent;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_CATALOG_MENU_VIEWED_PRODS_NAME)
    WebElement catalogMenuViewedProductsName;

    //  main page column
    @FindBy(css = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN)
    WebElement pageContentColumn;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_CATEGORY_IMG)
    WebElement categoryImg;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_CATEGORY_NAME)
    WebElement categoryName;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_PRODUCTSCOUNTER)
    WebElement productsCounter;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_FILTER_LABEL)
    WebElement filterLabel;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_PRODUCTSELECTOR_FLD)
    WebElement productsSelectorFld;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_DISPLAYVIEWED_TITLE)
    WebElement displayViewTitle;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_GRID_ICON)
    WebElement gridIcon;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_GRID_TITLE)
    WebElement gridTitle;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_LIST_ICON)
    WebElement listIcon;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_LIST_TITLE)
    WebElement listTitle;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_PRODUCT_COUNTER) //need first of type
    WebElement productCounterUp;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_COMPARE_BTN) //need first of type
    WebElement compareBtnUp;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_COMPARE_BTNVALUE) //need first of type
    WebElement compareBtnVal;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_RIGHT_ARROW_VAL) //need 5-th of type
    WebElement rightArrowVal;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_ITEM_PHOTO) //need second of type
    WebElement itemPhoto;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_PREVIEW_PHOTO)
    WebElement itemPreviewIcon;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_ITEMPIC)
    WebElement itemBigPic;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_ITEM_VIEWBLOCK)
    WebElement itemViewBlock;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_ITEM_VIEWBLOCK_PICLIST)
    WebElement itemViewBlockPicList;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_ITEM_VIEWBLOCK_PIC1)
    WebElement itemViewBlockPic1;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_ITEM_VIEWBLOCK_PIC2)
    WebElement itemViewBlockPic2;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_ITEM_VIEWBLOCK_CLOSE_BTN)
    WebElement itemViewBlockCloseBtn;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_PRODUCTNAME_TITLE)
//    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_PRODUCTNAME_TITLE)
    WebElement productNameTitle;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_ITEM_PRICE) // need last of type
    WebElement itemPrice;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_ADDTOCART)
    WebElement addToCartBtn;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_MORE_BTN)
    WebElement moreBtn;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_COLORLIST_CONTAINER)
    WebElement colorListContainer;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_COLORITEM_VARIABLE)
    WebElement colorItemVariable;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_COLORITEM1_VARIABLE)
    WebElement colorItem1Variable;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_INSTOCK_BTN)
    WebElement inStockBtn;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_ADDTOWISGLIST_LINK)
    WebElement addToWishListLink;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_ADDTOCOMPARE_LINK)
    WebElement addToCompareLink;

    @FindBy(xpath = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_PRODUCT_COUNTER_BOTTOM) //need last of type
    WebElement productCounterBottom;

    @FindBy(css = CatalogPage_OR.CATALOGPAGE_MAINPAGECOLUMN_COMPARE_BTN_BOTTOM) //need last of type
    WebElement compareBtnBottom;

    public CatalogPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        driver.get("http://automationpractice.com/index.php?id_category=5&controller=category");
        PageFactory.initElements(driver, this);
    }
    public CatalogPage() {
    }

}
