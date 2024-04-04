package Test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import org.testng.annotations.Parameters;

public class day3 {
	
	@BeforeSuite
	public void loginHello() {
		
		System.out.println("Before Suite");
		
	}
	
	@Test(groups= {"Smoke"})
	public void regression() {
		
		System.out.println("regression");
		
	}
	
	
	
	@Test(timeOut=3000)
	public void logins() {
		
		System.out.println("Timeout");
		
	}
	
	
	@Test(priority=0)
	public void login() {
		
		System.out.println("Test Method");
		
	}
	

	
	@Test(enabled=false)
	public void Case() {
		
		System.out.println("false");
		
	}
	
	
	
	@Test(dependsOnMethods= {"login"})
	public void loginHome() {
		
		System.out.println("before this login should execute");
		
	}
	
	@Parameters({"URL"})
	@Test
	public void Car(String url) {
		
		System.out.println("Web Car");
		
		System.out.println(url);
		
	}
	
	@Test
	public void WebloginMobile() {
		
		System.out.println("second");
		
	}

	@Test
	public void WebloginMobileLogin() {
		
		System.out.println("second Mobile");
		
	}
	@Test
	public void WebloginCarLoan() {
		
		System.out.println("third");
		
	}

}
