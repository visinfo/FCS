package com.fcs;

public class FileReader {

	private FileParser  fileParser;
    
	public void setParser(FileParser parser) {
		this.fileParser = parser;
	}
	public void readFile(String filePath){
		fileParser.parser(filePath);
	
	}
	
	
	
	
}
