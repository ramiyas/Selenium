package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test0 {
	@Test(priority=1)
	public void calls()
	{
		Reporter.log("calls",true);
	}
	@Test(priority=-1,invocationCount=3)
	public void chats()
	{
		Reporter.log("chats",true);
	}
	@Test
	public void settings()
	{
		Reporter.log("settings",true);
	}
	
	
	

}
