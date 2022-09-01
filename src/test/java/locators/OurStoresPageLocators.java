package locators;

import objectRepository.OurStoresPage_OR;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

public class OurStoresPageLocators extends BasePageLocators{
    WebDriver driver;

    @FindBy(css = OurStoresPage_OR.OUR_STORES_HOME_ICN)
    WebElement homeIcn;

    @FindBy(css = OurStoresPage_OR.OUR_STORES_NAVIGATION_PIPE)
    WebElement navigationPips;

    @FindBy(xpath = OurStoresPage_OR.OUR_STORES_NAVIGATION_TAB)
    WebElement authenticationTab;

    @FindBy(xpath = OurStoresPage_OR.PAGE_OUR_STORES_TITLE)
    WebElement forgotYourPasswordTab;

    @FindBy(css = OurStoresPage_OR.OUR_STORES_GOOGLE_MAP)
    WebElement googleMap;

    @FindBy(css = OurStoresPage_OR.ENTER_LOCATION_MAP_SUBTITLE)
    WebElement enterLocationMapSubtitle;

    @FindBy(xpath = OurStoresPage_OR.YOUR_LOCATION_MAP_SUBTITLE_LABEL)
    WebElement enterLocationMapSubtitleLab;

    @FindBy(xpath = OurStoresPage_OR.LOCATION_MAP_SUBTITLE_INPUT_FLD)
    WebElement locationMapSubtitleInputFld;

    @FindBy(css = OurStoresPage_OR.RADIUS_MAP_SUBTITLE_LABEL)
    WebElement locationMapSubtitleInputLabel;

    @FindBy(xpath = OurStoresPage_OR.MAP_SUBTITLE_RADIUS_DROPDOWN)
    WebElement mapSubtitleRadiusDropdown;

    @FindBy(xpath = OurStoresPage_OR.MAP_SUBTITLE_SEARCH_BTN)
    WebElement mapSubtitleSearchBtn;


    public OurStoresPageLocators(WebDriver driver) {
        super(driver);
        this.driver = driver;
        driver.get("http://automationpractice.com/index.php?controller=stores");
        PageFactory.initElements((ElementLocatorFactory) driver, this);
    }
    public OurStoresPageLocators() {
    }
}
