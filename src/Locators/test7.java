//Login to amazon and search and add an item,validate it.
package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'AT&T BL102-2')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("add-to-cart-button")).click();
		// String res="Added to Cart";
		Thread.sleep(5000);
		String actText = driver.findElement(By.xpath("//h1[contains(text(),'Added to Cart')]")).getText();
		System.out.println(actText);
		String expText = "Added to Cart";
		if (actText.equals(expText))
			System.out.println("Pass,Item successfully added");
		else
			System.out.println("Fail,Item not added");
		driver.close();

	}

}
