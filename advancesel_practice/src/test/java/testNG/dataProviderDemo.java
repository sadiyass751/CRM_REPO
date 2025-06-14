package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderDemo {
	
	
	
	@Test(dataProvider = "loginDetails")
	public void login(String username,String password) {
		
		
		System.out.println(username+password);
	}
	
	
	@DataProvider
	public Object[][] loginDetails(){
		Object[][] objArr=new Object[3][2];
		objArr[0][0]="k";
		objArr[0][1]="k@123";
		objArr[1][0]="s";
		objArr[1][1]="s@123";
		objArr[2][0]="d";
		objArr[2][1]="d@123";
		
		
		return objArr;
		
	}
}
