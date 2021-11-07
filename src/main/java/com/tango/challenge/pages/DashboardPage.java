package com.tango.challenge.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tango.challenge.core.BasePage;
import com.tango.challenge.core.Driver;

public class DashboardPage extends BasePage {
	
	
	public DashboardPage() {
		PageFactory.initElements(Driver.getDriver(), this);
		
	}
	
	@FindBy(xpath = "//*[contains(text(),'We've got your back, Bruno')]")
	WebElement textDashboard;

	public WebElement getTextDashboard() {
		return textDashboard;
	}

}
