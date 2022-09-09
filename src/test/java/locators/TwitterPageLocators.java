package locators;

import org.jetbrains.annotations.NotNull;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TwitterPageLocators {
    public static WebDriver driver;
    public String pageTitle;
    public TwitterPageLocators(@NotNull WebDriver driver) {
        this.driver = driver;
        driver.get("https://twitter.com/seleniumfrmwrk");
        Assert.assertNotNull(driver.findElement(By.xpath("//*[@aria-label='Twitter']")));
    }
}
