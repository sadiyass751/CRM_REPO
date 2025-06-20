package pac2;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Test2 {
	
	@Test(groups={"Smoke","Regression"})
	public void demo() {
		String url=System.getProperty("url");
		String browser=System.getProperty("browser","chrome");
		String username=System.getProperty("username");
		String password=System.getProperty("password");
		System.out.println(url+"\n"+browser+username+password);
	}
	
	@Test(groups="Regression")
	public void demo1() {
		System.out.println("demo");
	}
}
