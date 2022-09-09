package helpers.logger;

import org.testng.log4testng.Logger;

public class LoggerHelper {
	private Logger log = (Logger) LoggerHelper.getLogger();

	public LoggerHelper() throws ClassNotFoundException {
	}


	public static Logger getLogger() throws ClassNotFoundException {
		final Throwable t = new Throwable();
		t.fillInStackTrace();
		final String fullClassName = t.getStackTrace()[1].getClassName(); // get info on calling entity
		return Logger.getLogger(Class.forName(fullClassName));
	}
}