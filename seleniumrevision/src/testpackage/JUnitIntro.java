package testpackage;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitIntro {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Executing before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Executing after class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Executing before");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Executing after");
	}

	@Test
	public void test1() {
		System.out.println("Executing test method 1");
	}

	@Test
	public void test2() {
		System.out.println("Executing test method 2");
	}
	/*Executing before class
	Executing before
	Executing test method 1
	Executing after
	Executing before
	Executing test method 2
	Executing after
	Executing after class
	*/
	
	
}
