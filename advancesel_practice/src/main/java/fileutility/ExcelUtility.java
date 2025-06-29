package fileutility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	
	public String readDataFromExcelFile(String sheetName,int rowNum,int cellNum ) throws EncryptedDocumentException, IOException {
		FileInputStream fis =new FileInputStream("/Users/shabbarprince/Desktop/createCampaign.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
		wb.close();
		
		return data;
		
	}
	
	public int getRowCount(String sheetName) throws EncryptedDocumentException, IOException {
		FileInputStream f=new FileInputStream("/Users/shabbarprince/Desktop/createCampaign.xlsx");
		Workbook wb = WorkbookFactory.create(f);
		int rowCount = wb.getSheet(sheetName).getLastRowNum();
		wb.close();
		return rowCount;
		
	}
}
