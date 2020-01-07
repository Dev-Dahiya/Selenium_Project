package pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageFactory {
	WebDriver driver;
	
	@FindBy(id="tab-flight-tab")
	WebElement flightsTab;
	
	@FindBy(id="flight-origin")
	WebElement originCity;
	
	@FindBy(id="flight-destination")
	WebElement destinationCity;
	
	@FindBy(id="flight-departing")
	WebElement departureDate;
	
	@FindBy(id="flight-returning")
	WebElement returnDate;
	
	public SearchPageFactory (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickFlightTab() {
		flightsTab.click();
	}
	public void enterOriginCity(String origin) {
		originCity.sendKeys(origin);
	}
	public void enterDestinationCity(String destination) {
		destinationCity.sendKeys(destination);
	}
	public void enterdepartureDate(String departuredate) {
		departureDate.sendKeys(departuredate);
	}
	public void enterReturnDate(String returndate) {
		returnDate.sendKeys(returndate);
	}
}
