package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendarpopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://www.yatra.com/");
		d.manage().window().maximize();
		
		d.findElement(By.xpath("//div[@class='css-rd021u']")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//span[text()='December 2024']//ancestor::div[@class='react-datepicker__month-container']//div[@class='react-datepicker__day react-datepicker__day--030']")).click();
		d.close();
	}

}
