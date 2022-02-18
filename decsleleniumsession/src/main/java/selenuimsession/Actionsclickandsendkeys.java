package selenuimsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actionsclickandsendkeys {


	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vacations.spicejet.com/HotelLists?");
		Thread.sleep(5000);
		
		By input=By.xpath("//input[@id='txtHotelCity']");
		
		doactionsendkeys(input,"test");
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}

	
	public static void doactionsendkeys(By locator,String value)
	{
		Actions act=new Actions(driver);
		act.sendKeys(getElement(locator),value).build().perform();
	}
}
