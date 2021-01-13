package Alert;
	import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

	public class skillraryupload { 

		public static void main(String[] args) throws InterruptedException, AWTException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://skillrary.com/");
			JavascriptExecutor js=(JavascriptExecutor)driver;
			Thread.sleep(5000);
			WebElement ele=driver.findElement(By.linkText("Contact Us"));
			js.executeScript("arguments[0].scrollIntoView()",ele);
			driver.findElement(By.linkText("Compiler")).click();
			Thread.sleep(5000);
			Actions a=new Actions(driver);
			WebElement java=driver.findElement(By.id("java"));
			a.moveToElement(java).perform();
			a.click(java).perform();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[contains(text(),'Upload Code')]")).click();
			StringSelection selection = new StringSelection("C:\\Users\\91984\\Desktop\\test.java");
		     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
		 
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_ENTER);

			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(15000);
			driver.findElement(By.id("download")).click();
			
			driver.switchTo().alert().sendKeys("testd");
			driver.switchTo().alert().accept();
			Thread.sleep(10000);
			driver.close();
		
		}

	}







