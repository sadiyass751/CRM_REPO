package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class property1 {

	public static void main(String[] args) throws IOException {
		// to read data
		FileInputStream f = new FileInputStream("../BASIC_SELENIUM/data.properties");
		//open property file
		Properties p = new Properties();
		p.load(f);
		
	//fetch data
		String str = p.getProperty("email");
		String	str1=p.getProperty("pwd");
		
		
		
	}

}
