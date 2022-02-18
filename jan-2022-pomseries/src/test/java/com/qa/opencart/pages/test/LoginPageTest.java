package com.qa.opencart.pages.test;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.utlitlity.Constants;

public class LoginPageTest extends BaseTest{
	
	@Test(priority=1)
	public void loginpagTitletest()
	{
		String acttitle=loginpage.getloginpagetitle();
		System.out.println("page title :"+acttitle);
		Assert.assertEquals(acttitle, Constants.LOGIN_PAGE_TITLE);
	}

	
	@Test(priority=2)
	public void loginpageurltest()
	{
		String acturl=loginpage.getcurrenturl();
		System.out.println("page current url:"+acturl);
		Assert.assertTrue(acturl.contains(Constants.LOGIN_PAGE_URL_FRACTION));
	}
	
	@Test(priority=3)
	public void forgetpwdlinkexist()
	{
		boolean flag=loginpage.isfogetpwdlinkexistornot();
		Assert.assertTrue(flag);
		
	}
	
	@Test(priority=4)
	
		public void registerlinktext()
		{
			Assert.assertTrue(loginpage.isregisterlinkexistornot());
		}
	
	@Test(priority=5)
	
		public void logintest()
		{
			loginpage.dologin(prop.getProperty("username"),prop.getProperty("password"));
		}
	
}
