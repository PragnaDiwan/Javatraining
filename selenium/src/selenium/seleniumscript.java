package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumscript {
	
	
public static void main(String[] args)
{
System.setProperty("webdriver.chrome.driver", "c:\\chromedriver_win32 (7)\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.globalgarner.com/");
}
}