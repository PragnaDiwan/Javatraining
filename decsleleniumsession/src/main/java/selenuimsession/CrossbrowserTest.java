package selenuimsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossbrowserTest {
	
	static WebDriver driver;

	public static void main(String[] args) {

		String browser="firefox";
		
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
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Google"))
		{
			System.out.println("correct title");
		}
		else
			
		{
			System.out.println("wrong title");
		}
	driver.quit();
		
		
	}

}
