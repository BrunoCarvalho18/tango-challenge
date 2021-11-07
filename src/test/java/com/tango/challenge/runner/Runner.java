package com.tango.challenge.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import static com.tango.challenge.core.Driver.getDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(glue = { "com.tango.challenge.steps" }, features = {
		"src/main/resources" },tags =  "@register-valid" )
public class Runner {
	
	@AfterClass
	public static void encerraDriver() {
		//getDriver().close();
	}

}
