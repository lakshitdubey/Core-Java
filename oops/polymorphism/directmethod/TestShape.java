package com.rays.oops.polymorphism.directmethod;

public class TestShape {
public static void main(String[] args) {
	Shape s = new Shape();
	
	Circle c = (Circle) Shape.getShape(1);
	c.setRadius(5);
	c.area();
	
	Rectangle r = (Rectangle) Shape.getShape(2);
	r.setLength(12);
	r.setWidth(6);
	r.area();

	
	
	Triangle t = (Triangle) Shape.getShape(3);
	t.setBase(10);
	t.setHeight(6);
	t.area();
	
}
}
