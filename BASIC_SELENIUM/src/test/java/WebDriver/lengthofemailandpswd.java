package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lengthofemailandpswd {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		
		WebElement ele1 = d.findElement(By.xpath("//input[@id='email']"));
		WebElement ele2 = d.findElement(By.xpath("//input[@id=\"pass\"]"));

		if(ele1.getSize()==ele2.getSize()) {
			System.out.println("Same");
		}else {
			System.out.println("not same");
		}
		

	}

}
