package com.test;

public class Calculator { 
	
	CalculatorService service; 
	
	public int add(int a, int b)
	{
		return a+b;
	}
	
	public int subtract(int a , int b)
	{
		return a - b;
	}
	
	public int multiply(int a , int  b)
	{
		return a * b;
	}
	
	public float divide(int a , int  b)
	{
		return a / b;
	}
	
	public int arraySum(int number[])
	{
		int sum = 0;
		for(int val : number)
			sum += val;
		return sum;
	} 
		
	Calculator(){};
	//this is the example method to demonstrate MOCKITO.
	
	public Calculator(CalculatorService service)
	{
		this.service = service;
	}
	
	public int perform(int i , int j)
	{
		return service.add(i, j) * i;
	}

}
