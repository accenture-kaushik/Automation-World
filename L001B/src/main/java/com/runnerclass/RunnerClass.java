package com.runnerclass;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;
import com.manager.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		//features = where the feature files are stored
		//glue = where the step definition files are stored
		//monochrome = readable console output
		//dryRun = will do a dry run, check if all steps are written
		//format = for output formatting
		//strict = during runtime if we have all step definition. 
		//Tag is in conjunction with .feature file where we mention the tags. This is to execute specific group of Scenarios, similar to groups in TestNG 
		//{"@Something1", "@Something2"} = Something AND Something tag scenarios 
		//{"@Something1, @Something2"} = Something OR Something tag scenarios
		//{"~@Something3"} = Ignore scenarios with such tags
		
		
		features="/Users/kaushikmajumder/git/Automation-World/L001B/src/main/java/com/feature/files/Simple.feature"
		,glue= {"com.stepdefinition.select"}
		,monochrome = true
		,dryRun=false
//		,strict=true
//		,tags= {"@Basic", "@Extensive"}
		,format= {"pretty", "html:test-output", "json:json_output/cucumber.json", "junit:juint_xml/cucumber.xml"}
		,plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}
		)


public class RunnerClass {

	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getExtentReportConfigPath()));
		Reporter.setSystemInfo("User Name: ", System.getProperty("user.name"));
		Reporter.setSystemInfo("Machine", 	"Mac Pro");
	}
	
}
