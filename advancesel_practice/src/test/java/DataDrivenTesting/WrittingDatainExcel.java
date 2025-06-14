package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WrittingDatainExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("/Users/shabbarprince/Desktop/createCampaign.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet("Practice ");
		Row r = s.getRow(5);
		Cell c = r.createCell(2);
		c.setCellType(CellType.STRING);
		c.setCellValue("xxyz");
		FileOutputStream fos=new FileOutputStream("/Users/shabbarprince/Desktop/createCampaign.xlsx");
		wb.write(fos);
		wb.close();
	}

}
