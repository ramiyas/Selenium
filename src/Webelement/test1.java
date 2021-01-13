package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test1 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/");
		WebDriverWait w = new WebDriverWait(driver, 5);
		String title = driver.getTitle();
		System.out.println(title);
		String actTitle = "Sign in – Google accounts";
		// Tc for Display of Gmail page
		if (title.equals(actTitle)) {
			System.out.println("PASS:" + "Sign in – Google accounts" + " is displayed");
		} else {

			System.out.println("Fail:" + "Sign in – Google accounts" + " is not displayed");

		}
		// Tc for Display of Inbox page

		WebElement email = driver.findElement(By.id("identifierId"));
		//w.until(ExpectedConditions.elementToBeClickable(ele)).click();
		
		if ((email).isDisplayed()) {
			System.out.println("Pass:" + "Email is displayed");
			driver.findElement(By.id("identifierId")).clear();
			driver.findElement(By.id("identifierId")).sendKeys("ramiyas@gmail.com");
			WebElement next=driver.findElement(By.xpath("//span[text()='Next']"));
			boolean res=next.isDisplayed();
			System.out.println(res);
			next.click();
			//Thread.sleep(5000);
			//if(next.isDisplayed())
			//{
				//next.click();
			//}
			//else
			//{
				//System.out.println("next button is not displayed");
			//}
			
			

		}

	}

}
