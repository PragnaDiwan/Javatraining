package qa.globalagarner.pages.loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import qa.globalgarner.constants.ElementUtil;

public class Loginpage {
	
	private WebDriver driver;
	private ElementUtil utl;
	
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
		utl=new ElementUtil(driver);
	}
	
	
	
	
	
	private By login=By.xpath("//img[@class='img-fluid rounded-circle' and @alt='user']");
	private By loginnew=By.xpath("(//div[@class='bp3-fill bp3-text-overflow-ellipsis'])[1]");
	private By username=By.xpath("//input[@name='username']");
	private By password=By.xpath("//input[@name='password']");
	private By submit=By.xpath("//span[@class='bp3-button-text login-btn-text']");
	private By recharge=By.xpath("//p[text()='Bill Pay & Recharge']");
	private By bswlink=By.xpath("//p[text()='Best Shopping Websites']");
	
	
	public void clickonloginlink()
	{
		 utl.doClick(login);
	}
	
	public String getcurrenturl()
	{
		return driver.getCurrentUrl(); 
	}
	
	public String getpagetitle()
	{
		return driver.getTitle(); 
	}
	
	public void login(String un,String pwd) 
	
	{
		utl.doClick(login);
		utl.doClick(loginnew);
		utl.doSendKeys(username, un);
		utl.doSendKeys(password, pwd);
		utl.doClick(submit);
		
		
		
	}
	
	
	public boolean rechargelinkexistornot()
	{
		return utl.doIsDisplayed(recharge);
	}
	
	public boolean bswlinkisexist()
	{
		return utl.doIsDisplayed(bswlink);
	}

}
