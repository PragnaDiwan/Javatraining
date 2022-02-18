package qa.globalgarner.driverfactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Init_factory {
	
	String browsername;
	
	public  WebDriver driver;
	public Properties prop;
	
	public WebDriver init_method(Properties prop ) throws InterruptedException
	{
		String browsername=prop.getProperty("browser");
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
			System.out.println("please pass the right browser:"+browsername);
		}
		
		
		
		driver.manage().window().maximize();
		driver.get("https://www.globalgarner.com/");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		return driver;
		
		
			}
	
	
	public Properties properties()
	{
		prop=new Properties();
		
		try {
			FileInputStream ip=new FileInputStream("./src/test/configproperties/config.properties");
			
			try {
				prop.load(ip);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return prop;	
	}
                       
}

