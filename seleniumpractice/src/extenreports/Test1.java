package extenreports;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import page.classes.ExtentFactory;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Test1 {
	ExtentReports report;
	ExtentTest test;
	

	@BeforeClass
	public void beforeClass() {
		report = ExtentFactory.getInstance();
		test = report.startTest("Runnint Test 1");
	}

	@Test
	public void f() {
		test.log(LogStatus.INFO, "page opened");
		test.log(LogStatus.INFO, "page continuing");
		test.log(LogStatus.INFO, "page ended");
		report.endTest(test);
		report.flush();
	}

	@AfterClass
	public void afterClass() {
	}

}
