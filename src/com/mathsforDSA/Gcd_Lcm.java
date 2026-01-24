package com.mathsforDSA;

public class Gcd_Lcm {
	//Bruteforce-->Tc:O(min(a, b))
	static int gcdBrute(int a, int b) {
		int gcd = 1;
		for (int i = 1; i <= Math.min(a, b); i++) {
			if (a % i == 0 && b % i == 0) {
				gcd = i;   // keep updating
			}
		}
		return gcd;
	}
	
	//Euclids algorithm-->Tc:O(log(min(a, b)))
	static int gcd(int a,int b) {
		while(a>0 && b>0) {
			if(a>b)
				a=a%b;    //a=a-b
			else
				b=b%a;    //b=b-a
		}
		if(a==0)
			return b;
		else
			return a;
	}
	static int lcm(int a,int b) {
		int prod=a*b;
		return prod/gcd(a,b);
	}

	//using recursion
	static int gcd1(int a, int b) {
		if(a==0) {
			return b;
		}
		return gcd1(b%a,a);
	}
	
	static int lcm1(int a, int b) {
		return a*b/gcd1(a,b);
	}
	
	public static void main(String[] args) {
		System.out.println("GCD:"+gcd(20,28));
		System.out.println("LCM:"+lcm(20,28));
	}

}
