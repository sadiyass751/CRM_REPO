package ABC;

import org.openqa.selenium.chrome.ChromeDriver;

public class Sample4 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/?_rdr");
		driver.get("https://www.google.com/");
		driver.close();

	}

}
