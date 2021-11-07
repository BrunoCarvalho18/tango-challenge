package com.tango.challenge.steps;

import static com.tango.challenge.core.Driver.getDriver;
import com.tango.challenge.functionalities.LoginFuncionalities;
import com.tango.challenge.functionalities.OnboardingFuncionalities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteps {
	
	
	String url = "https://www.mavenclinic.com/app";	
	LoginFuncionalities login = new LoginFuncionalities();
	OnboardingFuncionalities onboarding = new OnboardingFuncionalities();
	
	@Given("I am on the login page")
	public void i_am_on_the_login_page() {
		getDriver().get(url + "/login");
	    	
	}

	@When("I fill {string} with {string} correctly")
	public void i_fill_with_correctly(String email, String password) {
	   login.writeEmail(email);
	   login.writePassword("S@mdeCueca5");
	   login.clickButtonSignIn();
	}

	@Then("I should see login sucessful")
	public void i_should_see_login_sucessful() {
		onboarding.waitforElementPresenteOnboarding();
		Assert.assertEquals("Get care from anywhere. Download the app!", onboarding.verifyGetFieldTextOnboarding());
			    
	}

}
