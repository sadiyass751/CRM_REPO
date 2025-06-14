package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class opt1_opt2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement un=driver.findElement(By.id("email"));
		un.sendKeys("abc@123");
		un.clear();
		un.sendKeys("xyz@12");
		
		driver.findElement(By.id("pass")).sendKeys("xasjk");
	}

}
