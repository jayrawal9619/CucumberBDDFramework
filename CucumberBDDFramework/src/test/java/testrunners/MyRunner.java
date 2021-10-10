package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Users\\jayra\\eclipse-workspace\\CucumberBDDFramework\\src\\test\\resources\\AppFeature\\login.feature"} ,
		glue = {"C:\\Users\\jayra\\eclipse-workspace\\CucumberBDDFramework\\src\\test\\java\\stepDefinition\\LoginStepDefinition.java"}
		//format = {"pretty","html:test-output"}
		
		)

public class MyRunner {

}
