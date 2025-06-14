package ABC;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exmp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.facebook.com/?_rdr");
//		Thread.sleep(3000);
//		driver.manage().window().minimize();
//		Thread.sleep(3000);
//		driver.manage().window().fullscreen();
		
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5km84u9k2k_e&adgrpid=155259813113&hvpone=&hvptwo=&hvadid=713930225034&hvpos=&hvnetw=g&hvrand=10646287672920610018&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061642&hvtargid=kwd-304880464215&hydadcr=14450_2402232&gad_source=1");
		Dimension size=driver.manage().window().getSize();
		System.out.println(size);
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		
		driver.manage().window().maximize();
		System.out.println(driver.manage().window().getSize());
		System.out.println(driver.manage().window().getSize().getHeight());
		System.out.println(driver.manage().window().getSize().getWidth());
		
		
		//setting size
		driver.manage().window().setSize(new Dimension(3000,3000));
		
		
		//get position
		Point position=driver.manage().window().getPosition();
		System.out.println(position);
		System.out.println(position.getX());
		System.out.println(position.getY());
		
		//set position
		driver.manage().window().setPosition(new Point(3000,3000));
	}
}
