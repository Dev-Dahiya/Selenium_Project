package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import listnerspackage.CustomListener2;

@Listeners(CustomListener2.class)
public class ListenerTest3 {

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("ListenerTest3 - code in before method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("ListenerTest3 - code in after method");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("ListenerTest3 - code in before class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("ListenerTest3 - code in after class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("ListenerTest3 - code in before test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("ListenerTest3 - code in after test");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("ListenerTest3 - code in before suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("ListenerTest3 - code in after suite");
	}

	@Test
	public void testMethod1() {
		System.out.println("ListenerTest3 - code in testMethod1");
		Assert.assertTrue(1>2);
	}

	@Test
	public void testMethod2() {
		System.out.println("ListenerTest3 - code in testMethod2");
		Assert.assertTrue(1<2);
	}
	
	@Test(dependsOnMethods="testMethod1")
	public void testMethod3() {
		System.out.println("ListenerTest3 - code in testMethod3");
		Assert.assertTrue(1<2);
	}

}
