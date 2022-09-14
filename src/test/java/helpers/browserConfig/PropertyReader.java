package helpers.browserConfig;

import helpers.resource.ResourceHelper;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public abstract class PropertyReader implements ConfigReader {

	private static FileInputStream file;
	public static Properties OR;

	public String PropertyReader() throws IOException {

		Map<String, String> properties = Map.of(
				"chrome_binary", "src/test/resources/drivers/chromedriver.exe",
				"load_timeout_sec", "50",
				"id", "qa",
				"website_host", "https://automationpractice.com/index.php",
				"user_name_pref", "user",
				"email_suf", "@gmail.com",
				"browser_type", "Chrome",
				"implicit_wait", "500",
				"explicit_wait", "visibilityOfElementLocated"
		);

		PropertyReader instance = new PropertyReader() {
			@Contract(pure = true)
			@Override
			public @Nullable Object reader(Object param) {
				return null;
			}
		};

		file = new FileInputStream(
				new Map<String, String> OR = (Properties) instance.reader(ResourceHelper.getResourcePath("src/test/resources/configfiles/driver-config.properties")) {
		};

		public String getImplicitWait() {
			List<String> implicitWait = List.of(OR.getProperty("implicit_wait"));
			return String.valueOf(implicitWait);
		}

		public String getExplicitWait() {
			List<String> explicitWait = List.of(OR.getProperty("explicit_wait"));
			return String.valueOf(explicitWait);
		}

		public String getPageLoadTimeOut() {
			List<String> loadTimeOut = List.of(OR.getProperty("load_timeout_sec"));
			return String.valueOf(loadTimeOut);
		}

		public String getBrowserType() {
			List<String> browserType = List.of(OR.getProperty("browser_type"));
			return String.valueOf(browserType); }

		public String getBaseUrl() {
			List<String> baseUrl = List.of(OR.getProperty("website_host"));
			return String.valueOf(baseUrl); }

		public String getName() {
			List<String> userName = List.of(OR.getProperty("user_name"));
			return String.valueOf(userName);
		}

		public String getEmail() {
			List<String> userEmail = List.of(OR.getProperty("user_email"));
			return String.valueOf(userEmail);
		}

		public String getBrowserBinary() {
			List<String> chromeExe = List.of(OR.getProperty("chrome_binary"));
			return String.valueOf(chromeExe);
		}
	}
}
