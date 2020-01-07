package listnerspackage;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class CustomListner3 implements ISuiteListener {

	@Override
	public void onStart(ISuite suite) {
		System.out.println("Running onStart");

	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("Running onFinish");

	}

}
