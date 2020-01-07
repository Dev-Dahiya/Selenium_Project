package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import base.BaseTestSetup2;

public class Parallel_2 {

//	@BeforeMethod
//	public void beforeMethod() {
//		System.out.println("Parallel_2 - before method");
//	}
//
//	@AfterMethod
//	public void afterMethod() {
//		System.out.println("Parallel_2 - after method");
//	}
//
//	@BeforeClass
//	public void beforeClass() {
//		System.out.println("Parallel_2 - before class");
//	}
//
//	@AfterClass
//	public void afterClass() {
//		System.out.println("Parallel_2 - after class");
//	}

	@Test
	public void testMethod_1() throws InterruptedException {
		System.out.println("Parallel_2 - testMethod_1");
		Thread.sleep(6000);
		System.out.println("Parallel_2 - testMethod_1 -- More steps");
	}
	
	@Test
	public void testMethod_2() throws InterruptedException {
		System.out.println("Parallel_2 - testMethod_2");
		Thread.sleep(6000);
		System.out.println("Parallel_2 - testMethod_2 -- More steps");
	}

}
