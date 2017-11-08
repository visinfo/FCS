package com.fcs;

import com.fcs.common.LoggerFormat;

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
    	FileReader reader = new FileReader();
    	reader.setParser(new CSVParser());
    	reader.readFile("");
    	
    }
}
