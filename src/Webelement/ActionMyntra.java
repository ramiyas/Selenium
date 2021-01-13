//WAS to use horizontal bar
package Webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMyntra {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		JavascriptExecutor js= (JavascriptExecutor)(driver);
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,10000)");
		Thread.sleep(5000);
		WebElement ele=driver.findElement(By.xpath("(//a[@href='/makeup'])[2]"));
		js.executeScript("arguments[0].scrollIntoView()", ele);
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("(//a[@href='/shop/kids'])[2])")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
