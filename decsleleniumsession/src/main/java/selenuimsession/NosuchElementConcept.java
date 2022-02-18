package selenuimsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NosuchElementConcept {

	static WebDriver driver;

	public static void main(String[] args) {
		

	         WebDriverManager.chromedriver().setup(); 
	         
	       driver=new ChromeDriver();

	        
	        driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
	        
	        By element=By.linkText("CONTACT SALES");
	        
	       IsElementExist(element);

}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static boolean IsElementExist(By locator)
	{
		int elementCount=driver.findElements(locator).size();
		System.out.println("total no of element count:"+elementCount);
		if(elementCount>=1)
		{
			System.out.println("element is found:"+locator);
			return true;
		}
		else
		{
			System.out.println("element is not present"+locator);
		}
		return false;
		
	}
	
	
	
}
