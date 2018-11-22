package com.wallmonkey.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.wallmonkey.utility.Utility;

public class Backbone_test extends Utility
{

	@FindBy(how = How.XPATH, using="//a/span/span[contains (text(),'Customer-Projects')]")
	WebElement customerproject;
	
	
	
	@Test(priority = 3)
	public void closetestcase1() throws Exception
	{
		driver.get("http://backbone:9090/SitePages/Home.aspx");
		Backbone_page.closeactivetextcase();
		
	}
	
	
}
