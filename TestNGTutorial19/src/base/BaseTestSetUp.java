package base;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class BaseTestSetUp {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BaseTestSetUp - Runs before suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("\nBaseTestSetUp - Runs after suite");
	}
	
	@BeforeClass
	public void setUp() {
		System.out.println("\nBaseTestSetUp - Runs once before first test method in the class");
	}

	@AfterClass
	public void tearDown() {
		System.out.println("BaseTestSetUp - Runs once after last test method in the class");
	}
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("BaseTestSetUp - Runs before test");
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("BaseTestSetUp - Runs after test");
	}


}
