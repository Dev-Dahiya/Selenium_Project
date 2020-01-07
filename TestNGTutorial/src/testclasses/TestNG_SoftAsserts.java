package testclasses;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import appcode.SomeClassToTest;

public class TestNG_SoftAsserts {
  
	@Test
  public void testSum() {
		System.out.println("Running Test -> testSum");
		SomeClassToTest obj = new SomeClassToTest();
		int actualResult = obj.sumNumbers(1, 2);
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualResult, 4);
		System.out.println("line after assert 1");
		sa.assertEquals(actualResult, 3);
		System.out.println("line after assert 2");
		sa.assertAll();
		System.out.println("Yash Dahiya");
		
  }
}
