package helpers.browserConfiguration;

import helpers.resource.ResourceHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeBrowser {

	public ChromeOptions getChromeOptions() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--test-type");
		option.addArguments("--disable-popup-blocking");
		DesiredCapabilities chrome = new DesiredCapabilities();
		chrome.setJavascriptEnabled(true);
		option.setCapability(ChromeOptions.CAPABILITY, option);

		// for linux Machine
		if (System.getProperty("os.name").contains("Linux")) {
			option.addArguments("--headless", "window-size=1024,768", "--no-sandbox");
		}
		return option;
	}

	public static WebDriver getChromeDriver() {
		if (System.getProperty("os.name").contains("mac")) {
			System.setProperty("webdriver.chrome.driver",
					ResourceHelper.getResourcePath("src/test/resources/drivers/chromedriver"));
			return new ChromeDriver();
		} else if (System.getProperty("os.name").contains("Window")) {
			System.setProperty("webdriver.chrome.driver",
					ResourceHelper.getResourcePath("src/test/resources/drivers/chromedriver"));
			return new ChromeDriver();
		} else if (System.getProperty("os.name").contains("Linux")) {
			System.setProperty("webdriver.chrome.driver",
					ResourceHelper.getResourcePath("src/test/resources/drivers/chromedriver"));
			return new ChromeDriver();
		}
		return null;
	}

}
