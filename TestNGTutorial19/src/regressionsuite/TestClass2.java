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

public class TestClass2 extends BaseTestSetUp{
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("TestClass2 - Runs once before each test method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("TestClass2 - Runs once after each test method");
	}
	
	@Test
	public void testMethodA() {
		System.out.println("Running TestClass2 - testMethodA");
	}

	@Test
	public void testMethodB() {
		System.out.println("Running TestClass2 - testMethodB");
	}

	}
