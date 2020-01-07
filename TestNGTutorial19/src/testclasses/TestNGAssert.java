package testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import appcode.SomeClassToTest;

public class TestNGAssert {

	@Test
	public void testSum() {
		System.out.println("\nRunning method testSum\n");
		SomeClassToTest obj = new SomeClassToTest();
		int actualResult = obj.addNumbers(1, 2);
		Assert.assertEquals(actualResult, 3);
	}
	
	@Test
	public void testStrings(){
		System.out.println("\nRunning method testStrings");
		SomeClassToTest obj = new SomeClassToTest();
		String actualResult = obj.addStrings("Hello", "World");
		String expectedResult = "Hello World";
		Assert.assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void testArrays(){
		System.out.println("Running method testArrays");
		SomeClassToTest obj = new SomeClassToTest();
		int[] actualResult = obj.getArray();
		int[] expectedResult = {1,2,3};
		Assert.assertEquals(actualResult, expectedResult);
	}
	
	
}
