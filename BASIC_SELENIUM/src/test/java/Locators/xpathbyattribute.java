package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbyattribute {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=8066411329291620078&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061642&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Iphone");

		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		
	}

}
