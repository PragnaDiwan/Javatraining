package selenuimsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegPagetest {
	
	
	
	

	public static void main(String[] args) throws InterruptedException {
		BrowserUtl brUtl=new BrowserUtl();
	WebDriver driver=brUtl.launchbrowser("chrome");
	//brUtl.launchbrowser("chrome");
		brUtl.Enterurl("https://demo.opencart.com/index.php?route=account/register");
		
		String title=brUtl.getpagetitle();
		System.out.println(title);
		By firstname=By.id("input-firstname");
		By lastname=By.id("input-lastname");
		By emailid=By.id("input-email");
		By telephone=By.id("input-telephone");
		By password=By.id("input-password");
		By conpwd=By.id("input-confirm");
		
		ElementUtl eleUtl=new ElementUtl(driver);
		eleUtl.doSendkeys(firstname, "pragna");
		eleUtl.doSendkeys(lastname, "diwan");
		eleUtl.doSendkeys(emailid, "pragna@gmail.com");
		eleUtl.doSendkeys(telephone, "8141143966");
		eleUtl.doSendkeys(password, "test");
		eleUtl.doSendkeys(conpwd, "test");
		
		Thread.sleep(5000);
		
		brUtl.closeBrowser();
		
		
	}

}
