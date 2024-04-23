package com.luma.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.luma.pageObjects.LoginPage;
import com.luma.pageObjects.OrderPage;

public class TC_OrderTest extends BaseClass 
{

	@Test
	public void orderTest() throws IOException, InterruptedException
	{	
		driver.get(baseURL);
		logger.info("URL is opened");
		
		LoginPage lp=new LoginPage(driver);
		lp.clickSignIn();
		logger.info("Login page is opened");
		
		lp.setUserName(username);
		logger.info("Entered username");
		
		lp.setPassword(password);
		logger.info("Entered password");
		
		lp.clickSubmit();
		
		if(driver.getTitle().equals("Home Page"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
		
		Thread.sleep(3000);
		
		OrderPage op=new OrderPage(driver);
		
		op.setSrchProduct(product);

		op.clickSearch();
		logger.info("Search Product");
		
		Thread.sleep(3000);
		
		op.clickSize();
		
		op.clickColor();
		
		Thread.sleep(3000);
		
		op.clickAdd();
		logger.info("Add Product To Cart");
		
		Thread.sleep(3000);
		
		op.clickCart();
		logger.info("Open My Cart");
		
		Thread.sleep(3000);
		
		op.clickProceed();
		logger.info("Open Checkout Page");
		
		Thread.sleep(3000);
		
		//op.clickNewAddress();
		//logger.info("New Address");
		
		//Thread.sleep(3000);
		
		//op.setStrName(streetname);
		//logger.info("Entered Street");
		
		//op.setCtyName(cityname);
		//logger.info("Entered City");
		
		//op.setSlctProv();
		//logger.info("Select Province");
		
		//op.setPostNum(postcode);
		//logger.info("Entered Postcode");
		
		//op.setPhoneNum(phonenumber);
		//logger.info("Entered Phone Number");
		
		//op.clickShpHere();
		
		//Thread.sleep(3000);
		
		op.clickShp();
		logger.info("Shipping Option");
		
		op.clickNext();
		logger.info("Open Confirm Page");
		
		Thread.sleep(8000);
		
		op.clickOrder();
		logger.info("Order Finish");
		
		
		
	}
}
