package selenuimsession;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Implycitlywait {
	
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		driver.get("https://classic.crmpro.com/index.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

	}

}
