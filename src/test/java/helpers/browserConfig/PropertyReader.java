package helpers.browserConfig;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public abstract class PropertyReader implements ConfigReader {

	private static FileInputStream file;
	public static Properties config;

	public Properties PropertyReader() throws IOException {

		PropertyReader instance = new PropertyReader() {
			@Contract(pure = true)
			@Override
			public @Nullable Object reader() {
				return file;
			}
		};

		file = new FileInputStream<Map<String, List<String>> config = (Properties) instance.reader();
		return config;
	}

	public List<String> getBrowserType() {
		final List<String> browserType = Collections.singletonList(config.getProperty("browser_type"));
		return browserType; }

	public List<String> getBaseUrl() {
		final List<String> baseUrl = Collections.singletonList(config.getProperty("website_host"));
		return baseUrl; }

	public List<String> getName() {
		final List<String> userNamePref = Collections.singletonList(config.getProperty("user_name_pref"));
		return userNamePref; }

	public List<String> getEmail() {
		final List<String> userEmailSuf = Collections.singletonList(config.getProperty("email_suf"));
		return userEmailSuf; }

	public List<String> getBrowserBinary() {
		final List<String> chromeExe = Collections.singletonList(config.getProperty("chrome_binary"));
		return chromeExe; }

	public List<String> getImplicitWait() {
		final List<String> implicitWait = Collections.singletonList(config.getProperty("implicit_wait"));
		return implicitWait; }

	public List<String> getExplicitWait() {
		final List<String> explicitWait = Collections.singletonList(config.getProperty("explicit_wait"));
		return explicitWait; }

	public List<String> getPageLoadTimeOut() {
		final List<String> loadTimeOut = Collections.singletonList(config.getProperty("load_timeout_sec"));
		return loadTimeOut; }
	}

