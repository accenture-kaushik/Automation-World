package com.stepdefinition.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginWithExamplesToFreeCRM {

	
WebDriver driver;

@Given("^User is on Login Page$")
public void user_is_on_login_page()   {

	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");	
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.navigate().to("https://www.freecrm.com/index.html");
    
}
	
@When("^Tile of Login Page contains free CRM$")
public void tile_of_login_page() {
String S1 = driver.getTitle();
Assert.assertEquals("#1 Free CRM software in the cloud for sales and service", S1);
	
	
}
//regular expression used in BDD with examples keyword in feature file
@Then("^User enters username \"(.*)\" and password \"(.*)\"$")
public void user_enters_username_password(String U1, String P1) {
	
driver.findElement(By.xpath("//input[@name='username']")).sendKeys(U1);
driver.findElement(By.xpath("//input[@name='password']")).sendKeys(P1);
System.out.println("User Name and Password Entered");
System.out.println(U1);
System.out.println(P1);
}

@Then("^User clicks on Login$")
public void user_clicks_on_login_button() {
WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].click();", loginBtn);
}

@Then("^User moves to Contacts and New Contact$")
public void user_moves_to_Contacts_and_New_Contact() {
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("^User enter contact details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
public void user_enter_contact_details_and_and(String arg1, String arg2, String arg3) {
    // Write code here that turns the phrase above into concrete actions
    ;
}

@Then("^Close the Browser$")
public void close_the_Browser() throws InterruptedException {
	Thread.sleep(1000);
	driver.quit();
}




}
