package testclasses;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ITestResultDemo {
  
  @AfterMethod
  public void afterMethod(ITestResult testResult) {
	  if(testResult.getStatus() == ITestResult.FAILURE) {
		  System.out.println("Failed: " + testResult.getName());
	  }
	  else if(testResult.getStatus() == ITestResult.SUCCESS) {
		  System.out.println("Successful: " + testResult.getName());
	  }
	  else if(testResult.getStatus() == ITestResult.SKIP){
		  System.out.println("Skipped: " + testResult.getName());
	  }
	  
  }
  
  @Test
  public void testMethod_1() {
	  System.out.println("Running testMethod_1");
	  Assert.assertTrue(0>1);
  }
  
  @Test(dependsOnMethods="testMethod_1")
  public void testMethod_2() {
	  System.out.println("Running testMethod_2");
	  Assert.assertTrue(0<1);
  }

}
