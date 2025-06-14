package Handlinglistbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fbapproach3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.findElement(By.linkText("Create new account")).click();
		WebElement day = d.findElement(By.id("day"));
		Select s=new Select(day);
		s.selectByValue("30");
		
		Thread.sleep(2000);
		WebElement month = d.findElement(By.id("month"));
		Select s1=new Select(month);
		s1.selectByIndex(9);
		
		Thread.sleep(2000);
		WebElement year = d.findElement(By.id("year"));
		Select s2=new Select(year);
		s2.selectByVisibleText("2000");
		
		d.close();
	}

}
