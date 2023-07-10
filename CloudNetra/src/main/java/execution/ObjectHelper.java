package execution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import execution.MyDriver;

public class ObjectHelper {

	private static MyDriver driver;
	
	public ObjectHelper(MyDriver driver) {
		this.driver = driver;
	}
	
	/*
	 * public static WebElement getTextElement(String xpath) { return
	 * driver.waitAndGetElement(By.xpath(xpath)); } public WebElement
	 * getElementxpath(String xpath) { return
	 * driver.waitAndGetElement(By.xpath(xpath)); }
	 * 
	 * public WebElement getClassElement(String classValue) { return
	 * driver.waitAndGetElement(By.xpath("(//*[@class='"+classValue+"'])")); }
	 */
}
