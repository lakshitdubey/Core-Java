package com.rays.excer;

public class Ex4ReverseFive {
	public static void main(String[] args) {
		int a = 546, rev=0, rem;
		while(a != 0) {
			rem = a%10;
			rev = rev*10+rem;
			a = a/10;
		}
		System.out.println("Reverse Of a Number a Will Be :- "+rev);
				
	}
}
