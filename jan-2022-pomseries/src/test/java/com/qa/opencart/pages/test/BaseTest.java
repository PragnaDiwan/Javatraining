package com.qa.opencart.pages.test;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.opencart.driverfactory.driverFactory;
import com.qa.opencart.pages.LoginPage;

public class BaseTest {
	
	driverFactory df;
	Properties prop;
	WebDriver driver;
	LoginPage loginpage;

	@BeforeTest
	public void setup()
	{
		df=new driverFactory();
		prop=df.init_prop();
		driver=df.init_driver(prop);
		loginpage=new LoginPage(driver);
	}
	
	
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
	
	
	
	
	

}
