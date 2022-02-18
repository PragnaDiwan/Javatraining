package selenuimsession;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitforJsAlert {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		
		String text=alertispresent(10).getText();
		
		System.out.println(text);
	}
	
	
	public static Alert alertispresent(int timeout)
	{WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
	return wait.until(ExpectedConditions.alertIsPresent());
		
	}

}