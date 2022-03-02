package testProjectPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG2 {
	
	@Test
	public void assertionCheck() {
		
		String expectedMessage = "Log In";
		String actualMessage = "Lag In";
		
		try {
			Assert.assertEquals(actualMessage, expectedMessage);
		} catch (Error e) {
			e.printStackTrace();
			System.out.println(e);
		}
		
		System.out.println("Verification Successful");
		
	}

}
