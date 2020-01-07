package testclasses;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class ListenerTest5 {

	@BeforeClass
	public void beforeClass() {
		System.out.println("ListenerTest5 - code in before class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("ListenerTest5 - code in after class");
	}

	@Test
	public void testMethod1() {
		System.out.println("ListenerTest5 - code in testMethod1");
		Assert.assertTrue(1 < 0);
	}

	@Test
	public void testMethod2() {
		System.out.println("ListenerTest5 - code in testMethod2");
		Assert.assertTrue(1 > 0);
	}

	@Test(dependsOnMethods = "testMethod1")
	public void testMethod3() {
		System.out.println("ListenerTest5 - code in testMethod2");
		Assert.assertTrue(1 > 0);
	}

}
