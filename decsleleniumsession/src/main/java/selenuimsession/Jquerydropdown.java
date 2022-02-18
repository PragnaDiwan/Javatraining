package selenuimsession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jquerydropdown {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		Thread.sleep(5000);
		
		driver.findElement(By.id("justAnInputBox")).click();
		By choices=By.xpath("//span[@class='comboTreeItemTitle']");
		
		selectChoice(choices,"choice 2 1","choice 1","choice 2");

		//selectChoice(choices,"all");
	}

	
	public static void selectChoice(By locator,String... value)
	{
List<WebElement>choiceslist=driver.findElements(locator);

       if(!value[0].equalsIgnoreCase("all"))
		{
    	   for(WebElement e:choiceslist)
		
		{
			String text=e.getText();
			System.out.println(text);
			
			for(int i=0;i<value.length;i++)
			{
			if(text.equals(value[i]))
			{
				e.click();
				break;
			}
		
		}
			}
		
	}
       else
       {
    	   try {
    	   for(WebElement e:choiceslist)
    	   {
    		   e.click();
    	   }
    	   }
    	   catch(ElementNotInteractableException e)
    	   {
    		   System.out.println("all choices are over");
    	   }
       }
}}
