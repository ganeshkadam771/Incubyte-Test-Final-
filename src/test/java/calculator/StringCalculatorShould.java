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
    
    @Test
    public void testTwoNumbers() {
    	assertEquals(3, StringCalculator.add("1,2"));
    	
    }
    
   @Test
   public void testThreeNumbers()
   {
	   assertEquals(6, StringCalculator.add("1,2,3"));
   }
   
   @Test
   public void testNewLine() {
	   assertEquals(6,StringCalculator.add("1\n2,3"));
   }
   
   @Test
   public void testOverThousand() {
	   assertEquals(2,StringCalculator.add("1000,2"));
   }
   
   @Test
   public void testOtherDelimiter()
   {
	   assertEquals(3,StringCalculator.add("//;\n;2"));
   }
   
}
