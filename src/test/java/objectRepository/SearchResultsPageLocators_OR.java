package objectRepository;

public class SearchResultsPageLocators_OR {
    public static final String HOME_ICN =".icon-home";
    public static final String NAVIGATION_PIPE = ".navigation-pipe";
    public static final String NAVIGATION_TAB = ".navigation-page";
    public static final String SEARCH_TITLE = "//h1[@class='page-heading  product-listing'][contains(text(), 'Search')]";
    public static final String SEARCHTITLE_LIGHTER = "//span[@class='lighter']";
    public static final String SORTBY_LABEL = "//label[@for='selectProductSort']";
    public static final String SORTBY_SELECTOR = "//select[@id='selectProductSort']";
//    public static final String SORTBY_SELECTOR = "//div[@id='uniform-selectProductSort']";
    public static final String FOUNDEDRESULTS_HEADING_COUNTER = "//span[@class='heading-counter']";
    public static final String FOUNDEDRESULTS_VIEW_OPTIONS = "//li[@class='display-title']";
    public static final String FOUNDEDRESULTS_GRIDVIEW_OPTIONS = "//li[@id='grid']//a[contains(text(), 'Grid')]";
    public static final String FOUNDEDRESULTS_LISTVIEW_OPTIONS = "//li[@id='list']//a[contains(text(), 'List')]";
    public static final String FOUNDEDRESULTS_SHOWING_COUNTER = "//*[@class='top-pagination-content clearfix']/div[@class='product-count'][contains(text(),'Showing')]";
    public static final String FOUNDEDRESULTS_SEARCH_LIGHTER = "//div[@class='left-block']//a[@class='product_img_link']";
    public static final String FOUNDEDRESULTS_COMPARE_BTN = "//*[@id='center_column']/div[1]/div[2]/form/button";
    public static final String FOUNDEDRESULTS_PRODUCT_LIST_CONTAINER = "//ul[@class='product_list grid row']";
    public static final String FOUNDEDRESULTS_FIRSTPRODUCT_CONTAINER = "(//div[@class='product-container'])[1]";
    public static final String FOUNNDEDRESULTS_FIRSTPRODUCT_IMG = "(//div[@class='product-container'])[1]//a[@class='product_img_link']";
    public static final String FOUNNDEDRESULTS_FIRSTPRODUCT_IMG_PREVIEW_ICN = "(//div[@class='product-container'])[1]//I[@class='icon-eye-open']";
    public static final String FOUNNDEDRESULTS_FIRSTPRODUCT_PRODUCT_NAME = "((//div[@class='product-container'])[1]//a[@class='product-name']";
    public static final String FOUNNDEDRESULTS_FIRSTPRODUCT_PRODUCT_PRICE = "//*[@id='center_column']/ul/li[1]/div/div[2]/div[1]/span[1]";
    public static final String FOUNNDEDRESULTS_FIRSTPRODUCT_PRODUCT_OLDPRICE = "//*[@id='center_column']/ul/li[1]/div/div[1]/div/div[2]/span[2]";
    public static final String FOUNNDEDRESULTS_FIRSTPRODUCT_PRODUCT_DISCOUNT = "//*[@id='center_column']/ul/li[1]/div/div[1]/div/div[2]/span[3]";
    public static final String FOUNNDEDRESULTS_FIRSTPRODUCT_ADDTOCART_BTN = "(//div[@class='product-container'])[1]//span[text()='Add to cart']";
    public static final String FOUNNDEDRESULTS_FIRSTPRODUCT_MORE_BTN = "(//div[@class='product-container'])[1]//span[text()='More']";
    public static final String FOUNNDEDRESULTS_FIRSTPRODUCT_COLORS_OPTIONS = "(//div[@class='product-container'])[1]//ul[@class='color_to_pick_list clearfix']";
    public static final String FOUNNDEDRESULTS_FIRSTPRODUCT_SECOND_COLORS_OPTION = "(//div[@class='product-container'])[1]//ul[@class='color_to_pick_list clearfix']/li[2]";
    public static final String FOUNNDEDRESULTS_FIRSTPRODUCT_INSTOCK_BTN = "(//div[@class='product-container'])[1]//span[@class='available-now']";
    public static final String FOUNNDEDRESULTS_FIRSTPRODUCT_ADTOWISHLIST_LINK = "(//div[@class='product-container'])[1]//a[contains(text(),'Add to Wishlist')]";
    public static final String FOUNNDEDRESULTS_FIRSTPRODUCT_ADTOCOMPARE_LINK = "(//div[@class='product-container'])[1]//div[@class='compare']";
    public static final String FOUNNDEDRESULTS_FIRSTPRODUCT_BOTTOM_COUNTER = "//div[@class='bottom-pagination-content clearfix']//div[@class='product-count']";
    public static final String FOUNNDEDRESULTS_FIRSTPRODUCT_BOTTOM_COMPARE_BTN = "//div[@class='bottom-pagination-content clearfix']//FORM[@class='compare-form']/button";


}
