package com.tango.challenge.steps;

import org.junit.Assert;

import com.tango.challenge.functionalities.RegisterAccountFunctionalities;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterInvalidSteps {
	
	RegisterAccountFunctionalities register = new RegisterAccountFunctionalities();
	String message = "This doesn't look like a valid email address";
	
	@When("I fill {string} with {string} with {string} incorrectly")
	public void i_fill_with_with_incorrectly(String firstName, String lastName, String email) {
		register.waitforElementPresentFirstName();
		register.writeFirstName(firstName);
		register.writeLastName(lastName);
		register.writeEmail(email);

	}
	@When("I fill {string} incorrectly")
	public void i_fill_incorrectly(String password) {
		register.writePassword("Yeshu@18");
	   
	}
	@Then("I should see create account unsucessfuly")
	public void i_should_see_create_account_unsucessfuly() {
	   register.getTextEmailField();
	   Assert.assertEquals(message, register.getTextEmailField());
	}


}
