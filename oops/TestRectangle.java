package com.rays.oops;

public class TestRectangle {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.setLen(7);
		r.setWid(3);
		r.setBorderWidth(5);
		r.setColor("green");
	double rarea= r.area();
	System.out.println(r.area());
	System.out.println(r.getBorderWidth());
	System.out.println(r.getColor());
	
	}
	
}
