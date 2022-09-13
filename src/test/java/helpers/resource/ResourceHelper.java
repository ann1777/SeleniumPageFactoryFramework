package helpers.resource;

public class ResourceHelper {

	/**
	 * This method removed hard coded path
	 * @param path
	 * @return
	 */
	public static String getResourcePath(String path) {
		String basePath = System.getProperty("user.dir");		
		return basePath + "/" + path;
	}
	/**
	 * This method return cucumber reportConfigPath
	 * @param reportConfigPath
	 * @return
	 */
	public String getReportConfigPath() {
		String reportConfigPath = System.getProperty("reportConfigPath");
		if (reportConfigPath != null) return reportConfigPath;
		else
			throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
	}
}