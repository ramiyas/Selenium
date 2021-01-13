package POM;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
	

public class EcommerceTestCases extends Baseclass  {
	@Parameters({"browsername"})
			

		@Test
		public void test(String browser)
		{
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else
		{
			driver=new FirefoxDriver();
		}
		}
		public void testAmazonSearchPage() throws InterruptedException
			{
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
			//driver.close();
		}
		
		@Test(priority=1,invocationCount=2)
		public void testMyntraWishlistPage() throws InterruptedException
		{
			driver.get("https://www.myntra.com/");
			Myntrahomepage mh=new Myntrahomepage(driver);
			mh.eleclick();
			Myntrasareepage ms=new Myntrasareepage(driver);
			Thread.sleep(5000);
			ms.sareeclick();
			MyntraWishlistpage mws=new MyntraWishlistpage(driver);
			Thread.sleep(2000);
		}

		@Test
		public void testFlipkartSearchPage() throws InterruptedException
		{
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			FlipcartSearchpage f=new FlipcartSearchpage(driver);
			//f.switchTo().window(cwin);
			f.clsclick();
			//driver.switchTo().defaultContent();
			f.EnterdatainSB();
			Thread.sleep(5000);
			f. Goclick();
			Flipcartelementpage fe= new Flipcartelementpage(driver);
			Thread.sleep(5000);
			fe.selectelement(1);
			Thread.sleep(5000);
			fe.selectelementmax(0);
			Thread.sleep(5000);
			fe.eleClick();
		}

	}



