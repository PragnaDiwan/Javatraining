package selenuimsession;

public class AmazonTest {

	public static void main(String[] args) {
		
		
		BrowserUtl br=new BrowserUtl();
		
		br.launchbrowser("chrome");
		br.Enterurl("https://www.amazon.com");
		
		
		String title=br.getpagetitle();
		System.out.println(title);
		if(title.contains("Amazon"))
		{
			System.out.println("correct Title");
		}

		
		String url=br.getcurrenturl();
		System.out.println(url);
		
		br.closeBrowser();
	}

}
