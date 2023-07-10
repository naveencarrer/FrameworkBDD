package stepdef;

import java.io.FileNotFoundException;
import java.io.IOException;

import execution.MyDriver;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
public static MyDriver driver;
	
	@Before
	public void startUp() throws FileNotFoundException, InterruptedException, IOException {
		if(driver==null) {
		driver = new MyDriver();
		driver.start();
	}else {
		System.out.println("MyWebDriver Instance " + driver.getDriver());
	}
	}
	
	@After
	public void stop(Scenario scenario ) {
		if(scenario.isFailed() ) {
			//driver.stop();
			driver.stop();
		}
	}

}
