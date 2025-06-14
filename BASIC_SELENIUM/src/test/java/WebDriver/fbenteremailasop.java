package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbenteremailasop {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		
		WebElement ele = d.findElement(By.id("email"));
		ele.sendKeys("abc@gmail.com");
		String s=ele.getAttribute("value");
		System.out.println(s);
		d.close();
	}

}
