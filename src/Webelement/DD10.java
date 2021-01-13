//WAS to check whether the given element is present in the dropdown
package Webelement;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DD10 {
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		Thread.sleep(3000);
		WebElement ele1=driver.findElement(By.id("gh-cat"));
		Select s=new Select(ele1);
		List<WebElement> option=s.getOptions();
		ArrayList a=new ArrayList();
		
		for(WebElement i:option)
		{
			String text=i.getText();
			a.add(text);
			
			
		}
			if(a.contains("Art"))
			{
				System.out.println("Pass"+" "+"the given option is present");
			}
			else
			{
				System.out.println("Fail"+ " "+"the given option is not present");	
			}
		
		
		
		driver.close();
	}

}
