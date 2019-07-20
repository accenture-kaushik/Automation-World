package com.JsonLearning;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadPerson {
	
	ObjectMapper mapper = new ObjectMapper();
	File json; 
	
	@Test
	public void toJava() {
		
		json = new File(System.getProperty("user.dir") + "//src//main//java//com//JsonLearning//FamilyPerson.json");
//		System.out.println("File Path : " + json.getPath());
		
		try {
			
			Persons[] persons = mapper.readValue(json, Persons[].class);
			List<Persons> lPerson = Arrays.asList(persons);
			System.out.println(lPerson.size());
			Iterator<Persons> it = lPerson.iterator();
			
			System.out.println("Number of Objects in array " + persons.length);
			int i = 1;
			while (it.hasNext())
			{	
				String name= it.next().getPerson().getName();
				String city = it.next().getPerson().getAddress().getCity();
				System.out.println("Name : " + name + " City : " + city);
				System.out.println(i);
				i++;
//				String name = lPerson.get(i).getPerson().getName();
				
			}
			
//			System.out.println("Name " + persons.getName());
//			System.out.println("Address City " + person.getAddress().getCity());
			
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

}
}
