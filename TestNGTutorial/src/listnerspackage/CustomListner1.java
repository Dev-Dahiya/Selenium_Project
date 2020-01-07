package listnerspackage;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class CustomListner1 implements IInvokedMethodListener {

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("beforeInvocation: " + testResult.getTestClass().getName() + "=>"
				+ method.getTestMethod().getMethodName());

	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("afterInvocation: " + testResult.getTestClass().getName() + "=>"
				+ method.getTestMethod().getMethodName());

	}

}
