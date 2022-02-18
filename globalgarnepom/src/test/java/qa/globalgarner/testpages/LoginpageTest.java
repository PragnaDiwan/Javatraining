package qa.globalgarner.testpages;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.netty.util.Constant;

public class LoginpageTest extends BaseTest {
	
	@Test
	public void getcurrenturltest()
	{
	   String acturl=lp.getcurrenturl();
	   System.out.println(acturl);
	  Assert.assertEquals(acturl,qa.globalgarner.constants.Constant.LOGIN_PAGE_URL);
	  
	}
	
	@Test
	public void getpagetitiletest()
	{
		String title=lp.getpagetitle();
		System.out.println(title);
		Assert.assertTrue(title.contains(qa.globalgarner.constants.Constant.LOGIN_PAGE_TITLE_FRACTION));
	}
	@Test
	public void logintest() 
	{
		lp.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	@Test
	public void rechargelinkexistornot()
	{
		 Assert.assertTrue(lp.rechargelinkexistornot());
		 System.out.println("recharge link is exist");
	}
	
	@Test
	
	public void bswlinkexistornot()
	{
	  Assert.assertTrue(lp.bswlinkisexist());
	  System.out.println("bsw link is exist");
	}

}
