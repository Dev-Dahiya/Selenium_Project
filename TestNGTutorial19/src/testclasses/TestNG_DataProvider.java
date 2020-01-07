package testclasses;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_DataProvider {

	@DataProvider
	public String[] getData() {
		return new String[] { "dev", "raj", "yash" };
	}

	@DataProvider(name="grades")
	public Object[][] getData2() {
		return new Object[][] { { 5, 1 }, { 6, 2 }, { 7, 3 } };
	}

	@Test(dataProvider = "getData")
	public void testMethod1(String name) {
		System.out.println("name: " + name);
	}
	
	@Test(dataProvider="grades")
	public void testMethod2(int age, int grade){
		System.out.println("Age - " + age + ", class - " + grade);
	}
}
