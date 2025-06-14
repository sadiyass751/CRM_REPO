package ABC;

import org.openqa.selenium.firefox.FirefoxDriver;

public class contains {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		// title
		String str = driver.getTitle();
		if (str.contains("gle")) {
			System.out.println("Google webpage displayed");
		} else {
			System.out.println("Google webpage not displayed");

		}
		driver.close();

	}

}
