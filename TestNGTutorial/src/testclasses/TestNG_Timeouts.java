package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestNG_Timeouts {
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Running before class");
  }
  
  @Test(enabled=false)
  public void testMethod1() {
	  System.out.println("Running Test Method1");
  }
  
  @Test(timeOut=200)
  public void testMethod2() throws InterruptedException {
	  Thread.sleep(300);
	  System.out.println("Running Test Method2");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Running after class");
  }

}
