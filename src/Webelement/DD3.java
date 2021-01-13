
	//WAS to check whether it is a singleselect or multiselect dropdown if it is multiple select deselect the option
	package Webelement;

	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class DD3 {

		public static void main(String[] args) throws InterruptedException {
			
					System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
					WebDriver driver=new ChromeDriver();
					driver.get("file:///C:/purvi/javaproject/test.html");
					WebElement ele=driver.findElement(By.id("Saravanas"));
					Select s=new Select(ele);
				//List<WebElement>options=s.getOptions();
				//System.out.println(s.s);
					Thread.sleep(3000);
					s.selectByIndex(1);
					Thread.sleep(5000);
					s.selectByValue("c");
					Thread.sleep(3000);
					s.selectByVisibleText("idly");
					if(s.isMultiple())
					{
						System.out.println("pass"+""+" it is multiple selection dropdown");
						s.deselectByIndex(1);
						s.deselectByValue("c");
						s.deselectByVisibleText("idly");
					}
						else
					{
							System.out.println("fail"+"it is not multiple selection dropdown");
					}
					driver.close();
		}
	}
