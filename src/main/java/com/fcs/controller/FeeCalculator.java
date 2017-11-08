package com.fcs.controller;

import com.fcs.CSVParser;
import com.fcs.FileReader;
import com.fcs.common.LoggerFormat;
import com.fcs.model.Transaction;

public class FeeCalculator {

	
	
	public Transaction calculateFee(String filePath) {
		FileReader reader = new FileReader();
		CSVParser  parser =new  CSVParser();
    	reader.setParser(parser);
    	reader.readFile(filePath);
    	for(Transaction txn:parser.getTransactions()){
    		LoggerFormat.printInfo("{}", txn.getReferenceId());
    	}
		return null;
	}
}
