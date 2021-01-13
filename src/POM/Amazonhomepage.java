package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;import org.openqa.selenium.support.PageFactory;



public class Amazonhomepage {
	@FindBy(id="twotabsearchtextbox")
	private WebElement SearchTB;
	@FindBy(xpath="//input[@value='Go']")
	private WebElement GoBtn;
	
	public Amazonhomepage(WebDriver driver)
	{
PageFactory.initElements(driver,this);
	

	}
public void searchTextbox(String text)
{
	SearchTB.sendKeys(text);
}
public void Go()
{
GoBtn.click();
}}

