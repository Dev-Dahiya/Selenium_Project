package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestingSteps {
	public static WebDriver driver;
	
	@Given("^user is on Home Page$")
	public void user_is_on_Home_Page() {
		System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
		driver = new FirefoxDriver();
		String baseURL = "http://www.letskodeit.com";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(baseURL);
	   }

	@When("^User enters valid username and password$")
	public void user_enters_valid_username_and_password() {
		WebElement signUpLink = driver.findElement(By.id("comp-iiqg1vggactionTitle"));
		signUpLink.click();
		WebElement loginLink = driver.findElement(By.id("signUpDialogswitchDialogLink"));
		loginLink.click();
		WebElement emailField = driver.findElement(By.id("memberLoginDialogemailInputinput"));
		emailField.sendKeys("test@email.com");
		WebElement passwordField = driver.findElement(By.id("memberLoginDialogpasswordInputinput"));
		passwordField.sendKeys("abcabc");
	    }

	@When("^User clicks Go button$")
	public void user_clicks_Go_button() throws InterruptedException {
		WebElement goButton = driver.findElement(By.id("memberLoginDialogoklink"));
		goButton.click();
		Thread.sleep(3000);
	    }

	@Then("^User can visit Practice page$")
	public void user_can_visit_Practice_page() {
		WebElement practicePage = driver.findElement(By.xpath("//div[@id='DrpDwnMn05bg']//p"));
		practicePage.click();
	    }

	@Then("^A message is displayed$")
	public void a_message_is_displayed() {
		System.out.println("Login sucessful");
	    }


}
