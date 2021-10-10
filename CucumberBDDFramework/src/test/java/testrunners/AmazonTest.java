package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = {"src\\test\\resources\\AppFeature\\Search.feature"} ,
			glue = {"StepDefinition", "MyHooks"},
			tags = "@smoke or @regression"
			//format = {"pretty","html:test-output"}
			)
		
			public class AmazonTest {

}
