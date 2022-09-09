package helpers;
import org.openqa.selenium.*;
import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class HelperBase {
    private boolean acceptNextAlert = true;
    protected final WebDriver driver;

    public HelperBase() {
        this.driver = driver;
    }

    protected void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    protected void click(By locator) {
        driver.manage().wait(Duration.ofSeconds(5, TimeUnit.SECONDS));
        driver.findElement(locator).click();
    }

    public boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }

}
