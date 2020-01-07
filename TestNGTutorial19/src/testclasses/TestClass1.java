package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class TestClass1 {

	@BeforeClass
	public void setUp() {
		System.out.println("\nTestClass1 - Runs once before first test method");
	}

	@AfterClass
	public void tearDown() {
		System.out.println("\nTestClass1 - Runs once after last test method");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("\nTestClass1 - Runs once before each test method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("\nTestClass1 - Runs once after each test method");
	}

	@Test
	public void testMethodA() {
		System.out.println("\nRunning TestClass1 - testMethodA");
	}

	@Test
	public void testMethodB() {
		System.out.println("\nRunning TestClass1 - testMethodB\n");
	}

	}
