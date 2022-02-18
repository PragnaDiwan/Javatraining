package webdrivertest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class test1 {
	
@Test	
public void test1()	
{
	Response response=RestAssured.get("https://reqres.in/api/users?page=2");
	System.out.println(response.getStatusCode());
	System.out.println(response.getTime());
	System.out.println(response.getBody().asString());
	System.out.println(response.getSessionId());
	System.out.println(response.getHeader("content-type"));
	
	int statuscode=response.getStatusCode();
	Assert.assertEquals(statuscode, 200);
	
}


}
	


