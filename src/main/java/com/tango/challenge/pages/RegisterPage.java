package com.tango.challenge.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.tango.challenge.core.BasePage;
import com.tango.challenge.core.Driver;

public class RegisterPage extends BasePage {
	
	public RegisterPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}	

	@FindBy(id = "firstName")
	WebElement fieldFirstName;
	
	@FindBy(id = "lastName")
	WebElement fieldLastName;
	
	@FindBy(id = "email")
	WebElement fieldEmail;
	
	@FindBy(name = "password")
	WebElement fieldPassword;
	
	@FindBy(xpath = "//*[@id=\"tos\"]")
	WebElement checkBoxTos;

	@FindBy(css = "#root > div > main > form > button")
	WebElement buttonRegister;
	
	
	public WebElement getFieldFirstName() {
		return fieldFirstName;
	}

	public WebElement getFieldLastName() {
		return fieldLastName;
	}

	public WebElement getFieldEmail() {
		return fieldEmail;
	}

	public WebElement getFieldPassword() {
		return fieldPassword;
	}
	
	public WebElement getCheckBoxTos() {
		return checkBoxTos;
	}
	

	public WebElement getButtonRegister() {
		return buttonRegister;
	}


}
