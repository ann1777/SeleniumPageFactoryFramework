package helpers;

import helpers.alert.AlertHelper;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class HelperBase {
    private boolean acceptNextAlert = true;
    protected WebDriver driver;

    public HelperBase() {

        this.driver = new ChromeDriver(); }

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

    public boolean isElementPresent(By locator) throws InterruptedException {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
            wait.until(ExpectedConditions.presenceOfElementLocated((locator)));
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean isAlertPresent() {
        try {
            if (AlertHelper.getAlert() != null) {
                driver.switchTo().activeElement();
                return true;
            }
            return false;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

     public String closeAlertAndGetItsText() {
        try {
            Alert alert = (Alert) driver.switchTo().activeElement();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dimiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
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
