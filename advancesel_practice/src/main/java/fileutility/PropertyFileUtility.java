package fileutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtility {
	
	public String readDataFromPropertiesFile(String Key) throws IOException {
		FileInputStream fis =new FileInputStream("./src/test/resources/data.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String value = prop.getProperty(Key);
		
		return value;
		
	}
	


}
