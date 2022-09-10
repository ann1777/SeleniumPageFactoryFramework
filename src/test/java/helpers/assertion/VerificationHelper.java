package helpers.assertion;

import helpers.logger.LoggerHelper;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
	public static boolean verifyIsPresent(WebElement element) {
		boolean isDispalyed = true;
		try {
			isDispalyed = element.isDisplayed();
			log.info(element.getText() + " is dispalyed");
			}
			catch(Exception ex){
				log.error("Element not found " + ex.getCause());
			}
			return isDispalyed;
	}

	/**
	 * This method is used to verify that element is not displayed *
	 *
	 * @param element
	 * @return
	 */
	public boolean verifyIsNotPresent(WebElement element) {
		boolean isDispalyed = false;
		try {
			element.isDisplayed();
			log.info(element.getText() + " is not dispalyed");
			}
		catch(Exception ex){
				log.error("Element not found " + ex.getCause());
				isDispalyed = false;
			}
			return isDispalyed;
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
