package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import webdriverutility.WebDriverUtility;

public class HomePage {

	WebDriver driver;
	WebDriverUtility wlib=new WebDriverUtility();
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='user-icon']")
	private WebElement userIcon;
	
	@FindBy(xpath = "//div[@class='dropdown-item logout']")
	private WebElement logoutBtn;
	
	@FindBy(xpath = "//span[text()='Create Campaign']")
	private WebElement createCampaignBtn;
	
	@FindBy(linkText = "Contacts")
	private WebElement contactBtn;
	
	@FindBy(xpath = "//div[@role='alert']")
	private WebElement toastMsg;
	
	@FindBy(xpath = "//button[@aria-label='close']")
	private WebElement closeToastMSg;

	public WebElement getUserIcon() {
		return userIcon;
	}

	public WebElement getLogoutBtn() {
		return logoutBtn;
	}

	public WebElement getCreateCampaignBtn() {
		return createCampaignBtn;
	}

	public WebElement getContactLink() {
		return contactBtn;
	}
		
	public WebElement getToastMsg() {
		return toastMsg;
	}

	public WebElement getCloseToastMSg() {
		return closeToastMSg;
	}

	public void Logout() {
		wlib.mouseHoverOnWebElement(driver, userIcon);
		wlib.clickOnWebElement(driver, logoutBtn);
		driver.quit();
	}
	
	
}
