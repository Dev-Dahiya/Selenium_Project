package testpackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FileUpload {
	private WebDriver driver;
	private String baseURL;
  
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
	  driver = new FirefoxDriver();
	  baseURL = "http://toolsqa.com/automation-practice-form/";
	  
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	  driver.get(baseURL);
	  
  }
  @Test
  public void mailLogin() throws AWTException {
	  driver.findElement(By.id("//input[@id='photo']")).click();
	  
	  StringSelection ss = new StringSelection("/Users/devkumar/Desktop/test.png");
	  // copy to clipboard
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	  
	  Robot robot = new Robot();
	  
	  // Cmd + Tab
	  robot.keyPress(KeyEvent.VK_META);
	  robot.keyPress(KeyEvent.VK_TAB);
	  robot.keyRelease(KeyEvent.VK_META);
	  robot.keyRelease(KeyEvent.VK_TAB);
	  robot.delay(3000);
	  //Goto window
	  robot.keyPress(KeyEvent.VK_META);
	  robot.keyPress(KeyEvent.VK_SHIFT);
	  robot.keyPress(KeyEvent.VK_G);
	  robot.keyRelease(KeyEvent.VK_META);
	  robot.keyRelease(KeyEvent.VK_SHIFT);
	  robot.keyRelease(KeyEvent.VK_G);
	  // paste to clipboard
	  robot.keyPress(KeyEvent.VK_META);
	  robot.keyPress(KeyEvent.VK_V);
	  robot.keyRelease(KeyEvent.VK_V);
	  robot.keyRelease(KeyEvent.VK_META);
	  // Hit Enter
	  robot.keyPress(KeyEvent.VK_ENTER);
	  robot.keyRelease(KeyEvent.VK_ENTER );
	  robot.delay(3000);
	  robot.keyPress(KeyEvent.VK_ENTER);
	  robot.keyRelease(KeyEvent.VK_ENTER);
  }
  @AfterClass
  public void afterClass() {
  }

}
