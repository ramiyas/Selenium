package pack1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test0 {
public static void main(String[]args){
	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
	FirefoxDriver driver1=new FirefoxDriver();
}
}
