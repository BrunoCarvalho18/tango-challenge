package com.tango.challenge.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.tango.challenge.core.BasePage;
import com.tango.challenge.core.Driver;

public class HomePage extends BasePage  {
	
	
	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}	
	
	@FindBy(xpath = "//button[contains(@aria-label, 'Create account') ]")
	WebElement buttonCreateAccount;
	
	@FindBy(xpath = "//button[contains(@aria-label, 'Sign in') ]")
	WebElement buttonSignIn;
	
	public WebElement getButtonCreateAccount() {
		return buttonCreateAccount;
	}

	public void setButtonCreateAccount(WebElement buttonCreateAccount) {
		this.buttonCreateAccount = buttonCreateAccount;
	}

	public WebElement getButtonSignIn() {
		return buttonSignIn;
	}

	public void setButtonSignIn(WebElement buttonSignIn) {
		this.buttonSignIn = buttonSignIn;
	}
	

}
