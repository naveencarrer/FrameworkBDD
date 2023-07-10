package execution;

import org.openqa.selenium.By;

import execution.MyDriver;

public class HomePage {

	private MyDriver driver;
	private static final String USERNAME = ".//input[@id='username']";
	private static final String PASSWORD = ".//input[@id='input-password']";
	private static final String SIGNIN = ".//button[@type='submit']";
	private static final String ORGANIZATIONALUNIT = ".//span[@class='menu-title' and text()='Organizational Unit']";
	private static final String OUADD = ".//span[@class='mat-button-wrapper']/mat-icon[text()='add']";
	private static final String NAME = ".//input[@id='OUName']";
	private static final String ADD = ".//span[@class='mat-button-wrapper' and text()=' Add ']";
	private static final String SEARCHBAR = ".//input[@id='searchBar']";
	private static final String Arrow = ".//td[text()='Naveen']/following::td[6]/a/mat-icon";
	private static final String MPPLUS = ".//span[@class='mat-button-wrapper']/mat-icon[text()='add']";
	private static final String PROJECTNAME = ".//input[@class='mat-input-element mat-form-field-autofill-control cdk-text-field-autofill-monitored ng-untouched ng-pristine ng-invalid']";
	private static final String PROJECTDESC = ".//textarea[@placeholder='Description']";
	
	public HomePage(MyDriver driver) {
		this.driver = driver;
	}
	
	public void Loginscreen() throws InterruptedException {
	
		driver.waitAndGetElement(By.xpath(USERNAME)).sendKeys("shagun0908singh@gmail.com");
		driver.waitAndGetElement(By.xpath(PASSWORD)).sendKeys("password@123");
		driver.maximize();
		driver.waitAndGetElement(By.xpath(SIGNIN)).click();		
	}
	public void organizationalUnit() throws InterruptedException {
		
		driver.waitAndGetElement(By.xpath(ORGANIZATIONALUNIT)).click();		
		Thread.sleep(1000);
		driver.waitAndGetElement(By.xpath(OUADD)).click();	
		Thread.sleep(1000);
		driver.waitAndGetElement(By.xpath(NAME)).sendKeys("Naveen");
		Thread.sleep(1000);
		driver.waitAndGetElement(By.xpath(ADD)).click();	
		Thread.sleep(1000);
		driver.waitAndGetElement(By.xpath(SEARCHBAR)).sendKeys("Naveen");
		Thread.sleep(1000);
		driver.waitAndGetElement(By.xpath(Arrow)).click();	
	}
	public void manageProject() throws InterruptedException {
		Thread.sleep(1000);	
		driver.waitAndGetElement(By.xpath(MPPLUS)).click();	
		Thread.sleep(1000);
		driver.waitAndGetElement(By.xpath(PROJECTNAME)).sendKeys("NaveenProject");
		Thread.sleep(1000);
		driver.waitAndGetElement(By.xpath(PROJECTDESC)).sendKeys("NaveenProject");
		Thread.sleep(1000);
		driver.waitAndGetElement(By.xpath(ADD)).click();	
		Thread.sleep(1000);
	}
	
	/*
	 * public boolean isTasksTabDisplayed() { return
	 * driver.getObjectHelper().getTextElement(TAB_TASKS).isDisplayed(); }
	 */
}
