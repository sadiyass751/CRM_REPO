package testng;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class script3 {
	@Test(priority=0)
	public void createAccount() {
		System.out.println("create account");
	}
	
	@Test(priority=1)
	public void EditAccount() {
		System.out.println("Edit account");
	}
	
	@Test(priority=2)
	public void deleteAccount() {
		System.out.println("delete account");
	}
}
