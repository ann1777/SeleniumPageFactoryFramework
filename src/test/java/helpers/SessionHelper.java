package helpers;

import helpers.browserConfig.PropertyReader;
import org.openqa.selenium.WebDriver;


public class SessionHelper {
    private WebDriver driver;

    public SessionHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void login() {
        driver.navigate().to(PropertyReader.config.getProperty("website_host")+"controller=authentication&back=my-account");
    }
}
