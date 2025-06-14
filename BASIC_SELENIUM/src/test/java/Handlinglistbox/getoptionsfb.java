package Handlinglistbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getoptionsfb {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.findElement(By.linkText("Create new account")).click();
		WebElement y = d.findElement(By.id("year"));
		Select s=new Select(y);
		List<WebElement> list = s.getOptions();
		int c=list.size();
		System.out.println("list of years present: "+c);

	}

}
