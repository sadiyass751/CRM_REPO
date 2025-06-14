package Handlinglistbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fatcowapp {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("http://www.fatcowhosting.com/");
		WebElement rv = d.findElement(By.id("countrySelect"));
		Select s=new Select(rv);
		s.selectByValue("AUD");
		
	
	}

}
