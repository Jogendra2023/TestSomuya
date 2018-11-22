package com.wallmonkey.test;

import org.testng.annotations.Test;

import com.wallmonkey.utility.Utility;

public class Login_test extends Utility
{
	@Test(groups="Login" , description="Login to Application")
	
	public void logintoappwithvalid() throws Exception
	{
		try
		{
		System.out.println("Inside the Login Test Class");
		login_page.loginapp();
		writetoexcel(filepath, "Result", "Login with valid credential", "PASSED");
		}
		catch (Exception e)
		{
			e.printStackTrace();
			writetoexcel(filepath, "Result", "Login with valid credential", "FAILED");
		}
	}

}
