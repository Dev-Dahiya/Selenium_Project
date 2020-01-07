package listnerspackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class CustomListener2 implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// gets invoked before each test method is invoked.
		System.out.println("onTestStart => Test name: " + result.getName());		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// gets invoked if the test method is successful.
		System.out.println("onTestSuccess => Test name: " + result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// gets invoked if the test method is failed.
		System.out.println("onTestFailure => Test name: " + result.getName());		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// gets invoked if the test method is skipped.
		System.out.println("onTestSkipped => Test name: " + result.getName());		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// Ignore it
	}

	@Override
	public void onStart(ITestContext context) {
		// gets invoked before any test method in any class of <test> tag in xml is invoked.
		System.out.println("onStart => Test tag name: " + context.getName());		
	}

	@Override
	public void onFinish(ITestContext context) {
		// gets invoked after all test methods of all classes of <test> tag in xml are invoked.
		System.out.println("onFinish => Test tag name: " + context.getName());
		ITestNGMethod[] ranMethods = context.getAllTestMethods();
		System.out.println("Following method were run:");
		for(ITestNGMethod method : ranMethods) System.out.println(method.getMethodName());		
	}

}
