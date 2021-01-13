package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Action4DragDrop{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		WebElement src=driver.findElement(By.xpath("//h1[text()='Block 4']"));
		WebElement des=driver.findElement(By.xpath("//h1[text()='Block 3']"));
		Thread.sleep(3000);
		a.dragAndDrop(src, des).perform();
		Thread.sleep(5000);
		driver.close();
	
}

}
