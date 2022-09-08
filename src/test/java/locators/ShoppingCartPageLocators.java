package locators;

import objectRepository.ShoppingCartPage_OR;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

public class ShoppingCartPageLocators extends BasePageLocators {

    WebDriver driver;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_HOME_ICN)
    public WebElement homeIcn;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_NAVIGATION_PIPE)
    public WebElement navigationPipe;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_YOURSHOPPINGCART_TAB)
//    @FindBy(xpath = "//*[text() = 'Your shopping cart']")
    public WebElement YourShoppingCartTab;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_SHOPPINGCART_TITLE)
    //*[@id="cart_title"][contains(text(), 'Shopping-cart summary')]
    public WebElement shoppingCartTitle;

    @FindBy(xpath = ShoppingCartPage_OR.SHOPPINGCARTPAGE_CARTHEADING_COUNTER)
    public WebElement cartHeadingCounter;

    @FindBy(xpath = ShoppingCartPage_OR.SHOPPINGCARTPAGE_ADDPRODUCTS_COUNTER)
    public WebElement addedProductsCounter;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_ORDERSTEPS_LINE)
    public WebElement orderStepsLine;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_SUMMARY_STEP)
//    @FindBy(xpath = "//*[@id=\"order_step\"]/li[1]/span[contains(text(), 'Summary')]")
    public WebElement summaryStep;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_SIGNIN_STEP)
//    @FindBy(xpath = "//*[@id=\"order_step\"]/li[2]/span[contains(text(), 'Sign in')]")
    public WebElement signInStep;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_ADDRESS_STEP)
//    @FindBy(xpath = "//*[@id=\"order_step\"]/li[3]/span[contains(text(), 'Address')]")
    public WebElement addressStep;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_SHIPPING_STEP)
//    @FindBy(xpath = "//*[@id=\"order_step\"]/li[4]/span[contains(text(), 'Shipping')]")
    public WebElement shippingStep;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_PAYMENT_STEP)
//    @FindBy(xpath = "//*[@id=\"order_step\"]/li[5]/span[contains(text(), 'Payment')]")
    public WebElement paymentStep;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_EMPTYCART_WARNING)
    public WebElement emptyCartWarning;

    @FindBy(xpath = ShoppingCartPage_OR.SHOPPINGCARTPAGE_ITEMS_TABLEBORDER)
    public WebElement itemsTableBorder;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_PRODUCTTAB_ITEMS_TABLEBORDER)
    public WebElement productTabItemsTableBorder;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_DESCRIPTIONTAB_ITEMS_TABLEBORDER)
    public WebElement descriptionTabItemsTableBorder;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_AVAILTAB_ITEMS_TABLEBORDER)
    public WebElement availTabItemsTableBorder;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_UNITPRICETAB_ITEMS_TABLEBORDER)
    public WebElement unitPriceTabItemsTableBorder;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_QUANTITYTAB_ITEMS_TABLEBORDER)
    public WebElement quantityTabItemsTableBorder;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_TOTALTAB_ITEMS_TABLEBORDER)
    public WebElement totalTabItemsTableBorder;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_CARTITEM_IMG)
    public WebElement cartItemImg;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_CARTITEM_DESCRIPTION)
    public WebElement cartItemDescription;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_CARTITEM_AVAILLABEL)
    public WebElement cartItemAvailLabel;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_CARTITEM_UNITPRICE)
    public WebElement cartItemUnitPrice;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_CARTITEM_QUANTITY_MANAGER)
    public WebElement cartItemsQuantityManager;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_CARTITEMS_QUANTITY_INPUT)
    public WebElement cartItemsQuantityInput;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_CARTITEMS_QUANTITY_BTNS)
    public WebElement cartItemsQuantityBtns;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_CARTITEMS_QUANTITY_TOTAL)
    public WebElement cartItemsQuantityTotal;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_CARTITEMS_DELETE_BTN)
    public WebElement cartItemsDeleteBtn;

    @FindBy(xpath = ShoppingCartPage_OR.SHOPPINGCARTPAGE_CARTTOTALPRODUCTS_FLD)
    public WebElement cartTotalProductsFld;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_CARTTOTALPRODUCTS_PRICE_FLD)
    public WebElement cartTotalProductsPriceFld;

    @FindBy(xpath = ShoppingCartPage_OR.SHOPPINGCARTPAGE_CARTTOTALSHIPPING_FLD)
    public WebElement cartTotalShippingFld;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_CARTTOTALSHIPPINGPRICE_FLD)
    public WebElement cartTotalShippingPriceFld;

    @FindBy(xpath = ShoppingCartPage_OR.SHOPPINGCARTPAGE_CARTTOTAL_FLD)
    public WebElement cartTotalFld;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_CARTTOTAL_WITHOUTTAX_FLD)
    public WebElement cartTotalWithoutTaxFld;

    @FindBy(xpath = ShoppingCartPage_OR.SHOPPINGCARTPAGE_CARTTAX_FLD)
    public WebElement cartTaxFld;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_CARTTAX_PRICE_FLD)
    public WebElement cartTaxPriceFld;

    @FindBy(xpath = ShoppingCartPage_OR.SHOPPINGCARTPAGE_CARTGENERALTOTAL_FLD)
    public WebElement cartGeneralTotalFld;

    @FindBy(xpath = ShoppingCartPage_OR.SHOPPINGCARTPAGE_CARTGENERAL_TOTALPRICE_FLD)
    public WebElement cartGeneralTotalPriceFld;

    @FindBy(xpath = ShoppingCartPage_OR.SHOPPINGCARTPAGE_CHECKOUT_BTN)
    public WebElement checkoutBtn;

    @FindBy(xpath = ShoppingCartPage_OR.SHOPPINGCARTPAGE_CONTINUESHOPPING_BTN)
    public WebElement continueShoppingBtn;

    public ShoppingCartPageLocators(WebDriver driver) {
        super(driver);
        this.driver = driver;
        driver.get("http://automationpractice.com/index.php?controller=order");
        PageFactory.initElements((ElementLocatorFactory) driver, this);
    }
}
