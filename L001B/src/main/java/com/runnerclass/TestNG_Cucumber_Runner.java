package com.runnerclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;



	@CucumberOptions(
			features="/Users/kaushikmajumder/git/Automation-World/L001B/src/main/java/com/feature/files/TestNG_Cucumber.feature"
			,glue={"com.stepdefinition.select"}
			,monochrome = true
			,dryRun=false
//			,strict=true
//			,tags= {"@Basic", "@Extensive"}
			,format= {"pretty", "html:test-output", "json:json_output/cucumber.json", "junit:juint_xml/cucumber.xml"}
			)
	
	public class TestNG_Cucumber_Runner{

		private TestNGCucumberRunner testRunner;

		@BeforeClass
		public void setUP()
		{			
			testRunner = new TestNGCucumberRunner(this.getClass());
		}
		
		
		@Test(description="Run Login With TestNG Cucumber",dataProvider="features")
		public void login(CucumberFeatureWrapper cFeature)
		{
			testRunner.runCucumber(cFeature.getCucumberFeature());
		}
		
		
		@DataProvider(name="features")
		public Object[][] getFeatures()
		{
			return testRunner.provideFeatures();
		}
		
		
		@AfterClass
		public void tearDown()
		{
			testRunner.finish();
		}


	}
