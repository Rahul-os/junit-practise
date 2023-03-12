 package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MockitoTest {
	
	Calculator cal ;
//	CalculatorService service = new CalculatorService() {    //service obj here is a dummy obj ,it is not doing anything.
//		
//		@Override
//		public int add(int i, int j) {
//			// TODO Auto-generated method stub
//			return 0;
//		}
		
		
	CalculatorService servic = Mockito.mock(CalculatorService.class);		//the same dummy obj is created using mockito .the backend is  same as the above code.
	
	//so inline 23 we created mock obj for service.It does the task in backend from line 16 to 20.It returns 0 . 
	//so if we run this test by commenting "when(service.add(2,3)).thenReturn(5);" line in testPerfom() method we get this error -> expected:<10> but was:<0> .
	
	@BeforeEach
	void init() {
		cal= new Calculator(servic);
	}
	
	@Test
	@DisplayName("TestPerformMethod")
	void testPerform()
	{
		when(servic.add(2,3)).thenReturn(5);
		assertEquals(10, cal.perform(2, 3));
		//verify(servic).add(2,3);
	}
	
}
