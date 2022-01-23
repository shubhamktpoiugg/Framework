package com.qa.utilities;

import java.io.File;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.qa.testBase.TestBase;

public class UtilClass extends TestBase {
	
	
	public void screenshot(String name) throws Exception
	{File src1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File drc=new File("C:\\Users\\Admin\\eclipse-workspace\\FullActiManager3"
			+ "\\src\\main\\java\\com\\qa\\utilities\\Screenshot"+name+".png");//append
	FileHandler.copy(src1, drc);
	}
}
