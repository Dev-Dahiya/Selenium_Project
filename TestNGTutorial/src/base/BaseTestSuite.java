package base;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class BaseTestSuite {
 
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("BaseTestSuite - Before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("BaseTestSuite - After Suite");
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("BaseTestSuite - Before Test");
  }
  
  @AfterTest
  public void afterTest() {
	  System.out.println("BaseTestSuite - After Test");
  }

}
