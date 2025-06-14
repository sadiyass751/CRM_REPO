package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WorkingWithIretryAnalyzer {

	@Test(retryAnalyzer = listnerUtility.RetryAnalyzerImplemetation.class)
	public void test() {
		System.out.println("test");
		Assert.assertEquals("hdfc", "hfdc");
	}

}
