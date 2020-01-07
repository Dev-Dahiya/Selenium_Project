package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class ReporterDemo {

	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("ReporterDemo => before method", true);
	}

	@AfterMethod
	public void afterMethod() {
		Reporter.log("ReporterDemo => after method", true);
	}

	@BeforeClass
	public void beforeClass() {
		Reporter.log("ReporterDemo => before class", true);
	}

	@AfterClass
	public void afterClass() {
		Reporter.log("ReporterDemo => after class", true);
	}

	@Test
	public void testMethod1() {
		Reporter.log("ReporterDemo => testMethod1", true);
	}

	@Test
	public void testMethod2() {
		Reporter.log("ReporterDemo => testMethod2", true);
		Assert.assertTrue(1 > 2);
	}

	@Test(dependsOnMethods = "testMethod2")
	public void testMethod3() {
		Reporter.log("ReporterDemo => testMethod3", true);
	}

}
