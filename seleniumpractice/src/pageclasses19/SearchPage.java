package pageclasses19;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basicweb19.GenericMethods;

public class SearchPage extends GenericMethods {
	WebDriver driver;
	private final String flightsTab = "tab-flight-tab-hp"; //id
	private final String originTextBox = "flight-origin-hp-flight"; //id
	private final String destinationTextBox = "flight-destination-hp-flight"; //id
	private final String departureDateTextBox = "flight-departing-hp-flight"; //id
	private final String returnDateTextBox = "flight-returning-hp-flight"; //id
	private final String searchButton = "//form[@id='gcw-flights-form-hp-flight']//button[@type='submit']"; //xpath
	
	public SearchPage(WebDriver driver){
		super(driver);
		this.driver = driver;
	}
	public WebElement getFlightsTab(){
		return getElement("id", flightsTab);
	}
	public WebElement getOriginTextBox(){
		return getElement("id", originTextBox);
	}
	public WebElement getDestinationTextBox(){
		return getElement("id", destinationTextBox);
	}
	public WebElement getDepartDateTextBox(){
		return getElement("id", departureDateTextBox);
	}
	public WebElement getReturnDateTextBox(){
		return getElement("id", returnDateTextBox);
	}
	public WebElement getSearchButton(){
		return getElement("xpath", searchButton);
	}
	
	
	public void clickFlightsTab(){
		findAndClickElement("id", flightsTab);
	}
	public void fillOriginCity(String enterOriginCity){
		findAndEnterKeysInElement("id", originTextBox, enterOriginCity);
	}
	public void fillDestCity(String enterDestCity){
		findAndEnterKeysInElement("id", destinationTextBox, enterDestCity);
	}
	public void fillDepartDate(String enterDepartDate){
		findAndEnterKeysInElement("id", departureDateTextBox, enterDepartDate);
	}
	public void fillReturnDate(String enterReturnDate){
		findAndEnterKeysInElement("id", returnDateTextBox, enterReturnDate);
	}
	public void clickSearchButton(){
		findAndClickElement("xpath", searchButton);
	}
}
