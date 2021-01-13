package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonAddtoCartpage {

	@FindBy(id="add-to-cart-button")
	private WebElement addBtn;
	public AmazonAddtoCartpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void btnclick()
	{
		addBtn.click();
	}
}
