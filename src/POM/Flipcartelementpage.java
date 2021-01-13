package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Flipcartelementpage {
	@FindBy(xpath="(//select[@class='_2YxCDZ'])[1]")
	private WebElement min;
	Flipcartelementpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void selectelement(int s)
	{
		Select s1=new Select(min);
		s1.selectByIndex(s);
		
		
	}
	@FindBy(xpath="(//select[@class='_2YxCDZ'])[2]")
	private WebElement max;
	public void selectelementmax(int m)
	{
		Select m1=new Select(max);
		m1.selectByIndex(m);;
		
		
	}
	@FindBy(xpath="//a[@title='Duroflex Essential Edge 4 inch Single PU Foam Mattress']")
	private WebElement selele;
	public void eleClick()
	{
		selele.click();
	}
	
}
