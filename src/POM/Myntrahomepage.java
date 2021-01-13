package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Myntrahomepage {
	@FindBy(xpath="(//a[text()='Women'])[1]")
	private WebElement menu1;
	private WebDriver driver;
	@FindBy(xpath="//a[text()='Sarees']")
	private WebElement ele;
	Myntrahomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public void eleclick() {
		
		Actions a=new Actions(this.driver);
		a.moveToElement(menu1);
		a.perform();
		a.moveToElement(ele).perform();
		a.click(ele).perform();
	}
}
