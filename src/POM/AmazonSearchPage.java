package POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSearchPage {
	@FindBy(xpath="(//span[contains(text(),\"Black - 16GB \")])[1]")
	private WebElement ilink;
	public AmazonSearchPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void phclick()
	{
		ilink.click();
	}
	

}
