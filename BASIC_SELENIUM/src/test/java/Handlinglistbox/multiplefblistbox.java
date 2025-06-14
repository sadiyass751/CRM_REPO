package Handlinglistbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiplefblistbox {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.findElement(By.linkText("Create new account")).click();
		WebElement day = d.findElement(By.id("day"));
		Select s=new Select(day);
		boolean b = s.isMultiple();
		if(b) {
			System.out.println("date field is multiselectable");
		}else {
			System.out.println("date field is not multiselectable");
		}
	}

}
