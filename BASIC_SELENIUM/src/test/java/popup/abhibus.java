package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class abhibus {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://www.abhibus.com/");
		d.manage().window().maximize();
		d.findElement(By.id("login-link")).click();
		Thread.sleep(3000);
		d.findElement(By.id("login-google-link")).click();
		}

}
