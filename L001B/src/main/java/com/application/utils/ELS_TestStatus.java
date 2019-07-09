package com.application.utils;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ELS_TestStatus {
	
	@JsonProperty("testClass")
		private String testClass;
	
	@JsonProperty("scenario")
		private String scenario;
	
	@JsonProperty("status")
		private String status;
	
	@JsonProperty("executionTimeStamp")
		private String executionTimeStamp;
	
	public void setTestClass(String testClass) {
		this.testClass=testClass;}
			
	
	public void setScenario(String scenario) {
		this.scenario=scenario;}
		

	public void setStatus(String status) {
		this.status=status;}
			

	public void setExecutionTimeStamp(String executionTimeStamp) {
		this.executionTimeStamp=executionTimeStamp;}
	
		
}
