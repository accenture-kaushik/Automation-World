package com.Utility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.parser.JSONParser;

import com.google.gson.JsonObject;

import net.sourceforge.htmlunit.corejs.javascript.json.JsonParser.ParseException;

public class JSONReader {
	
	
	public static void main(String[] args) {
	JSONParser parser = new JSONParser();
	
	try {
		
		Object obj = parser.parse(new FileReader("TestData.json"));
		JsonObject jsonobject = (JsonObject) obj;
		String FirstName = jsonobject.get("First Name").getAsString();
		
		
		
		
		
	}
	catch (FileNotFoundException e) {e.printStackTrace();}
	catch (IOException e1) {e1.printStackTrace();}
	catch (ParseException e2) {e2.printStackTrace();}
	catch (Exception e3) {e3.printStackTrace();}
	
	}

}
