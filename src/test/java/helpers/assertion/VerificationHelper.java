package helpers.assertion;

import helpers.logger.LoggerHelper;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerificationHelper {
	private WebDriver driver;
	private static Logger log;

	static {
		try {
			log = (Logger) LoggerHelper.getLogger();
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}

	public VerificationHelper(WebDriver driver) throws ClassNotFoundException {
		this.driver = driver;
	}

	/**
	 * This method is used to check whether element is displayed *
	 * @param element
	 * @return
	 */
	public static boolean isDispalyed(WebElement element) {
		WebDriver driver = new ChromeDriver();
		String xpathExpression = "//xxxx";
		try {
			driver.findElement(By.xpath(xpathExpression));
			log.info(element.getText() + " is dispalyed");
			return true;
			}
			catch(Exception ex){
				log.error("Element not found " + ex.getCause());
			}
			return false;
	}

	/**
	 * This method is used to verify that element is not displayed *
	 *
	 * @param element
	 * @return
	 */
	public boolean isNotDisplayed(WebElement element) {
		String xpathExpression = "//xxxx";
		try {
			driver.findElement(By.xpath(xpathExpression));
			log.info(element.getText() + " is not present");
			return false;
		}
		catch(Exception ex) {
			log.error("Element not found " + ex.getCause());
			return true;
		}
	}

	/**
	 * This method will get the text of an Webelement
	 *
	 * @param element
	 * @return
	 */

	public static synchronized boolean verifyTextEquals (WebElement element, String expectedText){
		boolean flag = false;
		try {
			String actualText = element.getText();
			if (actualText.equals(expectedText)) {
				log.info("actualText is :" + actualText + " expected text is: " + expectedText);
				return flag = true;
			} else {
				log.error("actualText is :" + actualText + " expected text is: " + expectedText);
				return flag;
			}
		} catch (Exception ex) {
			log.error("actualText is :" + element.getText() + " expected text is: " + expectedText);
			log.info("text not matching" + ex);
			return flag;
		}
	}

	/**
	 * This metthod returns the webpage title
	 *
	 * @return
	 */

	public String getTitle () {
		log.info("Getting the webpage title");
		return driver.getTitle();

	}

}
