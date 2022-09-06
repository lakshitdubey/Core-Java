package com.rays.oops.callingofconstructor;

public class Person {
protected String FirstName;
protected String LastName;
protected String Address;

public Person() {
	System.out.println("Person Default");
}
public Person (String fn , String ln) {
	FirstName = fn;
	LastName = ln;
	System.out.println("person 2 "+" "+ FirstName + " "+ LastName);
}

public Person (String fn , String ln, String add) {
  this(fn,ln);
  Address = add;
  System.out.println("person 3 "+" "+ FirstName+" "+ LastName+ " " + Address);
}

public static void main(String[] args) {
	Person p = new Person("Lalit","Modi","Sushmita Vihar");
}

}
