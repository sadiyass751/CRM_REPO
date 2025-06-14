package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb2copypastetopassword {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		
		 WebElement ele = d.findElement(By.xpath("//input[@id='email']"));
		ele.sendKeys("abc@gmail.com");
		ele.sendKeys(Keys.COMMAND+"a");
		ele.sendKeys(Keys.COMMAND+"c");
		ele.sendKeys(Keys.TAB+""+Keys.COMMAND+"v");
	}

}
