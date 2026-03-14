package com.mathsforDSA;

public class IsAutomorphic {
	static boolean method(int n) {
		int sq=n*n;
		while(n>0) {
			if(n%10 != sq%10) {
				return false;
			}else {
				n/=10;
				sq/=10;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int n=76;
		System.out.print(method(n));
	}
}
