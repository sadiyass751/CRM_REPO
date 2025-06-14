package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelPrintdata {

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		Workbook book = WorkbookFactory.create(new FileInputStream("/Users/shabbarprince/Desktop/Untitled.xlsx"));
		Sheet sheet=book.getSheet("Sheet 2");
		
		for(int rownum=0;rownum<=1;rownum++) {
			Row r=sheet.getRow(rownum);
			short countcell=r.getLastCellNum();
			for(int cellnum=0;cellnum<=1;cellnum++) {
				
					Cell tcell = r.getCell(cellnum);
					System.out.print(tcell.toString()+" ");
					
			}
			System.out.println(" ");
		}
	}

}
