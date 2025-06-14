package crm_testcases_after_genericUtility_and_POM;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import fileutility.ExcelUtility;
import fileutility.PropertyFileUtility;
import javaUtility.JavaUtility;
import objectRepository.CampaignPage;
import objectRepository.ContactPage;
import objectRepository.CreateContactPage;
import objectRepository.HomePage;
import objectRepository.LoginPage;
import objectRepository.SelectCampaignPage;
import webdriverutility.WebDriverUtility;

public class CreateContactWithMandatoryFieldsTest {

	public static void main(String[] args) throws IOException {
		PropertyFileUtility flib=new PropertyFileUtility();
		String browser = flib.readDataFromPropertiesFile("Browser");
		String url = flib.readDataFromPropertiesFile("URL");
		String username = flib.readDataFromPropertiesFile("Username");
		String password = flib.readDataFromPropertiesFile("Password");
		
		ExcelUtility exl=new ExcelUtility();
		String campName = exl.readDataFromExcelFile("Campaign", 1, 2);
		String targetSize = exl.readDataFromExcelFile("Campaign", 1, 3);
		
		String OrganizationName = exl.readDataFromExcelFile("Contacts", 1, 4);
		String Title = exl.readDataFromExcelFile("Contacts", 1, 5);
		String ContactName =exl.readDataFromExcelFile("Contacts", 1, 6);
		String MobileNumber = exl.readDataFromExcelFile("Contacts", 1, 7);
		String WindownTitle = exl.readDataFromExcelFile("Contacts", 1, 8);
		
		
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
		CreateContactPage createcontactpage=new CreateContactPage(d);
		ContactPage contactpage=new ContactPage(d);
		SelectCampaignPage scp=new SelectCampaignPage(d);
		
		lp.Login(url, username, password);
		
		//creating campaign
		cp.createCampaignWithMandatoryFields(campaignName,targetSize);
		cp.getCreateCampaignSubmitBtn().click();
		 
		 wlib.waitForVisbilityOfElement(d, hp.getToastMsg());
		hp.getCloseToastMSg().click();
		
		// Create Contact
		hp.getContactLink().click();
		contactpage.getCreateContactBtn().click();
		createcontactpage.createContactWithMAndatoryFields(OrganizationName, Title, ContactName, MobileNumber);
		
		String parentWindow = d.getWindowHandle();
		wlib.switchToWindowOnTitle(d, WindownTitle);
		
		 WebElement DD = scp.getCampaingDD();
		 wlib.select(DD, 1);
		scp.getSearchBar().sendKeys(campaignName);
		scp.getSelectBtn().click();
		
		d.switchTo().window(parentWindow);

		
		createcontactpage.getCreateContactSubmitBtn().click();
		
		//validation
		wlib.waitForVisbilityOfElement(d, hp.getToastMsg());
		String msg=hp.getToastMsg().getText();
		if(msg.contains(ContactName))
			System.out.println("Contact created");
		else
			System.out.println("contact not created");
		
		wlib.takeScreenShot(d, "contact");
		hp.getCloseToastMSg().click();
	
		
		//logout
		hp.Logout();


	}

}
	
	
	
