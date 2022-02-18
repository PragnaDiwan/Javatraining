package selenuimsession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitforframeHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		
		frametobeavailable(5,2);
		
		String text=driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
	}

	
	public static void frametobeavailable(int time,int index)
	{

		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(index));
	}
}
