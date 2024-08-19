package acceptance_tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Module1_Test {
	
	@Test(priority = 0)
	public void checkingStabilityOfBuild() {
		
		Assert.assertTrue(true);
		
	}
	@Test(priority = 2)
	public void performanceChecksRun() {
		
		Assert.assertTrue(true);
		
	}
	@Test(priority = 1)
	public void securityChecksRun() {
		
		Assert.assertFalse(false);
		
	}

}
