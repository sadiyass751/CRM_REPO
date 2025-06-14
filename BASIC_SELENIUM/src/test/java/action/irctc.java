package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class irctc {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://www.irctc.co.in/nget/train-search");
		d.manage().window().maximize();
		Actions a=new Actions(d);
		WebElement ele = d.findElement(By.xpath("//a[text()=' MORE ']"));
		a.moveToElement(ele).perform();
		d.findElement(By.linkText("Link Your Aadhaar")).click();
		Thread.sleep(2000);
		d.close();
	}

}
