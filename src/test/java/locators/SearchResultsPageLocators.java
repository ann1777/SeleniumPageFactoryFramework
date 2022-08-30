package locators;

import helpers.wait.WaitHelper;
import objectRepository.SearchResultsPageLocators_OR;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

public class SearchResultsPageLocators extends BasePageLocators{
    public WebDriver driver;
    public WaitHelper wait;

    @FindBy(css = SearchResultsPageLocators_OR.HOME_ICN)
    WebElement homeIcn;

    @FindBy(css = SearchResultsPageLocators_OR.NAVIGATION_PIPE)
    WebElement navigationPips;

    @FindBy(css = SearchResultsPageLocators_OR.NAVIGATION_TAB)
    WebElement navigationTab;

    @FindBy(css = SearchResultsPageLocators_OR.SEARCH_TITLE)
    WebElement searchTitle;

    @FindBy(css = SearchResultsPageLocators_OR.SEARCHTITLE_LIGHTER)
    WebElement searchTitleLighter;

    @FindBy(css = SearchResultsPageLocators_OR.SORTBY_LABEL)
    WebElement sortByLabel;

    @FindBy(css = SearchResultsPageLocators_OR.SORTBY_SELECTOR)
    WebElement sortByFld;

    @FindBy(css = SearchResultsPageLocators_OR.FOUNDEDRESULTS_HEADING_COUNTER)
    WebElement resultsCounter;

    @FindBy(css = SearchResultsPageLocators_OR.FOUNDEDRESULTS_VIEW_OPTIONS)
    WebElement viewOptions;

    @FindBy(css = SearchResultsPageLocators_OR.FOUNDEDRESULTS_GRIDVIEW_OPTIONS)
    WebElement gridViewOptions;

    @FindBy(css = SearchResultsPageLocators_OR.FOUNDEDRESULTS_LISTVIEW_OPTIONS)
    WebElement listViewOptions;

    @FindBy(css = SearchResultsPageLocators_OR.FOUNDEDRESULTS_SHOWING_COUNTER)
    WebElement showingCounter;

    @FindBy(css = SearchResultsPageLocators_OR.FOUNDEDRESULTS_SEARCH_LIGHTER)
    WebElement searchLighter;

    @FindBy(css = SearchResultsPageLocators_OR.FOUNDEDRESULTS_COMPARE_BTN)
    WebElement compareBtn;

    @FindBy(css = SearchResultsPageLocators_OR.FOUNDEDRESULTS_PRODUCT_LIST_CONTAINER)
    WebElement productContainer;

    @FindBy(css = SearchResultsPageLocators_OR.FOUNDEDRESULTS_FIRSTPRODUCT_CONTAINER)
    WebElement firstProductContainer;

    @FindBy(css = SearchResultsPageLocators_OR.FOUNNDEDRESULTS_FIRSTPRODUCT_IMG)
    WebElement firstProductImg;

    @FindBy(css = SearchResultsPageLocators_OR.FOUNNDEDRESULTS_FIRSTPRODUCT_IMG_PREVIEW_ICN)
    WebElement firstProductImgPreviewIvn;

    @FindBy(css = SearchResultsPageLocators_OR.FOUNNDEDRESULTS_FIRSTPRODUCT_PRODUCT_NAME)
    WebElement firstProductName;

    @FindBy(css = SearchResultsPageLocators_OR.FOUNNDEDRESULTS_FIRSTPRODUCT_PRODUCT_PRICE)
    WebElement firstProductPrice;

    @FindBy(css = SearchResultsPageLocators_OR.FOUNNDEDRESULTS_FIRSTPRODUCT_PRODUCT_OLDPRICE)
    WebElement firstProductOldPrice;

    @FindBy(css = SearchResultsPageLocators_OR.FOUNNDEDRESULTS_FIRSTPRODUCT_PRODUCT_DISCOUNT)
    WebElement firstProductDiscount;

    @FindBy(css = SearchResultsPageLocators_OR.FOUNNDEDRESULTS_FIRSTPRODUCT_ADDTOCART_BTN)
    WebElement firstProductAddToCartBtn;

    @FindBy(css = SearchResultsPageLocators_OR.FOUNNDEDRESULTS_FIRSTPRODUCT_MORE_BTN)
    WebElement firstProductMoreBtn;

    @FindBy(css = SearchResultsPageLocators_OR.FOUNNDEDRESULTS_FIRSTPRODUCT_COLORS_OPTIONS)
    WebElement firstProductColorsOptions;

    @FindBy(css = SearchResultsPageLocators_OR.FOUNNDEDRESULTS_FIRSTPRODUCT_SECOND_COLORS_OPTION)
    WebElement firstProductSecondColorOption;

    @FindBy(css = SearchResultsPageLocators_OR.FOUNNDEDRESULTS_FIRSTPRODUCT_INSTOCK_BTN)
    WebElement firstProductInStockBtn;

    @FindBy(css = SearchResultsPageLocators_OR.FOUNNDEDRESULTS_FIRSTPRODUCT_ADTOWISHLIST_LINK)
    WebElement firstProductAddToWishListLink;

    @FindBy(css = SearchResultsPageLocators_OR.FOUNNDEDRESULTS_FIRSTPRODUCT_ADTOCOMPARE_LINK)
    WebElement firstProductAddToCompareLink;

    @FindBy(css = SearchResultsPageLocators_OR.FOUNNDEDRESULTS_FIRSTPRODUCT_BOTTOM_COUNTER)
    WebElement firstProductBottomCounter;

    @FindBy(css = SearchResultsPageLocators_OR.FOUNNDEDRESULTS_FIRSTPRODUCT_BOTTOM_COMPARE_BTN)
    WebElement firstProductBottomCompareBtn;

    @FindBy(css = SearchResultsPageLocators_OR.TOP_SELLERS_LEFT_BLOCK)
    WebElement blockRightTopSellers;

    @FindBy(css = SearchResultsPageLocators_OR.TOP_SELLERS_LEFT_BLOCK_TITLE)
    WebElement blockRightTopSellersTitle;

    @FindBy(css = SearchResultsPageLocators_OR.TOP_SELLERS_LEFT_BLOCK_CONTENT)
    WebElement blockRightTopSellersContent;

    @FindBy(css = SearchResultsPageLocators_OR.TOP_SELLERS_BLOCK_CONTENT_FIRST_ITEM)
    WebElement blockRightTopSellersFirstItem;

    @FindBy(css = SearchResultsPageLocators_OR.TOP_SELLERS_BLOCK_CONTENT_FIRST_ITEM_IMG)
    WebElement blockRightTopSellersFirstItemImg;

    @FindBy(css = SearchResultsPageLocators_OR.TOP_SELLERS_BLOCK_CONTENT_FIRST_ITEM_NAME)
    WebElement blockRightTopSellersFirstItemNama;

    @FindBy(css = SearchResultsPageLocators_OR.TOP_SELLERS_BLOCK_CONTENT_FIRST_ITEM_DESCRIPTION)
    WebElement blockRightTopSellersFirstItemDesc;

    @FindBy(css = SearchResultsPageLocators_OR.TOP_SELLERS_BLOCK_CONTENT_FIRST_ITEM_PRICE)
    WebElement blockRightTopSellersFirstItemPrice;

    @FindBy(css = SearchResultsPageLocators_OR.ALL_BEST_SELLERS_BTN)
    WebElement allBestSellersBtn;

    @FindBy(css = SearchResultsPageLocators_OR.ALL_BEST_SELLERS_BTN_RIGHT_ICN)
    WebElement allBestSellersBtnIcn;

    @FindBy(css = SearchResultsPageLocators_OR.CATEGORIES_LEFT_BLOCK)
    WebElement categories;

    @FindBy(css = SearchResultsPageLocators_OR.CATEGORIES_LEFT_BLOCK_TITLE)
    WebElement categoriesLeftBlock;

    @FindBy(css = SearchResultsPageLocators_OR.CATEGORIES_LEFT_BLOCK_CONTENT)
    WebElement categoriesLeftBlockContent;

    @FindBy(css = SearchResultsPageLocators_OR.CATEGORIES_LEFT_BLOCK_CONTENT_PLUS_BTN)
    WebElement categoriesLeftBlockContentPlusBtn;

    @FindBy(css = SearchResultsPageLocators_OR.CATEGORIES_LEFT_BLOCK_CONTENT_TOP)
    WebElement categoriesLeftBlockContentTop;

    @FindBy(css = SearchResultsPageLocators_OR.CATEGORIES_LEFT_BLOCK_CONTENT_TOP_PLUS_BTN)
    WebElement categoriesLeftBlockContentTopPlusBtn;

    @FindBy(css = SearchResultsPageLocators_OR.INFORMATION_LEFT_BLOCK)
    WebElement informationLeftBlock;

    @FindBy(css = SearchResultsPageLocators_OR.INFORMATION_LEFT_BLOCK_TITLE)
    WebElement informationLeftBlockTitle;

    @FindBy(css = SearchResultsPageLocators_OR.INFORMATION_LEFT_BLOCK_CONTENT)
    WebElement informationLeftBlockContent;

    @FindBy(css = SearchResultsPageLocators_OR.INFORMATION_LEFT_BLOCK_CONTENT_PLUS_ABOUT_US_SUBCATEGORY)
    WebElement informationLeftBlockContentAboutAs;

    @FindBy(css = SearchResultsPageLocators_OR.MANUFACTURES_LEFT_BLOCK)
    WebElement manufacturesLeftBlock;

    @FindBy(css = SearchResultsPageLocators_OR.MANUFACTURES_LEFT_BLOCK_TITLE)
    WebElement manufacturesLeftBlockTitle;

    @FindBy(css = SearchResultsPageLocators_OR.MANUFACTURES_LEFT_BLOCK_CONTENT)
    WebElement manufacturesLeftBlockContent;

    @FindBy(css = SearchResultsPageLocators_OR.MANUFACTURES_LEFT_BLOCK_FASHION)
    WebElement manufacturesLeftBlockFashion;

    @FindBy(css = SearchResultsPageLocators_OR.MANUFACTURES_LEFT_BLOCK_FASHION_LINK)
    WebElement manufacturesLeftBlockFashionLink;

    @FindBy(css = SearchResultsPageLocators_OR.MANUFACTURES_LEFT_BLOCK_ALL_LIST)
    WebElement manufacturesLeftBlockAllList;

    @FindBy(css = SearchResultsPageLocators_OR.MANUFACTURES_LEFT_BLOCK_ALL_LIST_FASHION_OPTION)
    WebElement manufacturesLeftBlockAllListFashionOption;

    @FindBy(css = SearchResultsPageLocators_OR.SPECIALS_LEFT_BLOCK)
    WebElement specialsLeftBlock;

    @FindBy(css = SearchResultsPageLocators_OR.SPECIALS_LEFT_BLOCK_TITLE)
    WebElement specialsLeftBlockTitle;

    @FindBy(css = SearchResultsPageLocators_OR.SPECIALS_LEFT_BLOCK_CONTENT)
    WebElement specialsLeftBlockContent;

    @FindBy(css = SearchResultsPageLocators_OR.SPECIALS_LEFT_BLOCK_PRODUCT_IMG)
    WebElement specialsLeftBlockProductIcn;

    @FindBy(css = SearchResultsPageLocators_OR.SPECIALS_LEFT_BLOCK_PRODUCT_CONTENT)
    WebElement specialsLeftBlockProductContent;

    @FindBy(css = SearchResultsPageLocators_OR.SPECIALS_LEFT_BLOCK_PRODUCT_PRICE)
    WebElement specialsLeftBlockProductPrice;

    @FindBy(css = SearchResultsPageLocators_OR.SPECIALS_LEFT_BLOCK_ALL_SPECIALS_BTN)
    WebElement specialsLeftBlockAllSpecialsBtn;

    @FindBy(css = SearchResultsPageLocators_OR.OUR_STORES_LEFT_BLOCK)
    WebElement ourStoresLeftBlock;

    @FindBy(css = SearchResultsPageLocators_OR.OUR_STORES_LEFT_BLOCK_TITLE)
    WebElement ourStoresLeftBlockTitle;

    @FindBy(css = SearchResultsPageLocators_OR.OUR_STORES_LEFT_BLOCK_CONTENT)
    WebElement ourStoresLeftBlockContent;

    @FindBy(css = SearchResultsPageLocators_OR.OUR_STORES_LEFT_BLOCK_PRODUCT_IMG)
    WebElement ourStoresLeftBlockProductImg;

    @FindBy(css = SearchResultsPageLocators_OR.OUR_STORES_LEFT_BLOCK_PRODUCT_DISCOVER_BTN)
    WebElement ourStoresLeftBlockProductDiscoverBtn;

    @FindBy(css = SearchResultsPageLocators_OR.OUR_STORES_LEFT_BLOCK_PRODUCT_DISCOVER_BTN_ICN)
    WebElement ourStoresLeftBlockProductDiscoverBtnIcn;

    @FindBy(css = SearchResultsPageLocators_OR.SUPPLIERS_LEFT_BLOCK)
    WebElement suppliersLeftBlock;

    @FindBy(css = SearchResultsPageLocators_OR.SUPPLIERS_LEFT_BLOCK_TITLE)
    WebElement suppliersLeftBlockTitle;

    @FindBy(css = SearchResultsPageLocators_OR.SUPPLIERS_LEFT_BLOCK_CONTENT)
    WebElement suppliersLeftBlockContent;

    @FindBy(css = SearchResultsPageLocators_OR.SUPPLIERS_LEFT_BLOCK_FASHION_SUPPLIER)
    WebElement suppliersLeftBlockFashionSuppliers;

    @FindBy(css = SearchResultsPageLocators_OR.SUPPLIERS_LEFT_BLOCK_ALL_SUPPLIERS_DROPDOWN)
    WebElement suppliersLeftBlockAllSuppliersDropdown;

    @FindBy(css = SearchResultsPageLocators_OR.SUPPLIERS_LEFT_BLOCK_ALL_SUPPLIERS_OPTION)
    WebElement suppliersLeftBlockAllSuppliersOption;

    @FindBy(css = SearchResultsPageLocators_OR.VIEWED_PRODUCTS_LEFT_BLOCK)
    WebElement viewedProductsLeftBlock;

    @FindBy(css = SearchResultsPageLocators_OR.VIEWED_PRODUCTS_LEFT_BLOCK_TITLE)
    WebElement viewedProductsLeftBlockTitle;

    @FindBy(css = SearchResultsPageLocators_OR.VIEWED_PRODUCTS_LEFT_BLOCK_CONTENT)
    WebElement viewedProductsLeftBlockContent;

    @FindBy(css = SearchResultsPageLocators_OR.VIEWED_PRODUCTS_LEFT_BLOCK_LAST_VIEWED_ITEM)
    WebElement viewedProductsLeftBlockLastViewedItem;

    @FindBy(css = SearchResultsPageLocators_OR.VIEWED_PRODUCTS_LEFT_BLOCK_LAST_VIEWED_ITEM_IMG)
    WebElement viewedProductsLeftBlockLastViewedItemImg;

    @FindBy(css = SearchResultsPageLocators_OR.VIEWED_PRODUCTS_LEFT_BLOCK_LAST_VIEWED_ITEM_DESC)
    WebElement viewedProductsLeftBlockLastViewedItemImgDesc;

    public SearchResultsPageLocators(WebDriver driver) {
        this.driver = driver;
        driver.get("http://automationpractice.com/index.php?controller=search&orderby=position&orderway=desc&search_query=Dress&submit_search=");
        PageFactory.initElements((ElementLocatorFactory) driver, this);
    }
    public SearchResultsPageLocators() {
    }
}
