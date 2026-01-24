package com.mathsforDSA;

//Timecomplexity---> O(squareroot(n))

public class IsPrime {

	static boolean isprime(int n) {
		if(n<2) {
			return false;
		}
		for(int i=2;i*i<=n;i++) {
			 if(n%i==0) {
				return false;
			 }
		}
		return true;
	}
	public static void main(String[] args) {
		int n=19;
		System.out.println(isprime(n));

	}

}
