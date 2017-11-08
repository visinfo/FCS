package com.fcs;

import com.fcs.common.LoggerFormat;
import com.fcs.controller.FeeCalculator;

/**
 * Hello world!
 *
 */
public class App 
{
	
	private static final String className =  App.class.getName();

    public static void main( String[] args )
    {
    	LoggerFormat.printInfo("className {}  Details {}", className, "Executing");
    	execute();
    }
    public static void execute(){
    	try {
    		FeeCalculator  cal = new FeeCalculator();
        	cal.calculateFee("resource/sampleData.txt");
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    	
    }
}
