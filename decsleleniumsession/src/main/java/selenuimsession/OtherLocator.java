package selenuimsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OtherLocator {

	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
		
		//driver.get("https://www.crmpro.com/index.html");
//		Thread.sleep(5000);
//		By username=By.name("username");
//		By password=By.name("password");
//	
//		
//		ElementUtl eleUtl=new ElementUtl(driver);
//		eleUtl.doSendkeys(username, "pragna");
//		eleUtl.doSendkeys(password, "pragna");
//	
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		Thread.sleep(5000);
		By login=By.linkText("Login");
		
		By register=By.linkText("Register");
		doClick(login);
		
		doClick(register);
		String text=doGettext(login);
		System.out.println(text);
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}

	public static void doClick(By locator)
	{
		 getElement(locator).click();
	}
	
	public static String doGettext(By locator)
	{
		return getElement(locator).getText();
	}
	
}
