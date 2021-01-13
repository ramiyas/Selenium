package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipcartSearchpage {

	@FindBy(name="q")
	private WebElement SearchTB;
	FlipcartSearchpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterdatainSB()
	{
		SearchTB.sendKeys("Furniture");
	}
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement ButtonGo;
	
	public void Goclick()
	{
		ButtonGo.click();
	}
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	private WebElement clsBtn;
	public void clsclick()
	{
		clsBtn.click();
	}
	@FindBy(xpath="//div[@class='_2MlkI1']")
	public WebElement cwin;
	

	}

