package page.classes;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public static WebElement element = null;
	
	// find Origin Text Box
	public static WebElement originTextBox(WebDriver driver) {
		element = driver.findElement(By.id("flight-origin"));
		return element;
		}
	
	//pass values to Origin Text Box
	public static void passvalueToOriginTextBox(WebDriver driver, String origin) {
		element = originTextBox(driver);
		element.sendKeys(origin);
	}
	
	// find Destination Text Box
	public static WebElement destinationTextBox(WebDriver driver) {
		element = driver.findElement(By.id("flight-destination"));
		return element;
	}
	
	// fill value to Destination Text Box
	public static void fillvalueToDestnationTextBox(WebDriver driver, String destination) {
		element = destinationTextBox(driver);
		element.sendKeys(destination);
	}
			
	//find Departure Date Text Box
	public static WebElement departureDateTextBox(WebDriver driver) {
		element = driver.findElement(By.id("flight-departing"));
		return element;
	}
	
	public static void fillvalueTodepartureDateTextBox(WebDriver driver, String departuredate) {
		element = departureDateTextBox(driver);
		element.sendKeys(departuredate);
	}
	//find return date text box
	public static WebElement returnDateTextBox(WebDriver driver) {
		element = driver.findElement(By.id("flight-returning"));
		return element;
	}
	
	//fill value to return date text box
	public static void fillvalueToreturnDateTextBox(WebDriver driver, String returndate) {
		element = returnDateTextBox(driver);
		element.sendKeys("returndate");
	}
	
	//find Search Button
	public static WebElement searchButton(WebDriver driver) {
		element = driver.findElement(By.id("search-button"));
		return element;
	}
	// click on search button
	public static void clickSearchButton(WebDriver driver) {
		element = searchButton(driver);
		element.click();
	}
	// navigate to flights tab
	public static void navigateToFlightsTab(WebDriver driver) {
		driver.findElement(By.id("header-history")).click();
		element = driver.findElement(By.id("tab-flight-tab"));
		element.click();
	}
	
}
