package com.tango.challenge.steps;

import static com.tango.challenge.core.Driver.getDriver;
import org.junit.Assert;
import com.github.javafaker.Faker;
import com.tango.challenge.functionalities.OnboardingFuncionalities;
import com.tango.challenge.functionalities.RegisterAccountFunctionalities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps {

	String url = "https://www.mavenclinic.com/app";
	String message = "(If so, your membership is free!)";
	RegisterAccountFunctionalities register = new RegisterAccountFunctionalities();
	OnboardingFuncionalities onboarding = new OnboardingFuncionalities();
	Faker faker = new Faker();

	@Given("I am on the create account page")
	public void i_am_on_the_create_account_page() {
		getDriver().get(url);
		register.clickButton();
	}

	@When("I fill {string} with {string} with {string} correctly")
	public void i_fill_with_with_correctly(String firstName, String lastName, String email) {
		register.waitforElementPresentFirstName();
		register.writePassword(faker.internet().password());
		register.writeFirstName(faker.name().firstName());
		register.writeLastName(faker.name().lastName());
		register.writeEmail(faker.internet().emailAddress());

	}

	@When("I fill {string} correctly")
	public void i_fill_correctly(String password) {
		register.clickCheckBoxIcon();
		register.clickCheckBoxIcon();
		register.clickButtonRegister();

	}

	@Then("I should see create account sucessfuly")
	public void i_should_see_create_account_sucessfuly() {
		onboarding.waitforElementPresenteOnboarding();
		Assert.assertEquals(message, onboarding.verifyGetFieldTextOnboarding());
	}

}
