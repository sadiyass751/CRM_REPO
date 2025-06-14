package ABC;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exm4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.navigate().to("https://www.facebook.com/?_rdr");
		Thread.sleep(3000);
		//navigate to google
		driver.navigate().back();
		
		
		Thread.sleep(3000);
		//navigate to fb
		driver.navigate().forward();
		
		Thread.sleep(3000);
		//refresh 
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		//set size
		driver.manage().window().setSize(new Dimension(400,600));
		
		Thread.sleep(3000);
		//set position
		driver.manage().window().setPosition(new Point (150,300));
		
		Thread.sleep(3000);
		//maximize 
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		//full screen
		driver.manage().window().fullscreen();
		
		Thread.sleep(3000);
		//minimize
		driver.manage().window().minimize();
		
		Thread.sleep(3000);
		//close
		driver.close();
	}

}
