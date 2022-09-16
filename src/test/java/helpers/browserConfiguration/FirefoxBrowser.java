package helpers.browserConfiguration;

import helpers.resource.ResourceHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FirefoxBrowser {

	public static FirefoxOptions getFirefoxOptions() {

		DesiredCapabilities firefox = new DesiredCapabilities();
		FirefoxProfile profile = new FirefoxProfile();
		profile.setAcceptUntrustedCertificates(true);
		profile.setAssumeUntrustedCertificateIssuer(true);
		firefox.setCapability(String.valueOf(FirefoxDriver.class), profile);
		firefox.setCapability("marionette", true);

		FirefoxOptions firefoxOptions = new FirefoxOptions();
		// Linux
		if (System.getProperty("os.name").contains("Linux")) {
			firefoxOptions.addArguments("--headless", "windows-size=1024,768", "--no-sandbox");
		}
		return firefoxOptions;

	}

	public static WebDriver getFirefoxDriver() {
		if (System.getProperty("os.name").contains("mac")) {
			System.setProperty("webdriver.gecko.driver",
					ResourceHelper.getResourcePath("src/test/resources/drivers/geckodriver"));
			return new FirefoxDriver();
		} else if (System.getProperty("os.name").contains("Window")) {
			System.setProperty("webdriver.gecko.driver",
					ResourceHelper.getResourcePath("src/test/resources/drivers/geckodriver.exe"));
			return new FirefoxDriver();
		} else if (System.getProperty("os.name").contains("Linux")) {
			System.setProperty("webdriver.gecko.driver",
					ResourceHelper.getResourcePath("src/test/resources/drivers/geckodriver.exe"));
			return new FirefoxDriver();
		}
		return null;
	}
}
