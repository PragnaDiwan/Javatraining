package selenuimsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAlldropdownValuewithSelect {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		WebElement country=driver.findElement(By.id("Form_submitForm_Country"));
		
		Select select=new Select(country);
		List<WebElement>optionlist=select.getOptions();
		System.out.println(optionlist.size());
		
		int count=0;
		for(WebElement e:optionlist)
		{
			System.out.println(count+":"+e.getText());
			count++;
		}
		
		
	}

}
