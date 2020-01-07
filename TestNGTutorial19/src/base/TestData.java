package base;

import org.testng.annotations.DataProvider;

public class TestData {

	@DataProvider(name="name-age")
	public Object[][] getData() {
		return new Object[][] { {"Dev", 40}, {"Raj", 46} };
	}

}
