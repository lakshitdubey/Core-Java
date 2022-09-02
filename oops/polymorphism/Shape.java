package com.rays.oops.polymorphism;

public class Shape {
private String color;
private int borderWidth;
public static final double PI = 3.14;
public double area() {
	return 0;
}


public Shape() {
	
}
public Shape (String c , int b) {
	color= c;
	borderWidth= b;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getBorderWidth() {
	return borderWidth;
}
public void setBorderWidth(int borderWidth) {
	this.borderWidth = borderWidth;
}

}
