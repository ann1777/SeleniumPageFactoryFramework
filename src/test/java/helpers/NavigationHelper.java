package helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class NavigationHelper extends HelperBase {

    WebDriver driver;
    public NavigationHelper(WebDriver driver) {
        super(driver);
    }

    public void gotoMainPage() { click(By.xpath("//*[@class='icon-home']"));
    }

    public void gotoSignInPage() {
        click(By.xpath("//*[@class='login']"));
    }

    public void gotoContactPage() {
        click(By.xpath("//*[@id='contact-link']"));
    }
}
