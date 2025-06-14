package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb1firstname {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		
		d.findElement(By.xpath("//a[contains(@id,'u_0_0_')]")).click();
		
		WebElement ele = d.findElement(By.xpath("//input[@name=\"firstname\"]"));
		ele.sendKeys("abjds");
		Thread.sleep(3000);
		ele.sendKeys(Keys.COMMAND+"a");
		Thread.sleep(3000);
		ele.sendKeys(Keys.BACK_SPACE);
		
		

	}

}
