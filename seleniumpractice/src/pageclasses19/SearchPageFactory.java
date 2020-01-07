package pageclasses19;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageFactory {
	
	public SearchPageFactory(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="tab-flight-tab-hp")
	WebElement flightTab;
	
	@FindBy(id="flight-origin-hp-flight")
	WebElement originTextBox;
	
	@FindBy(id="flight-destination-hp-flight")
	WebElement destTextBox;
	
	@FindBy(id="flight-departing-hp-flight")
	WebElement departDateTextBox;
	
	@FindBy(id="flight-returning-hp-flight")
	WebElement returnDateTextBox;
	
	@FindBy(xpath="//form[@id='gcw-flights-form-hp-flight']//button[@type='submit']")
	WebElement searchButton;
	
	public void clickFlightTab(){
		flightTab.click();
	}
	public void enterOriginCity(String origin){
		originTextBox.sendKeys(origin);
	}
	public void enterDestCity(String destination){
		destTextBox.sendKeys(destination);
	}
	public void enterDepartDate(String departDate){
		departDateTextBox.sendKeys(departDate);
	}
	public void enterReturnDate(String returnDate){
		returnDateTextBox.sendKeys(returnDate);
	}
	public void clickSearchButton(){
		searchButton.click();
	}
	@FindBy(tagName="button")
	List<WebElement> elements;
	
	public void listSize(){
		System.out.println(elements.size());
	}
	
	
	
	
}
