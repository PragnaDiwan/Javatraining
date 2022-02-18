package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.utlitlity.Elementutl;

public class LoginPage {
	
	private WebDriver driver;
	private Elementutl eleutl;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		eleutl=new Elementutl(driver);
	}
	
	private By emailid=By.id("input-email");
	private By password=By.id("input-password");
	private By Loginbtn=By.xpath("//input[@type='submit' and @value='Login']");
	private By reglink=By.linkText("Register");
	private By forgetpwd=By.linkText("Forgotten Password");
	
	public String getloginpagetitle()
	{
		return driver.getTitle();
	}
	
	
	public String getcurrenturl()
	{
		return driver.getCurrentUrl();
	}
	
	public boolean isregisterlinkexistornot()
	{
		return eleutl.doIsDisplayed(reglink);
	}
	
	public boolean isfogetpwdlinkexistornot()
	{
		return eleutl.doIsDisplayed(forgetpwd);
	}
	
	public void dologin(String un,String pwd)
	{
		eleutl.doSendKeys(emailid,un);
		eleutl.doSendKeys(password,  pwd);
		eleutl.doClick(Loginbtn);
	}
	
}
