
	//WAP facebook login
	package Locators;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class test8 {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.linkedin.com/");
			driver.findElement(By.id("session_key")).sendKeys("ramiyas@gmail.com");
			driver.findElement(By.id("session_password")).sendKeys("Sairam!1");
			driver.findElement(By.xpath("//button[@class='sign-in-form__submit-button']")).click();
			Thread.sleep(10000);
			String actTitle=driver.getTitle();
			//String actTitle=driver.findElement(By.xpath("//title[contains(text(),'Feed | LinkedIn')]")).getText();
			System.out.println(actTitle);
			String expTitle=("Feed | LinkedIn");
			if(actTitle.equals(expTitle))
			System.out.println("Pass,Successfully logged in linkedin");
			else
			System.out.println("Fail,Not logged in linkedin");
			driver.close();
			
				
					

		}

	}

