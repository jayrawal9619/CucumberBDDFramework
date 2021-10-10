package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Users\\jayra\\eclipse-workspace\\CucumberBDDFramework\\src\\test\\resources\\AppFeature\\Uber.feature"} ,
		glue = {"C:\\Users\\jayra\\eclipse-workspace\\CucumberBDDFramework\\src\\test\\java\\stepDefinition\\UberBookingSteps.java"} ,
		// tags = "@All", 
		plugin = {"pretty","html:test-output"}

		// monochrome = false,
		// dryRun = true
		)

public class UberTest {

}

