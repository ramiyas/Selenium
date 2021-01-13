package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyntraTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		Myntrahomepage mh=new Myntrahomepage(driver);
		mh.eleclick();
		Myntrasareepage ms=new Myntrasareepage(driver);
		Thread.sleep(5000);
		ms.sareeclick();
		MyntraWishlistpage mws=new MyntraWishlistpage(driver);
		Thread.sleep(2000);
		
		//mws.WLClick();
		driver.quit();

	}

	
		
	}


