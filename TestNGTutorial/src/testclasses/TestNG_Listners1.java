package testclasses;

import org.testng.annotations.Test;

//import listnerspackage.CustomListner1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

//@Listeners(CustomListner1.class)
public class TestNG_Listners1 {

	@BeforeClass
	public void setUp() {
		System.out.println("Running before class-TestNG_Listners1");
	}

	@Test
	public void testMethod1() {
		System.out.println("Running testMethod1-TestNG_Listners1");
		Assert.assertTrue(false);
	}

	@Test
	public void testMethod2() {
		System.out.println("Running testMethod2-TestNG_Listners1");
		Assert.assertTrue(true);
	}

	@AfterClass
	public void cleanUp() {
		System.out.println("Running after class-TestNG_Listners1");
	}

}
