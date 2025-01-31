package com.Junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;




public class CalculatorTestt {
    
    private CalCulator calc;

    @Before
    public void setUp() { 
        calc = new CalCulator();
    }

    @Test
    public void testAddition() { 
        assertEquals(9, calc.add(4, 5)); 
    }

    @Test
    public void testSubtraction() { 
        assertEquals(2, calc.sub(5, 3)); 
    }

    
    @Test(expected = ArithmeticException.class)
    public void testDivision() { 
        calc.divide(10, 0); 
    }

    
   
    
    @After 
    public void tearDown() { 
        calc = null;
    }
}
