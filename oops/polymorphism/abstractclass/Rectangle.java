package com.rays.oops.polymorphism.abstractclass;

public class Rectangle extends Shape {
	private int length;
	private int width;

	public Rectangle() {
	}

	public Rectangle(int l, int b) {
		length = l;
		width = b;
	}

	public double area() {
		double arr = length * width;
		System.out.println("Area of Rectangle= " + arr);
		return arr;

	}

}
