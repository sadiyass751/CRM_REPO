package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb4getsizeofemail {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		
		 WebElement ele = d.findElement(By.xpath("//input[@id='email']"));
		 Dimension size=ele.getSize();
		 System.out.println(size);
		 System.out.println(size.getHeight());
		 System.out.println(size.getWidth());
		 d.close();
	}

}
