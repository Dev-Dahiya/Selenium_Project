package base;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseTestSetup2 {

	@BeforeTest
	public void beforeTest() {
		System.out.println("BaseTestSetup2 - before test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("BaseTestSetup2 - after test");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BaseTestSetup2 - before suit");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("BaseTestSetup2 - after suit");
	}

}
