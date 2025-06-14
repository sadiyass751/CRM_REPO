package autosuggestion;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tfat {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://www.fatcowhosting.com/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Pomfat p=new Pomfat(d);
		p.movefarm();
		
	}

}
