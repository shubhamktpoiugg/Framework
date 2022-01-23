package com.qa.pageLayer;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;
import com.qa.utilities.ReadConfig;

public class LoginPage extends TestBase {
	
	
	ReadConfig readcon  =new ReadConfig();
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name = 'username']")
	WebElement urs;
	public void enterUserNameActiTime()
	{	urs.sendKeys("amdin");
		//urs.sendKeys(readcon.getApplicationUserName());
	}
	
	@FindBy(xpath="//input[@name = 'pwd']")
	WebElement pwd;
	public void enterPasswordActiTime()
	{
		pwd.sendKeys("manager");
	//	pwd.sendKeys(readcon.getApplicationPassword());
		
	}
	
	@FindBy(xpath="//a[@id= 'loginButton']")
	WebElement logbtn;
	public void clickOnLoginButton()
	{
		logbtn.click();
	}
	
	
	public String getTitle1()
	{
		String t=driver.getTitle();
		return t;
	}
	
	
	
	
	
	
	
	
}
