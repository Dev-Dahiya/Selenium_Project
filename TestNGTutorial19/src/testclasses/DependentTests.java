package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import appcode.SomeClassToTest;

public class DependentTests {
	SomeClassToTest obj;

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class");
		obj = new SomeClassToTest();
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After class");
	}

	@Test(dependsOnMethods = {"testMethod2", "testMethod3"})
	public void testMethod1() {
		System.out.println("Running - testMethod1");
	}

	@Test
	public void testMethod2() {
		System.out.println("Running - testMethod2");
		int actualResult = obj.addNumbers(1, 2);
		Assert.assertEquals(actualResult, 1);
	}

	@Test
	public void testMethod3() {
		System.out.println("Running - testMethod3");
	}

//	@Test(dependsOnMethods = "testMethod3")
//	public void testMethod4() {
//		System.out.println("Running - testMethod4");
//	}

}
