package com.stepdefinition.select;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TabOffForAjaxCalls {
	WebDriver driver;
	
	@Test
	public void tabOff() {
		
		System.out.println("Tab ing off");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");	
		  driver = new ChromeDriver();
		
		  driver.navigate().to("http://demo.guru99.com/test/newtours/register.php");
		  WebElement FirstName = driver.findElement(By.xpath(".//*[@name='firstName']"));
		  FirstName.sendKeys("Kaushik");
		  FirstName.sendKeys(Keys.TAB);
		  
		  WebElement LastName = driver.findElement(By.xpath(".//*[@name='lastName']"));
		  Boolean b = driver.switchTo().activeElement().equals(LastName);
		  
		  System.out.println("Yes/No Tab to Last Name" + b);
		  
	}

}
