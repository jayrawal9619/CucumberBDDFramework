package stepDefinition;

import java.util.List;
import io.cucumber.core.cli.Main;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegistration1 {
	
	
	@Given("User is on registration page")
	public void user_is_on_registration_page() {
	System.out.println("user navigates on registration page");   
	}

	@When("User enter following user details")
	public void user_enter_following_user_details(DataTable dataTable) {
		List<List<String>> userList = dataTable.asList(String.class);  
		
		for (List<String> e : userList) {
			System.out.println(e);
		}
	}

	@Then("user registration should be successful")
	public void user_registration_should_be_successful() {
	    }	

}
