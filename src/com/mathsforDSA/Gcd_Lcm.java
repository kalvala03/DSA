package com.mathsforDSA;

public class Gcd_Lcm {
	//Bruteforce-->Tc:O(min(a, b))
	static int gcdBrute(int a, int b) {
		for (int i =  Math.min(a, b); i >= 1; i--) {
			if (a % i == 0 && b % i == 0) {
				return i;
			}
		}
		return 1;
	}
	
	//Euclids used (-)
	//Gabriel lame used (%) 
	//Tc:O(log(min(a, b)))
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

	public static void main(String[] args) {
		System.out.println("GCD:"+gcd(20,28));
		System.out.println("LCM:"+lcm(20,28));
	}

}
