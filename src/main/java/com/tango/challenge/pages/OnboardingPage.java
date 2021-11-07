package com.tango.challenge.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.tango.challenge.core.BasePage;
import com.tango.challenge.core.Driver;

public class OnboardingPage extends BasePage {
	
	public OnboardingPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}	
	

	@FindBy(css = "#root > main > div > div.DownloadAppHeader_downloadAppContainer__2ddwF > div > p")
	WebElement textPageOnboarding;
	
	public WebElement getTextPageOnboarding() {
		return textPageOnboarding;
	}


	


}
