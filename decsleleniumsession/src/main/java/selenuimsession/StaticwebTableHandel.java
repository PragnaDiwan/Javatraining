package selenuimsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticwebTableHandel {

	
	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		String beforexpath="//table[@id=\"customers\"]/tbody/tr[";
	String afterxpath="]/td[";

		By row=By.xpath("//table[@id='customers']/tbody/tr");
		By col=By.xpath("//table[@id='customers']/tbody/tr[1]/th");
		
		printtable(row,col,beforexpath,afterxpath);
		
	}
	
	public static void printtable(By rowlocator,By collocator,String beforexpath,String afterxpath)
	{
		int rowcount=driver.findElements(rowlocator).size();
		int colcount=driver.findElements(collocator).size();
		
		for(int row=2;row<=rowcount;row++)
		{
			for (int col=1;col<=colcount;col++)
			{
				String xpath=beforexpath+row+afterxpath+col+"]";
				String text=driver.findElement(By.xpath(xpath)).getText();
				System.out.print(text);
			}
			System.out.println();
	}
	}
}
