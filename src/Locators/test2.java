		package Locators;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class test2{

			public static void main(String[] args) {
				
				// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.facebook.com/");
				driver.findElement(By.id("email")).sendKeys("ramiyas@gmail.com");
				driver.findElement(By.name("pass")).sendKeys("Sairam!1");
				driver.findElement(By.linkText("Forgotten password?")).click();
				driver.findElement(By.id("identify_email")).sendKeys("9845443750");
				driver.navigate().back();

			}

		

		// TODO Auto-generated method stub

	

}
