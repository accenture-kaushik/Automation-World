package com.application.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class ELS_ResultSender {
	
	private static final ObjectMapper OM = new ObjectMapper();
    private static final String CONTENT_TYPE = "Content-Type";
    private static final String CONTENT_TYPE_VALUE = "application/json";
    private static final String ELASTICSEARCH_URL = "http://localhost:9200/app/suite"; 

    
    public static void sendResult(ELS_TestStatus teststatus) {
    	
    	try {
			Unirest.post(ELASTICSEARCH_URL)
			.header(CONTENT_TYPE, CONTENT_TYPE_VALUE)
			.body(OM.writeValueAsString(teststatus)).asJson();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (UnirestException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		}
    	
    	
    }


