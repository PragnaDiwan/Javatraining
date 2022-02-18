package selenuimsession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Text;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImagesUtl {
	
	static WebDriver driver;

	public static void main(String[] args) {

         WebDriverManager.chromedriver().setup(); 
         
       driver=new ChromeDriver();

        
        driver.get("https://www.amazon.com");
        
         By images=By.tagName("img");
        
         System.out.println(getElementscount(images));
         
      List<String>attrlist=getAttributeList(images,"alt");
   printElementValues(attrlist);
      
     
	}	   
		
	
	
	public static void printElementValues(List<String>elelist)
	{
		for(String e:elelist)
		{
			System.out.println(e);
		}
	}
	public static List<String> getAttributeList(By locator,String attributeName)
	{
		List<WebElement>elelist=getElements(locator);
		List<String>attrlist=new ArrayList<String>();
		for(WebElement e:elelist)
		{
			String attrvalue=e.getAttribute(attributeName);
			attrlist.add(attrvalue);
		}
		return attrlist;
	}
	
	public static int getElementscount(By locator)
	{
		return getElements(locator).size();
	}
	
	

	public static List<WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
	}

}
