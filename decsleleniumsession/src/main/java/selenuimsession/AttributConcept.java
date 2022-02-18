package selenuimsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AttributConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		

	         WebDriverManager.chromedriver().setup(); 
	         
	       driver=new ChromeDriver();

	        
	        driver.get("https://www.amazon.com");
	        
	      //  By elemen=By.linkText("Careers");
	     //   getAttributeValue(elemen,"href");
	        
	        By imagealt=By.xpath("(//img[@class='landscape-image'])[1]");
	        
	        getAttributeValue(imagealt,"alt");
	}

	
	public static String getAttributeValue(By locator,String attrName)
	{
		String attrvalue= getelement(locator).getAttribute(attrName);
		System.out.println(attrvalue);
		return attrvalue;
	}
	
	public static WebElement getelement(By locator)
	{
		return driver.findElement(locator);
	}
}
