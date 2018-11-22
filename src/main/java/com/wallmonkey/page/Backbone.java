package com.wallmonkey.page;

import java.awt.List;
import java.util.ArrayList;
import java.util.ListIterator;

import org.apache.poi.util.SuppressForbidden;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.wallmonkey.utility.Utility;

public class Backbone extends Utility
{
	public Backbone (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how= How.XPATH, using="//a/span/span[contains (text(),'Customer-Projects')][1]")
	WebElement customerproject;
	
	@FindBy(how= How.XPATH, using="//li/ul[@class='static']/li")
	WebElement projectname;
	
	@FindBy(how =How.XPATH, using="//ul[@id='zz14_RootAspMenu']/li[3]/ul/li[4]")
	WebElement QA;
	
	@FindBy(how = How.XPATH, using="//span[@id='zz11_ListTitleViewSelectorMenu_t']")
	WebElement MyIssue;
	
	@FindBy(how = How.XPATH, using="//tr/th/div[@displayname='Issue Status']/a")
	WebElement Issuestatus;
	
	@FindBy(how = How.XPATH, using="//tr[@setedgeborder='true']/td[5]")
	WebElement teststatus;
	
	@FindBy(how = How.XPATH, using="//tr[@setedgeborder='true']/td[4]")
	WebElement testcasex;
	
	@FindBy(how = How.XPATH, using="//iframe[@class='ms-dlgFrame']")
	WebElement frame;
	
	@FindBy(how= How.XPATH, using="//a[@id='Ribbon.Tabs.InfoPathListDisplayTab.Manage.Controls.btnEdit-Large']")
	WebElement editbutton;
	
		public void closeactivetextcase() throws Exception
		{
			try
			{
			fluentwaittillvisibilityofelement(customerproject);
			customerproject.click();
			Thread.sleep(5000);
			
			java.util.List<WebElement> ele = driver.findElements(By.xpath("//li/ul[@class='static']/li"));
				for(WebElement x : ele)
				{
					
					System.out.println(x.getText());
					if(x.getText().contains("AssureSign-LGLA"))
					{
						x.click();
						fluentwaittillvisibilityofelement(QA);
						QA.click();
						break;
					}
				}
				
				
				MyIssue.click();
				Thread.sleep(7000);
				java.util.List<WebElement> opt = driver.findElements(By.xpath("//li[@class='ms-MenuUIULItem']"));
				for(WebElement y : opt)
				{
					System.out.println(y.getText());
					if(y.getText().equalsIgnoreCase("Test Cases"))
					{
						System.out.println(y.getText());
						y.click();
						break;
					}
				}
				
				Issuestatus.click();
				Thread.sleep(7000);
				
				for(int i=1; i<=30; i++)
				{
					Thread.sleep(5000);
					if((driver.findElement(By.xpath("(//tbody/tr[@class='ms-itmhover']/td[5])[" +i+ "]"))).getText().equalsIgnoreCase("Active"))
					{
						
						driver.findElement(By.xpath("(//tbody/tr[@class='ms-itmhover']/td[4]/div[1]/a)[" +i+ "]")).click();
						
						Thread.sleep(5000);
						driver.switchTo().frame(frame);
						editbutton.click();
						
				driver.findElement(By.xpath("//select[@id='ctl00_m_g_cfaf3f0a_ac2e_4498_8da0_e473d9b9894a_FormControl0_V1_I1_D7']")).click();
				driver.findElement(By.xpath("//select[@id='ctl00_m_g_cfaf3f0a_ac2e_4498_8da0_e473d9b9894a_FormControl0_V1_I1_D7']/option[@value='Closed']")).click();
				Thread.sleep(6000);		
				driver.findElement(By.xpath("//a[@id='Ribbon.Tabs.InfoPathListTab.Commit.Controls.btnSubmit-Large']")).click();
				
						System.out.println("No Of test cases: " +i);
				driver.switchTo().defaultContent();
					}
					
				}
				
			
			}
			catch(Exception e)
			{
				System.out.println("In Catch Block: " +e);
				e.printStackTrace();
			}
		}
	
}

