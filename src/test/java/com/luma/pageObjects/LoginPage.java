package com.luma.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//div[@class='panel header']//a[contains(text(),'Sign In')]")
	@CacheLookup
	WebElement btnSignIn;
	
	@FindBy(xpath="//input[@id='email']")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(xpath="//fieldset[@class='fieldset login']//input[@id='pass']")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(xpath="//div[@class='panel header']//button[@type='button']")
	@CacheLookup
	WebElement lnkProfile;
	
	@FindBy(xpath="//div[@aria-hidden='false']//a[normalize-space()='Sign Out']")
	@CacheLookup
	WebElement lnkLogout;
	
	
	public void clickSignIn()
	{
		btnSignIn.click();
	}
	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void clickSubmit()
	{
		btnLogin.click();
	}	
	
	public void clickProfile()
	{
		lnkProfile.click();
	}
	
	public void clickLogout()
	{
		lnkLogout.click();
	}
}
