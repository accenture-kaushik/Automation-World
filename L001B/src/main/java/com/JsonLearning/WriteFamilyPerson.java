package com.JsonLearning;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

public class WriteFamilyPerson {
	
	ObjectMapper mapper = new ObjectMapper();
	File json; 
	
	@Test
	public void toJava() {
		
		json = new File(System.getProperty("user.dir") + "//src//main//java//com//JsonLearning//FamilyPerson.json");
		System.out.println("File Path : " + json.getPath());
		
		Address address = new Address();
		address.setCity("Faridabad");
		address.setCountry("India");
		
		Person person = new Person();
		person.setAddress(address);
		person.setId(1);
		person.setName("Kaushik");
		
		try {
			ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
			writer.writeValue(json, person);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
