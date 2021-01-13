package Alert;

	import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class Naukriupload {

		public static void main(String[] args) throws InterruptedException, AWTException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.naukri.com/");
			Thread.sleep(5000);
			Actions a= new Actions(driver);
		WebElement ele=	driver.findElement(By.xpath("//button[@title='Create account on Naukri.com for free']"));
			a.moveToElement(ele).perform();
			a.click(ele).perform();;
			Thread.sleep(3000);
		WebElement ele1=driver.findElement(By.xpath("//img[@data-ga-click='Register_QSB|Fresher']"));
		a.moveToElement(ele1).perform();
		a.click(ele1).perform();;
			Thread.sleep(3000);
			
			 
			driver.findElement(By.name("uploadCV")).sendKeys("C:\\Users\\91984\\Desktop\\Germination.docx");
			Thread.sleep(5000);
			driver.close();
		
		}

	}




