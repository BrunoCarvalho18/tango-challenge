package com.tango.challenge.functionalities;

import org.openqa.selenium.By;

import com.tango.challenge.pages.OnboardingPage;

public class OnboardingFuncionalities {
	
	OnboardingPage onboarding = new OnboardingPage();
	
	
	public OnboardingFuncionalities() {
		onboarding = new OnboardingPage();
	}
	
	public String verifyGetFieldTextOnboarding() {
		return onboarding.getTextPageOnboarding().getText();
	}
	
	public void waitforElementPresenteOnboarding() {
		onboarding.waitForElementPresent(By.cssSelector("#root > main > div > div.DownloadAppHeader_downloadAppContainer__2ddwF > div > p"));
	}
	

}
