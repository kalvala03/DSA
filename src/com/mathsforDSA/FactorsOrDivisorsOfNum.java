package com.mathsforDSA;

public class FactorsOrDivisorsOfNum {

	static void method(int n) {
		int i;

		for(i=1;i*i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}

		for(;i>=1;i--) {
			if(n%i==0 && i!=n/i) {   // prevents duplicate when num is perfect square
				System.out.println(n/i);
			}
		}
	}

	public static void main(String[] args) {
		int n=36;
		method(n);
	}
}