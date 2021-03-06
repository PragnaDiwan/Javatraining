package selenuimsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PaginationConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://babynames.merschat.com/popular.cgi?page=1");
		driver.manage().window().maximize();
		
		
		List<WebElement>namelist=driver.findElements(By.xpath("//a[contains(text(),'Amrisha')] "));
		
		while(true)
		{
			if(!(namelist.size()==1))
			{
				int count=1;
			
				WebElement click=driver.findElement(By.xpath("//select[@name='page']"));
				
				Select select=new Select(click);
				select.selectByIndex(count);
				driver.findElement(By.xpath("//input[@value='Go']")).click();
			
			
				namelist=driver.findElements(By.xpath("//a[contains(text(),'Amrisha')] "));
				count++;
			}
			else
			{
				String text=driver.findElement(By.xpath("(//a[contains(text(),'Amrisha')]/../parent::td/following-sibling::td)[2]")).getText();
				System.out.println(text);
				break;
			}
		}
	}

}
