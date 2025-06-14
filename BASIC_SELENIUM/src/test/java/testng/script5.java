package testng;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class script5 {
	@Test(dependsOnGroups="sample")
	public void test1() {
		System.out.println("test1");
	}
	
	@Test(groups="sample")
	public void test2() {
		System.out.println("test2");
	}
	
	@Test(groups="sample")
	public void test3() {
		System.out.println("test3");
	}
	
	@Test(groups="sample")
	public void test4() {
		System.out.println("test4");
	}
}
