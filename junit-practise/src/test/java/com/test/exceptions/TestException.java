package com.test.exceptions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.test.ExceptionMethods; 

class TestException {
	
	ExceptionMethods exception =new ExceptionMethods();
	
	@Test
	void testDivisionOfTwoNumbers()
	{
		//fail("not dim");
		assertThrows(ArithmeticException.class , () -> exception.divisionOfTwoNumbers(12, 0),"the test failed!!");
	}
	
	@Test
	void passingANullString()
	{
		assertThrows(NullPointerException.class, () -> exception.lengthOfString(null),"the test failed!!");
	}
	
	@Test
	void testDivision()
	{
		assertAll(
					() -> exception.divisionOfTwoNumbers(10, -1) ,
					
					() -> assertThrows(ArithmeticException.class, () ->exception.divisionOfTwoNumbers(12, 0)) 
					
				 );
	}

}

