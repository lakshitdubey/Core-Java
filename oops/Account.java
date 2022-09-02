package com.rays.oops;

public class Account {
private String number;
private String AccountType;
private double Balance;
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public String getAccountType() {
	return AccountType;
}
public void setAccountType(String accountType) {
	AccountType = accountType;
}
public double getBalance() {
	return Balance;
}
public void setBalance(double balance) {
	Balance = balance;
}
public double deposite(double ammount) {
Balance += ammount; 
return Balance;
}
public double withdraw(double ammount) {
Balance -= ammount;
return Balance;
}
public void fundTransfer(String number, double ammount) {
	
}
}
