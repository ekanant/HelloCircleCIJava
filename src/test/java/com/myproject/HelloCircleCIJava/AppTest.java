package com.myproject.HelloCircleCIJava;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigourous Test :-)
     */
	@Test
    public void testApp()
    {
        assertEquals(true, true);
    }
    
	/**
     * Impossible test case  2 is not equal 1
     */
    @Test
    public void myTestCase()
    {
    	assertEquals(true, false);
    }
}
