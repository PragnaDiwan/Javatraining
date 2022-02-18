package selenuimsession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Clickwhenready {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
		By register=By.linkText("Register");
		
		elementtobeclickable(2,register).click();

	}

	
	public static WebElement elementtobeclickable(int time,By locator)
	{
WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
}
