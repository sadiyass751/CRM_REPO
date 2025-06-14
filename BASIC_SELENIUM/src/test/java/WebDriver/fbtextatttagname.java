package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbtextatttagname {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		WebElement ele = d.findElement(By.linkText("Forgotten password?"));
		String s=ele.getTagName();
		System.out.println("Tagname :"+s);
		String s1=ele.getAttribute("href");
		System.out.println("Attribute :"+s1);
		String s2=ele.getText();
		System.out.println("Text is: "+s2);
	}

}
