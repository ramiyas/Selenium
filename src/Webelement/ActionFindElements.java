package Webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionFindElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Java");
		Thread.sleep(5000);
		List<WebElement>options1=driver.findElements(By.xpath("//li[@class='sbct']"));
		int count=options1.size();
		System.out.println("Number of elements displayed for the java autosuggestion is"+" "+count);
		for(WebElement ele:options1)
		{
			System.out.println(ele.getText());
		}
		Thread.sleep(5000);
		
		WebElement ele1=driver.findElement(By.xpath("//span[contains(text(),'java')]"));
		Actions a=new Actions(driver);
		a.moveToElement(ele1).perform();
		a.click(ele1).perform();
		Thread.sleep(5000);
		String actTitle=driver.getTitle();
		System.out.println(actTitle);
		String ExpTitle="java - Google Search";
		
		
		if(ExpTitle .equals( actTitle))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
				
		driver.close();
		}

	}


