package com.wallmonkey.test;

import org.testng.annotations.Test;

import com.wallmonkey.utility.Utility;

	public class BaumgamesSignupCaptcha_Test extends Utility
	{
		
		@Test(priority =1, groups="ReadCaptcha",description="Reading Captcha")
		public void readcaptcha()
		{
			
			BaumgamesSignupCaptcha_page.signup();
			
		}
	}
