package com.rays.excer;

public class Ex4SecondLargestSisteen {
	public static void firstMethod(int a[], int size)
	{
		int  largest, secondLargest;
		if(size<2)
		{
			System.out.println("Invalid Input");
			return;
		}
		largest = secondLargest = Integer.MIN_VALUE;
		for(int i=0; i<size; i++)
		{
		   if(a[i]>largest)
		   {
			secondLargest = largest;
			largest = a[i];
		   }
		   else if (a[i]>secondLargest && a[i] != largest)
		   {
			secondLargest = a[i];
		   }
		}
		   if(secondLargest == Integer.MIN_VALUE)
		   {
				System.out.println("There is no second largest");
		   }
		   else
		   {
				System.out.println("the second largest element is "+secondLargest);
		   }
	}
	public static void main(String[] args)
	{
	      int a[]= {127,335,921,610,234,111};
	      int size = a.length;
	      firstMethod(a,size);
		
	}
	
}
