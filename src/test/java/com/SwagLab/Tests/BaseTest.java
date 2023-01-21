package com.SwagLab.Tests;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.SwagLab.Pages.*;
import com.SwagLab.Utility.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class BaseTest
{
	public WebDriver driver;
	public LoginPage lp;
	public ProductPage pp;
	public CartPage cp;
	public CheckOutPage chk;
	public OrderDescription op;
	public PropertiesFile pf;
	public ExcelUtil excel;
	
	public ExtentSparkReporter avent;
	public ExtentReports reports;
	public ExtentTest test;

	
	
	@BeforeSuite
	public void reportsSetup()
	{avent = new ExtentSparkReporter("./"+"\\Reports\\SwagReport"+System.currentTimeMillis()+".html");
	reports=new ExtentReports();
	reports.attachReporter(avent);
	test = reports.createTest("SwagLabs Reports");
		
	}
	
	@AfterSuite
	public void closeReports()
	{
		reports.flush();
	}
	
	
	
	@BeforeTest
	public void setUp()
	{	 pf=new PropertiesFile();
//		driver=new ChromeDriver();
//		driver.get("https://www.saucedemo.com/");
		driver=BrowserProvider.browserSetup(PropertiesFile.getData("bname"));
		lp=new LoginPage(driver);
		pp=new ProductPage(driver);
		cp=new CartPage(driver);
		chk=new CheckOutPage(driver);
		op=new OrderDescription(driver);
		excel=new ExcelUtil();
		
		
	}
	
	@BeforeClass
	public void  pageSetUp()
	{
		getScreenshot();
		test.pass("Login Page title is matched!");
		Reporter.log("SwagLab Login Process is started....", true);
		//lp.doLogin(PropertiesFile.getData("username"),PropertiesFile.getData("password"));
		lp.doLogin(ExcelUtil.getData(0, 0),ExcelUtil.getData(0, 1));
		test.pass("Login Process Completed!");

		Reporter.log("SwagLab Login Process is completed....", true);
		waitForPage();
		getScreenshot();
		pp.addProductToCart(PropertiesFile.getData("pname"));
		test.pass("Product added!");

		Reporter.log("SwagLab Product added to Cart....", true);
		waitForPage();
		getScreenshot();
		cp.doCheckout();
		test.pass("Checkout Process is completed!");
		Reporter.log("SwagLab CartProcess is completed ....", true);
		waitForPage();
		getScreenshot();
		Reporter.log("SwagLab Checkout Process is started....", true);
		chk.doContinueCheckout(PropertiesFile.getData("fname"), PropertiesFile.getData("lname"), PropertiesFile.getData("zip"));
		Reporter.log("SwagLab CheckOut Process is completed....", true);
		getScreenshot();
	}
	
	public void getScreenshot()
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./"+"\\Screenshots\\swag"+System.currentTimeMillis()+".png");
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	//@AfterTest
	  public void tearDown()
	  {
		  driver.quit();
	  }
	  
	  
	  public void waitForPage()
	  {
		  try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	  
	  
	  
}


