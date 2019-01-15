package com.stepdefinition.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginWithOutExamplesToFreeCRM2 {

	
WebDriver driver;

@Given("^User is on Login Page_without Examples Keywprd$")
public void user_is_on_Login_Page_without_Examples_Keywprd() {
    // Write code here that turns the phrase above into concrete actions
    
}

@When("^Tile of Login Page contains free CRM_without Examples Keywprd$")
public void tile_of_Login_Page_contains_free_CRM_without_Examples_Keywprd() {
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("^User enters username_without Examples Keywprd uname and password pword$")
public void user_enters_username_without_Examples_Keywprd_uname_and_password_pword(DataTable credentials) {
    List<List<String>> cr  = credentials.raw(); 
    String S = cr.get(0).get(0);
    System.out.println(S);
	// Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
    // E,K,V must be a scalar (String, Integer, Date, enum etc)
    
}

@Then("^User clicks on Login_without Examples Keywprd$")
public void user_clicks_on_Login_without_Examples_Keywprd() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("^User moves to Contacts and New Contact_without Examples Keywprd$")
public void user_moves_to_Contacts_and_New_Contact_without_Examples_Keywprd() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("^User enter contact details_without Examples Keywprd firstname and lastname and position$")
public void user_enter_contact_details_without_Examples_Keywprd_firstname_and_lastname_and_position(DataTable arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
    // E,K,V must be a scalar (String, Integer, Date, enum etc)
    
}

@Then("^Close the Browser_without Examples Keywprd$")
public void close_the_Browser_without_Examples_Keywprd() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
}



}
