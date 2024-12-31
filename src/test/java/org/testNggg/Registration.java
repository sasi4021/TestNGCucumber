package org.testNggg;

import org.testng.annotations.Test;
import org.base.BaseClass;
import org.testng.annotations.*;

public class Registration extends BaseClass{
	
	
  @BeforeMethod
  public void launch()
  {
	  launchBrowser();
  }
  
  @AfterMethod
  public void quit()
  {
	  tearDown();
  }
  
  @Test
  public void register()
  {
//	  RegBtn("//a[text()='REGISTER']");
//	  sendKeys("firstName","sasi");
//	  sendKeys("lastName", "v");
//	  sendKeys("phone", "454676674");
//	  sendKeys("userName", "sasi@gmail.com");
//	  sendKeys("address1", "cbe");
//	  sendKeys("city", "oimbatore");
//	  sendKeys("state", "TN");
//	  sendKeys("postalCode", "4657654");
//	  dropDown("country", "ANDORRA");
//	  sendKeys("email", "sasi1234@gmail.com");
//	  sendKeys("password","46457754");
//	  sendKeys("confirmPassword", "46457754");
//	  submitBtn("submit");
//	  
	  
  }



}
	