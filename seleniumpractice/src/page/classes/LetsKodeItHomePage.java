package page.classes;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LetsKodeItHomePage {
	ExtentTest test;
	WebDriver driver = null;
	
	public LetsKodeItHomePage(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}
public void clickSignupLink() {
	WebElement signupLink = driver.findElement(By.id("comp-iiqg1vggactionTitle"));
	signupLink.click();
	test.log(LogStatus.INFO, "Clicked Signup link");
}
	
public void clickloginLink() {
	WebElement loginLink = driver.findElement(By.id("signUpDialogswitchDialogLink"));
	loginLink.click();
	test.log(LogStatus.INFO, "Clicked Login link");
}

public void enterEmail(String email) {
WebElement emailField = driver.findElement(By.id("memberLoginDialogemailInputinput"));
emailField.sendKeys(email);
test.log(LogStatus.INFO, "Email entered");
}

public void enterPassword(String password){
	WebElement passwordField = driver.findElement(By.xpath("//input[@id='memberLoginDialogpasswordInputinput']"));
	passwordField.sendKeys(password);
	test.log(LogStatus.INFO, "Password entered");
}

public void clickGoButton(){
	WebElement goButton = driver.findElement(By.id("memberLoginDialogoklink"));
	goButton.click();
	test.log(LogStatus.INFO, "Clicked Go button");
}


public boolean isWelcomeTextPresent() {
	WebElement welcomeText = null;
	try {
		welcomeText = driver.findElement(By.xpath("//div[text()='Hello test@email.com']"));
		if (welcomeText != null) {
		return true;
		}
	}
	catch (NoSuchElementException e) {
		System.out.println(e.getMessage());
		return false;
	}
	return false;
}
}

