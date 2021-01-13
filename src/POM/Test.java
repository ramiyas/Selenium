package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test  {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.com/");
		Amazonhomepage v1=new Amazonhomepage(driver);
		v1.searchTextbox("Phone");
		v1.Go();
		AmazonSearchPage v2=new AmazonSearchPage(driver);
		v2.phclick();
	AmazonAddtoCartpage v3=new AmazonAddtoCartpage(driver);
	Thread.sleep(5000);
		v3.btnclick();
		Thread.sleep(5000);
		driver.close();
	}

}
