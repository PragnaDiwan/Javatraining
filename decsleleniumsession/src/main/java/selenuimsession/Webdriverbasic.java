package selenuimsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriverbasic {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NEW-1\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
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
