package com.tango.challenge.steps;

import io.cucumber.java.en.Given;
import static com.tango.challenge.core.Driver.getDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	
	String url = "https://www.mavenclinic.com/app";	
	
	
	@Given("I am on the login page")
	public void i_am_on_the_login_page() {
		getDriver().get(url + "/login");
	    	
	}

	@When("I fill {string} with {string} correctly")
	public void i_fill_with_correctly(String string, String string2) {
	   
	}

	@Then("I should see login sucessful")
	public void i_should_see_login_sucessful() {
	    
	}

}
