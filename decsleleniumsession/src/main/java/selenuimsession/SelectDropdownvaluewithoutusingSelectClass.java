package selenuimsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropdownvaluewithoutusingSelectClass {

	
		
		static WebDriver driver;

		public static void main(String[] args) {
			
			WebDriverManager.chromedriver().setup();
			
			driver=new ChromeDriver();
			
			driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
			
			

			By country=By.xpath("//select[@id='Form_submitForm_Country']/option");
			SelectDropDownValeWithoutSelect(country,"Cuba");

	}
		public static List<WebElement> getElements(By locator)
		{return driver.findElements(locator);
		}
		
		public static void SelectDropDownValeWithoutSelect(By locator,String value)
		{
         List<WebElement>optionsList=getElements(locator);
			
			System.out.println(optionsList.size());
			
			for(WebElement e:optionsList)
			{
				String text=e.getText();
				if(text.equals(value))
				
					{
					e.click();
					break;
				}
		
			}	
		}
		

}
