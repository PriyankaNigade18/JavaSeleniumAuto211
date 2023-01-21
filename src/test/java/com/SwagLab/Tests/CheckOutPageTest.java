package com.SwagLab.Tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckOutPageTest extends BaseTest 
{
	@BeforeClass
	public void  pageSetUp()
	{
		lp.doLogin("standard_user","secret_sauce");
		waitForPage();
		pp.addProductToCart("Sauce Labs Fleece Jacket");
		waitForPage();
		cp.doCheckout();
	}
	
  @Test
  public void testCheckout() 
  {
	  chk.doContinueCheckout("Priyanka","Nigade","411014");
  }
}
