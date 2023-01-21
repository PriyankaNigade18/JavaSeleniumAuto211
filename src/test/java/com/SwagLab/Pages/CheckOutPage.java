package com.SwagLab.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage
{
	private WebDriver driver;
	
	public CheckOutPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Locator
	private By firstname=By.id("first-name");
	private By lastname=By.id("last-name");
	private By zipcode=By.id("postal-code");
	private By cancelbtn=By.id("cancel");
	private By continuebtn=By.id("continue");
	
	
	//Actions
	
	public void doContinueCheckout(String fname,String lname,String zipc)
	{
		driver.findElement(firstname).sendKeys(fname);
		driver.findElement(lastname).sendKeys(lname);
		driver.findElement(zipcode).sendKeys(zipc);
		driver.findElement(continuebtn).click();
		
		
	}
	
	public void doCancelCheckout()
	{
	driver.findElement(cancelbtn).click();		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
