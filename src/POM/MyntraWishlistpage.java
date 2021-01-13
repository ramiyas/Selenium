package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyntraWishlistpage {

	@FindBy(xpath="//span[text()='WISHLIST']")
	private WebElement addWL;
	private WebDriver driver;
	MyntraWishlistpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	public void WLClick()
	{
		Actions a=new Actions(driver);
		a.moveToElement(addWL).perform();
		a.click(addWL).perform();
		//WebDriverWait ew=new WebDriverWait(driver,5);
		//ew.until(ExpectedConditions.elementToBeClickable(addWL));
		//{
		//addWL.click();
	//}
	}
}
