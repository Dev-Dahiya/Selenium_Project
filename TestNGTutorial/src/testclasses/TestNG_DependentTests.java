package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import appcode.SomeClassToTest;

public class TestNG_DependentTests {
	SomeClassToTest obj;
  
	@BeforeClass
  public void beforeClass() {
		obj = new SomeClassToTest();
	  System.out.println("Running before class");
  }
  
  @Test(dependsOnMethods = {"testMethod2"}, alwaysRun=true)
  public void testMethod1() {
	  System.out.println("Running Test Method1");
  }
  
  @Test
  public void testMethod2() {
	  int result = obj.sumNumbers(1, 3);
	  Assert.assertEquals(result, 3);
	  System.out.println("Running Test Method2");
  }
  
  @Test(dependsOnMethods = {"testMethod1"})
  public void testMethod3() {
	  System.out.println("Running Test Method3");
  }
  
  @Test(dependsOnMethods = {"testMethod3"})
  public void testMethod4() {
	  System.out.println("Running Test Method4");
  }
  
  @AfterClass
  public void afterClass() {
	  System.out.println("Running after class");
  }

}
