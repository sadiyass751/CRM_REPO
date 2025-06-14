package ABC;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.LoggerFactoryFriend;

public class crm {

	public static void main(String[] args) {
		WebDriver d=new FirefoxDriver();
		d.get("http://49.249.28.218:8098/");
		d.findElement(By.id("username")).sendKeys("rmgyantra");
		d.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
		d.findElement(By.xpath("//button[text()='Sign In']")).click();
		
		d.findElement(By.xpath("//span[text()='Create Campaign']")).click();
		d.findElement(By.name("campaignName")).sendKeys("cdbsjhm");
		d.findElement(By.name("targetSize")).sendKeys("3");
		d.findElement(By.xpath("//button[text()='Create Campaign']")).click();
		
		
		WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(15));
		WebElement msg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Successfully')]")));
		String str = msg.getText();
		System.out.println("Message received: " + str);
		if(str.contains("cdbsjhm")) {
			System.out.println("campaign created sucessfully");
		}else {
			System.out.println("campaign not created");
		}
		
		
		 wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("Toastify__toast")));

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='user-icon-container'])[2]"))).click();

        // Step 4: Click logout (adjust XPath if the text or element type is different)
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Logout']"))).click();

        // Step 5: Optionally verify logout was successful
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));

		
		d.close();
		
	}

}
