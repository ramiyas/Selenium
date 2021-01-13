package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test2 {
	
	static WebDriver driver;

	static {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		// WebDriver driver1=new FirefoxDriver();
	}

	public static void testBrowser(WebDriver driver) {

		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		test2.testBrowser(driver);
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.flipkart.com/");
		test2.testBrowser(driver1);
//WebDriver driver1=new FirefoxDriver();
//driver1.get("https://www.youtube.com/");
//test2.testBrowser(driver1);
//driver1.get("https://www.flipkart.com/");
//test2.testBrowser(driver1);

	}

}
