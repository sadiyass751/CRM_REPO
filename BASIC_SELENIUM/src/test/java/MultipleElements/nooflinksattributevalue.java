package MultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nooflinksattributevalue {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.co.in/");
		List<WebElement> l=d.findElements(By.tagName("a"));
		int c=l.size();
		System.out.println(c);
		
		for(int i=0;i<c;i++) {
			WebElement rv = l.get(i);
			System.out.println(rv.getAttribute("href"));
		}
		d.close();

	}

}
