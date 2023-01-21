package com.SwagLab.Tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CartPageTest extends BaseTest 
 {
	
	
	@BeforeClass
	public void  pageSetUp()
	{
		lp.doLogin("standard_user","secret_sauce");
		pp.addProductToCart("Sauce Labs Fleece Jacket");
	}
	
  @Test(priority=1,enabled=false)
  public void verifyRemoveFeature()
  {
	  cp.doRemove();
  }
  
  @Test(priority=2)
  public void verifyCheckOut()
  {
	  cp.doCheckout();
	  test.pass("Product In cart page display!");
  }
}
