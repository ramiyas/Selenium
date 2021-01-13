
package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Action3Flipcart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		Actions a = new Actions(driver);
		a.moveToElement(close).perform();
		a.click(close);
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//span[text()='Women']"));
		a.moveToElement(ele).perform();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[text()='Sarees']")).click();
				
		Thread.sleep(5000);

		driver.close();

		// https://demoapp.skillrary.com/
	}

}
