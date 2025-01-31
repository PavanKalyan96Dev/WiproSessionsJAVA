package com.Junit;

import static org.junit.Assert.*;

import java.util.SortedSet;
import java.util.TreeSet;

import org.junit.Test;

public class TreeSetdataTest {
	

	TreeSetdata obj = new TreeSetdata();

	SortedSet<Integer> expectedSet= new TreeSet<>();
	{
		
	
		expectedSet.add(-5);
	
		expectedSet.add(6);
	
		expectedSet.add(67);
	
		expectedSet.add(100);
	
		expectedSet.add(152);
	
		expectedSet.add(234);
	
		expectedSet.add(333);

		SortedSet<Integer> actualSet = obj.getData();
		assertNotNull("Returned Set should not be null", actualSet);
		assertEquals("The sets should be equal", expectedSet, actualSet);
	}
 
}
	



