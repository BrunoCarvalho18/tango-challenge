package com.tango.challenge.core;

import static com.tango.challenge.core.Driver.getDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	public void clicar(By by) {
		getDriver().findElement(by).click();
	}

	public void escrever(By by, String escreve) {
		getDriver().findElement(by).sendKeys(escreve);
	}

	public void selecionaCampo(By by,int index) {
		Select select = new Select (getDriver().findElement(by));
		select.selectByIndex(index);
	}
	
	public void esperarPorElementoPresente(By by) {
		WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(by));
		
	}

}
