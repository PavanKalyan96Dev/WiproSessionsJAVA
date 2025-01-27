package com.FrameWorks;

import java.util.PriorityQueue;
import java.util.Queue;

public class priorityqueue {

	public static void main(String[] args) 
	{
		Queue<Integer> priorityQueue=new PriorityQueue<>();
		//add the elements into the queue
		priorityQueue.add(10);
		priorityQueue.add(100);
		priorityQueue.add(30);
		
		System.out.println(priorityQueue);//10,100,30
		System.out.println(priorityQueue.poll());//used to remove the head of the queue
		System.out.println(priorityQueue);
		
		System.out.println(priorityQueue.peek());//gives the top of the element
		
		
	

	}

}
