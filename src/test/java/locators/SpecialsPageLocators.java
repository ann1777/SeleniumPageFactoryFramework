package locators;

import objectRepository.SpecialsPage_OR;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

public class SpecialsPageLocators extends BasePageLocators{
    WebDriver driver;

    @FindBy(css = SpecialsPage_OR.SPECIALS_HOME_ICN)
    public WebElement homeIcn;

    @FindBy(css = SpecialsPage_OR.SPECIALS_NAVIGATION_PIPE)
    public WebElement navigationPipe;

    @FindBy(css = SpecialsPage_OR.SPECIALS_PRICE_DROP_TAB)
    public WebElement navigationTab;

    @FindBy(css = SpecialsPage_OR.SPECIALS_PRICE_DROP_TITLE)
    public WebElement pageTitle;

    @FindBy(css = SpecialsPage_OR.SPECIALS_RIGHT_BLOCK_TOP_SELLERS_TITLE)
    public WebElement TopSellersTitle;

    public SpecialsPageLocators(WebDriver driver) {
        super(driver);
        this.driver = driver;
        driver.get("http://automationpractice.com/index.php?controller=prices-drop");
        PageFactory.initElements((ElementLocatorFactory) driver, this);
    }
    public SpecialsPageLocators() {

    }
}
