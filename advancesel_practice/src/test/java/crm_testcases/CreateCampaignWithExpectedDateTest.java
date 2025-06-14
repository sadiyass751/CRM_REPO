package crm_testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
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

public class CreateCampaignWithExpectedDateTest {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis =new FileInputStream("./src/test/resources/data.properties");
		//create obj of properties
		Properties prop=new Properties();
		//load all keys
		prop.load(fis);
		String browser = prop.getProperty("Browser");
		String url = prop.getProperty("URL");
		String username = prop.getProperty("Username");
		String password = prop.getProperty("Password");
		
		
		//reading data from excel file
		FileInputStream f=new FileInputStream("/Users/shabbarprince/Desktop/createCampaign.xlsx");
		Workbook wb=WorkbookFactory.create(f);
		Row r = wb.getSheet("Campaign").getRow(7);
		String campaignName = r.getCell(2).getStringCellValue();
		String targetSize = r.getCell(3).getStringCellValue();
		wb.close();
		
		
		//generating random number
		Random random=new Random();
		int ranInt = random.nextInt(1000);
		
		
		
		//get date after 30 days
		Date date= new Date();   //current date
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy"); //date in particular format
		sdf.format(date); //got date but curent date should also be in same format so we are using this
		Calendar cal = sdf.getCalendar();// to get calendar to calculate date
		cal.add(Calendar.DAY_OF_MONTH, 30); //calculate date after 30 days(days of month)
		String requiredDate = sdf.format(cal.getTime());//format into our specifed format
		
		
		WebDriver d=null;
		if(browser.equalsIgnoreCase("chrome"))
			d=new ChromeDriver();
		else if(browser.equalsIgnoreCase("firefox"))
			d=new FirefoxDriver();
		else if(browser.equalsIgnoreCase("safari"))
			d=new SafariDriver();
		else if(browser.equalsIgnoreCase("edge"))
			d=new EdgeDriver();
		
		//login
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		d.get(url);
		d.findElement(By.id("username")).sendKeys(username);
		d.findElement(By.id("inputPassword")).sendKeys(password);
		d.findElement(By.xpath("//button[text()='Sign In']")).click();
		
		
		//creating campaign
		d.findElement(By.xpath("//span[text()='Create Campaign']")).click();
		d.findElement(By.name("campaignName")).sendKeys(campaignName+ranInt);
		WebElement targetsizeTF = d.findElement(By.name("targetSize"));
		targetsizeTF.clear();
		targetsizeTF.sendKeys(targetSize);
		
		WebElement ExpectedCloseDate = d.findElement(By.xpath("//input[@type='date']"));
		Actions action=new Actions(d);
		action.click(ExpectedCloseDate).sendKeys(requiredDate).perform();
		d.findElement(By.xpath("//button[text()='Create Campaign']")).click();
		
		//validating
		
		WebDriverWait wait=new WebDriverWait(d, Duration.ofSeconds(10));
		String toastMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='alert']"))).getText();
		
		System.out.println("Message received: " + toastMsg);
		if(toastMsg.contains(campaignName+ranInt)) {
			System.out.println("campaign created");
		}else {
			System.out.println("campaign not created");
		}
		
		//close popup
		d.findElement(By.xpath("//button[@aria-label='close']")).click();
		
		//logout
		WebElement userIcon = d.findElement(By.xpath("//div[@class='user-icon']"));
		action.moveToElement(userIcon).perform();
		d.findElement(By.xpath("//div[@class='dropdown-item logout']")).click();
		
		d.close();


	}

}
