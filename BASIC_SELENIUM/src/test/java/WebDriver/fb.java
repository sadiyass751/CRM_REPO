package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		
		d.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
		d.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("xyz");
		
		d.findElement(By.xpath("//button[contains(@id,'u_0_5_')]")).sendKeys(Keys.ENTER);


	}

}
