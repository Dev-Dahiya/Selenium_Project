package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class TestParameters {

	@BeforeClass
	@Parameters({ "browser", "platform" })
	public void beforeClass(String b, String p) {
		System.out.println("running before class");
		System.out.println("browser parameter value: " + b);
		System.out.println("platform parameter value: " + p);
	}

	@Test
	@Parameters({"response"})
	public void testMethod(String response) {
//		String[] stringArray = response.split(",");
		int a = Integer.parseInt(response);
		System.out.println("running test method");
		System.out.println("response parameter value: " + response);
//		System.out.println("stringArray[0] value: " + stringArray[0]);
//		System.out.println("stringArray[1] value: " + stringArray[1]);
		System.out.println(a+1);
	}

}
