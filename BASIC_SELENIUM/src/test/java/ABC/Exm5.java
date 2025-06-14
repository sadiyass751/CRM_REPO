package ABC;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exm5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.navigate().to("https://www.facebook.com/?_rdr");

		// navigate to google
		driver.navigate().back();
		// verification
		String s = driver.getTitle();
		if (s.equals("Google")) {
			System.out.println("Google web page is displayed");
		} else {
			System.out.println("Google web page is not displayed");
		}

		// change size
		driver.manage().window().setSize(new Dimension(400, 500));

		// change position
		driver.manage().window().setPosition(new Point(300, 450));

		// maximize
		driver.manage().window().maximize();

		// forward to fb
		driver.navigate().forward();

		// verify fb page
		String s1 = driver.getTitle();
		if (s1.contains("Facebook")) {
			System.out.println("FB web page is displayed");
		} else {
			System.out.println("FB web page is not displayed");
		}

		// refresh
		Thread.sleep(2000);
		driver.navigate().refresh();

		// close
		driver.close();
	}

}
