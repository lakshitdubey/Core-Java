package com.rays.string;

public class CountCharInString {
public static void main(String[] args) {
	String name="Vijay Dinanath Chauhan";
	int count = name.length();
	int countwithouta = name.replace("V", "").length();
	
	int totalcountofi = count - countwithouta;
	System.out.println(totalcountofi);
	
}
}
