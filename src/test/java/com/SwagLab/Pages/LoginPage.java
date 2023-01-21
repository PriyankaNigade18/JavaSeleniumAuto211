package com.SwagLab.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage
{//Encapsulation=Identification+Action
	
	private WebDriver driver;
	
	//initialize driver
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Identification
	private By username=By.id("user-name");
	private By password=By.id("password");
	private By loginbtn=By.id("login-button");
	
	
	
	//Actions
	
	public void doLogin(String un,String psw)
	{
		driver.findElement(username).sendKeys(un);
		driver.findElement(password).sendKeys(psw);
		driver.findElement(loginbtn).click();
	}
	
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	public String getAppCurrentUrl()
	{
		return driver.getCurrentUrl();
	}
	
	
	
	
	
	

}
