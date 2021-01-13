package Datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exceldata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		FileInputStream f=new FileInputStream("./Excel/test.xlsx");
		Workbook wb=WorkbookFactory.create(f);
		String url=wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		System.out.println(url);
		driver.get(url);
		String un=wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		driver.findElement(By.id("username")).sendKeys(un);
		String pwd=wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		wb.close();
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
	}

}
