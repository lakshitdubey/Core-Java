package com.rays.oops.polymorphism.overloading;

public class TestAddition {
public static void main(String[] args) {
	Addition a = new Addition();
	a.add(5,6);
	a.add(8.5, 3);
	a.add(6, 3, 9);
	a.add("Ram", "Manohar");
}
}
