package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends  BasePage{

    WebDriver driver;

    @FindBy(css = ".icon-home")
    WebElement homeIcn;

    @FindBy(css = ".navigation-pipe")
    WebElement navigationPipe;

    @FindBy(css = ".navigation_page")
//    @FindBy(xpath = "//*[text() = 'Your shopping cart']")
    WebElement YourShoppingCartTab;

    @FindBy(css = ".page-heading")
    //*[@id="cart_title"][contains(text(), 'Shopping-cart summary')]
    WebElement shoppingCartTitle;

    @FindBy(xpath = "//*[@class='heading-counter']")
    WebElement cartHeadingCounter;

    @FindBy(xpath = "//*[@id='summary_products_quantity']")
    WebElement addedProductsCounter;

    @FindBy(css = "#order_step")
    WebElement orderStepsLine;

    @FindBy(css = ".step_current.first")
//    @FindBy(xpath = "//*[@id=\"order_step\"]/li[1]/span[contains(text(), 'Summary')]")
    WebElement summaryStep;

    @FindBy(css = ".step_todo.second")
//    @FindBy(xpath = "//*[@id=\"order_step\"]/li[2]/span[contains(text(), 'Sign in')]")
    WebElement signInStep;

    @FindBy(css = ".step_todo.third")
//    @FindBy(xpath = "//*[@id=\"order_step\"]/li[3]/span[contains(text(), 'Address')]")
    WebElement addressStep;

    @FindBy(css = ".step_todo.four")
//    @FindBy(xpath = "//*[@id=\"order_step\"]/li[4]/span[contains(text(), 'Shipping')]")
    WebElement shippingStep;

    @FindBy(css = "#step_end")
//    @FindBy(xpath = "//*[@id=\"order_step\"]/li[5]/span[contains(text(), 'Payment')]")
    WebElement paymentStep;

    @FindBy(css = ".alert.alert-warning")
    WebElement emptyCartWarning;

    @FindBy(xpath = "//*[@id='cart_summary']")
    WebElement itemsTableBorder;

    @FindBy(css = ".cart_product.first_item")
    WebElement productTabItemsTableBorder;

    @FindBy(css = ".cart_description.item")
    WebElement descriptionTabItemsTableBorder;

    @FindBy(css = ".cart_avail.item")
    WebElement availTabItemsTableBorder;

    @FindBy(css = ".cart_unit.item")
    WebElement unitPriceTabItemsTableBorder;

    @FindBy(css = ".cart_quantity.item")
    WebElement quantityTabItemsTableBorder;

    @FindBy(css = ".cart_total.item")
    WebElement totalTabItemsTableBorder;

    @FindBy(css = "td.cart_product>a>img")
    WebElement cartItemImg;

    @FindBy(css = "td.cart_description")
    WebElement cartItemDescription;

    @FindBy(css = ".label.label-success")
    WebElement cartItemAvailLabel;

    @FindBy(css = "td.cart_unit")
    WebElement cartItemUnitPrice;

    @FindBy(css = ".cart_quantity.text-center")
    WebElement cartItemsQuantityManager;

    @FindBy(css = ".cart_quantity_input.form-control")
    WebElement cartItemsQuantityInput;

    @FindBy(css = ".cart_quantity_button.clearfix")
    WebElement cartItemsQuantityBtns;

    @FindBy(css = "td.cart_total")
    WebElement cartItemsQuantityTotal;

    @FindBy(css = ".cart_delete.text-center")
    WebElement cartItemsDeleteBtn;

    @FindBy(xpath = "//td[contains(text(), 'Total products')]")
    WebElement cartTotalProductsFld;

    @FindBy(css = "#total_product")
    WebElement cartTotalProductsPriceFld;

    @FindBy(xpath = "//td[contains(text(), 'Total shipping')]")
    WebElement cartTotalShippingFld;

    @FindBy(css = "#total_shipping")
    WebElement cartTotalShippingPriceFld;

    @FindBy(xpath = "//*//td[(text()= 'Total')]")
    WebElement cartTotalFld;

    @FindBy(css = "#total_price_without_tax")
    WebElement cartTotalWithoutTaxFld;

    @FindBy(xpath = "//*[@class='cart_total_tax']/td[contains(text(), 'Tax')]")
    WebElement cartTaxFld;

    @FindBy(css = "#total_tax")
    WebElement cartTaxPriceFld;

    @FindBy(xpath = "//*/td/span[(text()= 'Total')]")
    WebElement cartGeneralTotalFld;

    @FindBy(xpath = "//*[@id='total_price_container']")
    WebElement cartGeneralTotalPriceFld;

    @FindBy(xpath = "//a[text()='Proceed to checkout']")
    WebElement checkoutBtn;

    @FindBy(xpath = "//a[@title='Continue shopping']")
    WebElement continueShoppingBtn;

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        driver.get("http://automationpractice.com/index.php?controller=order");
        PageFactory.initElements(driver, this);
    }
}
