package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Grouping2 {

	@BeforeClass(alwaysRun = true)
	public void beforeClass() {
		System.out.println("Grouping - Before Class");
	}

	@AfterClass(alwaysRun = true)
	public void afterClass() {
		System.out.println("Grouping - After Class");
	}

	@Test(groups = { "cars", "SUV" })
	public void testBMWX6() {
		System.out.println("Running - testBMWX6");
	}

	@Test(groups = { "cars", "sedan" })
	public void testAudiA6() {
		System.out.println("Running- testAudiA6");
	}

	@Test(groups = "bikes")
	public void testHondaCBR() {
		System.out.println("Running - testHondaCBR");
	}

	@Test(groups = "bikes")
	public void testNinja() {
		System.out.println("Running - testNinja");
	}

}
