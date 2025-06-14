package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionPractice {

	
	@Test
	public void tes() {
		SoftAssert sa=new SoftAssert();
		sa.assertEquals("hdfc", "hfc");
		
		System.out.println("next line");
		sa.assertAll();
	}
}
