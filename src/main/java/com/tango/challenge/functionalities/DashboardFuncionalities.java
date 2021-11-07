package com.tango.challenge.functionalities;

import org.openqa.selenium.By;

import com.tango.challenge.pages.DashboardPage;

public class DashboardFuncionalities {
	
	DashboardPage dashboard = new DashboardPage();
	
	public DashboardFuncionalities() {
		dashboard = new DashboardPage();
	}
	
	public void waitforElementDashboard() {
		dashboard.waitForElementPresent(By.xpath("//*[contains(text(),'We've got your back, Bruno')]"));
	}
	
	public String verifyGetFieldDashboard() {
		return dashboard.getTextDashboard().getText();
	}
	


}
