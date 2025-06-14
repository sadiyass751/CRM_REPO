package POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Googlelinks {
	private List<WebElement> links;
	
	public Googlelinks(WebDriver driver) {
		links=driver.findElements(By.tagName("a"));
	}
	
	public void linksText() {
		for(int i=0;i<links.size();i++) {
			WebElement rv = links.get(i);
			String str = rv.getText();
			System.out.println(str);
		}
	}
}
