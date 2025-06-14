package webdriverutility;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {

	/**
	 * This method is used to maximize window
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	/**
	 * This method will wait for 10secs
	 * @param driver
	 */
	public void waitForPageLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	
	/**
	 * This method will wait for 10 sec for elements that are visible
	 * @param driver
	 * @param element
	 */
	public void waitForVisbilityOfElement(WebDriver driver,WebElement element){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	/**
	 * This method is used to switch to frames using index
	 * @param driver
	 * @param index
	 */
	public void switchToFrame(WebDriver driver,int index) {
		driver.switchTo().frame(index);
	}
	
	
	/**
	 * This method is used to switch to frames using name/ID
	 * @param driver
	 * @param index
	 */
	public void switchToFrame(WebDriver driver,String nameOrID) {
		driver.switchTo().frame(nameOrID);
	}
	
	
	/**
	 * This method is used to switch to frames using WebElement
	 * @param driver
	 * @param index
	 */
	public void switchToFrame(WebDriver driver,WebElement element) {
		driver.switchTo().frame(element);
	}
	
	/**
	 * This method will switch to alert and clicks on ok
	 * @param driver
	 */
	public void switchToAlertAndAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	/**
	 * This method will switch to alert and clicks on cancel
	 * @param driver
	 */
	public void switchToAlertAndDismiss(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	
	/**
	 *  This method will switch to alert and get text present in alert
	 * @param driver
	 * @return
	 */
	public String switchToAlertAndGetText(WebDriver driver) {
		String text = driver.switchTo().alert().getText();
		return text;
	}
	
	/**
	 * This method will switch to alert and sendkeys
	 * @param driver
	 * @param text
	 */
	public void switchToAlertAndSendKeys(WebDriver driver,String text) {
		 driver.switchTo().alert().sendKeys(text);
	}
	
	public void select(WebElement element,int index) {
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	
	public void select(String text,WebElement element) {
		Select s=new Select(element);
		s.selectByVisibleText(text);
	}
	
	public void select(WebElement element,String value) {
		Select s=new Select(element);
		s.selectByValue(value);
	}
	
	public void mouseHoverOnWebElement(WebDriver driver,WebElement element) {
		Actions a=new Actions(driver);
		a.moveToElement(element).perform();
	}
	
	public void clickOnWebElement(WebDriver driver,WebElement element) {
		Actions a=new Actions(driver);
		a.moveToElement(element).click().perform();
	}
	
	public void doubleClickOnWebElement(WebDriver driver,WebElement element) {
		Actions a=new Actions(driver);
		a.doubleClick(element).perform();
	}
	
	public void rightClickOnWebElement(WebDriver driver,WebElement element) {
		Actions a=new Actions(driver);
		a.contextClick(element).perform();
	}
	
	public void dragAndDropOnWebElement(WebDriver driver,WebElement src,WebElement dest) {
		Actions a=new Actions(driver);
		a.dragAndDrop(src, dest).perform();
	}
	
	public void enterInputOnWebElement(WebDriver driver,WebElement element,String text) {
		Actions a=new Actions(driver);
		a.click(element).sendKeys(text).perform();
	}
	
	public void switchToWindowOnTitle(WebDriver driver,String expectedTitle) {
		Set<String> set = driver.getWindowHandles();
		for(String id:set) {
			driver.switchTo().window(id);
			if(driver.getTitle().contains(expectedTitle))
				break;
			
		}
	}
	
	public void switchToWindowOnUrl(WebDriver driver,String expectedUrl) {
		Set<String> set = driver.getWindowHandles();
		for(String id:set) {
			driver.switchTo().window(id);
			if(driver.getCurrentUrl().contains(expectedUrl))
				break;
			
		}
	}
	
	
	public void takeScreenShot(WebDriver driver,String fileName) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest =new File("./Screenshots/"+fileName+".png");
		FileHandler.copy(src, dest);
	}
	
	public void takeElementScreenshot(WebElement element, String fileName) throws IOException {
	    File src = element.getScreenshotAs(OutputType.FILE);
	    File dest = new File("./Screenshots/" + fileName + ".png");
	    FileHandler.copy(src, dest);
	}
	
	public void scrollByAmount(WebDriver driver,int x,int y) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		
	}
}
