package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		FileInputStream fis= new FileInputStream("/Users/shabbarprince/Desktop/createCampaign.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Practice ");
	
		int rowCount = sh.getLastRowNum();
		for(int row=1;row<=rowCount;row++) {
			
			String Product_ID = sh.getRow(row).getCell(0).getStringCellValue();
			String Product_Name = sh.getRow(row).getCell(1).getStringCellValue();
			System.out.println(Product_ID+"---->"+ Product_Name);
			
			
		}
	}

}
