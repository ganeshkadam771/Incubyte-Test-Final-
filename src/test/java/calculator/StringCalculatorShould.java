package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class StringCalculatorShould {

	public static void main(String args[]) {
		org.junit.runner.JUnitCore.main("is.ru.stringcalculator.StringCalculatorShould");
	}
	
	// Changes to make code simple and readable
	// Instead of creating multiple objects we use following way
    @Test
    public void testEmptyString() {
		assertEquals(0, StringCalculator.add(""));
	}
    
    @Test
    public void testOneNumber() {
    	assertEquals(1, StringCalculator.add("1"));
    }
    
}
