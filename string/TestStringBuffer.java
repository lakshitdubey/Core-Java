package com.rays.string;

public class TestStringBuffer {
public static void main(String[] args) {
	StringBuffer sb = new StringBuffer("Vijay");
	System.out.println(sb.append(" Dinanath Chauhan"));
	System.out.println(sb.length());
	System.out.println(sb.capacity());
	System.out.println(sb.charAt(8));
	System.out.println(sb.indexOf("Dinanath"));
	System.out.println(sb.replace(0, 5, "jay"));
	System.out.println(sb.reverse());
}
}
