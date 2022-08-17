package com.api.resources;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class ApiLogger {

	private static boolean root=false;
	
	public static Logger getLogger(Class cls){
		if(root){
			return Logger.getLogger(cls);
		}
		PropertyConfigurator.configure("src\\main\\java\\com\\api\\resources\\log4j.properties");
		root = true;
		return Logger.getLogger(cls);
	}
	
	public static void main(String[] args) {
		Logger log = ApiLogger.getLogger(ApiLogger.class);
		log.info("I am test");
		log.info("I am test");
		log.info("I am test");
				
	}
}
