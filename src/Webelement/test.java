
//Login to amazon and search and add an item,validate it.
// its not working
package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		Thread.sleep(3000);
		Actions a=new Actions(driver);
		driver.findElement(By.xpath("//span[contains(text(),'Nokia 105 Single SIM (Black)')]")).click();;
		//a.moveToElement(ele).perform();
		//a.click(ele);
		Thread.sleep(15000);
		
		WebElement ele1=driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		a.moveToElement(ele1).perform();
		a.click(ele1).perform();
		//String res="Added to Cart";
		Thread.sleep(5000);
		String actText = driver.findElement(By.xpath("//h1[contains(text(),'add-to-cart-button')]")).getText();
		System.out.println(actText);
		String expText = "add-to-cart-button";
		if (actText.equals(expText))
			System.out.println("Pass,Item successfully added");
		else
			System.out.println("Fail,Item not added");
		driver.close();

	}

}
