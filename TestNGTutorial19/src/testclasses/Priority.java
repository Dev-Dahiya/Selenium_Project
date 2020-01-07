package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Priority {
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Priority - before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Priority - after class");
  }

  @Test(priority=1)
  public void testMethodA(){
	  System.out.println("Priority - testMethodA");
  }
  @Test(priority=2)
  public void testMethodB(){
	  System.out.println("Priority - testMethodB");
  }
  @Test(priority=0)
  public void testMethodC(){
	  System.out.println("Priority - testMethodC");
  }
}
