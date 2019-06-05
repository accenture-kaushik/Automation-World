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

//How Runner Works - Runner has the name of the feature file. Based on the Given-when-then
//Runner finds those methods in the package mentioned in glue. 
//Even if the step definition class name is different, it will find the exact match with method
//If there are 2 methods with same name, it will find the first hit and execute it. 
//Console shows details about the class.method that has been implemented 

public class LearningBackground_Z9 {
// *************** Global Hooks ********************************//
//No Change in feature file and runner class
@Before
public void setUp() {
	
	System.out.println("This is Setup Step from @Before Hook");
}

@After(order = 0) //This After will be implemented after first. order of imple - 3, 2, 1, 0
public void endTest() {
	System.out.println("This is End Step from @After Hook");
	
}
@After(order = 1) //This after will be implemented first
public void endApplication() {
	System.out.println("This is End Application from @After Hook");
	
} 
//*************** Global Hooks ********************************//



//*************** Local Hooks ********************************//
//Change required in the feature file to mention the hooks for each scenario

@Before("@First")
public void setUpForScenario_1() {
	
	System.out.println("This is Setup Step from @Before Hook for Scenario 1 only");
}

//*************** Local Hooks ********************************//


//Inline Data Table without header
//Every line will follow with the data and read from step definition for that method
@Given("^Person stays in Magarpatta$") 
public void person_stays_in_magarpatta(DataTable data) throws Throwable {
	List<List<String>> name_table = data.raw();
	String nameperson_1 = name_table.get(0).get(0);
	String nameperson_2 = name_table.get(1).get(0);
    System.out.println("Background Given Name 1 " + nameperson_1);
    System.out.println("Background Given Name 2 " + nameperson_2);
    
}

@When("^Approval wants to fix big elec$")
public void kaushik_wants_to_fit_big_electronics() throws Throwable {
    System.out.println("Background When");
    
}


@Given("^Kaushik has bought a AC$")
public void kaushik_has_bough_a_AC() throws Throwable {
    System.out.println("Scenario Given");
    
}

@When("^Kaushik wants to fit the AC$")
public void kaushik_wants_to_fit_the_AC() throws Throwable {
    System.out.println("Scenario When");
    
}

@Then("^Kaushik has to get written approval from PMS office$")
public void kaushik_has_to_get_written_approval_from_PMS_office() throws Throwable {
    System.out.println("Scenario Then");
    
}

@Given("^Resident wants to decorate home$")
public void wants_to_decorate_home() throws Throwable {
	System.out.println("Resident Decor");
    
    
}
//Examples Data Table with header
//Complete data for that whole scenario, like excel the header is the column name
@When("^\"([^\"]*)\" wants to use \"([^\"]*)\"$")
public void wants_to_use(String Resident, String Electronic) throws Throwable {
    System.out.println("Resident " + Resident);
    System.out.println("Electronic " + Electronic);
    
}

@Then("^get permission from PMS$")
public void get_permission_from_PMS() throws Throwable {
    System.out.println("Permission");
    
}



}
