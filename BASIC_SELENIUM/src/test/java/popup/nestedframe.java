package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nestedframe {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://the-internet.herokuapp.com/nested_frames");
		d.switchTo().frame(0);
		d.switchTo().frame(0);
		String str = d.findElement(By.xpath("//body[contains(text(),'LEFT')]")).getText();
		System.out.println(str);
		
		Thread.sleep(2000);
		d.switchTo().parentFrame();
		d.switchTo().frame(1);
		String str2 = d.findElement(By.id("content")).getText();
		System.out.println(str2);
		
		d.switchTo().parentFrame();
		d.switchTo().parentFrame();
		d.switchTo().frame(1);
		String str4 = d.findElement(By.tagName("body")).getText();
		System.out.println(str4);
		
		d.switchTo().defaultContent();
	}

}
