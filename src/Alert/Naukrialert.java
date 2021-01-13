package Alert;

	import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class Naukrialert { 

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.naukri.com/");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//p[contains(text(),'Share your location with Naukri.com for more relevant jobs')]"));
			driver.findElement(By.xpath("//span[text()='Later']")).click();
			
			Thread.sleep(3000);
			
			driver.close();
		
		}

	}




