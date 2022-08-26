package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{
    public WebDriver driver;

    @FindBy(id = "slider_row")
    WebElement homepageSliderRow;

    @FindBy(css = "#homepage-slider")
    WebElement homepageSlider;

    @FindBy(css = "a.bx-prev")
    WebElement homepageSliderLeftArrow;

    @FindBy(css = ".a.bx-next")
    WebElement homepageSliderRightArrow;

    @FindBy(css = "#htmlcontent_top")
    WebElement homepageHTMLContent;

    @FindBy(css = "#home-page-tabs>li>a.homefeatured")
//    @FindBy(xpath = "//*[text() = 'Popular']")
//    @FindBy(xpath = "//*[@id=\"home-page-tabs\"]//a[@class='homefeatured']")
    WebElement homepagePopularBtn;

    @FindBy(css = "#home-page-tabs>li>a.blockbestsellers")
//    @FindBy(xpath = "//*[text() = 'Best Sellers']")
//    @FindBy(xpath = "//*[@id="home-page-tabs"]//a[@class='blockbestsellers']']")
    WebElement homepageBestsellersBtn;

    @FindBy(xpath = "//*[@id = 'homefeatured']")
    WebElement productsContainer;

    @FindBy(xpath = "//*[@class = 'product-container']")
    WebElement product1Container;

    @FindBy(xpath = "//*[@class = 'product-container']/div[@class='left-block']")
    WebElement itemPhoto;

    @FindBy(css = ".icon-eye-open") //need first of type
    WebElement itemPreviewIcon;

    @FindBy(xpath = "//*[@class = 'product-container']//a[@class='product-name']")
    WebElement itemName;

    @FindBy(xpath = "//*[@class=\"content_price\"]/span[@class='price.product-price']")
    WebElement itemPrice;

    @FindBy(xpath = "//*[@title='Add to cart']") //need first of type
    WebElement addToCartBtn;

    @FindBy(xpath = "//*[text()='More']") //need first of type
    WebElement moreBtn;

    @FindBy(css = "#facebook_block")
    WebElement followUsOnFacebookBlock;

    @FindBy(css = "#cmsinfo_block")
    WebElement infoBlock;

    @FindBy(xpath = "//*[text()='Custom Block']")
    WebElement customBlock;

    @FindBy(xpath = "//*[@title='Automation Practice Website']")
    WebElement siteTitle;

    public HomePage(WebDriver driver) {
        super();
        PageFactory.initElements(driver, this);
        this.driver = driver;
        driver.get("https://automationpractice.com/index.php");
    }
}
