package Datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SelectAlldataExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream f=new FileInputStream("./Excel/ExcelData.xlsx");
	Workbook wb=WorkbookFactory.create(f);
	Sheet s = wb.getSheet("Sheet1");
	Row row = s.getRow(0);
	//System.out.println(row);
	//get data of first and second column
	//Cell col = row.getCell(2);
	//System.out.println(col);
	//int rowindex = s.getLastRowNum();
			int r = s.getPhysicalNumberOfRows();
		//short cell = row.getLastCellNum();
		int cell = row.getPhysicalNumberOfCells();
		System.out.println(cell);
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<cell;j++)
			{
				System.out.println(s.getRow(i).getCell(j));
			}
			}
		System.out.println(r);
		wb.close();
}
}
