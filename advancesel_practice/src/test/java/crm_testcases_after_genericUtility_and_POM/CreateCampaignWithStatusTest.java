package crm_testcases_after_genericUtility_and_POM;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import fileutility.ExcelUtility;
import fileutility.PropertyFileUtility;
import javaUtility.JavaUtility;
import objectRepository.CampaignPage;
import objectRepository.HomePage;
import objectRepository.LoginPage;
import webdriverutility.WebDriverUtility;

public class CreateCampaignWithStatusTest {

public static void main(String[] args) throws IOException {
		
		PropertyFileUtility flib=new PropertyFileUtility();
		String browser = flib.readDataFromPropertiesFile("Browser");
		String url = flib.readDataFromPropertiesFile("URL");
		String username = flib.readDataFromPropertiesFile("Username");
		String password = flib.readDataFromPropertiesFile("Password");
		
		ExcelUtility exl=new ExcelUtility();
		String campName = exl.readDataFromExcelFile("Campaign", 4, 2);
		String targetSize = exl.readDataFromExcelFile("Campaign", 4, 3);
		String status = exl.readDataFromExcelFile("Campaign", 4, 3);
		
		JavaUtility jlib=new JavaUtility();
		int randomInt = jlib.getRandomNum();
		String campaignName=campName+randomInt;
		
		WebDriverUtility wlib=new WebDriverUtility();
		
		WebDriver d=null;
		if(browser.equalsIgnoreCase("chrome"))
			d=new ChromeDriver();
		else if(browser.equalsIgnoreCase("firefox"))
			d=new FirefoxDriver();
		else if(browser.equalsIgnoreCase("safari"))
			d=new SafariDriver();
		else if(browser.equalsIgnoreCase("edge"))
			d=new EdgeDriver();
		
		LoginPage lp=new LoginPage(d);
		HomePage hp=new HomePage(d);
		CampaignPage cp=new CampaignPage(d);
		lp.Login(url, username, password);
		
		//creating campaign
		cp.createCampaignWithMandatoryFields(campaignName, targetSize);
		cp.getStatusTF().sendKeys(status);
		cp.getCreateCampaignSubmitBtn().click();
		
		//validating
		 wlib.waitForVisbilityOfElement(d, hp.getToastMsg());
		 String msg=hp.getToastMsg().getText();
		if(msg.contains(campaignName)) {
			System.out.println("campaign created");
		}else {
			System.out.println("campaign not created");
		}
		
		//close popup
		hp.getCloseToastMSg().click();
		
		//logout
		hp.Logout();	
 }
}
