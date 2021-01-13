	//WAS to count the option and print the text of all the option in ascending order
	package Webelement;

	import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class DD7 {
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
			ArrayList a=new ArrayList();
			System.out.println("Before Sorting");
			for(WebElement e:option)
			{
				String text=e.getText();
				System.out.println(a.add(text));
			}
			System.out.println("************************");
			System.out.println("After Sorting");
			Collections.sort(a);
			for(Object c:a)
			{
				System.out.println(c);
			}
			
			driver.close();
		}

	


}


