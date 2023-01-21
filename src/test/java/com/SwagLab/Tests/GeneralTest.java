package com.SwagLab.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GeneralTest {
  @Test
  public void swaglogin()
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.saucedemo.com/");
	  
	  driver.findElement(By.id("user-name")).sendKeys("standard_user");
	  driver.findElement(By.id("password")).sendKeys("secret_sauce");
	  driver.findElement(By.id("login-button")).click();
	  
	  System.out.println("Title is: "+driver.getTitle());
	  
	  driver.quit();
	  
  }
}
