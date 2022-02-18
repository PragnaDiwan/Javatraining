package selenuimsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Movetoelement {


	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(5000);
		By addon=By.xpath("//div[text()='Add-ons']");
		By child=By.xpath("//div[text()='Covid-19 RT-PCR Test']");
	//	movetoelement(addon);
		
		clickonchild(addon,child);
	}

	
	public static WebElement getelement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static void movetoelement(By locator)
	{
		Actions act=new Actions(driver);
		act.moveToElement(getelement(locator)).build().perform();
	}
	
	public static void clickonchild(By parentlocator,By childlocator) throws InterruptedException 
	{
		movetoelement(parentlocator);
		Thread.sleep(3300);
		getelement(childlocator).click();
		
	}
	
	
}
