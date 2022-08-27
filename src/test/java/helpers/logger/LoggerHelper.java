package helpers.logger;

import helper.resource.ResourceHelper;
import io.cucumber.core.logging.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoggerHelper {

	private static boolean root = false;

	/**
     * @param cls
     * @return
     */
	public static Logger getLogger(@SuppressWarnings("rawtypes") Class cls) {
		if (root) {
			return Logger.getLogger(cls);
		}
		PropertyConfigurator
				.configure(ResourceHelper.getResourcePath("\\src\\main\\resources\\configFile\\log4j.properties"));
		root = true;
		return Logger.getLogger(cls);
	}

}