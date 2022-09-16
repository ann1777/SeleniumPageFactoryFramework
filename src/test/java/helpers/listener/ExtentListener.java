package helpers.listener;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import helpers.logger.LoggerHelper;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.log4testng.Logger;

public class ExtentListener implements ITestListener {

	private Logger log = LoggerHelper.getLogger();
	public static ExtentReports extent;
	public static ExtentTest test;
	public ExtentListener() throws ClassNotFoundException {
	}

	public void onFinish(ITestContext arg0) {

		Reporter.log(arg0.getName() + " this test finished");
		long endTime = System.currentTimeMillis();
		log.info(arg0.getName() + " this test finished"+ endTime);
	}

	public void onStart(ITestContext arg0) {

		Reporter.log(arg0.getCurrentXmlTest().getName() + " this test started");
		long startTime = System.currentTimeMillis();
		log.info(arg0.getCurrentXmlTest().getName() + " this test started"+ startTime);
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {

		Reporter.log(arg0.getMethod().getMethodName() + " this test started");
		System.out.println("Test failed but it is in defined success ratio " + arg0.getMethod().getMethodName());
	}

	public void onTestFailure(ITestResult arg0) {

		Reporter.log(arg0.getMethod().getMethodName() + " this test failed " + arg0.getThrowable());
		log.error(arg0.getMethod().getMethodName() + " this test failed " + arg0.getThrowable());
	}

	public void onTestSkipped(ITestResult arg0) {

		Reporter.log(arg0.getMethod().getMethodName() + " this test skipped " + arg0.getThrowable());
		log.warn(arg0.getMethod().getMethodName() + " this test skipped " + arg0.getThrowable());
	}

	public void onTestStart(ITestResult arg0) {

		Reporter.log(arg0.getMethod().getMethodName() + " this test started");
		log.info(arg0.getMethod().getMethodName() + " this test started");
	}

	public void onTestSuccess(ITestResult arg0) {

		Reporter.log(arg0.getMethod().getMethodName() + " this test passed");
		log.info(arg0.getMethod().getMethodName() + " this test passed");

	}

}
