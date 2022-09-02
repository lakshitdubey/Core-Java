package com.rays.oops;

public class TestCircle {
public static void main(String[] args) {
	CircleInheritence c = new CircleInheritence();
	c.setRad(6);
	c.setColor("Blue");
	c.setBorderWidth(8);
	double carea= c.area();
	System.out.println(c.getColor());
	System.out.println(c.getBorderWidth());
}
}
