package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String path="/Users/shabbarprince/Desktop/Untitled.xlsx";
		
		//copy file
		FileInputStream file = new FileInputStream(path);
		//open file excel sheet
		Workbook book = WorkbookFactory.create(file);
		//open sheet
		Sheet s = book.getSheet("Sheet 1");
		
		//identify row
		Row r = s.getRow(1);
		
		//identify cell
		Cell c = r.getCell(0);
		
		//read data
		String data=c.getStringCellValue();
		System.out.println(data);
		}

}
