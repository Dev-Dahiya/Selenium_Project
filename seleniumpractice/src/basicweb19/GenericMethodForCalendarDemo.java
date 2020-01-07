package basicweb19;

import static org.junit.Assert.*;
import basicweb19.GenericMethods;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericMethodForCalendarDemo {
	WebDriver driver;
	String baseURl;
	GenericMethods gm;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseURl = "https://www.expedia.com/";
		gm = new GenericMethods(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get(baseURl);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(4000);
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		gm.getElement("id", "tab-flight-tab-hp").click();
		gm.getElement("id", "flight-departing-hp-flight").click();
		Thread.sleep(3000);
//		gm.calendarSelection("xpath", 
//				"//div[@class='datepicker-cal-month'][1]//button[@data-year='2019']", "29");
		gm.calendarSelection("29");
	}

}
