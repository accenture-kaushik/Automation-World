package com.stepdefinition.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class ApplicationTestUsingTags {

	
WebDriver driver;

//@Before is used before every scenario and before every scenario example in case of scenario outline
//Order of Global hooks-In this example both @Before will be executed, the one with order - 0 will be executed first
//For Global hooks, there is no change required in feature file. 
//For Local hooks(tagged hooks), scenarios has to be tagged like tags. 
//In this case, we will mention that hook name in @Before or @After and that will be executed only for that scenario 

@Before(order = 0) // global hook before every scenario
public void setup() {
	System.out.println("Open Browser");
}

@Before(order = 1) // global hook before every scenario
public void setupExtended() {
	System.out.println("Open Browser");
}

//@After is used after every scenario and before every scenario example in case of scenario outline
@After //Global hook after every scenario
public void tearDown() {
	
	System.out.println("Close Browser");
}

@Before("@FirstHook")
public void beforeHomePage() {
	System.out.println("This is before home page only");
	
}

@Before("@SecondHook")
public void beforecalenderPage() {
	System.out.println("This is before home page only");
	
}

@Given("^User is on Login Page of Free CRM$")
public void user_is_on_Login_Page_of_Free_CRM()  {

}

@Given("^User is on Home page of Free CRM$")
public void user_is_on_Home_page_of_Free_CRM() {

}

@Given("^User is on calender page of Free CRM$")
public void user_is_on_calender_page_of_Free_CRM()  {

}

@Given("^User is on companies page of Free CRM$")
public void user_is_on_companies_page_of_Free_CRM()  {

}

@Given("^User is on contact page of Free CRM$")
public void user_is_on_contact_page_of_Free_CRM() {

}

@Given("^User is on deals page of Free CRM$")
public void user_is_on_deals_page_of_Free_CRM()  {

}

@Given("^User is on tasks page of Free CRM$")
public void user_is_on_tasks_page_of_Free_CRM()  {
 }

@Given("^User is on call page of Free CRM$")
public void user_is_on_call_page_of_Free_CRM() {

}

@Given("^User is on email page of Free CRM$")
public void user_is_on_email_page_of_Free_CRM()  {

}
}
