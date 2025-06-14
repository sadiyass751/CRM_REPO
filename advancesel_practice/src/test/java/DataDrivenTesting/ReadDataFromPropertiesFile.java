package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReadDataFromPropertiesFile {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		
		//create java representation
		FileInputStream fis =new FileInputStream("./src/test/resources/data.properties");
		//create obj of properties
		Properties prop=new Properties();
		//load all keys
		prop.load(fis);
		String browser = prop.getProperty("Browser");
		String url = prop.getProperty("URL");
		String username = prop.getProperty("Username");
		String password = prop.getProperty("Password");
		
		
		WebDriver d=null;
		if(browser.equalsIgnoreCase("chrome"))
			d=new ChromeDriver();
		else if(browser.equalsIgnoreCase("firefox"))
			d=new FirefoxDriver();
		else if(browser.equalsIgnoreCase("edge"))
			d=new EdgeDriver();
		else if(browser.equalsIgnoreCase("safari"))
			d=new SafariDriver();
		
		
		//login
		d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		d.get(url);
		d.findElement(By.id("username")).sendKeys(username);
		d.findElement(By.id("inputPassword")).sendKeys(password);
		d.findElement(By.xpath("//button[text()='Sign In']")).click();
		
		
		Random r=new Random();
		int rInt = r.nextInt(1000);
		
		//creating campaign
		d.findElement(By.xpath("//span[text()='Create Campaign']")).click();
		d.findElement(By.name("campaignName")).sendKeys("cdbsjhm"+rInt);
		WebElement targetsize = d.findElement(By.name("targetSize"));
		targetsize.clear();
		targetsize.sendKeys("3");
		
		d.findElement(By.xpath("//button[text()='Create Campaign']")).click();
		
		
		//validating
		
		WebDriverWait wait=new WebDriverWait(d, Duration.ofSeconds(10));
		String toastMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='alert']"))).getText();
		
		System.out.println("Message received: " + toastMsg);
		if(toastMsg.contains("cdbsjhm"+rInt)) {
			System.out.println("campaign created");
		}else {
			System.out.println("campaign not created");
		}
		
		
		//close popup
		d.findElement(By.xpath("//button[@aria-label='close']")).click();
		
		
		//logout
		WebElement userIcon = d.findElement(By.xpath("//div[@class='user-icon']"));
		Actions action=new Actions(d);
		action.moveToElement(userIcon).perform();
		d.findElement(By.xpath("//div[@class='dropdown-item logout']")).click();
		
		d.close();

	}
}
