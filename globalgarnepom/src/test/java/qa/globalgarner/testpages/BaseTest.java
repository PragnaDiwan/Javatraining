package qa.globalgarner.testpages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;


import qa.globalagarner.pages.loginpage.Loginpage;
import qa.globalgarner.driverfactory.Init_factory;

public class BaseTest {
	WebDriver driver;
	Properties prop;
	Init_factory df;
	Loginpage lp;
	
	
	@BeforeTest
	public void setup() throws InterruptedException
	{
		
	 df=new Init_factory();
	prop=df.properties();
	  driver=df.init_method(prop);
	  lp=new Loginpage(driver);
	 
	 
	
	 
	 
	}
	
	
	public void teardown()
	{
	   driver.quit();
	}
	

}
