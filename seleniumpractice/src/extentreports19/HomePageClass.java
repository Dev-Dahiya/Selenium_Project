package extentreports19;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class HomePageClass {
	WebDriver driver;
	ExtentTest test;

	public HomePageClass(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}

	public void pressEscape() {
		driver.findElement(By.id("comp-jgmoxws4")).sendKeys(Keys.ESCAPE);
	}

	public void clickSignupLink() {
		driver.findElement(By.id("comp-iiqg1vggactionTitle")).click();
		test.log(LogStatus.INFO, "Clicked Login/Signup link");
	}

	public void clickLoginLink() {
		driver.findElement(By.id("signUpDialogswitchDialogLink")).click();
		test.log(LogStatus.INFO, "Clicked Login link");
	}

	public void enterEmail(String email) {
		driver.findElement(By.id("memberLoginDialogemailInputinput")).sendKeys(email);
		test.log(LogStatus.INFO, "Entered email");
	}

	public void enterPassword(String password) {
		driver.findElement(By.id("memberLoginDialogpasswordInputinput")).sendKeys(password);
		test.log(LogStatus.INFO, "Entered password");
	}

	public void clickLoginButton() {
		driver.findElement(By.id("memberLoginDialogokButton")).click();
		test.log(LogStatus.INFO, "Clicked Login button");
	}

	public boolean isWelcomeTextPresent() {
		WebElement welcomeText = null;
		try {
			welcomeText = driver.findElement(By.xpath("//div[text()='Hello test']"));
		} catch (NoSuchElementException e) {
			System.out.println("Message from catch block =>" + e.getMessage());
		}
		if (welcomeText != null){
			test.log(LogStatus.PASS, "Verified Welcome Text");
			return true;
			}
		else{
			test.log(LogStatus.FAIL, "Could not verify Welcome Text");
			return false;
		}
			
	}

}
