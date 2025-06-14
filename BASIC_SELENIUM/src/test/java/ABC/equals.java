package ABC;

import org.openqa.selenium.firefox.FirefoxDriver;

public class equals {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		//title
		 String str=driver.getTitle();
		 if(str.equals("Google")) {
			 System.out.println("Google webpage displayed");
		 }else {
			 System.out.println("Google webpage not displayed");

		 }
		 driver.close();


	}

}
