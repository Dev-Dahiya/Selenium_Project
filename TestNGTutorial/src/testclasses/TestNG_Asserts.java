package testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import appcode.SomeClassToTest;

public class TestNG_Asserts {
  
	@Test
  public void testSum() {
		System.out.println("Running Test -> testSum");
		SomeClassToTest obj = new SomeClassToTest();
		int actualResult = obj.sumNumbers(1, 3);
		int expectedResult = 4;
		Assert.assertEquals(actualResult, expectedResult);
		
  }
	@Test
	public void testStrings() {
		System.out.println("Running Test -> testStrings");
		SomeClassToTest obj = new SomeClassToTest();
		String actualResult = obj.addStrings("Hello", "World");
		String expectedResult = "Hello World";
		Assert.assertEquals(actualResult, expectedResult);
		
	}
	@Test
	public void testArrays() {
		System.out.println("Running Test -> testArrays");
		SomeClassToTest obj = new SomeClassToTest();
		int[] actualResult = obj.getArray();
		int[] expectedResult = {1, 2, 3};
		Assert.assertEquals(actualResult, expectedResult);
	}
}
