package selenuimsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropdownValueWithoutusingSelect {

	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By country=By.id("Form_submitForm_Country");
	 
		
		doselectdropdownValue(country,"India");
		
	}
	
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static void doselectdropdownValue(By locator,String value)
	{
		Select select=new Select(getElement(locator));
		List<WebElement>optionslist=select.getOptions();
		for(WebElement e:optionslist)
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
