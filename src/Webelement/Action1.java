package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Action1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://luxire.com/");
		Actions a=new Actions(driver);
		WebElement ele=driver.findElement(By.linkText("Account"));
		a.moveToElement(ele).perform();
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(7000);
		
		driver.findElement(By.xpath("//input[@id='CustomerEmail']")).sendKeys("abcd");
		driver.close();
	}

}
