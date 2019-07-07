package com.stepdefinition.select;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;




import com.application.utils.Log;
import com.application.utils.TestBase;
import com.cucumber.listener.Reporter;
import com.gargoylesoftware.htmlunit.javascript.host.file.FileReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SimpleStepDef_Reporting extends TestBase{	
	
//	Log log = new Log();
	WebDriver driver;
	
	@Given("^I have testing report$")
	public void i_have_testing_report() throws Throwable {
	    
		log.info("Printing #1 Statement");
	}

	
	@Then("^I have to print custom report$")
	public void i_have_to_print_custom_report() throws Throwable {
		
		log.info("Printing #2 Statement");
	}
	
	@Given("^Launch Google$")
	public void launch_Google() throws Throwable {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		log.info("Launched Chrome and navigating to Google");
		Assert.assertTrue(true);
		
	}

	@Then("^validate that google is launch correct$")
	public void validate_that_google_is_launch_correct() throws Throwable {
	    
		String PageTitle = driver.getTitle();
		Assert.assertEquals(PageTitle, "Google");
	
	}
	
	

}