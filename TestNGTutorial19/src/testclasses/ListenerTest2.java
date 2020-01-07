package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import listnerspackage.CustomListener2;

@Listeners(CustomListener2.class)
public class ListenerTest2 {

	@BeforeClass
	public void beforeClass() {
		System.out.println("ListenerTest2 - code in before class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("ListenerTest2 - code in after class");
	}

	@Test
	public void testMethod1() {
		System.out.println("ListenerTest2 - code in testMethod1");
		Assert.assertTrue(1 < 0);
	}

	@Test
	public void testMethod2() {
		System.out.println("ListenerTest2 - code in testMethod2");
		Assert.assertTrue(1 > 0);
	}

	@Test(dependsOnMethods = "testMethod1")
	public void testMethod3() {
		System.out.println("ListenerTest2 - code in testMethod2");
		Assert.assertTrue(1 > 0);
	}

}
