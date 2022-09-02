package com.rays.basics;

public class TestDecending {
public static void main(String[] args) {
	System.out.println("Decending Numbers");
	int[] dec = {23,56,12,34,67,91,4};
	System.out.print("{");
	for (int i=0; i<dec.length; i++) {
	for (int j=i+1;i < dec.length; j++) {
		int a = 0;
		if(dec[i] < dec[j]) {
			a=dec[i];
			dec[i] = dec[j];
			dec[j] = a;
		}
	}
	System.out.print(+dec[i]+",");
}
     System.out.println("}");
}
}
