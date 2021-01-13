//WAP to open skillrary and click on signup and using cssselector enter the details and click o
package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		driver.findElement(By.cssSelector("a[href='login.php?type=register']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("MyFirstName");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("MyLastName");
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("testsel@gmail.com");
		driver.findElement(By.name("password")).sendKeys("test#123");
		driver.findElement(By.cssSelector("input[name='repassword'])")).sendKeys("test#123");
		driver.findElement(By.cssSelector("input[value='Register']")).click();;
		
		
	}

}
