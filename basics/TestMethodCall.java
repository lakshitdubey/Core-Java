package com.rays.basics;

public class TestMethodCall {
public void addition() {
	int i=5;
	int j=9;
	int k=i+j;
	System.out.println(k);
}
public void substraction() {
	int i=768;
	int j=345;
	int k=i-j;
	System.out.println(k);
}
public int add(int a, int b) {
	int c=a+b;
	return c;
}
public static void main(String[] args) {
	TestMethodCall m= new TestMethodCall();
	m.addition();
	m.substraction();
	
	int c=m.add(78, 67);
	System.out.println(c);
}
}
