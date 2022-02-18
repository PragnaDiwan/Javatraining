package selenuimsession;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricketScoreTable {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.espncricinfo.com/series/india-in-south-africa-2021-22-1277060/south-africa-vs-india-1st-test-1277079/full-scorecard");
		Thread.sleep(5000);
	//	String text=driver.findElement(By.xpath("(//a[text()='Mayank Agarwal']/parent::td/following-sibling::td/span)[1]")).getText();
//		String name=getwicketkeepername("Rishabh Pant");
//		System.out.println(name);

		System.out.println(getscorecardlist("Mayank Agarwal"));
		
	}

	
	public static String getwicketkeepername(String playername)
	{
		String text=driver.findElement(By.xpath("(//a[text()='"+playername+"']/parent::td/following-sibling::td/span)[1]")).getText();
		return text;
	}
	
	public static List<String> getscorecardlist(String playername)
	{
		int countsize=driver.findElements(By.xpath("(//a[text()='"+playername+"']/parent::td)[1]/following-sibling::td")).size();
		List<WebElement>scorelist=driver.findElements(By.xpath("(//a[text()='"+playername+"']/parent::td)[1]/following-sibling::td"));
		List<String>scorecard=new ArrayList<String>();

		for(int i=1;i<countsize;i++)
		{
			String text=scorelist.get(i).getText();
			scorecard.add(text);
		}
		return scorecard;
	}
}
