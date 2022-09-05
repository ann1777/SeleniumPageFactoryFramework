package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TwitterPage extends BaseTest {
    public TwitterPage(WebDriver driver) {
        super(driver);
        driver.get("https://twitter.com/seleniumfrmwrk");
    }

    public static WebElement findElement(By xpath) {

        return new WebElement(driver) {
            @Override
            public void click() {

            }

            @Override
            public String getText() {
                return this.toString();
            }

            @Override
            public WebElement findElement(By xpath) {
                WebElement l = driver.findElement(By.xpath(""));
                return (l);
            }
        };
    }
}
