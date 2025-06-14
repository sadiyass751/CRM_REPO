package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=713930225169&hvpos=&hvnetw=g&hvrand=4600999811072873382&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007744&hvtargid=kwd-64107830&hydadcr=14452_2402225&gad_source=1");	
		
		//sign
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		
		
		//create
		driver.findElement(By.id("createAccountSubmit")).click();
		
		
		//name
		driver.findElement(By.id("ap_customer_name")).sendKeys("abc");
		
		
		//number
	
		driver.findElement(By.id("ap_phone_number")).sendKeys("7632318211");
		
		
		//password
		driver.findElement(By.id("ap_password")).sendKeys("abc734d");
				
		
		//verify
		driver.findElement(By.id("continue")).click();
		
		
		driver.close();
	}

}
