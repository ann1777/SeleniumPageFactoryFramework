package helpers.browserConfig;

import helpers.browserConfiguration.BrowserType;
import helpers.resource.ResourceHelper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader implements ConfigReader {

	private static FileInputStream file;
	public static Properties OR;

	public PropertyReader() throws IOException {

		file = new FileInputStream(
				new File(ResourceHelper.getResourcePath("src/test/resources/configfiles/config.properties")));
		OR = new Properties();
		OR.load(file);

	}

	public int getImplicitWait() {
		return Integer.parseInt(OR.getProperty("IMPLICITWAIT"));
	}

	public int getExplicitWait() {
		return Integer.parseInt(OR.getProperty("EXPLICITWAIT"));
	}

	public int getPageLoadTimeOut() {
		return Integer.parseInt(OR.getProperty("PAGELOADTIMEOUT"));
	}

	public BrowserType getBrowserType() { return BrowserType.valueOf(OR.getProperty("BROWSERTYPE")); }

	public String getUrl() {
		return OR.getProperty("applicationURL");
	}

	public String getUserReviews() {
		return OR.getProperty("userReviews");
	}

	public String getName() {
		return OR.getProperty("name");
	}

	public String getEmail() {
		return OR.getProperty("email");
	}

}
