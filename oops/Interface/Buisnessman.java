package com.rays.oops.Interface;

public class Buisnessman implements SocialWorker , Richman {

	@Override
	public void EarnMoney() {
		System.out.println("Earn Money");
		
	}

	@Override
	public void Donation() {
		System.out.println("Donation");
		
	}

	@Override
	public void Party() {
		System.out.println("Party");
		
	}

	@Override
	public void HelpToOthers() {
System.out.println("HelpToOthers");
	}
public static void main(String[] args) {
	SocialWorker s = new Buisnessman();
	s.HelpToOthers();
	
	Richman r = new Buisnessman();
	r.Donation();
	r.EarnMoney();
	r.Party();
}
}
