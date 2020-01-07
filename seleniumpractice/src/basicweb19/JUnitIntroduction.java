package basicweb19;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitIntroduction {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("runs once before any of the test in current class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("runs once after all tests in the current class");

	}

	@Before
	public void setUp() throws Exception {
		System.out.println("runs before each test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("runs after each test");

	}

	@Test
	public void test1() {
		System.out.println("Running test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("Running test 2");
	}
	
	public void test3() {
		System.out.println("Running test 3");
	}

}
