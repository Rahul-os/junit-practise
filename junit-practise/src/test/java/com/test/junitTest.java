package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.lang.annotation.Repeatable;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class junitTest { 
	
	Calculator test;
	int sum =10;
	
	@BeforeEach
	void init()
	{
		test = new Calculator();
	}
	
	@Test
	@DisplayName("Addition test")
	void testAddition()
	{
		System.out.println(sum+2);
		assertEquals(10, test.add(7, 3),"the method should return correct sum!!");
	}
	
	@Test
	void testSubtraction()
	{
		System.out.println(sum+3);
		assertEquals(4, test.subtract(10, 6),"should return correct sub result!!!");
	}
	
	public boolean oddcheck(int num)
	{
		return (num % 2 != 0);
		
	}
	
	@Test
	@DisplayName("Testing whether number is odd")
	void testOdd(TestInfo testInfo)
	{
		System.out.println(testInfo.getDisplayName());
		assertTrue(oddcheck(5)); 
		
	
	}
	
	@Test
	@DisplayName("Testing the method with array as input")
	//@RepeatedTest(3)
	void testArraySumMethod()
	{
		//int numbers[] = {1,2,9};
		//assertEquals(12, test.arraySum(numbers));
		assertEquals(12,test.arraySum(new int[] {1,2,9}));
	}

}
