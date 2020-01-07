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

public class Grouping {
  
  @BeforeMethod(alwaysRun=true)
  public void beforeMethod() {
	  System.out.println("Grouping - Before Method");
  }

  @AfterMethod(alwaysRun=true)
  public void afterMethod() {
	  System.out.println("Grouping - After Method");
  }

  @BeforeClass(alwaysRun=true)
  public void beforeClass() {
	  System.out.println("Grouping - Before Class");
  }

  @AfterClass(alwaysRun=true)
  public void afterClass() {
	  System.out.println("Grouping - After Class");
  }

  @BeforeTest(alwaysRun=true)
  public void beforeTest() {
	  System.out.println("Grouping - Before Test");
  }

  @AfterTest(alwaysRun=true)
  public void afterTest() {
	  System.out.println("Grouping - After Test");
  }

  @BeforeSuite(alwaysRun=true)
  public void beforeSuite() {
	  System.out.println("Grouping - Before Suite");
  }

  @AfterSuite(alwaysRun=true)
  public void afterSuite() {
	  System.out.println("Grouping - After Suite");
  }
  
  @Test(groups={"cars", "SUV"})
  public void testBMWX6() {
	  System.out.println("Running - testBMWX6");
  }
  
  @Test(groups={"cars", "sedan"})
  public void testAudiA6() {
	  System.out.println("Running- testAudiA6");
  }
  
  @Test(groups="bikes")
  public void testHondaCBR() {
	  System.out.println("Running - testHondaCBR");
  }
  
  @Test(groups="bikes")
  public void testNinja() {
	  System.out.println("Running - testNinja");
  }

}
