package ABC;

import org.openqa.selenium.firefox.FirefoxDriver;

public class VerificationOrangeHRm {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.orangehrm.com/");
		 String str=driver.getTitle();
		 if(str.contains("OrangeHRM")) {
			 System.out.println("Orange HRM webpage displayed");
		 }else {
			 System.out.println("Orange HRM webpage not displayed");

		 }
		 driver.close();
	}

}
