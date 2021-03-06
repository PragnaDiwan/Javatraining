package selenuimsession;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		System.out.println(driver.getCurrentUrl());
		Set<String>handle=driver.getWindowHandles();
		Iterator<String>it=handle.iterator();
		String parentwindowid=it.next();
		System.out.println("parentwindowid is:"+parentwindowid);
		String childwindowid=it.next();
		
		System.out.println("childwindow is :"+childwindowid);

		driver.switchTo().window(childwindowid);
		System.out.println(driver.getCurrentUrl());
	      driver.close();
	      
	      driver.switchTo().window(parentwindowid);
	      System.out.println(driver.getCurrentUrl());
	     
	}

}
