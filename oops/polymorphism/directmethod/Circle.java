package com.rays.oops.polymorphism.directmethod;

public class Circle extends Shape {
	private int radius;
	

		public int getRadius() {
		return radius;
	}


	public void setRadius(int radius) {
		this.radius = radius;
	}


		public double area () {
			double arr= Shape.PI*radius*radius;
			System.out.println("Area of Circle= "+ arr);
			return arr;
		}

}
