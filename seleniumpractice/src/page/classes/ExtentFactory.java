package page.classes;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentFactory {
	
	public static ExtentReports getInstance() {
	ExtentReports extent;
	String path = "//Users//devkumar//Desktop//logintest.html";
	extent = new ExtentReports(path, false);
	return extent;
	

	}

}
