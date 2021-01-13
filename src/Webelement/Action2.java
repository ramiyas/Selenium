
		package Webelement;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.interactions.Action;
		import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

		public class Action2{

			public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://demoapp.skillrary.com/");
				driver.manage().window().maximize();
				WebElement ele=driver.findElement(By.name("addresstype"));
				Select s=new Select(ele);
				s.selectByIndex(1);
				driver.findElement(By.linkText("Cucumber")).click();;
				Actions a=new Actions(driver);
				WebElement ele1=driver.findElement(By.xpath("//i[@class='fa fa-plus']"));
				//a.moveToElement(ele1).perform();
				Thread.sleep(5000);
				a.doubleClick(ele1).perform();
				Thread.sleep(5000);
				//driver.findElement(By.linkText("Login")).click();
				//driver.findElement(By.id("CustomerEmail")).sendKeys("abcd");
				driver.close();
			

		

		
		
		
		
		
		
		 //https://demoapp.skillrary.com/
	}

}
