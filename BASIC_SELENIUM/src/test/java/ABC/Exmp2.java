package ABC;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exmp2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.facebook.com/?_rdr");
//		driver.manage().window().minimize();
//		driver.manage().window().fullscreen();
		
		
		//get size
		driver.get("https://www.facebook.com/?_rdr");
		Dimension size=driver.manage().window().getSize();
		System.out.println(size);
		System.out.println("Height "+size.getHeight());
		System.out.println("Width "+size.getWidth());
		
		
		driver.manage().window().maximize();
		System.out.println("AFTER MAXIMIZE");
		System.out.println(driver.manage().window().getSize());
		System.out.println(driver.manage().window().getSize().getHeight());
		System.out.println(driver.manage().window().getSize().getWidth());
		
		//set size
		driver.manage().window().setSize(new Dimension(3000,300));
		
		
		//get position
		Point position=driver.manage().window().getPosition();
		System.out.println("position :"+position);
		System.out.println(position.getX());
		System.out.println(position.getY());
		
		
		//set position
		driver.manage().window().setPosition(new Point(3000,3000));
		
	}
}
