package selenuimsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QuitvsClose {

	public static void main(String[] args) {
		
				//System.setProperty("webdriver.chrome.driver","C:\\Users\\NEW-1\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com");
			String title=driver.getTitle();
			System.out.println(title);
			
		//	driver.close();
			driver.quit();
//		 driver=new ChromeDriver();
//			driver.get("https://www.google.com");
	System.out.println(driver.getTitle());
	}

}
