package locators;

import objectRepository.SitemapPage_OR;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

public class SitemapPageLocators extends BasePageLocators {
    public WebDriver driver;

    @FindBy(css = SitemapPage_OR.HOME_ICN)
    WebElement homeIcn;

    @FindBy(css = SitemapPage_OR.NAVIGATION_PIPE)
    WebElement navigationPipe;

    @FindBy(css = SitemapPage_OR.NAVIGATION_TAB)
    WebElement navigationTab;

    @FindBy(xpath = SitemapPage_OR.SITEMAP_PAGE_TITLE)
    WebElement priceDropTitle;

    @FindBy(xpath = SitemapPage_OR.PAGE_RIGHT_BLOCK_TOP_SELLERS_TITLE)
    WebElement TopSellersRightBlockTitle;

    public SitemapPageLocators(WebDriver driver) {
        super();
        this.driver = driver;
        driver.get("http://automationpractice.com/index.php?controller=sitemap");
        PageFactory.initElements((ElementLocatorFactory) driver, this);
    }

    public SitemapPageLocators() {

    }
}
