package com.rays.oops.polymorphism.abstractclass;

public class TestShape {
	public static void main(String[] args) {

		Shape s = new Circle(5);
		s.setBorderWidth(6);
		s.setColor("red");
		double arr = s.area();
		System.out.println(s.getColor());
		System.out.println(s.getBorderWidth());

	}
}
