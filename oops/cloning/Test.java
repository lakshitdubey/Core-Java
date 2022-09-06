package com.rays.oops.cloning;

public class Test {
public static void main(String[] args) throws CloneNotSupportedException {
	Address a = new Address();
	a.setStreet("Shushmita Vihar");
	a.setState("Madhya Pradesh");
	a.setCity("Indore");
	
	Employee e = new Employee();
	e.setId(141);
	e.setFirstName("Lalit");
	e.setLastName("Modi");
	e.setAddr(a);
	
	Employee e1 = (Employee) e.clone();
	
	System.out.println(e.getId());
	System.out.println(e.getFirstName());
	System.out.println(e.getLastName());
	System.out.println(e.getAddr().getStreet());
	System.out.println(e.getAddr().getCity());
	System.out.println(e.getAddr().getState());
	
	System.out.println("-----------------");

	System.out.println(e1.getId());
	System.out.println(e1.getFirstName());
	System.out.println(e1.getLastName());
	System.out.println(e1.getAddr().getStreet());
	System.out.println(e1.getAddr().getCity());
	System.out.println(e1.getAddr().getState());
}
}
