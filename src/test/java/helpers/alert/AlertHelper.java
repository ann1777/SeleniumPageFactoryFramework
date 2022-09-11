package helpers.alert;

import helpers.logger.LoggerHelper;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertHelper {
	
	private WebDriver driver;
	private static Logger log;

	static {
		try {
			log = (Logger) LoggerHelper.getLogger();
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}

	public AlertHelper(WebDriver driver) throws ClassNotFoundException {
		this.driver=driver;	
		log.info("Alert object is initialized");
		log.debug("AlertHelper : " + this.driver.hashCode());
	}

	/**
	 * This method will allow switching to Alert
	 * @return
	 */
	public static Alert getAlert() {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		String alertText = alert.getText();
		log.info("Switching to Alert " + alertText);
		return alert;
	}
	
	public void acceptAlert() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();
		log.info("Accept alert is done");
	}
	
	public void dismissAlert() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		alert.dimiss();
		log.info("Dismiss alert is done");
	}
	
	public String getAlertText() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		String text = alert.getText();
		log.info("Getting alert text: "+text);
		return text;
	}
	
	public boolean isAlertPresent() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.alertIsPresent());
		log.info("Alert is present");
		return false;
	}
	
	public void acceptAlertIfPresent() {
		if(isAlertPresent()) {
			acceptAlert();
			log.info("Alert is present");
		}
		else {
			log.info("Alert is not present");
		}
	}
	
	public void dismissAlertIfPresent() {
		if(isAlertPresent()) {
			dismissAlert();
		}
		else {
			log.info("Alert is not present");
		}
	}
	
	public void acceptPrompt(String text) {
		if(isAlertPresent()) {
			Alert alert = getAlert();
			alert.getText();
			alert.accept();
			log.info("Alert is present and text has been written: "+text);
		}
	}
}
