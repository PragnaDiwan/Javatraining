package selenuimsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageCount {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		
		driver.get(" https:www.amazon.com");
		
		By images=By.tagName("img");
		
		//List<WebElement>img=driver.findElements(images);
		List<WebElement>img=getElements(images);
		
		System.out.println("total no of images"+img.size());
		for(WebElement e:img)
		{
			String altvalue=e.getAttribute("alt");
			String srcvalue=e.getAttribute("src");
			
			System.out.println(altvalue+"----------->"  +  srcvalue);
		}
	}
	
	public static List<WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
	}

	
}
