package Test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day2 {

	
	@Test(dataProvider="getData")
	public void plan(String username,String Password) {
		System.out.println("After Test");
		
		System.out.println(username);
		System.out.println(Password);
		
	}
	
	@Parameters({"URL"})
	@Test
	public void Secondplan(String uname) {
		System.out.println("Second Plan");
		System.out.println(uname);
		
		
	}
	
	@Test
	public void fourthplan() {
	System.out.println("fourth Plan");
	Assert.assertTrue(false);
		
		
	}
	
	@BeforeTest
	public void aaa() {
		System.out.println("Before Test app");
		
	}
	
	
	@DataProvider
	public  Object[][] getData() {
		
	Object[][] data = new Object[3][2];
	
	data[0][0] ="firstusername";
	
	data[0][1] ="password";
	
	

	data[1][0] ="secondusername";
	
	data[1][1] ="secondpassword";
	
	

	data[2][0] ="secondusername";
	
	data[2][1] ="secondpassword";
	
	return data;
	
	
	
		
	}
}
