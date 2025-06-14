package popup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class yatra {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://www.yatra.com/");
		d.manage().window().maximize();
		d.findElement(By.xpath("//span[text()='Login / Signup']")).click();
		d.findElement(By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 css-oysnj3']")).click();
		d.findElement(By.id("fb-login-btn")).click();
		Set<String> s = d.getWindowHandles();
		Iterator<String> itr = s.iterator();
		while(itr.hasNext())
		{
		String refid = itr.next();
		d.switchTo().window(refid);
		
		}
		d.findElement(By.linkText("Create New Account")).click();
	}

}
