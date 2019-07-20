package com.stepdefinition.select;




import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.application.utils.ELS_TestStatus;
import com.application.utils.TestBase;

import com.cucumber.listener.Reporter;

import com.google.common.io.Files;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
//import cucumber.TestContext;

public class SimpleStepDef_Reporting extends TestBase{	
	
	WebDriver driver;
	private static ELS_TestStatus teststatus = new ELS_TestStatus();
	
	@Given("^I have testing report$")
	public void i_have_testing_report() throws Throwable {
	    
		log.info("Printing #1 Statement");
		Reporter.addStepLog(" Report Log: Printing #1 ");
	}

	
	@Then("^I have to print custom report$")
	public void i_have_to_print_custom_report() throws Throwable {
		
		log.info("Printing #2 Statement");
		Reporter.addStepLog(" Report Log: Printing #2 ");
	}
	
	@Given("^Launch Google$")
	public void launch_Google() throws Throwable {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		log.info("Launched Chrome and navigating to Google");
		Assert.assertTrue(true);
		Reporter.addStepLog(" Report Log: Launch Google!! Yay !!!  ");
		
	}
	
	@Then("^validate that google is launch correct$")
	public void validate_that_google_is_launch_correct() throws Throwable {
	    
		String PageTitle = driver.getTitle();
		Assert.assertEquals(PageTitle, "Google1");
		log.info("Driver : " + driver);
	
	}
	
//	@Before(order=0)
//	public static void assignAuthor() {
//		Reporter.assignAuthor("	Kaushik Majumder ");
//		Scenario scenario = null;
//		teststatus.setScenario(scenario.getName());
//		
//		
//	}
	
	@Before(order=1)
	public void startingTest() {
//		this.teststatus = new ELS_TestStatus();		
	}
	
	
	@After(order = 1)
	public void afterScenario(Scenario scenario) {
//		TestContext testContext;
		if (scenario.isFailed()) {
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			try {
				//This takes a screenshot from the driver at save it to the specified location
//				File sourcePath = ((TakesScreenshot) testContext.getWebDriverManager().getDriver()).getScreenshotAs(OutputType.FILE);
				File sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				//Building up the destination path for the screenshot to save
				//Also make sure to create a folder 'screenshots' with in the cucumber-report folder
				File destinationPath = new File(System.getProperty("user.dir") + "/target/cucumber-reports/screenshots/" + screenshotName + ".png");
				
				//Copy taken screenshot from source location to destination location
				Files.copy(sourcePath, destinationPath);   

				//This attach the specified screenshot to the test
				Reporter.addScreenCaptureFromPath(destinationPath.toString());
			} catch (IOException e) {
			} 
		}
	}
	

}