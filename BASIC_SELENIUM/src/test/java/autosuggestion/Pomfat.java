package autosuggestion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomfat {
	
	public WebDriver driver;
	@FindBy(linkText="Around the Farm")
	private WebElement farm;
	
	@FindBy(linkText="Testimonials")
	private WebElement testimonials;
	
	public  Pomfat(WebDriver d) {
		PageFactory.initElements(d, this);
	}
	
	public void movefarm() {
		Actions a=new Actions(driver);
		a.moveToElement(farm).perform();
		testimonials.click();
	}
	
	
}
