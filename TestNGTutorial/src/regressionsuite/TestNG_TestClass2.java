package regressionsuite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.BaseTestSuite;

public class TestNG_TestClass2 extends BaseTestSuite {
	

	 @Test
	  public void testMethod1() {
		 System.out.println("TestNG_TestClass2 - Method1");
	  }
	  
	  @Test
	  public void testMethod2() {
		  System.out.println("TestNG_TestClass2 - Method2");
	  }
	  
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("TestNG_TestClass2 - Before Method");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("TestNG_TestClass2 - After Method");
	  }

	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("TestNG_TestClass2 - Before Class");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("TestNG_TestClass2 - After Class");
	  }
}
