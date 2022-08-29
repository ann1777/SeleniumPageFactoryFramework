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



    public SearchResultsPageLocators(WebDriver driver) {
        this.driver = driver;
        driver.get("https://automationpractice.com/index.php");
        PageFactory.initElements((ElementLocatorFactory) driver, this);
    }
    public SearchResultsPageLocators() {
    }
}
