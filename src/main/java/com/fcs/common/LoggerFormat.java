package com.fcs.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LoggerFormat {
	
	
	
	private final static Logger logger = LoggerFactory
			.getLogger(LoggerFormat.class.getName());
	
	public static void printInfo(String pattern,Object... a){
		logger.info(pattern,a);
	}
	
	public static void printDebug(String pattern,Object... a){
		logger.debug(pattern,a);
	}
	
	public static void printError(String pattern,Object... a){
		
		logger.error(pattern,a);
	}
	
	public static void printWarning(String pattern,Object... a){
		logger.warn(pattern,a);
	}
	
	public static void main(String[] args) {
		printInfo("sdfds", 123,"esfew");
	}
}
