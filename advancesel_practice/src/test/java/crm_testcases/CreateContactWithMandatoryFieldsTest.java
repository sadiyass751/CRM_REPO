package crm_testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateContactWithMandatoryFieldsTest {

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
		
		
		
		FileInputStream f=new FileInputStream("/Users/shabbarprince/Desktop/createCampaign.xlsx");
		Workbook wb=WorkbookFactory.create(f);
		Row r = wb.getSheet("Campaign").getRow(1);
		String campaignName = r.getCell(2).getStringCellValue();
		String targetSize = r.getCell(3).getStringCellValue();
		
		Row r1 = wb.getSheet("Contacts").getRow(1);
		String OrganizationName = r1.getCell(4).getStringCellValue();
		String Title = r1.getCell(5).getStringCellValue();
		String ContactNme =r1.getCell(6).getStringCellValue();
		String MobileNumber = r1.getCell(7).getStringCellValue();
		wb.close();
		
		
		WebDriver d=null;
		if(browser.equalsIgnoreCase("chrome"))
			d=new ChromeDriver();
		else if(browser.equalsIgnoreCase("firefox"))
			d=new FirefoxDriver();
		else if(browser.equalsIgnoreCase("safari"))
			d=new SafariDriver();
		else if(browser.equalsIgnoreCase("edge"))
			d=new EdgeDriver();
		
		//navigate to application

		d.manage().window().maximize();

		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		d.get(url);
		
		//login
		d.findElement(By.id("username")).sendKeys(username);
		d.findElement(By.id("inputPassword")).sendKeys(password);
		d.findElement(By.xpath("//button[text()='Sign In']")).click();
		
		
		//generating random number
		Random random=new Random();
		int ranInt = random.nextInt(1000);
		
		//creating campaign
		d.findElement(By.xpath("//span[text()='Create Campaign']")).click();
		d.findElement(By.name("campaignName")).sendKeys(campaignName+ranInt);
		WebElement targetsizeTF = d.findElement(By.name("targetSize"));
		targetsizeTF.clear();
		targetsizeTF.sendKeys(targetSize);
		
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
		
		
		
		// Create Contact
		d.findElement(By.linkText("Contacts")).click();
		d.findElement(By.xpath("//span[text()='Create Contact']")).click();
		d.findElement(By.name("organizationName")).sendKeys(OrganizationName);
		d.findElement(By.name("title")).sendKeys(Title);
		d.findElement(By.name("contactName")).sendKeys(ContactNme);
		d.findElement(By.name("mobile")).sendKeys(MobileNumber);
		// Click + icon to open campaign selection popup
		WebElement plusIcon = wait.until(ExpectedConditions.elementToBeClickable(
		    By.xpath("//*[name()='svg' and contains(@class,'fa-plus')]")
		));
		plusIcon.click();	
		
		
		
		String parentWindow = d.getWindowHandle();
		
		Set<String> allWindows = d.getWindowHandles();
		for(String handle : allWindows) {
			if(!handle.equals(parentWindow)) {
				d.switchTo().window(handle);
				break;
			}
		}
		
		
		d.findElement(By.xpath("//option[text()='Campaign Name']")).click();
		d.findElement(By.xpath("//input[@id='search-input']")).sendKeys(campaignName+ranInt);
		d.findElement(By.xpath("//button[text()='Select']")).click();
		
		d.switchTo().window(parentWindow);

		
		d.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		
		
		String msg=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"Toastify__toast-body\"]"))).getText();
		System.out.println(msg);
		
		if(msg.contains(ContactNme))
			System.out.println("Contact created");
		else
			System.out.println("contact not created");
		
		
		d.findElement(By.xpath("//button[@aria-label=\"close\"]")).click();
		
	//logout
		WebElement userIcon = d.findElement(By.xpath("//div[@class='user-icon']"));
		Actions action=new Actions(d);
		action.moveToElement(userIcon).perform();
		d.findElement(By.xpath("//div[@class='dropdown-item logout']")).click();
		d.close();


	}

}
