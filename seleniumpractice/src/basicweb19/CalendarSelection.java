package basicweb19;

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalendarSelection {
	WebDriver driver;
	String baseURl;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseURl = "https://www.expedia.com/";
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
		driver.findElement(By.id("tab-flight-tab-hp")).click();
		// First Method
		WebElement departDate = driver.findElement(By.id("flight-departing-hp-flight"));
//		departDate.sendKeys("08/02/2019");
		
		// Second Method
		departDate.click();
		Thread.sleep(3000);
//		WebElement dateToSelect = driver.findElement(By.xpath
//				("//div[@class='datepicker-cal-month'][1]//button[@data-day='29']"));
//		dateToSelect.click();
		
		// Third Method
//		WebElement calMonth = driver.findElement(By.xpath("//div[@class='datepicker-cal-month'][position()=1]"));
		
		List <WebElement> allValidDates = driver.findElements(By.xpath("//div[@class='datepicker-cal-month'][1]//button[@data-year='2019']"));
		
		for(WebElement date : allValidDates){
			if (date.getAttribute("data-day").equals("30")){
				date.click();
				break;
			}
		}
	}

}
