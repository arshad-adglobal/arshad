package UAT_Env;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class UAT_Environment {
	
	
	@Test
	
	public void U1() {
		
		System.out.println("UAT environment 1:");
	}
	
	@Test
	
public void U2() {
		
		System.out.println("UAT environment 2:");
	}
	
	@Test
	
public void U3() {
		
		System.out.println("UAT environment 3:");
		//Assert.fail("Delibretry fails!!!");
		System.out.println("We failed this test case knowingly");
	}

}
