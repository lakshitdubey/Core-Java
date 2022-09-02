package com.rays.excer;

public class Ex4HarmonicThirteen {
	public static void main(String[] args) {
		int n=5;
		double rst = 0.0;
		for(int i=1; i<=n; i++)
		{
			System.out.print("1/"+i+" + ");
			rst = rst+(double)1/i;
			
		}System.out.println("\n\nsum of harmonic series is "+rst);
	}

}
