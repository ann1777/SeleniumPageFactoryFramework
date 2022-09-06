package helpers.logger;

import org.apache.log4j.Logger;

public class LoggerHelper {
	private final static Logger LOGGER =  LoggerHelper.getLogger();

	public static Logger getLogger() {
		final Throwable t = new Throwable();
		t.fillInStackTrace();
		final String fullClassName = t.getStackTrace()[1].getClassName(); // get info on calling entity
		return Logger.getLogger(fullClassName);
	}
}