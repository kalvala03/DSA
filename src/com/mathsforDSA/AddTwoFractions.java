package com.mathsforDSA;

public class AddTwoFractions {
	static void method(int n1,int d1,int n2,int d2) {
		int lcm=lcm(d1,d2);
		int num=(n1*(lcm/d1)) + (n2*(lcm/d2));
		System.out.println(num + "/" + lcm);
	}

	static int lcm(int d1, int d2) {
		int prod=d1*d2;
		int lcm=prod/gcd(d1,d2);
		return lcm;
	}

	static int gcd(int d1, int d2) {
		while(d1>0 && d2>0) {
			if(d1>d2) {
				d1=d1%d2;
			}
			else {
				d2=d2%d1;
			}
		}
		if(d1==0) {
			return d2;
		}
		else {
			return d1;
		}
	}

	public static void main(String[] args) {
		int n1=3,d1=4,n2=1,d2=7;
		method(n1,d1,n2,d2);
	}
}
