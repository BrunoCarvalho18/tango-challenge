package com.tango.challenge.functionalities;

import com.tango.challenge.pages.LoginPage;

public class LoginFuncionalities {

	LoginPage login = new LoginPage();

	public LoginFuncionalities() {
		login = new LoginPage();
	}

	public void writeEmail(String firstName) {
		login.getFieldFEmail().sendKeys(firstName);
	}

	public void writePassword(String lastName) {
		login.getFieldPassword().sendKeys(lastName);
	}

	public void clickButtonSignIn() {
		login.getButtonSignIn().click();
	}

}
