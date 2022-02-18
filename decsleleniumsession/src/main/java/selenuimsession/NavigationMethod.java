package selenuimsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationMethod {

	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
	//	WebDriver driver=new ChromeDriver();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.navigate().to("https://www.Amazon.com");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		System.out.println();
	}

}
