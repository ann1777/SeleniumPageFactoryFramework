package helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class NavigationHelper extends HelperBase {

    WebDriver driver;
    public NavigationHelper(WebDriver driver) {
        super(driver);
    }

    public void gotoMainPage() {
        click(By.cssSelector(".icon-home"));
    }

    public void gotoSignInPage() {
        click(By.cssSelector(".login"));
    }

    public void gotoContactPage() {
        click(By.cssSelector("#contact-link"));
    }


}
