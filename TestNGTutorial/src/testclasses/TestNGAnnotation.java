package testclasses;

import org.testng.annotations.Test;

public class TestNGAnnotation {
  
	@Test
  public void testMethod3() {
		System.out.println("Running Test -> Test Method 3");
  }
	@Test
	  public void atestMethod2() {
			System.out.println("Running Test -> Test Method 2");
	  }
	@Test
	  public void testMethod1() {
			System.out.println("Running Test -> Test Method 1");
	  }
}
