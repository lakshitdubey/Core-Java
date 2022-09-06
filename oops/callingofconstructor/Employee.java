package com.rays.oops.callingofconstructor;

public class Employee extends Person{
	
	private String Designation;
	public Employee() {
		System.out.println("Employee Designation");
	}
public Employee (String fn, String ln, String des) {
	super(fn,ln);
	Designation = des;
	
	System.out.println("Employee 3 "+ FirstName + " " + LastName + " " + Designation);
}

public static void main(String[] args) {
	Employee e = new Employee("Sushmita", "Jain" , "HR");
}

}
