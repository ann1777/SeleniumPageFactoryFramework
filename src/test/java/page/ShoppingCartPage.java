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
    WebElement shoppingCartTitle;

    @FindBy(css = "#order_step")
    WebElement orderStepsLine;

    @FindBy(css = ".step_current.first")
    WebElement summaryStep;

    @FindBy(css = ".step_todo.second")
    WebElement signInStep;

    @FindBy(css = ".step_todo.third")
    WebElement addressStep;

    @FindBy(css = ".step_todo.four")
    WebElement shippingStep;

    @FindBy(css = "#step_end")
    WebElement paymentStep;

    @FindBy(css = ".alert.alert-warning")
    WebElement emptyCartWarning;

    //add shopping table locators



    public ShoppingCartPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        driver.get("http://automationpractice.com/index.php?controller=order");
        PageFactory.initElements(driver, this);
    }
}
