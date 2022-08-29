package helpers.logger;

import org.openqa.selenium.WebDriver;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LoggerHelper {
	private final static Logger LOGGER =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	public static org.testng.log4testng.Logger getLogger(WebDriver assertionHelperClass) {
		return this.sampleLog();
	}

	public LoggerHelper sampleLog()
	{
		LOGGER.log(Level.WARNING, "WARNING");
		return null;
	}
	public static void main(String[] args)
	{
		LoggerHelper obj = new LoggerHelper();
		obj.sampleLog();
		LogManager slg = LogManager.getLogManager();
		Logger log = slg.getLogger(Logger.GLOBAL_LOGGER_NAME);
		log.log(Level.WARNING, "WARNING");
	}

	public void info(String alert_object_is_initialized) {
	}
}