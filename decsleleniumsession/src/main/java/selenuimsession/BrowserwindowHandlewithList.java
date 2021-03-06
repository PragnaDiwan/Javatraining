package selenuimsession;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserwindowHandlewithList {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
		
		
		Set<String>handles=driver.getWindowHandles();
		List<String>handlelist=new ArrayList<String>(handles);
		
		String parentwidnowid=handlelist.get(0);
		System.out.println(parentwidnowid);
		String childwindowid=handlelist.get(1);
		driver.switchTo().window(childwindowid);
		System.out.println(driver.getCurrentUrl());
		
		String childwindowid1=handlelist.get(2);
		driver.switchTo().window(childwindowid1);
			
		System.out.println(driver.getCurrentUrl());
		
		
		
		
	}
	

}
