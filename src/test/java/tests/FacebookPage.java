package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

class FacebookPage extends BaseTest {

    FacebookPage fbPage = new FacebookPage();
    String faceBookLink = "https://www.facebook.com/groups/525066904174158/";
    FacebookPage() {
        super(driver);
        driver.get(faceBookLink);
//        return;
    }


    @FindBy(xpath = "//h1//a[text()='Selenium Framework']")
    WebElement pageTitle;
    String fbPageTitle = fbPage.pageTitle.getText();

    public FacebookPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements((ElementLocatorFactory) driver, this);
    }
}
