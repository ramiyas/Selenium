package Alert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class Seleniumdownload {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.get("https://www.selenium.dev/downloads/");
			Thread.sleep(5000);
			
			Actions a= new Actions(driver);
		WebElement ele=	driver.findElement(By.linkText("3.141.59"));
			a.moveToElement(ele).perform();
			a.click(ele).perform();
			
			Thread.sleep(3000);
			
			driver.close();
		
		}

	}





//https://www.selenium.dev/downloads/