package com.qa.testCases;





import org.testng.Assert;
import org.testng.annotations.Test;


import com.qa.pageLayer.LoginPage;
import com.qa.testBase.TestBase;




public class TestLoginPage extends TestBase {

	
	LoginPage l;
	
	@Test
	public void verifyLogin() 
	{
		l=new LoginPage();
		l.enterUserNameActiTime();
		l.enterPasswordActiTime();
		l.clickOnLoginButton();
		
	}
	@Test
	public void verifyPageTitle() 
	{l.getTitle1();
	
	System.out.println(l.getTitle1());
	Assert.assertEquals(l.getTitle1(),"actiTIME - Login" );
	
	}
}
