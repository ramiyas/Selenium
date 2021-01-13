package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Myntrasareepage {
	@FindBy(xpath="//span[text()='919']")
	private WebElement saree;
	
	Myntrasareepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void sareeclick()
	{
		saree.click();
	}

}
