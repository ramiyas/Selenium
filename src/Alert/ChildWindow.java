package Alert;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow {
	public static void main(String[]args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		Set<String>child=driver.getWindowHandles();
		//String atitle='ICICI';

		for(String b:child)
		{
			driver.switchTo().window(b);
			System.out.println(driver.switchTo().window(b).getTitle());
		}
	}

}
