package com.ListTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;


import java.util.List;
//import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

class ListTest {

	@Test
	void mockListSizeMethod()
	{
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(2);
		assertEquals(2, listMock.size());
	}
	
	@Test
	void mockListSizeMethod1()
	{
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(2);
		assertEquals(2, listMock.size());
		assertEquals(2, listMock.size());
		assertEquals(2, listMock.size());
	}
	
	@Test
	void mockListReturnsMultipleValues()
	{
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(2).thenReturn(3);
		assertEquals(2, listMock.size());
		//assertEquals(2, listMock.size());  test fails because it returns 3 at this point.
		assertEquals(3, listMock.size());
	}
	
	@Test
	void letsMockListGet()
	{
		List listMock = mock(List.class);
		when(listMock.get(0)).thenReturn("hello"); 
		when(listMock.get(1)).thenReturn(null);
		assertEquals("hello", listMock.get(0));
		assertEquals(null, listMock.get(1));
		
	}
	
	@Test
	void testArgumentMatcher()
	{
		//Matchers class.
		List listMock = mock(List.class);
		//here we used the concept of "ARGUMENT MATCHER" ie anyInt() .there are several other methods also which can be foundin  Matchers class.
		when(listMock.get(anyInt())).thenReturn("hello");
		assertEquals("hello", listMock.get(0));    // returns "hello"
		assertEquals("hello", listMock.get(1));    // returns "hello" as well because we used anyInt() which is argument matcher.
	}
	
	//@Test(expected=RuntimeException.class)
	public void letsThrowExceptionForList()
	{
		List mockList = mock(List.class);
		when(mockList.get(0)).thenThrow(new RuntimeException("Exception thrown"));
		mockList.get(0);
	}
}
