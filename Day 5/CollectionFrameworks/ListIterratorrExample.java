package com.FrameWorks;
//iterator cannot travel from back to front so we'll use the
//ListIterator
import java.util.*;
public class ListIterratorrExample {

	

public static void main(String args[])
{
	Set<Integer> s=new LinkedHashSet<>();
	for(int i=1;i<=10;i++)
	{
		s.add(i);
	}
	List<Integer> list=new ArrayList<>(s);
	ListIterator<Integer> itr=list.listIterator();//with the 
	//help of iterator we r printing the values
	  while (itr.hasNext()) {
          System.out.println(itr.next());	//print 1 to 10
      }
	while(itr.hasPrevious())
	{
		System.out.println(itr.previous()); //print 10 to 1
	}

}}