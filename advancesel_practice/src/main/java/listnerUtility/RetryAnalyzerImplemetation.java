package listnerUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerImplemetation implements IRetryAnalyzer

{

	@Override
	public boolean retry(ITestResult result) {

		int count = 0;
		int limitcount = 2;

		if (count < limitcount) {
			count++;
			return true;
		}

		return false;
	}

} 
