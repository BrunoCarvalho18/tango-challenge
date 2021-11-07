package com.tango.challenge.core;

import static com.tango.challenge.core.Driver.getDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	public void click(By by) {
		getDriver().findElement(by).click();
	}

	public void write(By by, String escreve) {
		getDriver().findElement(by).sendKeys(escreve);
	}

	public void selectField(By by,int index) {
		Select select = new Select (getDriver().findElement(by));
		select.selectByIndex(index);
	}
	
	public void waitForElementPresent(By by) {
		WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(by));
		
	}

}
