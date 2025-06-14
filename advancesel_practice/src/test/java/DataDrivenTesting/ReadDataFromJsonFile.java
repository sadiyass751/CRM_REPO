package DataDrivenTesting;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadDataFromJsonFile {

	public static void main(String[] args) throws ParseException, FileNotFoundException, IOException {
		JSONParser parser=new JSONParser();
		Object javaobj = parser.parse(new FileReader("./src/test/resources/jFile.json"));
		
		JSONObject obj=(JSONObject)javaobj;
		String value = obj.get("Browser").toString();
		System.out.println(value);
	}

}
