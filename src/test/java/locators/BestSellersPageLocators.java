package locators;

import objectRepository.BestSellersPage_OR;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BestSellersPageLocators extends BasePageLocators{
    WebDriver driver;

    @FindBy(css = BestSellersPage_OR.BESTSELLERS_HOME_ICN)
    WebElement homeIcn;

    @FindBy(css = BestSellersPage_OR.BESTSELLERS_NAVIGATION_PIPE)
    WebElement navigationPips;

    @FindBy(css = BestSellersPage_OR.BESTSELLERS_NAVIGATION_TAB)
//    @FindBy(xpath = BestSellersPage_OR.BESTSELLERS_NAVIGATION_TAB)
    WebElement bestSellersTab;

    @FindBy(xpath = BestSellersPage_OR.PAGE_BESTSELLERS_TITLE)
    WebElement bestSellersTitle;

    @FindBy(xpath = BestSellersPage_OR.PAGE_RIGHT_BLOCK_TOP_SELLERS_TITLE)
    WebElement topSellersRightBlockTitle;


    public BestSellersPageLocators(WebDriver driver) {
        super(driver);
        this.driver = driver;
        driver.get("http://automationpractice.com/index.php?controller=best-sales");
        PageFactory.initElements(driver, this);
    }
    public BestSellersPageLocators() {
    }

}
