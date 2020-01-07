package TCS.expedia;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestNG_Grouping {

	@BeforeClass(alwaysRun=true)
	public void beforeClass() {
		System.out.println("Before Class");
	}

	@Test(groups = {"cars", "suv"})
	public void testBMWX6() {
		System.out.println("Running Test - BMWX6");
	}

	@Test(groups = {"cars", "sedan"})
	public void testAudiA6() {
		System.out.println("Running Test - AudiA6");
	}

	@Test(groups = {"bike"})
	public void testNinja() {
		System.out.println("Running Test - Ninja");
	}

	@Test(groups = {"bike"})
	public void testHondaCBR() {
		System.out.println("Running Test - HondaCBR");
	}

	@AfterClass(alwaysRun=true)
	public void afterClass() {
		System.out.println("After Class");
	}

}
