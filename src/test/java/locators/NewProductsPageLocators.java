package locators;

import objectRepository.NewProductsPage_OR;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

public class NewProductsPageLocators extends BasePageLocators {
    public WebDriver driver;

    @FindBy(css = NewProductsPage_OR.NEW_PRODUCTS_HOME_ICN)
    WebElement homeIcn;

    @FindBy(css = NewProductsPage_OR.NEW_PRODUCTS_NAVIGATION_PIPE)
    WebElement navigationPipe;

    @FindBy(css = NewProductsPage_OR.NEW_PRODUCTS_NAVIGATION_TAB)
    WebElement navigationTab;

    @FindBy(xpath = NewProductsPage_OR.PAGE_NEW_PRODUCTS_TITLE)
    WebElement priceDropTitle;

    @FindBy(xpath = NewProductsPage_OR.PAGE_RIGHT_BLOCK_TOP_SELLERS_TITLE)
    WebElement TopSellersRightBlockTitle;

    public NewProductsPageLocators(WebDriver driver) {
        super();
        this.driver = driver;
        driver.get("http://automationpractice.com/index.php?controller=new-products");
        PageFactory.initElements((ElementLocatorFactory) driver, this);
    }

    public NewProductsPageLocators() {

    }
}
