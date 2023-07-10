package execution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import execution.ObjectHelper;

import execution.MyDriver;

public class LoginPage {

	private static String INPUT_USERNAME = "(//*[@class='android.widget.EditText'])[1]";
	private static String INPUT_PASSWORD = "(//*[@class='android.widget.EditText'])[2]";
	private static final String BUTTON_SIGN_IN = "Sign in";
	private static final String TXT_INVALID_MESSAGE = "Invalid username or passcode.";
	private static final String SUITCASE_IOCN = "//android.widget.Button[@content-desc='You, tab, 4 of 4']/android.widget.ImageView";
	private static final String LOGOUT = ".//*[@text='LOG OUT']";
	
	private MyDriver driver;
	
	public LoginPage(MyDriver driver) {
		this.driver = driver;
	}
	
	/*
	 * public void setUsernameAndPassword(String username, String password) {
	 * WebElement userNameElement =
	 * driver.waitAndGetElement(By.xpath(INPUT_USERNAME));
	 * userNameElement.sendKeys(username); WebElement passewordElement =
	 * driver.waitAndGetElement(By.xpath(INPUT_PASSWORD));
	 * passewordElement.sendKeys(password); }
	 * 
	 * public void clickSignIn() {
	 * driver.waitAndGetElement(By.xpath(BUTTON_SIGN_IN)).click(); }
	 */
	/*
	 * public void NegativeScenario(String username, String password) throws
	 * InterruptedException {
	 * driver.getObjectHelper().getElementxpath(SUITCASE_IOCN).click();
	 * driver.getObjectHelper().getElementxpath(LOGOUT).click(); Thread.sleep(3000);
	 * WebElement userNameElement =
	 * driver.waitAndGetElement(By.xpath(INPUT_USERNAME));
	 * userNameElement.sendKeys(username); WebElement passewordElement =
	 * driver.waitAndGetElement(By.xpath(INPUT_PASSWORD));
	 * passewordElement.sendKeys(password); }
	 */
	
	/*
	 * public boolean isErrorMsgDisplayed() { return
	 * driver.getObjectHelper().getTextElement(TXT_INVALID_MESSAGE).isDisplayed(); }
	 */
	
}
