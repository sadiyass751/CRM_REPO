package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		By un = By.id("email");
		WebElement ele = driver.findElement(un);
		ele.sendKeys("abc@gmail.com");
		
		
		By pwd = By.id("pass");
		WebElement ele1 = driver.findElement(pwd);
		ele1.sendKeys("abc");
		
		By login = By.tagName("button");
		WebElement ele3 = driver.findElement(login);
		ele3.click();
	}
}
