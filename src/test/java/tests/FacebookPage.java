package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

class FacebookPage {

    String faceBookLink = "https://www.facebook.com/groups/525066904174158/";

    FacebookPage(WebDriver driver)throws RuntimeException {
        driver.get(faceBookLink);
        PageFactory.initElements((ElementLocatorFactory) driver, this);
    }

    @FindBy(xpath = "//h1//a[text()='Selenium Framework']")
    WebElement pageTitle;
}
