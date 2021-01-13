package Webelement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(3000);
		WebElement ele=driver.findElement(By.name("birthday_month"));
		Select s=new Select(ele);
		s.selectByIndex(2);
		List<WebElement> option=s.getOptions();
		System.out.println("The month count is  "+option.size());
		
		List<String> monthNames = new ArrayList();
		for(WebElement ele1:option)
		{
		System.out.println(ele1.getText());
		monthNames.add(ele1.getText());
	
		}
		driver.close();
		
		Collections.sort(monthNames);
		System.out.print(monthNames);
		}
		
	}


