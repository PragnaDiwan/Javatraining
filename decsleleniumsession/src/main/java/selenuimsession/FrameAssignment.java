package selenuimsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameAssignment {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get("https://allwebco-templates.com/support/S_script_IFrame.htm");
		Thread.sleep(5000);
		
				WebElement path=driver.findElement(By.xpath("//iframe[@name='Framename' and @class='framesample']"));
				
				driver.switchTo().frame(path);
				
				String text=driver.findElement(By.xpath("//body/div/span[@class='colortitle']")).getText();
				System.out.println(text);

	}

}
