package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestNG_TestClass1 {

	

	@Test
	public void testMethod1() {
		System.out.println("Running TestNG_TestClass1 - testMethod1");
	}

	@Test
	public void testMethod2() {
		System.out.println("Running TestNG_TestClass1 - testMethod2");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Runs before each test method - TestNG_TestClass1");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Runs after each test method - TestNG_TestClass1");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Runs once before class - TestNG_TestClass1");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Runs once after class - TestNG_TestClass1");
	}

}
