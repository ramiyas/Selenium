package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//public WebDriver driver;
public class Testdata {
	@DataProvider
	public Object[][] getdata(){
		Object[][]a=new Object[3][2];
		a[0][0]="abca";
		a[0][1]="abcp";
		a[1][0]="abc1";
		a[1][1]="abc1p";
		a[2][0]="abc2";
		a[2][1]="abc2p";
		return a;
		
	}
@Test(dataProvider="getdata")
public void demo(String un,String pwd) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  driver.get("https://demo.actitime.com/login.do");
 driver.findElement(By.id("username")).sendKeys(un);
 driver.findElement(By.name("pwd")).sendKeys(pwd);
 Thread.sleep(3000);
 driver.close();


}
}
