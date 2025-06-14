package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis =new FileInputStream("/Users/shabbarprince/Desktop/createCampaign.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet s = wb.getSheet("Campaign");
		Row r = s.getRow(1);
		Cell c = r.getCell(2);
		String campaignName=c.getStringCellValue();
		System.out.println(campaignName);
		String targetSize = r.getCell(3).getStringCellValue();
		System.out.println(targetSize);
		
		wb.close();
	}

}
