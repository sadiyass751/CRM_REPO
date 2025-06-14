package ABC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FB {
	WebDriver driver;
	
	public void browser(String browsername) {
		
		if(browsername.equals("Firefox")) {
			driver=new FirefoxDriver();
		}else if(browsername.equals("chrome")) {
			driver=new ChromeDriver();
		}else {
			driver=new EdgeDriver();
		}
		driver.get("https://www.facebook.com/?_rdr");
		driver.close();
	}
	
	
 
	public static void main(String[] args) {
		FB f=new FB();
		f.browser("Firefox");
		f.browser("chrome");
		f.browser("Edge");

	}
}
