package testclasses;

import org.testng.annotations.Test;

public class TestNG_DataProvider_2 {

	@Test(dataProvider="name-age", dataProviderClass=base.TestData.class)
	public void testMethod1(String name, int age) {
		System.out.println("Name - " + name + ", Age - " + age);
	}
}
