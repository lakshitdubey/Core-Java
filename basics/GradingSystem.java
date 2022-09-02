package com.rays.basics;

public class GradingSystem {
	public static void main(String[] args) {
		int marks = 86;
		if (marks > 90) {
			System.out.println("your Grade is A+");
		} else if (marks < 90 && marks > 70) {
			System.out.println("your Grade is A");
		} else if (marks < 70 && marks > 60) {
			System.out.println("your Grade is B+");
		} else if (marks < 60 && marks > 50) {
			System.out.println("your Grade is B");
		} else if (marks < 50 && marks > 40) {
			System.out.println("Your Grade is C");
		} else {
			System.out.println("You are Failed");
		}
	}
}
