package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot1 {

	public static void main(String[] args) throws IOException {
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
		TakesScreenshot s=(TakesScreenshot)d;
		File src = s.getScreenshotAs(OutputType.FILE);
		//define location
		File dest=new File("../BASIC_SELENIUM/screenshot/webpage.png");
		//save file and it will throw IO exception
		FileUtils.copyFile(src, dest);
	}

}
