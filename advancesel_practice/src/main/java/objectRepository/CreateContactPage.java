package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContactPage {
	
	WebDriver driver;
	
	public CreateContactPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name = "organizationName")
	private WebElement organizationNameTF;
	
	
	@FindBy(name = "title")
	private WebElement titleTF;
	
	@FindBy(name = "contactName")
	private WebElement contactNameTF ;
	
	@FindBy(name = "mobile")
	private WebElement mobileTF;
	
	
	@FindBy(xpath = "//*[name()='svg' and @data-icon='plus']")
	private WebElement plusBtn;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement createContactSubmitBtn;
	
	

	public WebElement getOrganizationNameTF() {
		return organizationNameTF;
	}


	public WebElement getTitleTF() {
		return titleTF;
	}


	public WebElement getContactNameTF() {
		return contactNameTF;
	}


	public WebElement getMobileTF() {
		return mobileTF;
	}


	public WebElement getplusBtn() {
		return plusBtn;
	}
	
	
	public WebElement getCreateContactSubmitBtn() {
		return createContactSubmitBtn;
	}


	public void createContactWithMAndatoryFields(String organizationName,String title,String contactName,String mobile) {
		organizationNameTF.sendKeys(organizationName);
		titleTF.sendKeys(title);
		contactNameTF.sendKeys(contactName);
		mobileTF.sendKeys(mobile);
		plusBtn.click();
	}
	
}
