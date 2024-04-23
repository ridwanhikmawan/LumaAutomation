package com.luma.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	
	public ReadConfig()
	{
		File src = new File("./Configuration/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}
	
	public String getApplicationURL()
	{
		String url=pro.getProperty("baseURL");
		return url;
	}
	
	public String getUsername()
	{
	String username=pro.getProperty("username");
	return username;
	}
	
	public String getPassword()
	{
	String password=pro.getProperty("password");
	return password;
	}
	
	public String getSearchProduct()
	{
	String product=pro.getProperty("product");
	return product;
	}
	
	public String getStreetName()
	{
	String streetname=pro.getProperty("streetname");
	return streetname;
	}
	
	public String getCityName()
	{
	String cityname=pro.getProperty("cityname");
	return cityname;
	}
	
	public String getPostCode()
	{
	String postcode=pro.getProperty("postcode");
	return postcode;
	}
	
	public String getPhoneNumber()
	{
	String phonenumber=pro.getProperty("phonenumber");
	return phonenumber;
	}
	
	public String getChromePath()
	{
	String chromepath=pro.getProperty("chromepath");
	return chromepath;
	}
	
	public String getIEPath()
	{
	String iepath=pro.getProperty("iepath");
	return iepath;
	}
	
	public String getFirefoxPath()
	{
	String firefoxpath=pro.getProperty("firefoxpath");
	return firefoxpath;
	}

	
}
