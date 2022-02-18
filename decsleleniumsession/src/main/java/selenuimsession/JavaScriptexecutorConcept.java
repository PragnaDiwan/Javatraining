package selenuimsession;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptexecutorConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		
		JavascriptExecutor js=( JavascriptExecutor)driver;
	
		
//		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//		Thread.sleep(5000);
//		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		//js.executeScript("window.scrollTo(document.body.scrollHeight,3000)");
	//	js.executeScript("window.scrollTo(0, 500)");
		
		WebElement view=driver.findElement(By.xpath("//img[@alt='New arrivals in Toys']"));
		System.out.println(view);
		js.executeScript("arguments[0].scrollIntoView(true);",view);
	}

}
