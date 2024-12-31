package org.testNggg;

import org.testng.annotations.Test;
import org.base.BaseClass;
import org.pom.LoginPom;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class LoginInfo extends BaseClass{
	
	

	@BeforeMethod
	public void launchBrowserr()
	{
		launchBrowser();
		get("https://demo.guru99.com/test/newtours/");
		
	}
	
	@Test
	public void login() throws InterruptedException
	{
		Thread.sleep(2000);
		LoginPom l = new LoginPom();

		sendKeys(l.getUserName(),"sasi");
		sendKeys(l.getPassWord(),"sasi12344");
		loginBtn(l.getSubmit());
		
		 
	}
	
	@AfterMethod
	public void quitt()
	{
		tearDown();
	}
	
}
