package com.luma.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OrderPage {

WebDriver ldriver;
	
	public OrderPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//input[@id='search']")
	@CacheLookup
	WebElement searchBox;
	
	@FindBy(xpath="//button[@title='Search']")
	@CacheLookup
	WebElement searchBtn;
	
	@FindBy(xpath="//div[@id='option-label-size-143-item-169']")
	@CacheLookup
	WebElement productSize;
	
	@FindBy(xpath="//div[@id='option-label-color-93-item-52']")
	@CacheLookup
	WebElement productColor;
	
	@FindBy(xpath="//form[@data-role='tocart-form']//span[contains(text(),'Add to Cart')]")
	@CacheLookup
	WebElement addToCart;
	
	@FindBy(xpath="//a[@class='action showcart']")
	@CacheLookup
	WebElement cartBtn;
	
	@FindBy(xpath="//button[@id='top-cart-btn-checkout']")
	@CacheLookup
	WebElement proceed;
	
	@FindBy(xpath="//span[normalize-space()='New Address']")
	@CacheLookup
	WebElement newAddBtn;
	
	@FindBy(name="street[0]")
	@CacheLookup
	WebElement strName;
	
	@FindBy(name="city")
	@CacheLookup
	WebElement ctyName;
	
	@FindBy(name="region_id")
	@CacheLookup
	WebElement prov;
	
	@FindBy(name="postcode")
	@CacheLookup
	WebElement post;
	
	@FindBy(name="telephone")
	@CacheLookup
	WebElement phone;
	
	@FindBy(xpath="//span[normalize-space()='Ship here']")
	@CacheLookup
	WebElement shpHereBtn;
	
	@FindBy(name="ko_unique_1")
	@CacheLookup
	WebElement shpMthod;
	
	@FindBy(xpath="//button[@class='button action continue primary']")
	@CacheLookup
	WebElement nextBtn;
	
	@FindBy(xpath="//span[normalize-space()='Place Order']")
	@CacheLookup
	WebElement orderBtn;
	
	public void setSrchProduct(String prod)
	{
		searchBox.sendKeys(prod);
	}
	
	public void clickSearch()
	{
		searchBtn.click();
	}
	
	public void clickSize()
	{
		productSize.click();
	}
	
	public void clickColor()
	{
		productColor.click();
	}
	
	public void clickAdd()
	{
		addToCart.click();
	}
	
	public void clickCart()
	{
		cartBtn.click();
	}
	
	public void clickProceed()
	{
		proceed.click();
	}
	
	public void clickNewAddress()
	{
		newAddBtn.click();
	}
	
	public void setStrName(String str)
	{
		strName.sendKeys(str);
	}
	
	public void setCtyName(String cty)
	{
		ctyName.sendKeys(cty);
	}
	
	public void setSlctProv()
	{
		Select slProv=new Select(prov);
		slProv.selectByVisibleText("Arizona");
	}
	
	public void setPostNum(String pstnum)
	{
		post.sendKeys(pstnum);
	}
	
	public void setPhoneNum(String phn)
	{
		phone.sendKeys(phn);
	}
	
	public void clickShpHere()
	{
		shpHereBtn.click();
	}
	
	public void clickShp()
	{
		shpMthod.click();
	}
	
	public void clickNext()
	{
		nextBtn.click();
	}
	
	public void clickOrder()
	{
		orderBtn.click();
	}
}
