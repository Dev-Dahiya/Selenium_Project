package testclasses;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import appcode.SomeClassToTest;

public class TestNGSoftAssert {

	@Test
	public void testSum() {
		SoftAssert sa = new SoftAssert();
		System.out.println("\nRunning method testSum");
		SomeClassToTest obj = new SomeClassToTest();
		int actualResult = obj.addNumbers(1, 2);
		sa.assertEquals(actualResult, 1);
		System.out.println("\nLine after assert 1");
		sa.assertEquals(actualResult, 3);
		System.out.println("\nLine after assert 2");
		sa.assertAll();
	}
	
}
