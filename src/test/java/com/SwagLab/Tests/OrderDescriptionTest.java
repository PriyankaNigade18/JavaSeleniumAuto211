package com.SwagLab.Tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OrderDescriptionTest extends BaseTest 
{
//	@BeforeClass
//	public void  pageSetUp()
//	{
//		lp.doLogin("standard_user","secret_sauce");
//		waitForPage();
//		pp.addProductToCart("Sauce Labs Fleece Jacket");
//		waitForPage();
//		cp.doCheckout();
//		waitForPage();
//		chk.doContinueCheckout("priyanka", "Nigade", "411014");
//	
//	}
  @Test
  public void testOrderDescription()
  {
	  op.checkDescription();
	  test.pass("Order successfully placed!");
  }
}
