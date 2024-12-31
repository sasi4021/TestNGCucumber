package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;

public class LoginPom extends BaseClass {
	
	
	public LoginPom()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="userName")
	private WebElement userName;
	
	@FindBy(name="password")
	private WebElement passWord;
	
	@FindBy(name="submit")
	private WebElement submit;
	
	

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getSubmit() {
		return submit;
	}

	
	
	
	
	
	

}
