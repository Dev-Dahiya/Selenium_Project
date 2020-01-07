package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class EnabledAndTimeout {
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After class");
  }
  
  @Test(enabled=false)
  public void testMethod1() {
	  System.out.println("Running testMethod1");
  }
  
  @Test(timeOut=200)
  public void testMethod2() throws InterruptedException {
	  System.out.println("Running testMethod2");
	  Thread.sleep(300);
  }

}
