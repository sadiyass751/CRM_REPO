package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	
	WebDriver d;
	
	@Test(priority = 2 ,invocationCount = 4 , threadPoolSize = 3)
	public void t1() {
	 Reporter.log("t1",true);
	}
	
	@Test(dependsOnMethods = "t3")
	public void t2() {
		d.get("https://abclst.blogspot.com/2017/01/sub-queries-with-answer.html");
		Reporter.log("t2",true);
	}
	
	@Test(priority = -3)
	public void t3() {
		 d=new ChromeDriver();
		Reporter.log("t3",true);
	}
	
	@Test(dependsOnMethods = {"t3","t2"})
	public void t4() {
		 d.findElement(By.linkText("QTP")).click();;
		Reporter.log("t3",true);
	}
}
