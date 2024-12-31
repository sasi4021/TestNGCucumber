package org.testNggg;

import java.io.IOException;

import org.base.*;
import org.openqa.selenium.WebElement;
import org.pom.LoginPom;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginWithPropertyFile extends BaseClass {
	
	 LoginPom l ;
	 
	 
	@BeforeMethod
	public void launch() throws InterruptedException
	{
		launchBrowser();
		get("https://demo.guru99.com/test/newtours/");
		Thread.sleep(1000);
	}
	
	@Test
	public void login() throws IOException
	{
		l=new LoginPom();
		getPropertySend(l.getUserName(),"username");
		getPropertySend(l.getPassWord(), "password");
	}
	
	

	@AfterMethod
	public void quit()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
