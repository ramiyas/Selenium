package robot;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlepay_Appstore {
	

public static void main(String[]args) throws AWTException, InterruptedException {
	 
	// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://paytm.com/");
	driver.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();
	Thread.sleep(6000);
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//span[contains(text(),'App Store')]")).click();
	Thread.sleep(5000);
	driver.switchTo().parentFrame();
	driver.close();
	 }
}

