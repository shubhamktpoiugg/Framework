package com.qa.utilities;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

public class ReadConfig {
	Properties pro;
	
	
	public ReadConfig()
	{
		File src=new File("C:\\Users\\Admin\\eclipse-workspace\\FullActiManager3\\src\\"
				+ "main\\java\\com\\qa\\configfiles\\config.properties");
		
		try {
			FileInputStream fis=new FileInputStream(src);
			 pro=new Properties();
			 pro.load(fis);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
//	public void getActiTimeUrl()
//	{
//	String baseURL	=pro.getProperty("URL");
//	return baseURL;
//	}

	public String getApplicationUrl()
	{
	String baseURL	=pro.getProperty("URL");
	return baseURL;
	}
	
	public String getApplicationUserName()
	{
		String baseUSER=pro.getProperty("USER");
		return baseUSER;
	}
	
	public String getApplicationPassword()
	{
		String basePASSWORD=pro.getProperty("PASSWORD");
		return basePASSWORD;
	}
	
	
	
}
