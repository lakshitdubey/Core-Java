package com.rays.basics;

public class TestSwappingOfNumbers {
public static void main(String[] args) {
	int x=324;
	int y=987;
	int k;
	System.out.println("Before Swapping Numbers are : "+x+" "+y);
	
	k=x;
	x=y;
	y=k;
	System.out.println("After Swapping Numbers are : "+ x + " " + y);
}
}
