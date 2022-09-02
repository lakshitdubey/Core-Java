package com.rays.excer;

public class Ex4LargestFifteen {
	public static void main(String[] args) 
	{
		int a[] = {180,698,896,378,99};
		firstMethod(a);
	}
	public static void  firstMethod(int []a)
	{
		
		int max = a[0];
		for(int i=1; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max =a[i];
			}
			
		}System.out.println(max);
	}
}
