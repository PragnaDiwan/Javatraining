package selenuimsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launchfirefox {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\NEW-1\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Google"))
		{
			System.out.println("correct title");
		}
		else
			
		{
			System.out.println("wrong title");
		}
	driver.quit();
	}

	

}
