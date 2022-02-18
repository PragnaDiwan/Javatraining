package selenuimsession;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomDynamicWait {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		By emailid=By.name("input-email");
		retryelement(emailid,10).sendKeys("test");
	
}
	
	public static WebElement getelment(By locator)
	{
		return driver.findElement(locator);
	}
	public static WebElement retryelement(By locator,int timeout) 
	{
		WebElement element=null;
		int attempts=0;
		
		while(attempts<timeout)
		{
			try {
			element=getelment(locator);
			break;
			}
			catch(NoSuchElementException e)
			{
				System.out.println("element is not fountd:"+attempts+":"+locator);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					
					e1.printStackTrace();
				}
			}
			attempts++;
		}
		return element;
	}
}

