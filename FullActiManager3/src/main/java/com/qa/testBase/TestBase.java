package com.qa.testBase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.qa.utilities.ReadConfig;
import com.qa.utilities.UtilClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	
	
	ReadConfig readcon=new ReadConfig();
	
	public static WebDriver driver;
	
	@Parameters("browser")
	@BeforeMethod
	public void setUp(String br) throws IOException
	{	
		if(br.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver =new FirefoxDriver();
		}
		else 
		{
			System.out.println("Please Enter Brower Name");
		}
	
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		//driver.get(readcon.getApplicationUrl());
		//readcon.getApplicationUserName();
		//readcon.getApplicationPassword();
		
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
