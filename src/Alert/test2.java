package Alert;

	import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class test2 {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.actitime.com/login.do");
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
			Actions a=new Actions(driver);
			Thread.sleep(5000);
			WebElement ele=driver.findElement(By.id("container_users"));
			a.moveToElement(ele).perform();
			a.click(ele).perform();
			Thread.sleep(3000);
			WebElement ele1=driver.findElement(By.xpath("//div[text()='New User']"));
			a.moveToElement(ele1).perform();
			ele1.click();
			Thread.sleep(2000);
			driver.findElement(By.id("createUserPanel_firstNameField")).sendKeys("abc");
			driver.findElement(By.xpath("//div[@class='closeButton hideButton_panelContainer']")).click();
		Alert al= driver.switchTo().alert();
		System.out.println(al.getText());
		al.dismiss();
		driver.close();
		
		}

	}


