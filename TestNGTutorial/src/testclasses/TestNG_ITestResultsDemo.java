package testclasses;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class TestNG_ITestResultsDemo {

	@Test
	public void testMethod1() {
		System.out.println("Running Test -> testMethod1");
		Assert.assertTrue(true);
	}

	@Test
	public void testMethod2() {
		System.out.println("Running Test -> testMethod2");
		Assert.assertTrue(false);
	}

	@AfterMethod
	public void afterMethod(ITestResult testResult) {
		if (testResult.getStatus() == ITestResult.FAILURE) {
			System.out.println("Failed: " + testResult.getName());
		} else if (testResult.getStatus() == ITestResult.SUCCESS) {
			System.out.println("Successful: " + testResult.getName());
		}

	}

}
