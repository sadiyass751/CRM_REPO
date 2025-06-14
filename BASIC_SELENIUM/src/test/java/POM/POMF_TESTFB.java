package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POMF_TESTFB {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		POMF_LOGIN pomfb=new POMF_LOGIN(driver);
		pomfb.loginfb("shajsab@hhas", "wdsxb23");
	}

}
