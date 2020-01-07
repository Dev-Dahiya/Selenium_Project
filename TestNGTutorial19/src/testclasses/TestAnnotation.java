package testclasses;

import org.testng.annotations.Test;
import appcode.SomeClassToTest;

public class TestAnnotation {
	
	@Test
	public void testMethodC() {
		SomeClassToTest obj = new SomeClassToTest();
		int result = obj.addNumbers(1, 2);
		System.out.println("Running testMethodC");
	}

	@Test
	public void testMethodA() {
		System.out.println("Running testMethodA");
	}
	
	@Test
	public void testMethodB() {
		System.out.println("Running testMethodB");
	}
}
