package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectCampaignPage {
	
	WebDriver driver;
	
	public SelectCampaignPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "search-criteria")
	private WebElement CampaingDD;

	@FindBy(xpath = "//input[@id='search-input']")
	private WebElement searchBar;
	
	@FindBy(xpath = "//button[text()='Select'][1]")
	private WebElement selectBtn;

	public WebElement getCampaingDD() {
		return CampaingDD;
	}

	public WebElement getSearchBar() {
		return searchBar;
	}

	public WebElement getSelectBtn() {
		return selectBtn;
	}
	
}
