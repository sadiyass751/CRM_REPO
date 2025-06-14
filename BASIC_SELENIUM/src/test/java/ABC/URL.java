package ABC;

import org.openqa.selenium.firefox.FirefoxDriver;

public class URL {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=13109664963615328628&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007740&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
		String str = driver.getTitle();
		System.out.println("Title is: "+str);
		String str1 = driver.getCurrentUrl();
		System.out.println("Current url is: "+str1);
		driver.close();
	}

}
