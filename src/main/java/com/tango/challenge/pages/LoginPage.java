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
	WebElement fieldFirstName;
	
	@FindBy(id = "password")
	WebElement fieldLastName;
	
	@FindBy(xpath = "//button[contains(text(),'Sign in')]")
	WebElement buttonRegister;

	public WebElement getFieldFirstName() {
		return fieldFirstName;
	}

	public WebElement getFieldLastName() {
		return fieldLastName;
	}

	public WebElement getButtonRegister() {
		return buttonRegister;
	}

}
