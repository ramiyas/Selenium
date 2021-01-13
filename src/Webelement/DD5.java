//WAS to count the option and print the text of all the option using for loop
package Webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DD5 {
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		Thread.sleep(3000);
		WebElement ele1=driver.findElement(By.id("gh-cat"));
		Select s=new Select(ele1);
		List<WebElement> option=s.getOptions();
		int cnt=option.size();
		System.out.println("Number of options in the dropdown"+" "+cnt);
		for(int i=0;i<cnt;i++)
		{
			System.out.println(option.get(i).getText());
		}
		
		
		driver.close();
	}

}
