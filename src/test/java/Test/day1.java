package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org.testng.annotations.Parameters;

public class day1 extends day2 {
	
	
	@Test(dataProvider="getData")
	public void demoClass(String username, String password) {
		
		System.out.println("demo");
		System.out.println(username);
		System.out.println(password);
		
	}
	

	@BeforeTest
	public void zoo() {
		
		System.out.println("BeforeTest Zoo");
		
	}
	

	@BeforeClass
	public void demoCar() {
		
		System.out.println("BeforeClass");
		
	}
	

	
	@Test(timeOut=2000)
	public void demoSch() {
		
		System.out.println("false");
		
	}
	
	@AfterSuite
	public void demoHome() {
		
		System.out.println("After suite");
		
	}
	
	@BeforeMethod
	public void demoHomeLast() {
		
		System.out.println("Before Method");
		
	}
}
