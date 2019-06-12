package com.stepdefinition.select;

import com.application.utils.TestNG_Cucumber_app_utils;
import com.application.utils.TestNG_Test_Class;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TestNG_Cucumber {
	
	@Given("^I am on logon page$")
	public void i_am_on_logon_page() throws Throwable {
	    
//	    TestNG_Cucumber_app_utils.launchWebsite();
	    TestNG_Test_Class.launchWebSite_TestNG();
	}

	@Given("^I have entered ID and Password$")
	public void i_have_entered_ID_and_Password() throws Throwable {
//		TestNG_Cucumber_app_utils.enterCredentials();
		TestNG_Test_Class.enterCredentials_TestNG();
	}

	@Then("^I will logon to website$")
	public void i_will_logon_to_website() throws Throwable {
//		TestNG_Cucumber_app_utils.clickContinue();
		TestNG_Test_Class.enterCredentials_TestNG();
	}


}
