package testng;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class script7 {
	@Test
	public void contact() {
		System.out.println("contacts");
	}
	
	@Test(dependsOnMethods="contact",invocationCount=2)
	public void chats() {
		System.out.println("chats");
	}
}
