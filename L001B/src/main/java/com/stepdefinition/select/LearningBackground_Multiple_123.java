package com.stepdefinition.select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LearningBackground_Multiple_123 {
 
	@Given("^Kaushik has bought a AC Multiple Example$")
	public void kaushik_has_bought_a_AC_Multiple_Example() throws Throwable {
		System.out.println("Scenario Given Multipe Example");
	    
	}

	@When("^Kaushik wants to fit the AC Multiple Example$")
	public void kaushik_wants_to_fit_the_AC_Multiple_Example() throws Throwable {
		System.out.println("Scenario When Multiple Example");
	    
	}

	@Then("^Kaushik has to get written approval from PMS office Multiple Example$")
	public void kaushik_has_to_get_written_approval_from_PMS_office_Multiple_Example() throws Throwable {
		System.out.println("Scenario Then Multiple Example");
	    
	}


}
