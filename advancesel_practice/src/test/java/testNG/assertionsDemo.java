package testNG;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assertionsDemo {
	@Test
	public void demo() {
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		String actualT = d.getTitle();
		String ExpexctedT = "Facebook";
		SoftAssert sa=new SoftAssert();
		//sa.assertEquals(actualT, ExpexctedT);
		
		// sa.assertNotEquals(actualT, ExpexctedT);
		// sa.assertTrue(actualT.contains(ExpexctedT));
		// sa.assertFalse(actualT.equals(ExpexctedT));
		// sa.assertNull(actualT);
		sa.assertNotNull(actualT);
		System.out.println("Next Line ");
		sa.assertAll();
		
		d.quit();
	}
	
	

}
