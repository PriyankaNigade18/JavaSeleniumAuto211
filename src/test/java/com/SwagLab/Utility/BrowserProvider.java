package com.SwagLab.Utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserProvider
{
	
	public static WebDriver driver;
	
	public static WebDriver browserSetup(String bname)
	{
		if(bname.equalsIgnoreCase("chrome"))
		{
		 driver=new ChromeDriver();
			
		}else if(bname.equalsIgnoreCase("firefox"))
		{
		driver=new FirefoxDriver();	
		}else if(bname.equalsIgnoreCase("edge"))
		{
		driver=new EdgeDriver();	
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		
		return driver;		
	}
	

}
