package com.qa.opencart.driverfactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class driverFactory {
	
	public WebDriver driver;
	public Properties prop;
	
	/**
	 * this method is used to initialized webdriver
	 * @param browsername
	 * @return
	 */
	
	public WebDriver init_driver(Properties prop)
	
	{
		String browsername=prop.getProperty("browser");
		
		System.out.println("browsername:"+browsername);
		if(browsername.equals("chrome"))
		{
		
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
			
		}
		else if(browsername.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
		}
		else 
		{
			System.out.println("please pass the right browser"+browsername);
		}
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		return driver;
	}
	
	/**
	 * this method is used to initialize property
	 * @return
	 */
	public Properties init_prop()
	{
		prop=new Properties();
		try {
			FileInputStream ip=new FileInputStream("./config/config.properties");
			try {
				prop.load(ip);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		return prop;
	}

}
