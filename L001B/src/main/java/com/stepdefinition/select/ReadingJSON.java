package com.stepdefinition.select;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.testng.annotations.Test;

public class ReadingJSON {
	
	@Test
	public void readJSON() {
		
		
	JSONParser parser = new JSONParser();
	
	try {
		File file = new File("/Users/kaushikmajumder/git/Automation-World/L001B/src/main/java/TestData.json");
		FileReader reader = new FileReader(file.getAbsolutePath());
		Object obj = parser.parse(reader);
		JSONObject jsonObject = (JSONObject) obj;
		jsonObject.get("First Name");
		
	} 
	catch (FileNotFoundException e) {e.printStackTrace();}
	catch (Exception e) {e.printStackTrace();}
	
		
		
		
	}

}
