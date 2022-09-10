package locators;

import helpers.wait.WaitHelper;
import objectRepository.SearchResultsPage_OR;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

public class SearchResultsPageLocators extends BasePageLocators{
    public WebDriver driver;
    public WaitHelper wait;

    @FindBy(css = SearchResultsPage_OR.HOME_ICN)
    public WebElement homeIcn;

    @FindBy(css = SearchResultsPage_OR.NAVIGATION_PIPE)
    public WebElement navigationPips;

    @FindBy(css = SearchResultsPage_OR.NAVIGATION_TAB)
    public WebElement navigationTab;

    @FindBy(xpath = SearchResultsPage_OR.SEARCH_TITLE)
    public WebElement searchTitle;

    @FindBy(css = SearchResultsPage_OR.SEARCHTITLE_LIGHTER)
    public WebElement searchTitleLighter;

    @FindBy(css = SearchResultsPage_OR.SORTBY_LABEL)
    public WebElement sortByLabel;

    @FindBy(css = SearchResultsPage_OR.SORTBY_SELECTOR)
    public WebElement sortByFld;

    @FindBy(css = SearchResultsPage_OR.FOUNDEDRESULTS_HEADING_COUNTER)
    public WebElement resultsCounter;

    @FindBy(css = SearchResultsPage_OR.FOUNDEDRESULTS_VIEW_OPTIONS)
    public WebElement viewOptions;

    @FindBy(css = SearchResultsPage_OR.FOUNDEDRESULTS_GRIDVIEW_OPTIONS)
    public WebElement gridViewOptions;

    @FindBy(css = SearchResultsPage_OR.FOUNDEDRESULTS_LISTVIEW_OPTIONS)
    public WebElement listViewOptions;

    @FindBy(css = SearchResultsPage_OR.FOUNDEDRESULTS_SHOWING_COUNTER)
    public WebElement showingCounter;

    @FindBy(css = SearchResultsPage_OR.FOUNDEDRESULTS_SEARCH_LIGHTER)
    public WebElement searchLighter;

    @FindBy(css = SearchResultsPage_OR.FOUNDEDRESULTS_COMPARE_BTN)
    public WebElement compareBtn;

    @FindBy(css = SearchResultsPage_OR.FOUNDEDRESULTS_PRODUCT_LIST_CONTAINER)
    public WebElement productContainer;

    @FindBy(css = SearchResultsPage_OR.FOUNDEDRESULTS_FIRSTPRODUCT_CONTAINER)
    public WebElement firstProductContainer;

    @FindBy(css = SearchResultsPage_OR.FOUNNDEDRESULTS_FIRSTPRODUCT_IMG)
    public WebElement firstProductImg;

    @FindBy(css = SearchResultsPage_OR.FOUNNDEDRESULTS_FIRSTPRODUCT_IMG_PREVIEW_ICN)
    public WebElement firstProductImgPreviewIvn;

    @FindBy(css = SearchResultsPage_OR.FOUNNDEDRESULTS_FIRSTPRODUCT_PRODUCT_NAME)
    public WebElement firstProductName;

    @FindBy(css = SearchResultsPage_OR.FOUNNDEDRESULTS_FIRSTPRODUCT_PRODUCT_PRICE)
    public WebElement firstProductPrice;

    @FindBy(css = SearchResultsPage_OR.FOUNNDEDRESULTS_FIRSTPRODUCT_PRODUCT_OLDPRICE)
    public WebElement firstProductOldPrice;

    @FindBy(css = SearchResultsPage_OR.FOUNNDEDRESULTS_FIRSTPRODUCT_PRODUCT_DISCOUNT)
    public WebElement firstProductDiscount;

    @FindBy(css = SearchResultsPage_OR.FOUNNDEDRESULTS_FIRSTPRODUCT_ADDTOCART_BTN)
    public WebElement firstProductAddToCartBtn;

    @FindBy(css = SearchResultsPage_OR.FOUNNDEDRESULTS_FIRSTPRODUCT_MORE_BTN)
    public WebElement firstProductMoreBtn;

    @FindBy(css = SearchResultsPage_OR.FOUNNDEDRESULTS_FIRSTPRODUCT_COLORS_OPTIONS)
    public WebElement firstProductColorsOptions;

    @FindBy(css = SearchResultsPage_OR.FOUNNDEDRESULTS_FIRSTPRODUCT_SECOND_COLORS_OPTION)
    public WebElement firstProductSecondColorOption;

    @FindBy(css = SearchResultsPage_OR.FOUNNDEDRESULTS_FIRSTPRODUCT_INSTOCK_BTN)
    public WebElement firstProductInStockBtn;

    @FindBy(css = SearchResultsPage_OR.FOUNNDEDRESULTS_FIRSTPRODUCT_ADTOWISHLIST_LINK)
    public WebElement firstProductAddToWishListLink;

    @FindBy(css = SearchResultsPage_OR.FOUNNDEDRESULTS_FIRSTPRODUCT_ADTOCOMPARE_LINK)
    public WebElement firstProductAddToCompareLink;

    @FindBy(css = SearchResultsPage_OR.FOUNNDEDRESULTS_FIRSTPRODUCT_BOTTOM_COUNTER)
    public WebElement firstProductBottomCounter;

    @FindBy(css = SearchResultsPage_OR.FOUNNDEDRESULTS_FIRSTPRODUCT_BOTTOM_COMPARE_BTN)
    public WebElement firstProductBottomCompareBtn;

    @FindBy(css = SearchResultsPage_OR.TOP_SELLERS_LEFT_BLOCK)
    public WebElement blockRightTopSellers;

    @FindBy(css = SearchResultsPage_OR.TOP_SELLERS_LEFT_BLOCK_TITLE)
    public WebElement blockRightTopSellersTitle;

    @FindBy(css = SearchResultsPage_OR.TOP_SELLERS_LEFT_BLOCK_CONTENT)
    public WebElement blockRightTopSellersContent;

    @FindBy(css = SearchResultsPage_OR.TOP_SELLERS_BLOCK_CONTENT_FIRST_ITEM)
    public WebElement blockRightTopSellersFirstItem;

    @FindBy(css = SearchResultsPage_OR.TOP_SELLERS_BLOCK_CONTENT_FIRST_ITEM_IMG)
    public WebElement blockRightTopSellersFirstItemImg;

    @FindBy(css = SearchResultsPage_OR.TOP_SELLERS_BLOCK_CONTENT_FIRST_ITEM_NAME)
    public WebElement blockRightTopSellersFirstItemNama;

    @FindBy(css = SearchResultsPage_OR.TOP_SELLERS_BLOCK_CONTENT_FIRST_ITEM_DESCRIPTION)
    public WebElement blockRightTopSellersFirstItemDesc;

    @FindBy(css = SearchResultsPage_OR.TOP_SELLERS_BLOCK_CONTENT_FIRST_ITEM_PRICE)
    public WebElement blockRightTopSellersFirstItemPrice;

    @FindBy(css = SearchResultsPage_OR.ALL_BEST_SELLERS_BTN)
    public WebElement allBestSellersBtn;

    @FindBy(css = SearchResultsPage_OR.ALL_BEST_SELLERS_BTN_RIGHT_ICN)
    public WebElement allBestSellersBtnIcn;

    @FindBy(css = SearchResultsPage_OR.CATEGORIES_LEFT_BLOCK)
    public WebElement categories;

    @FindBy(css = SearchResultsPage_OR.CATEGORIES_LEFT_BLOCK_TITLE)
    public WebElement categoriesLeftBlock;

    @FindBy(css = SearchResultsPage_OR.CATEGORIES_LEFT_BLOCK_CONTENT)
    public WebElement categoriesLeftBlockContent;

    @FindBy(css = SearchResultsPage_OR.CATEGORIES_LEFT_BLOCK_CONTENT_PLUS_BTN)
    public WebElement categoriesLeftBlockContentPlusBtn;

    @FindBy(css = SearchResultsPage_OR.CATEGORIES_LEFT_BLOCK_CONTENT_TOP)
    public WebElement categoriesLeftBlockContentTop;

    @FindBy(css = SearchResultsPage_OR.CATEGORIES_LEFT_BLOCK_CONTENT_TOP_PLUS_BTN)
    public WebElement categoriesLeftBlockContentTopPlusBtn;

    @FindBy(css = SearchResultsPage_OR.INFORMATION_LEFT_BLOCK)
    public WebElement informationLeftBlock;

    @FindBy(css = SearchResultsPage_OR.INFORMATION_LEFT_BLOCK_TITLE)
    public WebElement informationLeftBlockTitle;

    @FindBy(css = SearchResultsPage_OR.INFORMATION_LEFT_BLOCK_CONTENT)
    public WebElement informationLeftBlockContent;

    @FindBy(css = SearchResultsPage_OR.INFORMATION_LEFT_BLOCK_CONTENT_PLUS_ABOUT_US_SUBCATEGORY)
    public WebElement informationLeftBlockContentAboutAs;

    @FindBy(css = SearchResultsPage_OR.MANUFACTURES_LEFT_BLOCK)
    public WebElement manufacturesLeftBlock;

    @FindBy(css = SearchResultsPage_OR.MANUFACTURES_LEFT_BLOCK_TITLE)
    public WebElement manufacturesLeftBlockTitle;

    @FindBy(css = SearchResultsPage_OR.MANUFACTURES_LEFT_BLOCK_CONTENT)
    public WebElement manufacturesLeftBlockContent;

    @FindBy(css = SearchResultsPage_OR.MANUFACTURES_LEFT_BLOCK_FASHION)
    public WebElement manufacturesLeftBlockFashion;

    @FindBy(css = SearchResultsPage_OR.MANUFACTURES_LEFT_BLOCK_FASHION_LINK)
    public WebElement manufacturesLeftBlockFashionLink;

    @FindBy(css = SearchResultsPage_OR.MANUFACTURES_LEFT_BLOCK_ALL_LIST)
    public WebElement manufacturesLeftBlockAllList;

    @FindBy(css = SearchResultsPage_OR.MANUFACTURES_LEFT_BLOCK_ALL_LIST_FASHION_OPTION)
    public WebElement manufacturesLeftBlockAllListFashionOption;

    @FindBy(css = SearchResultsPage_OR.SPECIALS_LEFT_BLOCK)
    public WebElement specialsLeftBlock;

    @FindBy(css = SearchResultsPage_OR.SPECIALS_LEFT_BLOCK_TITLE)
    public WebElement specialsLeftBlockTitle;

    @FindBy(css = SearchResultsPage_OR.SPECIALS_LEFT_BLOCK_CONTENT)
    public WebElement specialsLeftBlockContent;

    @FindBy(css = SearchResultsPage_OR.SPECIALS_LEFT_BLOCK_PRODUCT_IMG)
    public WebElement specialsLeftBlockProductIcn;

    @FindBy(css = SearchResultsPage_OR.SPECIALS_LEFT_BLOCK_PRODUCT_CONTENT)
    public WebElement specialsLeftBlockProductContent;

    @FindBy(css = SearchResultsPage_OR.SPECIALS_LEFT_BLOCK_PRODUCT_PRICE)
    public WebElement specialsLeftBlockProductPrice;

    @FindBy(css = SearchResultsPage_OR.SPECIALS_LEFT_BLOCK_ALL_SPECIALS_BTN)
    public WebElement specialsLeftBlockAllSpecialsBtn;

    @FindBy(css = SearchResultsPage_OR.OUR_STORES_LEFT_BLOCK)
    public WebElement ourStoresLeftBlock;

    @FindBy(css = SearchResultsPage_OR.OUR_STORES_LEFT_BLOCK_TITLE)
    public WebElement ourStoresLeftBlockTitle;

    @FindBy(css = SearchResultsPage_OR.OUR_STORES_LEFT_BLOCK_CONTENT)
    public WebElement ourStoresLeftBlockContent;

    @FindBy(css = SearchResultsPage_OR.OUR_STORES_LEFT_BLOCK_PRODUCT_IMG)
    public WebElement ourStoresLeftBlockProductImg;

    @FindBy(css = SearchResultsPage_OR.OUR_STORES_LEFT_BLOCK_PRODUCT_DISCOVER_BTN)
    public WebElement ourStoresLeftBlockProductDiscoverBtn;

    @FindBy(css = SearchResultsPage_OR.OUR_STORES_LEFT_BLOCK_PRODUCT_DISCOVER_BTN_ICN)
    public WebElement ourStoresLeftBlockProductDiscoverBtnIcn;

    @FindBy(css = SearchResultsPage_OR.SUPPLIERS_LEFT_BLOCK)
    public WebElement suppliersLeftBlock;

    @FindBy(css = SearchResultsPage_OR.SUPPLIERS_LEFT_BLOCK_TITLE)
    public WebElement suppliersLeftBlockTitle;

    @FindBy(css = SearchResultsPage_OR.SUPPLIERS_LEFT_BLOCK_CONTENT)
    public WebElement suppliersLeftBlockContent;

    @FindBy(css = SearchResultsPage_OR.SUPPLIERS_LEFT_BLOCK_FASHION_SUPPLIER)
    public WebElement suppliersLeftBlockFashionSuppliers;

    @FindBy(css = SearchResultsPage_OR.SUPPLIERS_LEFT_BLOCK_ALL_SUPPLIERS_DROPDOWN)
    public WebElement suppliersLeftBlockAllSuppliersDropdown;

    @FindBy(css = SearchResultsPage_OR.SUPPLIERS_LEFT_BLOCK_ALL_SUPPLIERS_OPTION)
    public WebElement suppliersLeftBlockAllSuppliersOption;

    @FindBy(css = SearchResultsPage_OR.VIEWED_PRODUCTS_LEFT_BLOCK)
    public WebElement viewedProductsLeftBlock;

    @FindBy(css = SearchResultsPage_OR.VIEWED_PRODUCTS_LEFT_BLOCK_TITLE)
    public WebElement viewedProductsLeftBlockTitle;

    @FindBy(css = SearchResultsPage_OR.VIEWED_PRODUCTS_LEFT_BLOCK_CONTENT)
    public WebElement viewedProductsLeftBlockContent;

    @FindBy(css = SearchResultsPage_OR.VIEWED_PRODUCTS_LEFT_BLOCK_LAST_VIEWED_ITEM)
    public WebElement viewedProductsLeftBlockLastViewedItem;

    @FindBy(css = SearchResultsPage_OR.VIEWED_PRODUCTS_LEFT_BLOCK_LAST_VIEWED_ITEM_IMG)
    public WebElement viewedProductsLeftBlockLastViewedItemImg;

    @FindBy(css = SearchResultsPage_OR.VIEWED_PRODUCTS_LEFT_BLOCK_LAST_VIEWED_ITEM_DESC)
    public WebElement viewedProductsLeftBlockLastViewedItemImgDesc;

    public SearchResultsPageLocators(WebDriver driver) {
        this.driver = driver;
        driver.get("http://automationpractice.com/index.php?controller=search&orderby=position&orderway=desc&search_query=Dress&submit_search=");
        PageFactory.initElements((ElementLocatorFactory) driver, this);
    }
    public SearchResultsPageLocators() {
    }
}
