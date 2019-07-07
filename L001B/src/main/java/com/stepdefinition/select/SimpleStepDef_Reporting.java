package com.stepdefinition.select;

import org.apache.log4j.Logger;

//import org.testng.log4testng.Logger;

import com.application.utils.Log;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SimpleStepDef_Reporting {	
	
	Log log = new Log();
	
	
	@Given("^I have testing report$")
	public void i_have_testing_report() throws Throwable {
	    log.info("Printing #1");
	}

	
	@Then("^I have to print custom report$")
	public void i_have_to_print_custom_report() throws Throwable {
		log.info("Printing #2");
	}
	
	
}
