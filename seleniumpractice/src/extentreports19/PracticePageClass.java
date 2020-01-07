package extentreports19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class PracticePageClass {
	WebDriver driver;
	ExtentTest test;
	
	public PracticePageClass(WebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	}
	
	public void enterName(String text){
		driver.findElement(By.id("name")).sendKeys(text);
		test.log(LogStatus.PASS, "Entered Name");
	}

}
