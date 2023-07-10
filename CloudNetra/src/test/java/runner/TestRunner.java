package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},features = "src/test/resources/features", glue = "stepdef", monochrome = true,strict = true, tags = "@Regression")
public class TestRunner extends AbstractTestNGCucumberTests {
	
	
}
