package com.application.utils;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Test_Class {
	
	@BeforeTest
	public static void setUP_TestNG() {
		
		System.out.println("Set Up for Tests");
	}
	
	@BeforeMethod
	public static void printBeforeEveryMethod() {
		System.out.println("Print before Every method");
	}
	
	
	@Test(priority = 1)
	public static void launchWebSite_TestNG() {
		
		System.out.println("Launch Website for TestNG");
	}
	
	@Test(priority = 2)
	public static void enterCredentials_TestNG() {
		
		System.out.println("Enter Credentials TestNg");
	}
	
	@Test(priority = 3)
	public static void clickContinue_TestNG() {
		
		System.out.println("Click Continue and verify Logon TestNG");
	}

}
