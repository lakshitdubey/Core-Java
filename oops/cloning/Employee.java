package com.rays.oops.cloning;

public class Employee implements Cloneable {
private int id;
private String FirstName;
private String LastName;
private Address addr;

public Employee() {
	// TODO Auto-generated constructor stub
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFirstName() {
	return FirstName;
}

public void setFirstName(String firstName) {
	FirstName = firstName;
}

public String getLastName() {
	return LastName;
}

public void setLastName(String lastName) {
	LastName = lastName;
}

public Address getAddr() {
	return addr;
}

public void setAddr(Address addr) {
	this.addr = addr;
}

@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
}
