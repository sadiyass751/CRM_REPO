package DataDriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String path="/Users/shabbarprince/Desktop/Untitled.xlsx";
		FileInputStream file=new FileInputStream(path);
		Workbook book=WorkbookFactory.create(file);
		Sheet s=book.getSheet("Sheet 1");
		Row r=s.createRow(8);
		Cell c=r.createCell(5);
		c.setCellValue("Ruby");
		FileOutputStream out=new FileOutputStream(path);
		book.write(out);
	}

}
