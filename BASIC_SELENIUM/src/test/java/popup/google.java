package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
		d.switchTo().frame("callout");
		d.findElement(By.linkText("Sign in")).click();

	}

}
