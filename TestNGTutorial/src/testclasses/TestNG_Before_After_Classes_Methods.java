package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class TestNG_Before_After_Classes_Methods {

	@BeforeClass
	public void setUp() {
		System.out.println("Runs once before test methods");
	}

	@AfterClass
	public void cleanUp() {
		System.out.println("Runs once after test methods");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Runs before each test method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Runs after each test method");
	}

	@Test
	public void testMethod1() {
		System.out.println("Running Test Method 1");
	}

	@Test
	public void testMethod2() {
		System.out.println("Running Test Method 2");
	
	}
	
	
}
