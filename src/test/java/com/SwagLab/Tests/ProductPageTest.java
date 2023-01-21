package com.SwagLab.Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProductPageTest extends BaseTest 
{
	@BeforeClass
	public void  pageSetUp()
	{
		lp.doLogin("standard_user","secret_sauce");
	}
	
	
	
  @Test(priority=1)
  public void verifyProductCount()
  {
	  int count=pp.getListOfProducts();
	  Assert.assertTrue(count==6);
	  System.out.println("Total products are: "+count);
  }
  
  @Test(priority=2)
  public void verifyLables()
  {
	  pp.getLabelOfProducts();
  }
  
  @Test(priority=3)
  public void verifyFilterOptions()
  {
	  pp.getFilterOptions();
	  
  }
  
  @Test(priority=4)
  public void addProduct()
  {
	  pp.addProductToCart("Sauce Labs Fleece Jacket");
	  test.pass("Product added to the cart!");
  }
  
  
}
