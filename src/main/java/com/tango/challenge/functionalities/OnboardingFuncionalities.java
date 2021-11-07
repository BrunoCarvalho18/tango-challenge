package com.tango.challenge.functionalities;

import org.openqa.selenium.By;

import com.tango.challenge.pages.OnboardingPage;

public class OnboardingFuncionalities {
	
	OnboardingPage onboarding = new OnboardingPage();
	
	
	public OnboardingFuncionalities() {
		onboarding = new OnboardingPage();
	}
	
	public String verifyGetFieldCssSelector() {
		return onboarding.getTextPageOnboarding().getText();
	}
	
	public void waitforElementPresenteOnboarding() {
		onboarding.esperarPorElementoPresente(By.xpath("//*[contains(text(),'(If so, your membership is free!)')]"));
	}
	

}
