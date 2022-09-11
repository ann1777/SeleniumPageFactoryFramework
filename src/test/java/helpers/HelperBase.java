package helpers;

import helpers.alert.AlertHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class HelperBase {
    private boolean acceptNextAlert = true;
    protected WebDriver driver = new ChromeDriver();

    public HelperBase() {
    }

    protected void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    protected void click(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.elementToBeClickable((locator)));
        driver.findElement(locator).click();
    }

    public boolean isElementPresent() {
        try {
            driver.findElement(By.xpath(""));
        } catch (NoSuchElementException e) {
            return false;
        }
        return true;
    }

    public boolean isAlertPresent() {
        try {
            if (AlertHelper.getAlert() != null) {
                return true;
            }
            return false;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void waitFor(int seconds) {
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
