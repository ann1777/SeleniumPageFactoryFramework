package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

public class FacebookPageLocators {

    public WebDriver driver;
    public String faceBookLink = "https://www.facebook.com/groups/525066904174158/";


    @FindBy(xpath = "//h1//a[text()='Selenium Framework']")
    public WebElement pageTitle;

    public FacebookPageLocators(WebDriver driver) {
        this.driver = driver;
        driver.get(faceBookLink);
        PageFactory.initElements((ElementLocatorFactory) driver, this);
    }
    public FacebookPageLocators() {
    }

}
