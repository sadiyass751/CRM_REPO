package DataDriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class excel3fb {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		Workbook book = WorkbookFactory.create(new FileInputStream("/Users/shabbarprince/Desktop/Untitled.xlsx"));
		Row r=book.getSheet("Sheet 2").getRow(1);
		String un=r.getCell(0).toString();
		String pwd=r.getCell(1).toString();
		d.findElement(By.id("email")).sendKeys(un);
		d.findElement(By.id("pass")).sendKeys(pwd);
		d.findElement(By.xpath("//button[contains(@id,'u_0_')]")).click();
	}
}
