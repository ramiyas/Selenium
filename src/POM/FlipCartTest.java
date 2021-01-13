package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipCartTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
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
		driver.quit();
	}

}
