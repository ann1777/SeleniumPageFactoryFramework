package helpers.browserConfiguration;

import helpers.resource.ResourceHelper;
import org.jetbrains.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeBrowser {

	public static ChromeOptions getChromeOptions() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--test-type");
		option.addArguments("--disable-popup-blocking");
		DesiredCapabilities chrome = new DesiredCapabilities();
		option.setCapability(ChromeOptions.CAPABILITY, option);

		// for linux Machine
		if (System.getProperty("os.name").contains("Linux")) {
			option.addArguments("--headless", "window-size=1024,768", "--no-sandbox");
		}
		return option;
	}

	@Nullable
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
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");
            options.addArguments("--test-type");
            options.addArguments("--disable-extensions");
            options.addArguments("--ignore-certificate-errors");
            options.addArguments("--disable-popup-blocking");
            options.addArguments("--allow-running-insecure-content");
            options.addArguments("--disable-translate");
            options.addArguments("--always-authorize-plugins");
            options.addArguments("--disable-infobars");
            options.addArguments("--enable-automation");
			options.setExperimentalOption("useAutomationExtension", false);
			return new ChromeDriver();
		}
		return null;
	}
}
