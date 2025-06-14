package configBaseClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import fileutility.PropertyFileUtility;
import objectRepository.HomePage;
import objectRepository.LoginPage;

public class BaseClass {

	public PropertyFileUtility plib = new PropertyFileUtility();
	public WebDriver d = null;
	public static WebDriver sdriver = null;

	@BeforeSuite(groups = { "Smoke", "Regression" })
	public void beforeSuite() {
		System.out.println("Establish DB Connection");
	}

	@BeforeTest(groups = { "Smoke", "Regression" })
	public void beforeTest() {
		System.out.println(" PreCondition");
	}

	// @Parameters("Browser")
	@BeforeClass(groups = { "Smoke", "Regression" })
	public void beforeClass() throws IOException {
		String browser = plib.readDataFromPropertiesFile("Browser");
		if (browser.equalsIgnoreCase("chrome"))
			d = new ChromeDriver();
		else if (browser.equalsIgnoreCase("firefox"))
			d = new FirefoxDriver();
		else if (browser.equalsIgnoreCase("safari"))
			d = new SafariDriver();
		else if (browser.equalsIgnoreCase("edge"))
			d = new EdgeDriver();

		sdriver = d;

		System.out.println("Launch Browser");
	}

	@BeforeMethod(groups = { "Smoke", "Regression" })
	public void beforeMethod() throws IOException {
		String url = plib.readDataFromPropertiesFile("URL");
		String username = plib.readDataFromPropertiesFile("Username");
		String password = plib.readDataFromPropertiesFile("Password");
		LoginPage lp = new LoginPage(d);
		lp.Login(url, username, password);
		System.out.println("Login");
	}

	@AfterMethod(groups = { "Smoke", "Regression" })
	public void afterMethod() {
		HomePage hp = new HomePage(d);
		hp.Logout();
		System.out.println("Logout");
	}

	@AfterClass(groups = { "Smoke", "Regression" })
	public void afterClass() {
		d.quit();
		System.out.println("Close Browser");

	}

	@AfterTest(groups = { "Smoke", "Regression" })
	public void afterTest() {
		System.out.println("Post condition");
	}

	@AfterSuite(groups = { "Smoke", "Regression" })
	public void afterSuite() {
		System.out.println("Close DB Connection");
	}

}
