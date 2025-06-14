package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FB {

	private WebElement uname;
	private WebElement pwd;
	private WebElement loginbtn;
	
	public FB(WebDriver driver) {
		uname=driver.findElement(By.id("email"));
		pwd=driver.findElement(By.id("pass"));
		loginbtn=driver.findElement(By.xpath("//button[contains(@id,'u_0_5')]"));
	}
	
	public void enteruname(String name) {
		uname.sendKeys(name);
	}
	
	public void enterpwd(String pass) {
		pwd.sendKeys(pass);
	}
	
	public void clickloginbtn() {
		loginbtn.click();;
	}

}




