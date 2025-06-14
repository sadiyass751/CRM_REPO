package testNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderUsingExcel {

	@Test(dataProvider = "LoginD")
	public void login(String Username,String Password) {
		System.out.println( Username+Password);
	}
	
	@DataProvider
	public Object[][] LoginD() throws EncryptedDocumentException, IOException{
		FileInputStream fis=new FileInputStream("/Users/shabbarprince/Desktop/createCampaign.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("LoginDetails");
		int rowCount=sh.getLastRowNum();
		System.out.println(rowCount);
		Object[][] objArr =new Object[rowCount][2];
		
		for(int i=0;i<rowCount;i++) {
		
				objArr[i][0]=sh.getRow(i+1).getCell(0).getStringCellValue();
				objArr[i][1]=sh.getRow(i+1).getCell(1).getStringCellValue();
		
			}
			
		
		return objArr;
	}
}
