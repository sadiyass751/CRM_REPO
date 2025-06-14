package testNG;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WorkingWithTakingScreensshot {
	@Test
	public void takescreenshot() throws IOException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com/");
		
		Date date=new Date(); //Thu Jun 05 08:53:07 IST 2025
		String newD = date.toString().replace(" ", "_");
		System.out.println(newD);
	
		TakesScreenshot ts=(TakesScreenshot)d;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshots/demo_"+newD+".png");
		FileHandler.copy(src, dest);
		
	}
}
