package com.wallmonkey.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.wallmonkey.utility.Utility;

public class BaumgamesSignupCaptcha extends Utility
{
	public BaumgamesSignupCaptcha(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how= How.XPATH, using="//div[@class='modal-content model-bgcolor']/button[@data-dismiss='modal']")
	WebElement dismiss;
	
	@FindBy(how= How.CSS, using="input[id=lnkJoin_Now]")
	WebElement Signup;
	
	@FindBy(how=How.CSS, using="form[id=playerFormRegister]")
	WebElement signupform;
	
		public void signup() 
		{
			fluentwaittillvisibilityofelement(dismiss);
			dismiss.click();
			fluentwaittillvisibilityofelement(Signup);
			Signup.click();
			fluentwaittillvisibilityofelement(signupform);
			
		}

}
