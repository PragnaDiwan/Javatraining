package selenuimsession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtl {
	
	private WebDriver driver;
	
	public  ElementUtl(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	public WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	
	public void doSendkeys(By locator,String value)
	{
		getElement(locator).sendKeys(value);
	}
	
	public  void doClick(By locator)
	{
		 getElement(locator).click();
	}
	
	
	public  String doGettext(By locator)
	{
		return getElement(locator).getText();
	}
	
	
	public boolean doIsDisplayed(By locator)
	{
		return getElement(locator).isDisplayed();
		
	}
	public  List<WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
	}
	
	public  List<String> getElementstextlist(By locator)
	{
		List<WebElement>elelist=getElements(locator);
		List<String>eleTextlist=new ArrayList<String>();
		
		for(WebElement e:elelist)
		{
			String eleText=e.getText();
			if(!eleText.isEmpty())
			{
				eleTextlist.add(eleText);
			}
		}
		return eleTextlist;
	}
	public  void printElementValues(List<String>elelist)
	{
		for(String e:elelist)
		{
			System.out.println(e);
		}
	}
	public  List<String> getAttributeList(By locator,String attributeName)
	{
		List<WebElement>elelist=getElements(locator);
		List<String>attrlist=new ArrayList<String>();
		for(WebElement e:elelist)
		{
			String attrvalue=e.getAttribute(attributeName);
			attrlist.add(attrvalue);
		}
		return attrlist;
	}
	

	public  int getElementsCount(By locator)
	{
		return getElements(locator).size();
	}

	public  String getAttributeValue(By locator,String attrName)
	{
		String attrvalue= getElement(locator).getAttribute(attrName);
		System.out.println(attrvalue);
		return attrvalue;
	}
	
	public  boolean IsElementExist(By locator)
	{
		int elementCount=getElements(locator).size();
		System.out.println("total no of element count:"+elementCount);
		if(elementCount>=1)
		{
			System.out.println("element is found:"+locator);
			return true;
		}
		else
		{
			System.out.println("element is not present"+locator);
		}
		return false;
		
	}
	
	public boolean elementIsDisplayed(By locator)
	{
		return getElement(locator).isDisplayed();
	}
	public  void dropdownSelectByIndex(By locator,int index)
	{
		Select select=new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public  void dropDownSelectByVisibleText(By locator,String visibleText)
	{
		Select select=new Select(getElement(locator));
		select.selectByVisibleText(visibleText);
	}

	public  void dropDownSelectByValue(By locator,String value)
	{
		Select select=new Select(getElement(locator));
		select.selectByValue(value);
	}
	public  void doselectdropdownValue(By locator,String value)
	{
		Select select=new Select(getElement(locator));
		List<WebElement>optionslist=select.getOptions();
		for(WebElement e:optionslist)
		{
			String text=e.getText();
			if(text.equals(value))
			{		
			e.click();
			break;
			}
		}
	}
	public  void SelectDropDownValeWithoutSelect(By locator,String value)
	{
     List<WebElement>optionsList=getElements(locator);
		
		System.out.println(optionsList.size());
		
		for(WebElement e:optionsList)
		{
			String text=e.getText();
			if(text.equals(value))
			
				{
				e.click();
				break;
			}
	
		}	
	}
	public  void searchsuggetionList(By locator,String value)
	{
		List<WebElement>searchlist=getElements(locator);
		System.out.println(searchlist.size());
		for(WebElement e:searchlist)
		{
			String text=e.getText();
			System.out.println(text);
			if(text.equals(value))
			{
				e.click();
				break;
			}
		}
	}
	public  void printtable(By rowlocator,By collocator,String beforexpath,String afterxpath)
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
