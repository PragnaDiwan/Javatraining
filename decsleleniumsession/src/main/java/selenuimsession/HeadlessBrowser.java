package selenuimsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class HeadlessBrowser {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--incognito");
	//co.addArguments("--headless");		
	WebDriver driver=new ChromeDriver(co);
	
	
		
		
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\NEW-1\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
//		FirefoxOptions fo=new FirefoxOptions();
//		fo.addArguments("--headless");
	//	WebDriver driver=new FirefoxDriver(fo);
		
		driver.get("https://www.Amazon.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}

}
