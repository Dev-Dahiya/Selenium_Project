package testpackage;

import static org.testng.Assert.assertEquals;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class testNGReportersAndAsserts {

	@Test
	public void testString() {
		String actualString = "Test Reporters and Asserts";
		Reporter.log("Value of actual string is " + actualString, true);
		Assert.assertEquals(actualString, "Tests Reporters and Asserts");
		Reporter.log("Verifying the acttual value with expected value", true);
		Reporter.log("");
	}

	@Test
	public void testInt() {
		int actualIntegar = 10;
		Reporter.log("Value of actual integar is " + actualIntegar, true);
		Assert.assertEquals(actualIntegar, 10);
		Reporter.log("Verifying the actual value of integar", true);
		Reporter.log("");
	}

	@Test
	public void testArrays() {
		int[] actualArray = {1, 2, 3};
		int[] expectedArray = {1, 2, 3};
		Reporter.log("Value of actual array is " + actualArray, true);
		Assert.assertArrayEquals(actualArray, expectedArray);
		Reporter.log("Verifying value of actual array" , true);
		Reporter.log("");

	}
}
