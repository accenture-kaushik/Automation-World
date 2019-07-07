package com.application.utils;

import org.apache.log4j.Logger;


public class Log {
	
    Logger logs = Logger.getLogger(this.getClass());
	
	public void info(String message) {
		
		logs.info("Log Message: " + message);
		
	}
	

}
