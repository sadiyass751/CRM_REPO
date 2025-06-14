package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class classname {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/?s_kwcid=AL!739!3!582822043580!b!!g!!flipkart&gclsrc=aw.ds&&semcmpid=sem_8024046704_brand_exe_buyers_goog&gad_source=1&gclid=CjwKCAiA9bq6BhAKEiwAH6bqoCC--zkYknLTR8fDWxLNLTchsv_6Sm6P9JLHO49sG_SK5NTEsTycQBoCcUMQAvD_BwE");
		
		By search = By.className("Pke_EE");
		WebElement ele = driver.findElement(search);
		ele.sendKeys("mobiles");
		
		By btn = By.className("_2iLD__");
		WebElement ele2 = driver.findElement(btn);
		ele2.click();
	}

}
