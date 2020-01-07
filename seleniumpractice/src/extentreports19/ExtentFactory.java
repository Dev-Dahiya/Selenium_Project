package extentreports19;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentFactory {	
	public static ExtentReports getInstance(){
		ExtentReports report;
		String path = "//Users//devkumar//desktop//ExtentReports//extent-demo.html";
		report = new ExtentReports(path, false);
		return report;
	}

}
