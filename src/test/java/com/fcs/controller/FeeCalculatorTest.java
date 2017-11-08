package com.fcs.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.modules.junit4.PowerMockRunner;

import com.fcs.CSVParser;
import com.fcs.FileReader;
import com.fcs.common.LoggerFormat;
import com.fcs.model.Transaction;

@RunWith(PowerMockRunner.class)
public class FeeCalculatorTest {

	@Test
    public void execute_checkIfReturnSuccess(){
		FeeCalculator  cal = new FeeCalculator();
    	Assert.assertNotNull(cal.calculateFee(""));
    }
	
}
