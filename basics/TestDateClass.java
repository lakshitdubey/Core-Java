package com.rays.basics;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateClass {
public static void main(String[] args) {
	Date d= new Date();
	System.out.println("date: "+ d);
	
	SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
	String sd= sdf.format(d);
	System.out.println(sd); 
}
}
