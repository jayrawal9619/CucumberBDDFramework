package MyHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class AmazonHooks {
	
	@Before(order = 1)
	public void setup(Scenario sc) {
		System.out.println("launch amazon application");
	}

	@Before(order = 2)
	public void setup_url() {
		System.out.println("launch url");
	}
	
	@After
	public void tearDown() {
		System.out.println("close the browser");
	}
	
	@BeforeStep
	public void takescreenshot() {
		System.out.println("take the screenshot");
	}
	
	@AfterStep
	public void refreshPage() {
		System.out.println("refresh the page");
	}
	
	
}
