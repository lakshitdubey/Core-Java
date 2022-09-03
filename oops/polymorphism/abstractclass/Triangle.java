package com.rays.oops.polymorphism.abstractclass;

public class Triangle extends Shape {
	private int base;
	private int height;

	public Triangle() {
	}

	public Triangle(int b, int h) {
		base = b;
		height = h;
	}

	public double area() {
		double arr = 0.5 * base * height;
		System.out.println("Area of triangle= " + arr);
		return arr;
	}

}
