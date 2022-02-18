package selenuimsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtl {

	
	public WebDriver driver;
	/**
	 * this method is used to launch the browser
	 * @param browser
	 * @return this will return the driver
	 */
	public WebDriver launchbrowser(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\NEW-1\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			
			driver=new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\NEW-1\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			 driver=new FirefoxDriver();
		}
				
		else
		{
			System.out.println("please pass the right browser:"+browser);
		}
		
		return driver;		
		
	}
	
	/**
	 * This method is ued to enter url
	 * 
	 * @param url
	 */
	public void Enterurl(String url)
	{
		if(url==null)
		{
			System.out.println("url is null");
			return;
		}
		
		if(url.indexOf("http")==-1)
		{
			System.out.println("url is missing");
			return;
		}
         driver.get(url);
	}
	
	/**
	 * this method provide currenturl
	 * @return
	 */
	public String getcurrenturl()
	{
		return driver.getCurrentUrl();
	}
	
	
	/**
	 * this method provide the page title
	 * @return
	 */
		
	public String getpagetitle()
	{
		return driver.getTitle();
	}
		
	
	public void quitBrowser()
	{
		driver.quit();
	}
		
	public void closeBrowser()
	{
		driver.close();
	}

	}


