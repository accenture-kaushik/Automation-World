package com.JsonLearning;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadJson {
	
	/**
	 * CUEQATeam Json to be read as a java Object
	 * 
	 */
	
	ObjectMapper mapper = new ObjectMapper();
	File json; 
	
	@Test
	public void toJava() {
		
		json = new File(System.getProperty("user.dir") + "//src//main//java//com//JsonLearning//CUEQATeam.json");
		System.out.println("File Path : " + json.getPath());
		
		try {
			QATeam team = mapper.readValue(json, QATeam.class);
			System.out.println(team);
			
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
