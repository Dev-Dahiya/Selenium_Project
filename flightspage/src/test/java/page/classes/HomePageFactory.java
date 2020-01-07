package page.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageFactory {
	WebDriver driver;
	
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
	}
	
	public void setOriginCity(String origin) {
		originTextBox.sendKeys(origin);
	}
	
	public void setDestinationCity(String destination) {
		destinationTextBox.sendKeys(destination);
	}
	
	public void setDepartureDate(String departuredate) {
		departureDate.sendKeys(departuredate);
	}
	
	public void setRetureDate(String returndate) {
		returnDate.sendKeys(returndate);
	}
}
