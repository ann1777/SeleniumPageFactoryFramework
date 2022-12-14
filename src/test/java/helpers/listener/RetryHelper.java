package helpers.listener;

import helpers.logger.LoggerHelper;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.log4testng.Logger;

public class RetryHelper implements IRetryAnalyzer {

	private int retryCount = 0;
	private int maxRetryCount = 1;
	private Logger log = (Logger) LoggerHelper.getLogger();

	public RetryHelper() throws ClassNotFoundException {
	}

	/**
	 * This method is used for retrying failed test case
	 */
	public boolean retry(ITestResult arg0) {
		if (retryCount <= maxRetryCount) {
			log.info("retrying test case: " + arg0.getName() + " with status " + getResultStatusName(arg0.getStatus())
					+ " for the " + (retryCount + 1) + " times");
			retryCount++;
			return true;
		}
		return false;
	}

	public String getResultStatusName(int status) {
		String resultName = null;
		if (status == 1) {
			resultName = "SUCCESS";
		}
		if (status == 2) {
			resultName = "FAILURE";
		}
		if (status == 2) {
			resultName = "SKIP";
		}
		return resultName;
	}

}
