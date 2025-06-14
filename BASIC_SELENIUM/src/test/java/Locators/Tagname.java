package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=906780981585933440&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007809&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
		By s=By.id("twotabsearchtextbox");
		WebElement ele = driver.findElement(s);
		ele.sendKeys("iphone");
		
		By s1=By.id("nav-search-submit-button");
		WebElement ele1 = driver.findElement(s1);
		ele1.click();
		
		driver.close();
	}

}
