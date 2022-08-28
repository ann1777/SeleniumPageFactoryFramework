package page;

import objectRepository.ShoppingCartPage_OR;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends  BasePage{

    WebDriver driver;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_HOME_ICN)
    WebElement homeIcn;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_NAVIGATION_PIPE)
    WebElement navigationPipe;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_YOURSHOPPINGCART_TAB)
//    @FindBy(xpath = "//*[text() = 'Your shopping cart']")
    WebElement YourShoppingCartTab;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_SHOPPINGCART_TITLE)
    //*[@id="cart_title"][contains(text(), 'Shopping-cart summary')]
    WebElement shoppingCartTitle;

    @FindBy(xpath = ShoppingCartPage_OR.SHOPPINGCARTPAGE_CARTHEADING_COUNTER)
    WebElement cartHeadingCounter;

    @FindBy(xpath = ShoppingCartPage_OR.SHOPPINGCARTPAGE_ADDPRODUCTS_COUNTER)
    WebElement addedProductsCounter;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_ORDERSTEPS_LINE)
    WebElement orderStepsLine;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_SUMMARY_STEP)
//    @FindBy(xpath = "//*[@id=\"order_step\"]/li[1]/span[contains(text(), 'Summary')]")
    WebElement summaryStep;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_SIGNIN_STEP)
//    @FindBy(xpath = "//*[@id=\"order_step\"]/li[2]/span[contains(text(), 'Sign in')]")
    WebElement signInStep;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_ADDRESS_STEP)
//    @FindBy(xpath = "//*[@id=\"order_step\"]/li[3]/span[contains(text(), 'Address')]")
    WebElement addressStep;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_SHIPPING_STEP)
//    @FindBy(xpath = "//*[@id=\"order_step\"]/li[4]/span[contains(text(), 'Shipping')]")
    WebElement shippingStep;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_PAYMENT_STEP)
//    @FindBy(xpath = "//*[@id=\"order_step\"]/li[5]/span[contains(text(), 'Payment')]")
    WebElement paymentStep;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_EMPTYCART_WARNING)
    WebElement emptyCartWarning;

    @FindBy(xpath = ShoppingCartPage_OR.SHOPPINGCARTPAGE_ITEMS_TABLEBORDER)
    WebElement itemsTableBorder;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_PRODUCTTAB_ITEMS_TABLEBORDER)
    WebElement productTabItemsTableBorder;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_DESCRIPTIONTAB_ITEMS_TABLEBORDER)
    WebElement descriptionTabItemsTableBorder;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_AVAILTAB_ITEMS_TABLEBORDER)
    WebElement availTabItemsTableBorder;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_UNITPRICETAB_ITEMS_TABLEBORDER)
    WebElement unitPriceTabItemsTableBorder;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_QUANTITYTAB_ITEMS_TABLEBORDER)
    WebElement quantityTabItemsTableBorder;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_TOTALTAB_ITEMS_TABLEBORDER)
    WebElement totalTabItemsTableBorder;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_CARTITEM_IMG)
    WebElement cartItemImg;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_CARTITEM_DESCRIPTION)
    WebElement cartItemDescription;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_CARTITEM_AVAILLABEL)
    WebElement cartItemAvailLabel;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_CARTITEM_UNITPRICE)
    WebElement cartItemUnitPrice;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_CARTITEM_QUANTITY_MANAGER)
    WebElement cartItemsQuantityManager;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_CARTITEMS_QUANTITY_INPUT)
    WebElement cartItemsQuantityInput;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_CARTITEMS_QUANTITY_BTNS)
    WebElement cartItemsQuantityBtns;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_CARTITEMS_QUANTITY_TOTAL)
    WebElement cartItemsQuantityTotal;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_CARTITEMS_DELETE_BTN)
    WebElement cartItemsDeleteBtn;

    @FindBy(xpath = ShoppingCartPage_OR.SHOPPINGCARTPAGE_CARTTOTALPRODUCTS_FLD)
    WebElement cartTotalProductsFld;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_CARTTOTALPRODUCTS_PRICE_FLD)
    WebElement cartTotalProductsPriceFld;

    @FindBy(xpath = ShoppingCartPage_OR.SHOPPINGCARTPAGE_CARTTOTALSHIPPING_FLD)
    WebElement cartTotalShippingFld;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_CARTTOTALSHIPPINGPRICE_FLD)
    WebElement cartTotalShippingPriceFld;

    @FindBy(xpath = ShoppingCartPage_OR.SHOPPINGCARTPAGE_CARTTOTAL_FLD)
    WebElement cartTotalFld;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_CARTTOTAL_WITHOUTTAX_FLD)
    WebElement cartTotalWithoutTaxFld;

    @FindBy(xpath = ShoppingCartPage_OR.SHOPPINGCARTPAGE_CARTTAX_FLD)
    WebElement cartTaxFld;

    @FindBy(css = ShoppingCartPage_OR.SHOPPINGCARTPAGE_CARTTAX_PRICE_FLD)
    WebElement cartTaxPriceFld;

    @FindBy(xpath = ShoppingCartPage_OR.SHOPPINGCARTPAGE_CARTGENERALTOTAL_FLD)
    WebElement cartGeneralTotalFld;

    @FindBy(xpath = ShoppingCartPage_OR.SHOPPINGCARTPAGE_CARTGENERAL_TOTALPRICE_FLD)
    WebElement cartGeneralTotalPriceFld;

    @FindBy(xpath = ShoppingCartPage_OR.SHOPPINGCARTPAGE_CHECKOUT_BTN)
    WebElement checkoutBtn;

    @FindBy(xpath = ShoppingCartPage_OR.SHOPPINGCARTPAGE_CONTINUESHOPPING_BTN)
    WebElement continueShoppingBtn;

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        driver.get("http://automationpractice.com/index.php?controller=order");
        PageFactory.initElements(driver, this);
    }
}
