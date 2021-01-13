package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assign2511 {
	static WebDriver driver;
	static {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		 driver = new ChromeDriver();

		}
	public static void navigation(WebDriver driver) throws InterruptedException
	{
		driver.navigate().to("https://www.zomato.com/");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().to("https://www.zomato.com/vijayawada/restaurants?category=2&context=dineout");
		Thread.sleep(5000);
		driver.navigate().refresh();
		driver.close();
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//WebDriver driver=new ChromeDriver();
		navigation(driver);

	}

}
