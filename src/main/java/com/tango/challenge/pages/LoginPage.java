package com.tango.challenge.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.tango.challenge.core.BasePage;
import com.tango.challenge.core.Driver;

public class LoginPage  extends BasePage{
	
	
	public LoginPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(id = "email")
	WebElement fieldFEmail;
	
	@FindBy(id = "password")
	WebElement fieldPassword;
	
	@FindBy(css = "#root > main > section > div > div:nth-child(2) > form > button > span")
	WebElement buttonRegister;

	public WebElement getFieldFEmail() {
		return fieldFEmail;
	}

	public WebElement getFieldPassword() {
		return fieldPassword;
	}

	public WebElement getButtonSignIn() {
		return buttonRegister;
	}

}
