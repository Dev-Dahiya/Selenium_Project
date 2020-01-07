package page.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HomePageFactory {
	WebDriver driver;
	private static final Logger log = LogManager.getLogger(HomePageFactory.class.getName());
	
	@FindBy(id="header-history")
	WebElement headerHistory;
	
	@FindBy(id="tab-flight-tab")
	WebElement flightTab;
	
	@FindBy(id="flight-origin")
	WebElement originTextBox;
	
	@FindBy(id="flight-destination")
	WebElement destinationTextBox;
	
	@FindBy(id="flight-departing")
	WebElement departureDate;
	
	@FindBy(id="flight-destination")
	WebElement returnDate;
	
	
	public HomePageFactory(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickFlightTab() {
		headerHistory.click();
		flightTab.click();
		log.info("Flights tab clicked");
		
	}
	
	public void setOriginCity(String origin) {
		originTextBox.sendKeys(origin);
		log.info("Origin text box filled");
	}
	
	public void setDestinationCity(String destination) {
		destinationTextBox.sendKeys(destination);
		log.info("Destination text box filled");
	}
	
	public void setDepartureDate(String departuredate) {
		departureDate.sendKeys(departuredate);
		log.info("Departure date filled");
	}
	
	public void setRetureDate(String returndate) {
		returnDate.sendKeys(returndate);
		log.info("Return date filled");
	}
}
