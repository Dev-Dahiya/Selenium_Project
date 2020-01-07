package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BeforeAfterClassMethod {

	@BeforeClass
	public void setUp() {
		System.out.println("\nRuns once before first test method");
	}

	@AfterClass
	public void tearDown() {
		System.out.println("\nRuns once after last test method");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("\nRuns once before each test method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("\nRuns once after each test method");
	}

	@Test
	public void testMethodA() {
		System.out.println("\nRunning testMethodA");
	}

	@Test
	public void testMethodB() {
		System.out.println("\nRunning testMethodB\n");
	}

	public void MethodC() {
		System.out.println("\nRunning MethodC");
	}

}
