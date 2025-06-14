package action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyupdown {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		Actions a=new Actions(d);
		WebElement ele = d.findElement(By.id("email"));
		a.keyDown(Keys.SHIFT).sendKeys(ele,"s").build().perform();
		a.keyUp(Keys.SHIFT).sendKeys(ele,"a").build().perform();
		a.keyDown(Keys.SHIFT).sendKeys(ele,"d").build().perform();
		a.keyUp(Keys.SHIFT).sendKeys(ele,"i").build().perform();
		a.keyDown(Keys.SHIFT).sendKeys(ele,"y").build().perform();
		a.keyUp(Keys.SHIFT).sendKeys(ele,"a").build().perform();

	}

}
