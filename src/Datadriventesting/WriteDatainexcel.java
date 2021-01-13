package Datadriventesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDatainexcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream f=new FileInputStream("./Excel/ExcelData.xlsx");
		Workbook wb = WorkbookFactory.create(f);
		Sheet sh = wb.getSheet("Sheet1");
		Row r = sh.getRow(0);
		//Cell c = r.getCell(0);
		int rn = sh.getPhysicalNumberOfRows();
		int cn=r.getPhysicalNumberOfCells();
		//To read data
		for(int i=0;i<rn;i++)
		{
			for(int j=0;j<cn;j++)
			{
				System.out.println(sh.getRow(i).getCell(j).getStringCellValue());
			}
		}
		//To write data
		Cell c = wb.getSheet("Sheet1").getRow(rn).createCell(3);
		c.setCellValue("testram");
		
		FileOutputStream fo=new FileOutputStream("./Excel/ExcelData.xlsx");
		wb.write(fo);
		wb.close();
	}


}
