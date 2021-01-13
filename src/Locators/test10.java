//WAP to enter URL vtiger.com clear the data and enter the data and use the submit method
package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement eleUN = driver.findElement(By.id("username"));
		eleUN.clear();
		eleUN.sendKeys("admin");
		WebElement elePD = driver.findElement(By.id("password"));
		elePD.clear();
		elePD.sendKeys("admin");
		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
		driver.close();

	}

}
