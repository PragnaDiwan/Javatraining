package selenuimsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import java.util.List;

import org.openqa.selenium.By;

public class RelativeLocator {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		Thread.sleep(2000);
		
	//	WebElement ele=driver.findElement(By.xpath("(//a[text()='Terrebonne, Canada'])[1]"));
		
//		String text=driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
//		System.out.println(text);
//		
//		String text1=driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
//		
//			System.out.println(text1);
//			
//			
//			String text2=driver.findElement(with(By.xpath("(//a[text()='Smithers, Canada'])[1]")).below(ele)).getText();
//			System.out.println(text2);
//
//			
////			List<WebElement>test=driver.findElements(By.xpath("//a[text()='Alberta']//parent::th/following-sibling::td"));
////			for(WebElement e:test)
////			{
////				System.out.println(e.getText());
////			}
//
//			
			WebElement ele1 =driver.findElement(By.xpath("//a[text()='Alberta']"));
			
			List<WebElement>ele=driver.findElements(with(By.tagName("td")).toRightOf(ele1));
			for(WebElement e:ele)
			{
				String text5=e.getText();
				System.out.println(text5);
			}
			
	}

}
