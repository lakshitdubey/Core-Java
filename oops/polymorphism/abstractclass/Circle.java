package com.rays.oops.polymorphism.abstractclass;

public class Circle extends Shape {
	private int radius;

	public Circle() {

	}

	public Circle(int rad) {
		radius = rad;
	}

	@Override
	public double area() {
		double arr = Shape.PI * radius * radius;
		System.out.println("Area of Circle= " + arr);
		return arr;
	}
}
