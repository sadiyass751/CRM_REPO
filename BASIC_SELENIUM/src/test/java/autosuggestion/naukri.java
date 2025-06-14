package autosuggestion;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class naukri {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gclid=EAIaIQobChMIvIWUjvyGiwMVPyaDAx2AkCo0EAAYASAAEgLFZfD_BwE&gclsrc=aw.ds");
		d.findElement(By.linkText("Login")).click();
		Thread.sleep(4000);
		
		d.findElement(By.xpath("//span[contains(text(),'Google')]")).click();
		
		Set<String> s = d.getWindowHandles();
		Iterator<String> itr = s.iterator();
		while(itr.hasNext()) {
			String id = itr.next();
			d.switchTo().window(id);
			
		}
		d.findElement(By.id("identifierId")).sendKeys("xya@gmail.com");
		d.findElement(By.xpath("//span[text()='Next']")).click();
	}

}
