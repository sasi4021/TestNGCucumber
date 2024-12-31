package org.testNggg;

import java.io.IOException;

import org.base.BaseClass;
import org.pom.LoginPom;
import org.testng.annotations.Test;

public class Sample extends BaseClass{
	
	@Test
	private void test() throws IOException {
		LoginPom l=new LoginPom();
		getPropertySend(l.getUserName(),"username");
		
	}

}
