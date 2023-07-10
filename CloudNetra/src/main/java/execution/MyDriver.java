package execution;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.omg.CORBA.ObjectHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;


public class MyDriver {
	
	public static WebDriver driver;
	private ObjectHelper objectHelper;
	private static final long DEFAULT_TIMEOUT = 10000;
	public String currentDeviceName;
	private static String baseURL = "https://cloudnetratest.firebaseapp.com/#/auth";
	
	public void start() throws InterruptedException, FileNotFoundException, IOException{
		 System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
		 driver = new ChromeDriver();
		 loadUrl(baseURL);
	}
	
	public void loadUrl(String url) {
		driver.get(url);
	}
	public void maximize() {
		driver.manage().window().maximize();
	}
	public void stop() {
		getDriver().quit();
	}
	public ObjectHelper getObjectHelper() {
		return objectHelper;
	}
	public WebDriver getDriver() {	
		return driver;
	}
	
	public FluentWait<WebDriver> waitDriver(long millis) {
		FluentWait<WebDriver> waitDriver = new FluentWait<WebDriver>(getDriver());
		waitDriver.withTimeout(Duration.ofMillis(millis));
		waitDriver.ignoring(Exception.class);
		return waitDriver;
	}
	
	public WebElement waitAndGetElement(By by) {
		return waitDriver(DEFAULT_TIMEOUT).until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	
	public WebElement waitAndGetElement(String xpath, String values) {
		waitDriver(DEFAULT_TIMEOUT).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		driver.findElement(By.xpath(xpath)).sendKeys(values);
		return null;
	}
	
	/*
	 * public void clickByJs(By by) { JavascriptExecutor js = (JavascriptExecutor)
	 * getDriver(); js.executeScript("arguments[0].click();",
	 * waitAndGetElement(by)); }
	 */
	
}
