package extentreports19;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
// start from 179. Advanced Reporting - Practical Example
public class Practice2 {
	ExtentReports report;
	ExtentTest test;

	@BeforeClass
	public void beforeClass() {
		report = new ExtentReports("//Users//devkumar//desktop" + "//ExtentReports//login_test_2.html");
		System.out.println("Running before class");
		test = report.startTest("Practice Test...");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Running after class");
		report.endTest(test);
		report.flush();		
	}

	@Test
	public void passTest() {
		System.out.println("Running passTest");
		test.log(LogStatus.PASS, "msg from passTest!");
	}

	@Test
	public void failTest() {
		System.out.println("Running failTest");
		test.log(LogStatus.FAIL, "msg from failTest!");
	}

	@Test
	public void fatalTest() {
		System.out.println("Running fatalTest");
		test.log(LogStatus.FATAL, "msg from fatalTest!");
	}
	
	@Test
	public void errorTest() {
		System.out.println("Running errorTest");
		test.log(LogStatus.ERROR, "msg from errorTest!");
	}
	
	@Test
	public void warningTest() {
		System.out.println("Running warningTest");
		test.log(LogStatus.WARNING, "msg from warningTest!");
	}
	
	@Test
	public void skipTest() {
		System.out.println("Running skipTest");
		test.log(LogStatus.SKIP, "msg from skipTest!");
	}
	
	@Test
	public void infoTest() {
		System.out.println("Running infoTest");
		test.log(LogStatus.INFO, "msg from infoTest!");
	}
	
	@Test
	public void unknownTest() {
		System.out.println("Running unknownTest");
		test.log(LogStatus.UNKNOWN, "msg from unknownTest!");
	}

}
