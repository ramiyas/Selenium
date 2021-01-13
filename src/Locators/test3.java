package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.id("forgetPasswordEmailOrUsername")).sendKeys("ramiyas@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Return")).click();
	}
}
