package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumLoginTest {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
		WebDriver driver = new FirefoxDriver();
		String baseURL = "http://www.letskodeit.com";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get(baseURL);
		driver.findElement(By.id("comp-joictyuz")).click();
		WebElement signUpLink = driver.findElement(By.id("comp-iiqg1vggactionTitle"));
		signUpLink.click();
		WebElement loginLink = driver.findElement(By.id("signUpDialogswitchDialogLink"));
		loginLink.click();
		WebElement emailField = driver.findElement(By.id("memberLoginDialogemailInputinput"));
		emailField.sendKeys("test@email.com");
		WebElement passwordField = driver.findElement(By.id("memberLoginDialogpasswordInputinput"));
		passwordField.sendKeys("abcabc");
		WebElement goButton = driver.findElement(By.id("memberLoginDialogokButton"));
		goButton.click();
		Thread.sleep(3000);
		WebElement practicePage = driver.findElement(By.xpath("//div[@id='DrpDwnMn04bg']//p"));
		practicePage.click();
		System.out.println("Login sucessful");
		
	}

}
