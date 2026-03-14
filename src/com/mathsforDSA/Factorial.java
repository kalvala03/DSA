package com.mathsforDSA;

public class Factorial {
	static int method(int n) {
		int fact=1;
		for(int i=n;i>=1;i--) {
			fact*=i;
		}
		return fact;
	}

	public static void main(String[] args) {
		int n=5;
		System.out.print(method(n));
	}
}
