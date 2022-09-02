package com.rays.oops.polymorphism;


public class TestShape {
	public static void main(String[] args) {
		//Shape s = new Circle(5);
		//s.setBorderWidth(6);
		//s.setColor("red");
		//double arr= s.area();
		//System.out.println(s.getColor());
		//System.out.println(s.getBorderWidth());
		
	   // Shape s = new Rectangle(10, 12);
	    //s.setBorderWidth(4);
	    //s.setColor("blue");
	    //double arr= s.area();
	    //System.out.println(s.getBorderWidth());
	    //System.out.println(s.getColor());
		
		//Shape s = new Triangle(4,7);
		//s.setBorderWidth(3);
		//s.setColor("pink");
		//double arr= s.area();
		//System.out.println(s.getBorderWidth());
	    //System.out.println(s.getColor());
		
		Shape[] s = new Shape[3];
		s[0] = new Circle(5);
		s[1] = new Rectangle(5,10);
		s[2] = new Triangle(10, 4);
		
		//for (int i = 0; i < s.length; i++) {
			//System.out.println(s[i].area());
		//}
		double tarea = calcArea(s);
		System.out.println(tarea);
	}

	private static double calcArea(Shape[] s) {
		double tarea= 0;
		for (int i = 0; i < s.length; i++) {
			tarea= tarea +s[i].area();
			
		}
		return tarea;
	}
}
