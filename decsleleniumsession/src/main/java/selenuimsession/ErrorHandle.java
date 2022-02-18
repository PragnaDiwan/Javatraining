package selenuimsession;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErrorHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication");
		driver.findElement(By.name("email")).sendKeys("hi",Keys.TAB);
		System.out.println(driver.findElement(By.cssSelector("div.form-group form-error")).isDisplayed());
		
		
		
		
	}

}
