//WAP facebook login
package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("ramiyas@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Sairam!1");
		driver.findElement(By.name("login")).click();
		String title="Facebook";
		Thread.sleep(5000);
		String actTitle=driver.getTitle();
		if(title.equals(actTitle))
			System.out.println("Pass,Successfully logged in fb");
		else
			System.out.println("Fail,Not logged in fb");
		driver.close();
		
			
				

	}

}
