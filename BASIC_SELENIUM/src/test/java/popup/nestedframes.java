package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nestedframes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://demo.automationtesting.in/Frames.html");
		d.findElement(By.className("container"));
		WebElement frame = d.findElement(By.id("singleframe"));
		//String arg
		d.switchTo().frame(frame);
		
		//index arg
		// d.switchTo().frame(0);
		
		Thread.sleep(3000);
		WebElement text = d.findElement(By.xpath("//input[@type='text']"));
        text.sendKeys("Hello");
        
        d.switchTo().defaultContent();
	}

}
