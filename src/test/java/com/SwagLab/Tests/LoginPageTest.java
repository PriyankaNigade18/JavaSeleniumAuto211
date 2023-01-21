package com.SwagLab.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.SwagLab.Pages.LoginPage;

public class LoginPageTest extends BaseTest 
{
	//WebDriver driver;
	
	
	
	
	@Test(priority=1)
	public void verifyTitle()
	{
		String title=lp.getAppTitle();
		Assert.assertTrue(title.contains("Labs"));
		test.pass("Login page Title matched.....Test Pass");
		System.out.println("Valid title is: "+title);
	}
	
	
  @Test(priority=2)
  public void loginTest() 
  {
	 
	  lp.doLogin("standard_user","secret_sauce");
	  test.pass("Login Process Completed!");
  }
  
  
  
}
