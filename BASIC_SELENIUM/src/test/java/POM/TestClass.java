package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		FB f=new FB(driver);
		f.enteruname("sfx@hh.com");
		f.enterpwd("hjbh");
		f.clickloginbtn();
	}

}
