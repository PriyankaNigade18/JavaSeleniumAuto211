package com.SwagLab.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ProductPage 
{

	private WebDriver driver;
	
	//initialize driver
	public ProductPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	//Identification
	private By allproduct=By.xpath("//div[@class='inventory_list']//div[@class='inventory_item_name']");
	private By ddele=By.className("product_sort_container");
	private By addToCartbtn=By.xpath("//button[text()='Add to cart']");
	private By cartopt=By.xpath("//a[@class='shopping_cart_link']");
	
	//Actions
	
	public int getListOfProducts()
	{
		return driver.findElements(allproduct).size();
	}
	
	public void getLabelOfProducts()
	{
		List<WebElement> list=driver.findElements(allproduct);
		for(WebElement i:list)
		{
			System.out.println(i.getText());
		}
	}
	
	public void getFilterOptions()
	{
		Select s1=new Select(driver.findElement(ddele));
		//allOptions
		List<WebElement> list=s1.getOptions();
		for(WebElement i:list)
		{
			System.out.println(i.getText());
		}
	}
	
	public void addProductToCart(String pname)
	{
		List<WebElement> list=driver.findElements(allproduct);
		for(WebElement i:list)
		{
			if(i.getText().equals(pname))
			{
				i.click();
				break;
			}
		}
		
		driver.findElement(addToCartbtn).click();
		System.out.println("Product got added into Cart!");
		
		driver.findElement(cartopt).click();
		System.out.println("Add To cart page is open");
		
	}
	
	
	
	
	
	
	
	
}
