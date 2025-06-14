package ABC;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Title {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/?_rdr");
		//title
		 String str=driver.getTitle();
		 System.out.println("Title is:"+str);
		 //Current URL
		String str1 = driver.getCurrentUrl();
		System.out.println("Current url is:"+str1);
		 driver.close();

	}

}
