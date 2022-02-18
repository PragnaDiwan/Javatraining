package selenuimsession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitforNonweblement {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//div[@id='contact-link']/a")).click();
		
		if(watForUrlTobe(("controller=contact"),10))
		{
			System.out.println("url is corecnt");
		}
	}
	
	public static Boolean watForUrlTobe(String value,int time)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		return wait.until(ExpectedConditions.urlContains(value));
	}

}
