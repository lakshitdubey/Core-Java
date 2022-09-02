package com.rays.oops;



public class TestPerson {
public static void main(String[] args) {
	Person p= new Person();
	p.setDob(1994);
	p.setName("Lakshit");
	p.setAddress("Indore");
	
	System.out.println("name "+p.getName() );
	System.out.println("DOB= "+p.getDob());
	System.out.println("Address= "+ p.getAddress());
}
}
