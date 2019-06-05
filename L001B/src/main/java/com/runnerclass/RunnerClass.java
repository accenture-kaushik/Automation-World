package com.runnerclass;

import org.junit.runner.RunWith;
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
		

		features="/Users/kaushikmajumder/git/Automation-World/L001B/src/main/java/com/feature/files/LearningBackground_Multiple.feature"
		,glue= {"com.stepdefinition.select"}
		,monochrome = true
		,dryRun=false
//		,strict=true
//		,tags= {"@Basic"}
		,format= {"pretty", "html:test-output", "json:json_output/cucumber.json", "junit:juint_xml/cucumber.xml"}
		)


public class RunnerClass {

}
