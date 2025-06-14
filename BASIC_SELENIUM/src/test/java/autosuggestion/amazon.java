package autosuggestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d= new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
		
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("PUMA");
	
		List<WebElement> l = d.findElements(By.xpath("//div[@id=\"sac-autocomplete-results-container\"]//div[@id=\"sac-suggestion-row-5\"]"));
		for(int i=0;i<l.size();i++) {
			WebElement rv = l.get(i);
			if(rv.getText().contains("jacket for men original")) {
				rv.click();
			}
		}
	}

}
