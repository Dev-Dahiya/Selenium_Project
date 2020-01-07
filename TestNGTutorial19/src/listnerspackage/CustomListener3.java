package listnerspackage;

import java.util.List;

import org.testng.IInvokedMethod;
import org.testng.ISuite;
import org.testng.ISuiteListener;

public class CustomListener3 implements ISuiteListener {

	@Override
	public void onStart(ISuite suite) {
		System.out.println("onStart - before suite starts => " + suite.getName());
	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("onFinish - after suite completes => " + suite.getName());
		List<IInvokedMethod> allMethods = suite.getAllInvokedMethods();
		System.out.println("Following methods were invoked in this suite:");
		for (IInvokedMethod method : allMethods)
			System.out.println(method.getTestMethod().getMethodName());
	}

}
