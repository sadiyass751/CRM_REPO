package scripts;

import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class alphabeticorder {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.findElement(By.linkText("Create new account")).click();
		
		WebElement ele = d.findElement(By.id("month"));
		Select s=new Select(ele);
		List<WebElement> month = s.getOptions();
		for(int i=0;i<month.size();i++) {
			WebElement rv = month.get(i);
			String str = rv.getText();
			System.out.println(str);
			
			
			
		}
		
	}

}
