package com.rays.oops;

public class TestTriangle {
public static void main(String[] args) {
	Triangle t= new Triangle();
	t.setBase(5);
	t.setHeight(8);
	t.setBorderWidth(3);
	t.setColor("red");
	
	double tarea= t.area();
	
	System.out.println(t.getBorderWidth());
	System.out.println(t.getColor());
}
}
