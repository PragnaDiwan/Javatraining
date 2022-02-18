package selenuimsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandlewithSelectTag {


	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		

	         WebDriverManager.chromedriver().setup(); 
	         
	       driver=new ChromeDriver();

	        
	        driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
	        
	        By country=By.id("Form_submitForm_Country");
	       // dropdownSelectByIndex(country,10);
	        dropDownSelectByVisibleText(country,"Albania");
	      //  dropDownSelectByValue(country,"Afghanistan");
	        
	    
	}

	
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static void dropdownSelectByIndex(By locator,int index)
	{
		Select select=new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public static void dropDownSelectByVisibleText(By locator,String visibleText)
	{
		Select select=new Select(getElement(locator));
		select.selectByVisibleText(visibleText);
	}

	public static void dropDownSelectByValue(By locator,String value)
	{
		Select select=new Select(getElement(locator));
		select.selectByValue(value);
	}


}
