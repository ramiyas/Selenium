package Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		Actions a=new Actions(driver);
		WebElement ele=driver.findElement(By.id("course"));
		a.moveToElement(ele).perform();
		WebElement ele1=driver.findElement(By.xpath("//a[text()='Selenium Training']"));
		a.moveToElement(ele1).perform();
		ele1.click();
		WebElement ele2=driver.findElement(By.id("add"));
		a.moveToElement(ele2).perform();
		a.doubleClick(ele2).perform();
			
		Thread.sleep(5000);
		WebElement ele3=driver.findElement(By.xpath("//button[contains(text(),' Add to Cart')]"));
		ele3.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.close();
		
		
	}

}
