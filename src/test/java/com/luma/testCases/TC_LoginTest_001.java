package com.luma.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.luma.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass 
{

	@Test
	public void loginTest() throws IOException
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
		
	}
}
