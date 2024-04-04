package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PS {
	
	@BeforeMethod
	public void m5() {
		
		System.out.println("execute me before Method");
	}
	
	@Test
	public void m1() {
		
		System.out.println("execute me");
	}
	
	@AfterMethod
	public void m8() {
		
		System.out.println("hey afterMethod");
	}

}
