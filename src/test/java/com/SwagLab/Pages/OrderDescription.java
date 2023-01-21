package com.SwagLab.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderDescription 
{
	private WebDriver driver;
	
	public OrderDescription(WebDriver driver)
	{
		this.driver=driver;
	}

	
	//locator
	private By finishbtn=By.id("finish");
	private By cacelbtn=By.id("cancel");
	private By details=By.xpath("//div[@id='checkout_summary_container']");
	private By ftext=By.xpath("//h2[text()='THANK YOU FOR YOUR ORDER']");
	
	//Actions
	public void checkDescription()
	{
		String text=driver.findElement(details).getText();
		System.out.println("********Product Information**********");
		System.out.println(text);
		driver.findElement(finishbtn).click();
		System.out.println(driver.findElement(ftext).getText());
				
	}
	
	public void doCacel()
	{
		driver.findElement(cacelbtn).click();
	}
	
}
