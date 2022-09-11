package helpers;

import org.openqa.selenium.WebDriver;


public class SessionHelper {
    private WebDriver driver;

    public SessionHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void login() {
        driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

}
