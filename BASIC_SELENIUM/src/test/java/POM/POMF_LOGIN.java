package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMF_LOGIN {
	@FindBy(id="email")
	private WebElement emailId;
	@FindBy(id="pass")
	private WebElement pwd;
	@FindBy(name="login")
	private WebElement login;
	
	public POMF_LOGIN(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void loginfb(String user,String pass) {
		emailId.sendKeys(user);
		pwd.sendKeys(pass);
		login.click();
	}
	
}
