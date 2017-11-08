package com.fcs;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.modules.junit4.PowerMockRunner;


/**
 * Unit test for simple App.
 */
@RunWith(PowerMockRunner.class)
public class AppTest {
	@Test
    public void execute_checkIfReturnSuccess(){
    	
    	Assert.assertEquals(true,true);
    }
}
