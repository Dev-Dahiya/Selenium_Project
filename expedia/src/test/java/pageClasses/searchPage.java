package pageClasses;

import org.apache.regexp.recompile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class searchPage {
	public static WebElement element = null;
	

	public static WebElement originTextBox(WebDriver driver) {
		element = driver.findElement(By.id("flight-origin"));
		return element;
		}
	
	public static void fillOriginTextBox(WebDriver driver, String origin) {
		originTextBox(driver).sendKeys(origin);
		
	}
	
	public static WebElement destinationTextBox(WebDriver driver) {
		element = driver.findElement(By.id("flight-destination"));
		return element;
	}
	
	public static void fillDestinationTextBox(WebDriver driver, String destination) {
		destinationTextBox(driver).sendKeys(destination);
	}
	
	public static WebElement departureDate(WebDriver driver) {
		element = driver.findElement(By.id("flight-departing"));
		return element;
	}
	
	public static void fillDepartureDate(WebDriver driver, String departuredate) {
		departureDate(driver).sendKeys(departuredate);
	}
	
	public static WebElement returnDate(WebDriver driver) {
		element = driver.findElement(By.id("flight-returning"));
		return element;
	}
	
	public static void fillReturnDate(WebDriver driver, String returndate) {
		returnDate(driver).sendKeys(returndate);
	}
	
	public static void clickSearchButton(WebDriver driver) {
		driver.findElement(By.id("search-button")).click();
	}
}
