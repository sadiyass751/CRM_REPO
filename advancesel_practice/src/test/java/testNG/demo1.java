package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class demo1 {

	@Test(retryAnalyzer = listnerUtility.RetryAnalyzerImplemetation.class)
	public void test() {
		System.out.println("test");
		Assert.assertEquals("hdfc", "hfdc");
	}

}
