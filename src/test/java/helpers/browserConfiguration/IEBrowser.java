package helpers.browserConfiguration;

import helpers.resource.ResourceHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.ElementScrollBehavior;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IEBrowser {

	public InternetExplorerOptions getInternetExplorerCapabilities() {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(InternetExplorerDriver.ELEMENT_SCROLL_BEHAVIOR, ElementScrollBehavior.BOTTOM);
		cap.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
		cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		cap.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		cap.setJavascriptEnabled(true);
		InternetExplorerOptions internetExplorerOptions = new InternetExplorerOptions(cap);
		return internetExplorerOptions;
	}

	public static WebDriver getExplorerDriver() {
		System.setProperty("webdriver.ie.driver",
				ResourceHelper.getResourcePath("src/test/resources/drivers/geckodriver"));
		return new InternetExplorerDriver();
	}

}
