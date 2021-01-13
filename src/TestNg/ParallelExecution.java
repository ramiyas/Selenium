package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import POM.AmazonAddtoCartpage;
import POM.AmazonSearchPage;
import POM.Amazonhomepage;

@Test
public class ParallelExecution {
	public WebDriver driver;

	@BeforeMethod
	public void openapp() {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
	}

	@Parameters({ "browsername" })
	@Test
	public void test(String browser) throws InterruptedException {
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else {
			driver = new FirefoxDriver();
		}

		driver.get("https://www.amazon.com/");
		Amazonhomepage v1 = new Amazonhomepage(driver);
		v1.searchTextbox("Phone");
		v1.Go();
		AmazonSearchPage v2 = new AmazonSearchPage(driver);
		v2.phclick();
		AmazonAddtoCartpage v3 = new AmazonAddtoCartpage(driver);
		Thread.sleep(5000);
		v3.btnclick();
		Thread.sleep(5000);
	}

	@AfterMethod
	public void closeapp() {
		driver.quit();
	}

}
