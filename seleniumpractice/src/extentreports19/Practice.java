package extentreports19;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Practice {
	ExtentReports report;
	ExtentTest test;
	public Logger log = LogManager.getLogger(Practice.class.getName());

	@BeforeClass
	public void beforeClass() {
		report = new ExtentReports("//Users//devkumar//desktop" + "//ExtentReports//login_test_2.html");
		System.out.println("Running before class");
		test = report.startTest("Practice Test...");
		// Reporter.log("reporter log from before class", true);
//		test.log(LogStatus.INFO, "info msg from before class!");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Running after class");
		test.log(LogStatus.INFO, "info msg from after class!");
		report.endTest(test);
		report.flush();
		// Reporter.log("reporter log from after class", true);		
	}

	@Test
	public void practiceTest1() {
		System.out.println("Running practiceTest1");
//		test.log(LogStatus.INFO, "info msg from practiceTest1!");
		log.debug("practiceTest1 => debug msg");
		// Reporter.log("reporter log from practiceTest1", true);
	}

	@Test
	public void practiceTest2() {
		System.out.println("Running practiceTest2");
//		test.log(LogStatus.INFO, "info msg from practiceTest2!");
		log.debug("practiceTest2 => debug msg");
		// Reporter.log("reporter log from practiceTest2", true);
	}

	@Test
	public void practiceTest3() {
		System.out.println("Running practiceTest3");
//		test.log(LogStatus.INFO, "info msg from practiceTest3!");
		log.debug("practiceTest3 => debug msg");
		// Reporter.log("reporter log from practiceTest3", true);
	}

}
