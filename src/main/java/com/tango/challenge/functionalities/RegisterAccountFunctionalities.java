package com.tango.challenge.functionalities;

import org.openqa.selenium.By;

import com.tango.challenge.pages.HomePage;
import com.tango.challenge.pages.RegisterPage;

public class RegisterAccountFunctionalities {

	HomePage home = new HomePage();
	RegisterPage register = new RegisterPage();

	public RegisterAccountFunctionalities() {
		home = new HomePage();
	}

	public void clickButton() {
		home.getButtonCreateAccount().click();
	}
	
	public void waitforElementPresentFirstName() {
		home.waitForElementPresent(By.id("firstName"));
	}
	
	public void writeFirstName(String firstName) {
		register.getFieldFirstName().sendKeys(firstName);
	}
	
	public void writeLastName(String lastName) {
		register.getFieldLastName().sendKeys(lastName);
	}
	
	public void writeEmail(String email) {
		register.getFieldEmail().sendKeys(email);
		
	}
	
	public void writePassword(String password) {
		register.getFieldPassword().sendKeys(password);
	}
	
	public void clickPassword() {
		register.getFieldPassword().click();
	}
	
	
	public void clickCheckBoxIcon() {
		
		register.getCheckBoxTos().click();	
		
	}
	
	public void clickButtonRegister() {
		register.getButtonRegister().click();
		
	}
	
	public String getTextEmailField() {
		return register.getFieldEmailError().getText();
	}

}
