package selenuimsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchTest {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		//driver.findElement(By.name("q")).sendKeys("movie");
		By searchname=By.name("q");

		dosendkeys(searchname,"movie");
		Thread.sleep(5000);
		
		By search=By.xpath("//ul[@role='listbox']/li//div[@class='wM6W7d']/span");
		searchsuggetionList(search,"movies playing");
		
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}

	
	public static void dosendkeys(By locator,String value)
	{
		getElement(locator).sendKeys(value);
	}
	
	public static List<WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
	}
	
	public static void searchsuggetionList(By locator,String value)
	{
		List<WebElement>searchlist=getElements(locator);
		System.out.println(searchlist.size());
		for(WebElement e:searchlist)
		{
			String text=e.getText();
			System.out.println(text);
			if(text.equals(value))
			{
				e.click();
				break;
			}
		}
	}
}


