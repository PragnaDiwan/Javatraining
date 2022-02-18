package selenuimsession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitlyWait {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get("https://classic.crmpro.com/index.html");
		
		By locator=By.name("username");
//	//	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement username=wait.until(ExpectedConditions.presenceOfElementLocated(locator));
//		username.sendKeys("naveen");

//		WebElement username=doPresenceofElementLocated(locator,10);
//		username.sendKeys("naeveen");
		By password=By.name("password");
		//dopresencpfelementpollingtime(password,20,5000).sendKeys("test");
		dosendkeys(password,20,1000,"test");
	}

	public static WebElement doPresenceofElementLocated(By locator,int timeout)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public static WebElement dopresencpfelementpollingtime(By locator,int timeout,long intertime)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout), Duration.ofMillis(intertime));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public static void dosendkeys(By locator,int timeout,long intertime,String value)
	{
		dopresencpfelementpollingtime( locator, timeout, intertime).sendKeys(value);
	}
}


