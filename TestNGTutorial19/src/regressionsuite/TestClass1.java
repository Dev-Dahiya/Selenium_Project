package regressionsuite;

import org.testng.annotations.Test;

import base.BaseTestSetUp;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class TestClass1 extends BaseTestSetUp{
		
//	@BeforeClass
//	public void setUp() {
//		super.setUp();
//		System.out.println("\nTestClass1 - Runs once before first test method");
//	}
//
//	@AfterClass
//	public void tearDown() {
//		System.out.println("\nTestClass1 - Runs once after last test method");
//	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("TestClass1 - Runs once before each test method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("TestClass1 - Runs once after each test method");
	}

	@Test
	public void testMethodA() {
		System.out.println("Running TestClass1 - testMethodA");
	}

	@Test
	public void testMethodB() {
		System.out.println("Running TestClass1 - testMethodB");
	}

	}
