//WAS to print all the selected option
package Webelement;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DD9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/purvi/javaproject/test.html");
		WebElement ele=driver.findElement(By.id("Saravanas"));
		Select s=new Select(ele);
	//List<WebElement>options=s.getOptions();
	//System.out.println(s.s);
		Thread.sleep(3000);
		s.selectByIndex(1);
		Thread.sleep(3000);
		s.selectByValue("k");
		Thread.sleep(3000);
		s.selectByVisibleText("idly");
		List<WebElement> l= s.getAllSelectedOptions();
		for(WebElement i:l)
		{
			System.out.println(i.getText());
		}
		driver.close();
		

	}

}
