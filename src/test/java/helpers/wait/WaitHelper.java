package helpers.wait;

import helpers.logger.LoggerHelper;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.log4testng.Logger;
import org.openqa.selenium.WebDriver;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;


public class WaitHelper {

	private WebDriver driver;
	private Logger log = (Logger) LoggerHelper.getLogger();
	private String baseUrl = "http://www.google.com";

	public WaitHelper(WebDriver driver) throws ClassNotFoundException {
		this.driver = driver;
	}

	/**
	 * This is implicit Wait Method
	 */
	@BeforeMethod
	public void setImplicitWait(int i, TimeUnit unit) throws InterruptedException {
		log.info("setImplicitWait has been set to : " + i);
		WebDriverWait implicitlyWait = new WebDriverWait(driver, Duration.ofSeconds(i));
	}

	public void waitForElement( @NotNull WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(element));
		wait.until(ExpectedConditions.alertIsPresent());
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));

	}

	/**
	 * This will generate WebDriverWait object
	 * @param TimeOutInSeconds
	 * @param pollingInEveryMilliseconds
	 * @return
	 */
	private WebDriverWait getWait(int TimeOutInSeconds, int pollingInEveryMilliseconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
		wait.pollingEvery(Duration.ofMillis(pollingInEveryMilliseconds));
		wait.ignoring(NoSuchElementException.class);
		wait.ignoring(ElementNotVisibleException.class);
		wait.ignoring(StaleElementReferenceException.class);
		wait.ignoring(NoSuchFrameException.class);
		return wait;

	}

	/**
	 * This method will wait for visibility of an element
	 * @param element
	 * @param timeOutInSeconds
	 * @param pollingEveryMilliSeconds
	 */
	public void waitForElementVisibleWithPollingTime(@NotNull WebElement element, int timeOutInSeconds,
													 int pollingEveryMilliSeconds) {
		log.info("Waiting for Element: " + element.toString() + "for: " + timeOutInSeconds + " seconds");
		WebDriverWait wait = getWait(timeOutInSeconds, pollingEveryMilliSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));
		log.info("Element is visible now");
	}

	/**
	 * This method will make sure element is clickable
	 * @param element
	 * @param timeOutInSeconds
	 * @param pollingEveryMilliSeconds
	 */
	public void waitForElementClickable(@NotNull WebElement element, int timeOutInSeconds, int pollingEveryMilliSeconds) {
		log.info("Waiting for Element: " + element.toString() + "for: " + timeOutInSeconds + " seconds");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
		wait.until(ExpectedConditions.elementToBeClickable((element)));
		log.info("Element is clickable now");
	}

	/**
	 * This method will make sure element is not present
	 * @param element
	 * @param timeOutInSeconds
	 * @param pollingEveryMilliSeconds
	 * @return
	 */
	public boolean waitForElementNotPresent(@NotNull WebElement element, int timeOutInSeconds, int pollingEveryMilliSeconds) {
		log.info("Waiting for Element: " + element.toString() + "for: " + timeOutInSeconds + " seconds");
		WebDriverWait wait = getWait(timeOutInSeconds, pollingEveryMilliSeconds);
		boolean status = wait.until(ExpectedConditions.invisibilityOf((element)));
		log.info("Element is invisible now");
		return status;
	}

	/**
	 * This method will make sure frame is available and switched to
	 * @param element
	 * @param timeOutInSeconds
	 * @param pollingEveryMilliSeconds
	 */
	public void frameToBeAvailableAndSwitchToIt(@NotNull WebElement element, int timeOutInSeconds,
												int pollingEveryMilliSeconds) {
		log.info("Waiting for Element: " + element.toString() + "for: " + timeOutInSeconds + " seconds");
		WebDriverWait wait = getWait(timeOutInSeconds, pollingEveryMilliSeconds);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt((element)));
		log.info("Frame is available and switched");
	}

	/**
	 * This method will give us fluent wait
	 * @param TimeOutInSeconds
	 * @param pollingInEveryMilliseconds
	 * @return
	 */
	private Wait<WebDriver> getFluentWait(int TimeOutInSeconds, int pollingInEveryMilliseconds) {
		Wait<WebDriver> fWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(TimeOutInSeconds))
				.pollingEvery(Duration.ofSeconds(pollingInEveryMilliseconds)).ignoring(NoSuchElementException.class);
		return fWait;
	}

	/**
	 * This method will check for element visibility
	 * @param element
	 * @param TimeOutInSeconds
	 * @param pollingInEveryMilliseconds
	 * @return
	 */
	public WebElement waitForElement(@NotNull WebElement element, int TimeOutInSeconds, int pollingInEveryMilliseconds) {
		log.info("Waiting for Element: " + element.toString() + "for: " + TimeOutInSeconds + " seconds");
		Wait<WebDriver> fWait = getFluentWait(TimeOutInSeconds, pollingInEveryMilliseconds);
		fWait.until(ExpectedConditions.visibilityOf((element)));
		log.info("Element is visible");
		return element;
	}
	
	public WebElement waitForElement(@NotNull WebElement element, int TimeOutInSeconds) {
		log.info("Waiting for Element: " + element.toString() + "for: " + TimeOutInSeconds + " seconds");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
		wait.until(ExpectedConditions.visibilityOf(element));
		log.info("Element is visible now");
		return element;
	}

	public void pageLoadTime(long timeOut, TimeUnit unit) {
		log.info("Waiting for page to load: " + timeOut + " seconds");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		log.info("Page is loaded");
	}
}
