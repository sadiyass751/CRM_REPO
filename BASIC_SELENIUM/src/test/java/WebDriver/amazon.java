package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5km84u9k2k_e&adgrpid=155259813113&hvpone=&hvptwo=&hvadid=713930225034&hvpos=&hvnetw=g&hvrand=397930803092941275&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061642&hvtargid=kwd-304880464215&hydadcr=14450_2402232&gad_source=1");
		boolean ele = d.findElement(By.id("twotabsearchtextbox")).isEnabled();
		if(ele) {
			System.out.println("search field is enabled");
		}else {
			System.out.println("search field is disabled");
		}
	}

}
