package helpers.listener;

import helpers.logger.LoggerHelper;
import org.apache.log4j.Logger;
import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class RetryListener implements IAnnotationTransformer {

	private Logger log = (Logger) LoggerHelper.getLogger();

	public void transform(ITestAnnotation arg0, @SuppressWarnings("rawtypes") Class arg1,
			@SuppressWarnings("rawtypes") Constructor arg2, Method arg3) {
		Class<? extends IRetryAnalyzer> retry = arg0.getRetryAnalyzerClass();
		if (retry == null) {
			log.info("Listening to failed test case");
			arg0.setRetryAnalyzer(RetryHelper.class);
		}
	}

}
