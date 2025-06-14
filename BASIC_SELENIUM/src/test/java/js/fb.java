package js;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("document.getElementById('email').value='sadiya@gmail.commm'");
		js.executeScript("document.getElementById('pass').value='21323sdx'");
		
	}

}
