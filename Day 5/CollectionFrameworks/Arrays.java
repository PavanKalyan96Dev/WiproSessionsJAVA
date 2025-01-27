package com.FrameWorks;

public class Arrays 
{
	public static void main(String args[])
	{
		int arr[]=new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		System.out.println(arr[0]);
		
		System.out.println("by using for looop");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("by using the for each loop");
		for(int x:arr)
		{
			System.out.println(x);
		}
		
		
	}

}
