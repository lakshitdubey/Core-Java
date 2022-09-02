package com.rays.string;

public class CountEachCharString {
public static void main(String[] args) {
	String name = "Vijay Dinanath Chouhan";
	char ch = 0;	
	
	for (int i=0;i < name.length();i++) {
		ch = name.charAt(i);
		int count = 0;
		for(int j=0;j < name.length(); j++) {
			if( ch == name.charAt(j)) {
				count++;
			}
		}
		System.out.println(ch +"-"+ count );
	}
	}
}

