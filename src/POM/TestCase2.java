package POM;

import org.testng.annotations.Test;

public class TestCase2  extends Baseclass{
	@Test
	public void testcase2() throws InterruptedException
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

}
