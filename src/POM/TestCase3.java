package POM;

import org.testng.annotations.Test;

public class TestCase3 extends Baseclass{
	@Test
	public void testcase3() throws InterruptedException
	{
		driver.get("https://www.flipkart.com/");
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
