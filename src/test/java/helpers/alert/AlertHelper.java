package helpers.alert;

//import helpers.logger.LoggerHelper;

import helpers.logger.LoggerHelper;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.apache.log4j.Logger;

public class AlertHelper {
	
	private WebDriver driver;
	private Logger log = LoggerHelper.getLogger();
	
	public AlertHelper(WebDriver driver) {
		this.driver=driver;	
		log.info("Alert object is initialized");
		log.debug("AlertHelper : " + this.driver.hashCode());
	}

	/**
	 * This method will allow switching to Alert
	 * @return
	 */
	public Alert getAlert() {
		log.info("Switching to Alert " +driver.switchTo().alert().getText());
		log.debug("");
		return driver.switchTo().alert();
	}
	
	public void acceptAlert() {
		getAlert().accept();
		log.info("Accept alert is done");
	}
	
	public void dismissAlert() {
		getAlert().dismiss();
		log.info("Dismiss alert is done");
	}
	
	public String getAlertText() {
		String text = getAlert().getText();
		log.info("Getting alert text: "+text);
		return text;
	}
	
	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			log.info("Alert is present");
			return true;
		}catch(NoAlertPresentException e) {
			log.info(String.valueOf(e.getCause()));
			return false;
		}
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
