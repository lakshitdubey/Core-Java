package com.rays.oops;

public class Rectangle extends Shape {
	private int len;
	private int wid;
	public int getLen() {
		return len;
	}
	public void setLen(int len) {
		this.len = len;
	}
	public int getWid() {
		return wid;
	}
	public void setWid(int wid) {
		this.wid = wid;
	}
	public double area() {
		double arr= len*wid;
		return arr;
	}

}
