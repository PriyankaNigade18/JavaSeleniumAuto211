package com.SwagLab.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemo 
{
	public ExtentSparkReporter avent;
	public ExtentReports reports;
	public ExtentTest test;
	@BeforeClass
	public void reportSetup()
	{
		avent = new ExtentSparkReporter("./"+"\\Reports\\TestReport"+System.currentTimeMillis()+".html");
		reports=new ExtentReports();
		reports.attachReporter(avent);
		test = reports.createTest("MyFirstExtentTest");
	}
  @Test
  public void GoogleTest() 
  {
	  WebDriver driver=new ChromeDriver();
			 
	  driver.get("https://www.google.com");
			 
		if(driver.getTitle().equals("Google"))
		{
			test.pass("Title is matched....Test Pass");
		}
	  
		else
		{
			test.fail("Title is not matched....Test Fail");
		}
	  
 
  }
  
  @AfterClass
  public void closeReports()
  {
	  reports.flush();
  }
  
  
}
