package com.JsonLearning;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonParser;

public class NodeTraverseInJSON {
	
	ObjectMapper mapper = new ObjectMapper();
	File json; 
	
	@Test
	public void toJava() {
		
		json = new File(System.getProperty("user.dir") + "//src//main//java//com//JsonLearning//Person.json");
		System.out.println("File Path : " + json.getPath());
		try {
			JsonNode rootNode = mapper.readTree(json);
			System.out.println(rootNode.asText());
			JsonNode nameNode = rootNode.path("Employee").path("name");
//			JsonNode path = rootNode.findPath("name");
//			System.out.println(path.asText());
			System.out.println(" Node " + nameNode.asText());
			
			
			
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

}
	
}
