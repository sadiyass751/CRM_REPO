package autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.co.in/");
		d.findElement(By.id("APjFqb")).sendKeys("selenium");
		Thread.sleep(3000);
		List<WebElement> l = d.findElements(By.xpath("//ul[@class=\"G43f7e\"]//li"));
		
		for(int i=0;i<l.size();i++) {
			WebElement ele = l.get(i);
			if(ele.getText().contains("rich foods")) {
				ele.click();
				break;
			}
			
		}
	}

}
