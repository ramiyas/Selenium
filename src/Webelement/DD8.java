	//WAS to print the first selected option
	package Webelement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class DD8 {
		public static void main(String[]args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.ebay.com/");
			Thread.sleep(3000);
			WebElement ele1=driver.findElement(By.id("gh-cat"));
			Select s=new Select(ele1);
			List<WebElement> option=s.getOptions();
			s.selectByIndex(5);
			s.selectByIndex(2);
			s.selectByIndex(7);
			s.selectByIndex(2);
			System.out.println(s.getFirstSelectedOption().getText());
					
			driver.close();
		}

	


}



