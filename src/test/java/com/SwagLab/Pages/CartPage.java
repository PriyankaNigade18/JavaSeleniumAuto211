package com.SwagLab.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage 
{

	private WebDriver driver;
	
	//Initialize driver
	public CartPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Identification
	private By removebtn=By.xpath("//button[text()='Remove']");
	private By conbtn=By.xpath("//button[text()='Continue Shopping']");
	private By checkbtn=By.id("checkout");
	
	
	
	//Actions
	public void doRemove()
	{
		driver.findElement(removebtn).click();
	}
	
	public void doContinueShopping()
	{
		driver.findElement(conbtn).click();
	}
	
	
	public void doCheckout()
	{
		driver.findElement(checkbtn).click();
	}
	
	
	
	
	
	
}
