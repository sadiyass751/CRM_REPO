package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://www.flipkart.com/");
		
		d.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("redmi 9 activ (coral green 64 gb)");

		d.findElement(By.xpath("//button[@class=\"_2iLD__\"]")).click();
		
		String str=d.findElement(By.xpath("//div[@class=\"KzDlHZ\"]/../..//div[@class='Nx9bqj _4b5DiR']")).getText();
		System.out.println(str);
	}

}
