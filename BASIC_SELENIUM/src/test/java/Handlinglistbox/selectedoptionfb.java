package Handlinglistbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectedoptionfb {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.findElement(By.linkText("Create new account")).click();
		WebElement ele = d.findElement(By.id("month"));
		
		Select s=new Select(ele);
		s.selectByValue("7");
		WebElement l = s.getFirstSelectedOption();
		System.out.println(l.getText());
		d.close();
	}

}
