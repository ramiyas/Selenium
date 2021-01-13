package Datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
//import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class test2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream f=new FileInputStream("./Excel/test.xlsx");
		Workbook wb=WorkbookFactory.create(f);
		//FileInputStream f = new FileInputStream("./Excel/exceldatat.xlsx");
		 // Workbook wb = WorkbookFactory.create(f);
		  wb.getSheet("Sheet1").getRow(2).getCell(2).setCellValue("JavaSelenium");
		  //Write the data in excel
		  FileOutputStream fo=new  FileOutputStream("./Excel/exceldatat.xlsx");
		  wb.write(fo);
		  wb.close();
	}

}
