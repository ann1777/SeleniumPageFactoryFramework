package helpers.browserConfig;

import helpers.resource.ResourceHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public abstract class PropertyReader implements ConfigReader {

	private static FileInputStream file;
	public static Properties OR;

	public PropertyReader() throws IOException {

		file = new FileInputStream(
				new Map<String, String>(ResourceHelper.getResourcePath("src/test/resources/configfiles/driver-config.properties")) {
					@Override
					public int size() {
						return this.size();
					}

					@Override
					public boolean isEmpty() {
						if(this.size() == 0) return true;
						return false;
					}

					@Override
					public boolean containsKey(Object key) {
						if(this.keySet().contains(key)) return true;
						return false;
					}

					@Override
					public boolean containsValue(Object value) {
						if(this.containsValue(value)) return true;
						return false;
					}

					@Override
					public String get(Object key) {
						Arrays.stream(this.keySet().toArray()).iterator();
						return (String) key;
					}

//					@Nullable
//					@Override
//					public String put(String key, String value)
//
//						return new Map<>;
//					}
//
//					@Override
//					public String remove(Object key) {
//						return null;
//					}
//
//					@Override
//					public void putAll(@NotNull Map<? extends String, ? extends String> m) {
//
//					}
//
//					@Override
//					public void clear() {
//
//					}
//
//					@NotNull
//					@Override
//					public Set<String> keySet() {
//						return null;
//					}
//
//					@NotNull
//					@Override
//					public Collection<String> values() {
//						return null;
//					}
//
//					@NotNull
//					@Override
//					public Set<Entry<String, String>> entrySet() {
//						return null;
//					}
//
//					@NotNull
//					@Override
//					public Object[] toArray() {
//						return new Object[new Properties];
//					}
				});
		OR = new Properties();
		OR.load(file);

	}

	public int getImplicitWait() {
		List<String> implicitWait = List.of(OR.getProperty("implicit_wait"));
		return Integer.parseInt(String.valueOf(implicitWait));
	}

	public String getExplicitWait() {
		List<String> explicitWait = List.of(OR.getProperty("explicit_wait"));
		return String.valueOf(explicitWait);
	}

	public int getPageLoadTimeOut() {
		List<String> loadTimeOut = List.of(OR.getProperty("load_timeout_sec"));
		return Integer.parseInt(String.valueOf(loadTimeOut));
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
